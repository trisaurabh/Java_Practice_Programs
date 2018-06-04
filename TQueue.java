class TQueue{
    Tlist a;

    public TQueue(){
	a=new Tlist();
    }

    public void push(Tnode k){
	a.append(k);
    }

    public Tnode pop(){
	Tnode j;
	j=a.head.datanode;
	a.head=a.head.next;
	return j;
    }

    public void printQ(){
	a.printTlist();
    }

    public boolean isqempty(){
	return(a.head==null);
    }
}
	