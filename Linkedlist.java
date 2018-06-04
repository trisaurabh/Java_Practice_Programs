class Linkedlist{
    public Node head;
       
    public Linkedlist(){
	head=null;
    }

    public boolean is_empty(){
	return head==null;
    }

    public void append(int o){
	Node n;
       	Node m=new Node(o,null);
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
	Node n;
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

	

    
    
    public void printlist(){
	int i;
	Node n;
	n=head;
	for(i=0;i<listsize();i++){
	    System.out.print(n.data+" ");
	    n=n.next;
	}
	System.out.println();
    }

    
    
}  
