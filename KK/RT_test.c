/* Test #1 @wi.inits_1 COMP-540 DE Ää Öö ẞß Üü Zz */
#include<stdio.h>

// Test #2 @wi.runs_2 COMP-540 i
int i = 0;

/* Test #3 @wi.resurrects_3 COMP-540 int_ptr */
typedef int *int_ptr;

// Test #4 @wi.runs_4 COMP-540 x
int x;

/* Test #5 @wi.resurrects_5 COMP-540 myDay */
enum days myDay;

// Test #6 @wi.runs_6 COMP-540 max
int max(int a, int b);

/* Test #7 @wi.resurrects_7 COMP-540 max */
int max(int a, int b)
{

};

// Test #8 @wi.runs_8 COMP-540 process
void (*process(int, void (*)(int)))(int) {

};

/* Test #9 @wi.resurrects_9 COMP-540 BBook1 */
struct BBooks BBook1;

// Test #10 @wi.runs_10 COMP-540 book
struct Books {
   char  title[50];
   char  author[50];
   char  subject[100];
   int   book_id;
} book;

/* Test #11 @wi.resurrects_11 COMP-540 MyUnion */
union MyUnion {
   int i;
   float f;
   char str[20];
}; 

// Test #12 @wi.runs_12 COMP-540 days
enum days {MONDAY, TUESDAY, WEDNESDAY};
