/*
*********************************************************************************************************
*                                                 uC/OS-II
*                                          The Real-Time Kernel
*                                                 PORT LINUX
*
*
* File : Router.c
*
*********************************************************************************************************
*/

#include "includes.h"
/*
*********************************************************************************************************
*                                              CONSTANTS
*********************************************************************************************************
*/

#define          TASK_STK_SIZE    8192                // Size of each task's stacks (# of WORDs)

#define	     	   UBYTE		unsigned char

#define          TASK_INJECTPACKET_ID  	1                 // Application tasks IDs
#define          TASK_CALCUL_ID  		    6            	    // Application tasks IDs
#define          TASK_FOWARDING_ID  		7                	// Application tasks IDs
#define          TASK_FOWARDING2_ID  		8                	// Application tasks IDs
#define          TASK_INTERFACE1_ID  		2                	// Application tasks IDs
#define          TASK_INTERFACE2_ID  		3                	// Application tasks IDs
#define          TASK_INTERFACE3_ID  		4                	// Application tasks IDs
#define          TASK_INTERFACE4_ID  		5                	// Application tasks IDs


#define          TASK_INJECTPACKET_PRIO  	1  			          // Application tasks IDs 
#define          TASK_CALCUL_PRIO  		    6                	// Application tasks IDs
#define          TASK_FOWARDING_PRIO  	 	7                	// Application tasks IDs
#define          TASK_FOWARDING2_PRIO  	 	8                	// Application tasks IDs
#define          TASK_INTERFACE1_PRIO  		2                	// Application tasks IDs
#define          TASK_INTERFACE2_PRIO	  	3                	// Application tasks IDs
#define          TASK_INTERFACE3_PRIO	  	4                	// Application tasks IDs
#define          TASK_INTERFACE4_PRIO	  	5                	// Application tasks IDs

// -- Routing info.
//
#define INT1_LOW  0
#define INT1_HIGH 1073741823
#define INT2_LOW  1073741824
#define INT2_HIGH 2147483647
#define INT3_LOW  2147483648
#define INT3_HIGH 3221225472

// -- Reject source info
//
#define REJECT_LOW  1753761824
#define REJECT_HIGH 2000000000

typedef struct {
	unsigned int src;
	unsigned int dst;
	unsigned int type;
  unsigned int crc;
 	unsigned int data[12];
}Packet;

/*
*********************************************************************************************************
*                                              VARIABLES
*********************************************************************************************************
*/

OS_STK           TASK_INJECTPACKET[TASK_STK_SIZE]; 
OS_STK           TASK_CALCUL[TASK_STK_SIZE];
OS_STK           TASK_FOWARDING[TASK_STK_SIZE];
OS_STK           TASK_FOWARDING2[TASK_STK_SIZE];
OS_STK           TASK_INTERFACE1[TASK_STK_SIZE];
OS_STK           TASK_INTERFACE2[TASK_STK_SIZE];
OS_STK           TASK_INTERFACE3[TASK_STK_SIZE];
OS_STK           TASK_INTERFACE4[TASK_STK_SIZE];


// Event definition: mutex, semaphore, mbox and queue
OS_EVENT         *ptrFifoIn;                         // Message queue pointer
OS_EVENT         *ptrFifoHigh;                       // Message queue pointer
OS_EVENT         *ptrFifoMedium;                     // Message queue pointer
OS_EVENT         *ptrFifoLow;                        // Message queue pointer
OS_EVENT         *ptrMbox1;                          // Message box for printing
OS_EVENT         *ptrSem2;                           // Message box for printing
OS_EVENT         *ptrSem3;                           // Message box for printing
OS_EVENT         *ptrMbox4;                          // Message box for printing
OS_EVENT         *ptrMutexCnt;

// Memory definition (tables, structures) for queues and mbox
Packet           FifoTblIn[16];                    // Storage for messages
Packet           FifoTblHigh[4];                   // Storage for messages
Packet           FifoTblMedium[4];                 // Storage for messages
Packet           FifoTblLow[4];                    // Storage for messages
Packet*          Int1Box;                          // Storage for message box
Packet*          ptrInt2SplitVar;                  // Storage for split variable interface 2
Packet*          ptrInt3SplitVar;                  // Storage for split variable interface 3
Packet*          Int4Box;                          // Storage for message box


// For Unilateral synchronization
unsigned short reg1, reg2;

