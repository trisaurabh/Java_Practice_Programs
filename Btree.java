class Btree{
    public Tnode root;
    public Btree(){
	root=null;
    }

    public void append(int key){
	Tnode m=new Tnode(key);
	Tnode dummy;
	
	if(root==null){
	    root=m;
	    
	}
       	else{	    
	    dummy=root;
	    loop:
	    while(dummy.left!=null || dummy.right!=null){
		//	System.out.println("weightofdummy: "+dummy.weight);
		if(dummy.weight<key && dummy.right==null){
		    //dummy.right=m;
		    
		    // m.parent=dummy;
		    break loop;
		}
		else{
		    if(dummy.weight<key && dummy.right!=null){
			dummy=dummy.right;
		    }
		    else{
			if(dummy.weight>=key && dummy.left==null){
			    //dummy.left=m;
			    // m.parent=dummy;
			    break loop;
			}
			else{
			    if(dummy.weight>=key && dummy.left!=null){
				dummy=dummy.left;
			    }
			}
		    }
		}		
	    }
	    //System.out.println("weightofdummy: "+dummy.weight);
	   
	    if(dummy.weight>key){
		dummy.left=m;
		//	m.parent=dummy;
	    }
	    else{
		dummy.right=m;
		//	m.parent=dummy;
	    }
	}
    }



    public void print_tree(){
	Tnode lefty,righty;
	Btree auxleft=new Btree();
	Btree auxright=new Btree();
	if(root==null){
	    //System.out.print(" ");
	}
	else{
	    root.printnode();
	    lefty=root;
	    righty=root;
	    lefty=lefty.left;
	    righty=righty.right;
	    auxleft.root=lefty;
	    auxright.root=righty;
	    auxright.print_tree();
	    auxleft.print_tree();
	    
	}
    }
}
