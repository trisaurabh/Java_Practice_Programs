class Stack{
    private int[] values=new int[500000];
    private int tos=0;
     

    public void push(int i){
	values[tos]=i;
	tos=tos+1;
    }

    public int pop(){
	tos=tos-1;
	return values[tos];
    }	
    
    public boolean is_empty(){
	return(tos==0);
    }
}
