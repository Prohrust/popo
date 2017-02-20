/**   * Linked to @wi COMP-551  */
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