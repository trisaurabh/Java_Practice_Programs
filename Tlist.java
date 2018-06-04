class Tlist{
    public TQnode head;
       
    public Tlist(){
	head=null;
    }

    public boolean is_empty(){
	return head==null;
    }

    public void append(Tnode o){
	TQnode n;
       	TQnode m=new TQnode(o);
	if(head==null){
	    head=m;
	}
	else{
	    for(n=head;n.next!=null;n=n.next){}
	    n.next=m;
	}
    }

    public void deletehead(){
	head=head.next;
    }

    public int listsize(){
	TQnode n;
	int i=0;
	if(head==null){
	    return 0;
	}
	else{
	    for(n=head;n.next!=null;n=n.next){
		i=i+1;
	    }
	    return  i+1;
	}
    }

	

    
    
    public void printTlist(){
	int i;
	TQnode n;
	n=head;
	for(i=0;i<listsize();i++){
	    System.out.print(n.datanode.weight+" ");
	    n=n.next;
	}
	System.out.println();
    }

    
    
}  
