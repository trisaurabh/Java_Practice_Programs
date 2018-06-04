class Factorial{

    public static int fact(int n){
	if(n<0 || n==0){
	    System.out.println("Not possible");
	}

	if(n==1){
	    return 1;
	}
	else{
	    return n*fact(n-1);
	}
    }
}