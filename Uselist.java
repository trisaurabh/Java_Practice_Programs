class Uselist{
    public static void main(String[] args){
	int i;
	Linkedlist c,d;
	Linkedlist list=new Linkedlist();
	Linkedlist list1=new Linkedlist();


	
	
	for(i=0;i<10;i++){
	    list.append(3*i-1);
	    list.append(40-6*i);
	}

	

	list.printlist();

	c=Mergesort.sort(list);

	c.printlist();




	
	
	

    }
}