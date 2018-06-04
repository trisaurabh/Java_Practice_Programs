class Mergelist{
    public static Linkedlist merge(Linkedlist left,Linkedlist right){
	
	Linkedlist result=new Linkedlist();
	
	while(left.listsize() > 0 || right.listsize() >0){
	    if(left.listsize()>0 && right.listsize() >0){
		if(left.head.data <= right.head.data){
		    result.append(left.head.data);
		    left.deletehead();
		}
		else{
		    result.append(right.head.data);
		    right.deletehead();
		}
	    }
	    else{
		if(left.listsize()>0){
		    result.append(left.head.data);
		    left.deletehead();
		}
		if(right.listsize()>0){
		    result.append(right.head.data);
		    right.deletehead();
		}
	    }
	}
	return result;
    }
}



	
	