// Statistics
int nbPacket = 0;                 // Total number of packets
int nbPacketCRCRejected = 0 ;     // Number of rejected packet (bad CRC) 
int nbPacketSourceRejected = 0;   // Number of rejected packet (from source)
int nbPacketHighRejected = 0;     // Number of rejected packet (from High Priority Queue)
int nbPacketMediumRejected = 0;   // Number of rejected packet (from Medium Priority Queue)
int nbPacketLowRejected = 0;      // Number of rejected packet (from Low Priority Queue)


/*
*********************************************************************************************************
*                                         FUNCTION PROTOTYPES
*********************************************************************************************************
*/

void             TaskInjectPacket(void *data);          // Function prototypes of tasks
void             TaskCalculation(void *data);           // Function prototypes of tasks
void             TaskFowarding(void *data);             // Function prototypes of tasks
void             TaskPrint(void *data);

// Print function parameters 
typedef struct 
{
  unsigned int interfaceID;
  OS_EVENT *Mbox;
  OS_EVENT *Sem;
 
} PRINT_PARAM;		



/*
*********************************************************************************************************
*                                                  MAIN
*********************************************************************************************************
*/

int main (void)
{
    INT8U err;
    PRINT_PARAM param[4];
   
    OSInit(); // Initialize uC/OS-II

    ptrFifoIn      = OSQCreate( &FifoTblIn[0], 16, sizeof(Packet) );    
    ptrFifoHigh    = OSQCreate( &FifoTblHigh[0], 4, sizeof(Packet) ); 
    ptrFifoMedium  = OSQCreate( &FifoTblMedium[0], 4, sizeof(Packet) );
    ptrFifoLow     = OSQCreate( &FifoTblLow[0], 4, sizeof(Packet) ); 
    ptrMbox1       = OSMboxCreate(&Int1Box, sizeof(Packet)); 
    ptrSem2        = OSSemCreate(0); // Create a semaphore intialized to 0
    ptrSem3        = OSSemCreate(0); // Create a semaphore intialized to 0
    ptrMbox4       = OSMboxCreate(&Int4Box, sizeof(Packet)); // Create a empty message box
    ptrMutexCnt    = OSMutexCreate(0, &err);
         
    // Tasks Creation
    OSTaskCreateExt(TaskInjectPacket, (void *)0, &TASK_INJECTPACKET[TASK_STK_SIZE-1], TASK_INJECTPACKET_PRIO,
                   TASK_INJECTPACKET_ID, &TASK_INJECTPACKET[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   
    OSTaskCreateExt(TaskCalculation, (void *)0, &TASK_CALCUL[TASK_STK_SIZE-1], TASK_CALCUL_PRIO,
                   TASK_CALCUL_ID, &TASK_CALCUL[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   
    OSTaskCreateExt(TaskFowarding, (void *)0, &TASK_FOWARDING[TASK_STK_SIZE-1], TASK_FOWARDING_PRIO,
                   TASK_FOWARDING_ID, &TASK_FOWARDING[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   	   
    
    param[0].interfaceID=1;
    param[0].Mbox=ptrMbox1;
    OSTaskCreateExt(TaskPrint, (void *)&param[0], &TASK_INTERFACE1[TASK_STK_SIZE-1], TASK_INTERFACE1_PRIO,
                   TASK_INTERFACE1_ID, &TASK_INTERFACE1[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   
    param[1].interfaceID=2;
    param[1].Sem=ptrSem2;
    OSTaskCreateExt(TaskPrint, (void *)&param[1], &TASK_INTERFACE2[TASK_STK_SIZE-1], TASK_INTERFACE2_PRIO,
                   TASK_INTERFACE2_ID, &TASK_INTERFACE2[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   
    param[2].interfaceID=3;
    param[2].Sem=ptrSem3;   
    OSTaskCreateExt(TaskPrint, (void *)&param[2], &TASK_INTERFACE3[TASK_STK_SIZE-1], TASK_INTERFACE3_PRIO,
                   TASK_INTERFACE3_ID, &TASK_INTERFACE3[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);
		   
    param[3].interfaceID=4;
    param[3].Mbox=ptrMbox4;		   
    OSTaskCreateExt(TaskPrint, (void *)&param[3], &TASK_INTERFACE4[TASK_STK_SIZE-1], TASK_INTERFACE4_PRIO,
                   TASK_INTERFACE4_ID, &TASK_INTERFACE4[0], TASK_STK_SIZE, (void *)0,
                   OS_TASK_OPT_STK_CHK | OS_TASK_OPT_STK_CLR);		   		   		   		   		   
	
    OSStart();  // Start uC/OS-II
    return 1;  	
    
}

/*
*********************************************************************************************************
*                                              Functions
*********************************************************************************************************
*/
/**   * Linked to @wi COMP-554  */
unsigned int computeCRC( INT16U* w, int nleft) 
{
    
    unsigned int sum = 0;
    INT16U answer = 0;
    
    // -- 16 bits word sum
    //                                                                                          
    while (nleft > 1)  
    {
      sum += *w++;
      nleft -= 2;
    }
                                                                                         
    if (nleft == 1) 
    {
      *(unsigned char *)(&answer) = *(const unsigned char *)w ;
      sum += answer;
    }
     
    // -- Overflow
    //                                                                                         
    sum = (sum & 0xffff) + (sum >> 16);
    sum += (sum >> 16);
                                                                                              
    answer = ~sum;
    return (unsigned int) answer;
    
}

/**   * Linked to @wi COMPOT/COMP-554   */
int TestFunction (int number1, int number2)
{
	if (nbPacket > 10)
	{
		return number1-number2;
	}
	else
	{
		return number1+number2;
	}


}

int StubTestFunction (int number1, int number2)
{
	OS_MemInit();
	if (nbPacket > 10)
	{
		return number1-number2;
	}
	else
	{
		return number1+number2;
	}
}


/*
*********************************************************************************************************
*                                              Tasks
*********************************************************************************************************
*/


// This task will create new packets to be injected in the system
// --------------------------------------------------------------
void  TaskInjectPacket (void *data)
{
    int i, j;
    INT8U err;

    Packet packet;
    i = 0;
    for (;;) 
    {

      // -- Packet Creation
      //
      packet.src = 2*65536*rand();
      packet.dst = 2*65536*(unsigned int)rand();
      packet.type = rand() % 3;		// -- 3 types of packet (High, Medium, Low)
      for(j=0; j<13; j++) 
      {
          packet.data[j] = rand();
      }
	    packet.crc = 0;
	    if (rand()%25 == 11)			// -- Creation of bad CRC packet 
      {
	      packet.crc = 1234; 
      }
	    else
      {
        packet.crc = computeCRC( (INT16U*)(&packet), 64 );
      }

      printf("---- TASK_INJECT_PACKET-----\n");
      printf("******** Packet Generation # %d ******** \n", ++i);
      printf("    -- src : 0x%8x \n", packet.src);
      printf("    -- dst : 0x%8x \n", packet.dst);
      printf("    -- type : %d \n", packet.type);

      err = OSQPost(ptrFifoIn, &packet); 

      if (err == OS_Q_FULL) 
      {
        printf("Packet rejected -> FIFO is Full\n");
      }

      // -- Packet flow
      // 
      OSTimeDly(50);                       // Wait 0.5 sec
      
      
     if (i == 10)
     {
       OSTimeDly(1000); 
       exit(0);
     }
   }
}



// This task will filter packets based on CRC and on Type
// ------------------------------------------------------ 
/**   * Linked to @wi COMP-554   */
void  TaskCalculation (void *data)
{
    Packet packet;
    INT8U err = 0;
    
    for(;;)
    {
      
      err = OSQPend(ptrFifoIn, &packet, 0);

	    if (err==OS_TIMEOUT)
	    {
		    printf("TaskCalculation err= %d \n", err);
	    }
	    if(err == OS_NO_ERR)
	    {
	      // -- If the source packet address in not defined within a range, it will be rejected
	      //
        if(REJECT_LOW <=  packet.src && packet.src <= REJECT_HIGH) 
          {
            printf("---- TASK_TEST_CALCULATION -> Packet rejected, source invalid (total : %d)\n", ++nbPacketSourceRejected);
            continue;
          }
    
        // -- CRC Checking
        //
        if ( computeCRC( (INT16U*)(&packet), 64 ) != 0) 
        { 
          printf("---- TASK_TEST_CALCULATION Packet rejected, crc invalid\n (total : %d)", ++nbPacketCRCRejected);
          printf("---- TASK_TEST_CALCULATION CRC checked value %8x\n", packet.crc);
          continue;
        }
    
    
        switch(packet.type)
        {
        case 0:
          if((err = OSQPost(ptrFifoHigh, &packet)) == OS_Q_FULL)
          {
            printf("---- TASK_TEST_CALCULATION Packet rejected, fifo high full (total : %d) !\n", ++nbPacketHighRejected);
          }
          break;
        case 1:
          if((err = OSQPost(ptrFifoMedium, &packet)) == OS_Q_FULL)
          {
            printf("---- TASK_TEST_CALCULATION Packet rejected, fifo medium full (total : %d) !\n", ++nbPacketMediumRejected);
          }
          break;
        case 2:
          if((err = OSQPost(ptrFifoLow, &packet)) == OS_Q_FULL)
          {
            printf("---- TASK_TEST_CALCULATION Packet rejected, fifo low full (total : %d) !\n", ++nbPacketLowRejected);
          }
          break;
        default:
            printf("---- TASK_TEST_CALCULATION Error : Type Invalid!");
        }
	    }
    }       
}


// This task will forward packet to the corresponding routing table
// Packet will be forwarded depending on their priority
// ----------------------------------------------------------------
void  TaskFowarding (void *data)
{
    Packet packet;
    INT8U err;
    
    for(;;)
    {
        // -- Forward packet to the right interface, depending on the queue priority
        // Higher the priority of the queue, faster the packet will be forwarded
        //
        if((err = OSQAccept(ptrFifoHigh, &packet)) != OS_NO_ERR) 
        {
          if((err = OSQAccept(ptrFifoMedium, &packet)) != OS_NO_ERR)
          {
	          err = OSQAccept(ptrFifoLow, &packet);
	        }
        }
        
        OSTimeDly(100);                       // Wait one second    
		
	      // Packet forwarding to the right routing table
        if(err == OS_NO_ERR)
        {
	        printf("---- TASK_FOWARDING-----\n");
          printf("packet.dst : %8x\n", packet.dst);

      	  if(packet.dst >= INT1_LOW && packet.dst <= INT1_HIGH)
      	  {
		        OSMboxPost(ptrMbox1, &packet);
       	  }
       	  else if(packet.dst >= INT2_LOW && packet.dst <= INT2_HIGH)
	        {
   	        OSSemAccept(ptrSem2);
		        ptrInt2SplitVar = &packet;
		        OSSemPost(ptrSem2);
	        }
          else if(packet.dst >= (unsigned int)INT3_LOW && packet.dst <= (unsigned int)INT3_HIGH) 
	        {	
		        OSSemAccept(ptrSem3);
		        ptrInt3SplitVar = &packet;
		        OSSemPost(ptrSem3);
          }
          else
          {
		        OSMboxPost(ptrMbox4, &packet);
		      }
		    }
	      
	      OSMutexPend(ptrMutexCnt, 0, &err);
        printf("%d packets sent \n", ++nbPacket);
        OSMutexPost(ptrMutexCnt);
	    }
}


// This task will print/consume packets sent to routing tables
// ----------------------------------------------------------- 
void TaskPrint(void *data)
{
  int intID      = ((PRINT_PARAM*)data)->interfaceID;
  INT8U err;
  OS_EVENT *Mbox =0;
  OS_EVENT *Sem =0;
  Packet packet;

  // Mailbox
  if ((intID == 1)||(intID == 4))
  {
  	Mbox = ((PRINT_PARAM*)data)->Mbox;    
  }
  //Semaphore
  else
  {
    Sem = ((PRINT_PARAM*)data)->Sem;
  }
  
  while(1)
  {
  
    // Mailbox
    if ((intID == 1)||(intID == 4))
    {
     	OSMboxPend(Mbox, &packet, 0);    
    }
    //Semaphore
    else
    {
    	OSSemPend(Sem, 0, &err);
	    if (intID==2)
	    {
	       packet.src = ptrInt2SplitVar->src;
	       packet.dst = ptrInt2SplitVar->dst;
	       packet.type = ptrInt2SplitVar->type;
	    }
	    else if (intID==3)
	    {
	       packet.src = ptrInt3SplitVar->src;
	       packet.dst = ptrInt3SplitVar->dst;
	       packet.type = ptrInt3SplitVar->type;
	    }

    }
	
    printf("---- TASK_PRINT-----\n");
    printf("Packet received on %d.\n", intID);
    printf("    -- src : 0x%8x \n", packet.src);
    printf("    -- dst : 0x%8x \n", packet.dst);
    printf("    -- type : %d \n", packet.type);
  }
}

