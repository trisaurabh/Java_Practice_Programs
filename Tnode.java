class Tnode{
    int weight;
    
   
    Tnode left;
    Tnode right;
    //Tnode parent;

    public Tnode(int a){
	weight=a;
	left=null;
	right=null;
	//	parent=null;
    }

   

    public void printnode(){
	if(left==null && right==null){}
	else{
	    if(left!=null && right!=null){
		System.out.println("  "+weight);
		System.out.println(" /"+" \\");
		System.out.println(left.weight+"   "+right.weight);
	    }
	    else{
		if(left!=null && right==null){
		    System.out.println("  "+weight);
		    System.out.println(" /");
		    System.out.println(left.weight);
		}
		else{			
		    if(left==null && right!=null){
			System.out.println("  "+weight);
			System.out.println("   \\");
			System.out.println(" "+"   "+right.weight);
		    }
		}
	    }
	}
    }
}
