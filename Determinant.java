class Determinant{
    public static int[][] minor(int a[][],int i,int sizeof){
	int row,col;
	int[][] b= new int[sizeof-1][sizeof-1];
		
	for(col=1;col<sizeof;col++){
	    for(row=0;row<i-1;row++){
		b[row][col-1]=a[row][col];
	    }
	    for(row=i;row<sizeof;row++){
		b[row-1][col-1]=a[row][col];
	    }
	    
	}	
	return b;
    }
    
    public static double det(int a[][],int sizeof){
	int y=sizeof;
	int i;
	double t=0.0;
	
	if(sizeof==1){
	    return a[0][0];
	}
	else{
	    
	    for(i=0;i<sizeof;i++){
		t=t+Math.pow(-1,i)*a[i][0]*det(minor(a,i+1,sizeof),sizeof-1);
	    }
	}
	
	if(y%2==0){
	    return t;
	}
	else{
	    return t;
	}
    }
    
    public static void main(String[] args){
	int[][] a=new int[3][3];
	int i,j;
	a[0][0]=3;
	a[0][1]=1;
	a[0][2]=9;
	//	a[0][3]=5;
	a[1][0]=9;
	a[1][1]=1;
	a[1][2]=6;
	//	a[1][3]=9;
	a[2][0]=5;
	a[2][1]=8;
	a[2][2]=2;
	//	a[2][3]=54;
	//	a[3][0]=9;
	//	a[3][1]=1;
	//	a[3][2]=5;
	//	a[3][3]=5;
	
	
	
	for(i=0;i<3;i++){
	    for(j=0;j<3;j++){
		System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
	
	for(i=0;i<3;i++){
	    for(j=0;j<3;j++){
		//	System.out.print(minor(a,3,3)[i][j]+" ");
	    }
	    System.out.println();
	}
	System.out.println(det(a,3));
    }
}
		  
		    
	    
	       	