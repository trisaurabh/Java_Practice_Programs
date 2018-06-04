class Queue{
    Linkedlist a;

    public Queue(){
	a=new Linkedlist();
    }

    public void push(int k){
	a.append(k);
    }

    public int pop(){
	int j;
	j=a.head.data;
	a.head=a.head.next;
	return j;
    }

    public void printQ(){
	a.printlist();
    }

    public boolean isqempty(){
	return(a.head==null);
    }
}
	
	