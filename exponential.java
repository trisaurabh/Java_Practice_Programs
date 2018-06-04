class exponential{

    static double expvalue(int n){
	int i;
	double t,s;
	t=0.0;
	s=1.0;
	for(i=1;i<=n;i++){
	    t=t+s;
	    s=s*(1.0/i);
	}

	return t;
    }
    
    public static void main(String[] args){
	System.out.printf("%.30f",expvalue(100));
    }
}