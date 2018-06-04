class TnodeL{
    int weight;
    int haut;
   
    TnodeL left;
    TnodeL right;
    //Tnode parent;

    public TnodeL(int a,int b){
	weight=a;
	haut=b;
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
