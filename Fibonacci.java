class Fibonacci{
 
    public static void main(String[] args){
	if(args.length!=1){
	    System.out.println("Usage Fibonacci of number");
	}
	else{
	    fib(Long.parseLong(args[0]));
	}
    
    }

    public static void fib(long m){
	long i,t,r,s;
	if(m==0){
	    System.out.println(0);
	}
	else{
	    if(m==1){
		System.out.println(0);
		System.out.println(1);
	    }
	    else{
		System.out.println(0);
		System.out.println(1);
		r=0;
		t=1;
		for(i=0;i<m-2;i++){
		    System.out.println(t+r);
		    s=r;
		    r=t;
		    t=t+s;	    
		}
	    }
	}
    }
}
	   