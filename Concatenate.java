class Concatenate{
    public static void main(String[] args){
	Linkedlist list1 = new Linkedlist();
	Linkedlist list2 = new Linkedlist();

	int i;
	Node m;

	for(i=0;i<10;i++){
	    list1.append(i*2);
	    list2.append(i*i);
	}


	
	for(m=list1.head;m.next!=null;m=m.next){
	}
	m.next=list2.head;

	for(m=list1.head;m!=null;m=m.next){
	    System.out.println(m.data);
	}
    }
}

	    
		