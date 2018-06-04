import java.util.Scanner;

class matrix{
    int row; 
    int col;
    int[][] a;

    public matrix(int r, int c){
	row=r;
	col=c;
	a=new int[row][col];
    }
	
	
	
    

    public void takematrix(){
	int i,j,b;
	Scanner sc=new Scanner(System.in);
	
	for(i=0;i<row;i++){
	    for(j=0;j<col;j++){
		System.out.print("a["+i+"]["+j+"]: ");
		b=sc.nextInt();
		a[i][j]=b;
	    }
	    System.out.println();
	}
    }

    public void printmatrix(){
	int i,j;
	for(i=0;i<row;i++){
	    for(j=0;j<col;j++){
		System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
    }
}
	
