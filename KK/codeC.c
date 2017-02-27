Single line:
#define TRACE_SYSTEM sched

// @wi QAZ/QAZ-76 link comment
static int fcmp_eq(struct sh_fpu_soft_struct *fregs, struct pt_regs *regs, int m, int n){return 0;}


Multi line:
#define BOTH_PRmn(op,x) \
FP_DECL_EX; if(FPSCR_PR) op(D,x,DRm,DRn); else op(S,x,FRm,FRn);
               
// @wi QAZ-76 link comment
static int fcmp_eq(struct sh_fpu_soft_struct *fregs, struct pt_regs *regs, int m, int n){return 0;}

Link binding: link will be bound to function, not to directive
// @wi QAZ-76 link comment
#define XFn  (FR[BANK(XREG(n))])
               
static int fcmp_eq(struct sh_fpu_soft_struct *fregs, struct pt_regs *regs, int m, int n){return 0;}
