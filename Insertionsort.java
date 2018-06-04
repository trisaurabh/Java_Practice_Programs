import java.util.Scanner;

class Insertionsort{
    public static void main(String[] args){
	int[] values=new int[25];
	int b,i,j,k;
	Scanner sc=new Scanner(System.in);
	for(i=0;i<25;i++){
	    System.out.println("your number: ");
	    b=sc.nextInt();
	    values[i]=b;
	}
	    
	k=findlargest(values);
	for(i=0;i<values.length;i++){
	    System.out.println(values[findshortestslot(values)]);
	    
	    values[findshortestslot(values)]=k;
	}
    }
    
    public static int findshortestslot(int[] array){
	int s,i,k;
	k=0;
	s=array[0];
	for(i=0;i<array.length;i++){
	    if(array[i]<s || array[i]==s){
		s=array[i];
		k=i;
	    }
	}
	return k;
    }

    public static int findlargest(int[] array){
	int s,i,k;
	k=0;
	s=array[0];
	for(i=0;i<array.length;i++){
	    if(array[i]>s || array[i]==s){
		s=array[i];
		k=i;
	    }
	}
	return s;
    }
}
