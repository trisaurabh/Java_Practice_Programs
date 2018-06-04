class Insertion{
    public static void main(String[] args){

	int a[]={5,9,4,12,2,7,12};
	
	int i,j,k,l;
	int b,c;
	
	for(i=1;i<a.length;i++){
	    j=i-1;
	    b=a[i];
	    k=i;
	    loop:
	    do{
		if(a[j]>b || a[j]==b){
		    c=a[j];
		    a[j]=b;
		    a[k]=c;
		    k--;
		    j--;
		}
		else{
		    break loop;
		}
	    }
	    while(j>-1);
	    for(l=0;l<a.length;l++){
		System.out.print(a[l]);
	    }
	    System.out.println();
	}

	for(i=0;i<a.length;i++){
	    System.out.println(a[i]);
	
	}
    }
}


	    
	