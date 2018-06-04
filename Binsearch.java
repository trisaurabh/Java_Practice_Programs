import java.util.Random;

class Binsearch{
    public static void main(String args[]){
	Linkedlist L=new Linkedlist();
	int i;

	
	
		for(i=0;i<100;i++){
	  Random rand = new Random();
	  
	  int number = rand.nextInt(200)+1;
	  L.append(number);
	}

	L.append(365);
	L.append(387);
	L.append(87);
	L.append(56);

		
	for(i=0;i<100;i++){
	 Random rand = new Random();
	    
	  int number = rand.nextInt(200)+1;
	  L.append(number);
	}

	
	L.printlist();
	search(L,87);
    }


    
    public static void search(Linkedlist list,int number){
	Linkedlist left = new Linkedlist();
	Linkedlist right = new Linkedlist();
	
	int i,j;
	
	
	if(list.listsize() == 0){
	    System.out.println("The number does not exist");
	    
	    
	}
	else{
	    
	    if(list.listsize() == 1 && list.head.data==number){
		System.out.println("The number exists");
		System.exit(0);
	    }
	    else{
		if(list.listsize() == 1 && list.head.data!=number){
		    
		}
		else{
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
		    
		    left.printlist();
		    right.printlist();
		    
		    search(left,number);
		    search(right,number);
		    
		}
	    }
	}
    }
}

		    
	     
        
		    
