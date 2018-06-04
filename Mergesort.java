class Mergesort{
    public static void main(String args[]){
	Linkedlist L=new Linkedlist();
	L.append(45);
	L.append(87);
	L.append(23);
	L.printlist();
	sort(L).printlist();

    }


    public static Linkedlist sort(Linkedlist list){
	Linkedlist left=new Linkedlist();
	Linkedlist right=new Linkedlist();
	int i,j;
	
	if(list.listsize() <=1){
	    return list;
	}
	
	if(list.listsize()%2==0){
	    i=list.listsize()/2;
	}
	else{
	    i=(list.listsize()+1)/2;
	}
	
	for(j=0;j<i;j++){
	    left.append(list.head.data);
	    list.deletehead();
	}
	
	
	right=list;

      
	left=sort(left);
	
	right=sort(right);
	
	return Mergelist.merge(left,right);
    }
}




 