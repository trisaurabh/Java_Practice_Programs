class PGCD{    
    public static void main(String[] args){
	int m=1778112;
	int n=264600;
	System.out.println(pgcd(99,13));
    }
    
    public static int pgcd(int a, int b){
        int r;

	if(a==b){
	    return a;
	}

	if(a>b){
	    r=a%b;
	    if(r==0){
		return b;
	    }
	    else{
		return pgcd(b,r);
	    }
	}
	else{
	    return pgcd(b,a);
	}
    }
}
