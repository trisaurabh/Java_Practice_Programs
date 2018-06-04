class Btreelaurent{
    public TnodeL root;
    int height;

    public Btreelaurent(){
	root=null;
	height=-1;
    }

    public void append(int key){
	TnodeL m=new TnodeL(key,0);
	TnodeL dummy;
	int i;
	i=0;
	if(root==null){
	   root=m;
	   height=0;
	}
       	else{
	    
	    dummy=root;
	    loop:
	    while(dummy.left!=null || dummy.right!=null){
		i=i+1;
		m.haut=i;
		//	System.out.println("weightofdummy: "+dummy.weight);
		if(dummy.weight<key && dummy.right==null){
		    dummy.right=m;
		    
		    // m.parent=dummy;
		    break loop;
		}
		else{
		    if(dummy.weight<key && dummy.right!=null){
			dummy=dummy.right;
		    }
		    else{
			if(dummy.weight>=key && dummy.left==null){
			    dummy.left=m;
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
	    if (height<i) {
		height=i;
	    }
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

    public void find_height(int h){
	Tnode lefty,righty;
	Btree auxleft=new Btree();
	Btree auxright=new Btree();
	if(root==null){
	    //System.out.print(" ");
	}
	else{
	    if (root.haut==h){
		System.out.print
	    printnode_l("fuck");
	    //lefty=root;
	    //righty=root;
	    // lefty=lefty.left;
	    //righty=righty.right;
	    //auxleft.root=lefty;
	    //auxright.root=righty;
	    //auxright.print_tree();
	    //auxleft.print_tree();
	    
	}
    }
    public void print_tree(){
	int i,j;
	
	for (i=height;i>-1;i--){
	    if (root!=null) {
		//System.out.print(getPrefix(i,' ')+root.weight+"\n");
		for j
	    }

	}
    }
protected String getPrefix(int length, char charToFill) {
    int pos;
    pos=0;
  if (length > 0) {
    char[] array = new char[length];
    while (pos < length) {
        array[pos] = charToFill;
        pos++;
    }
    return new String(array);
  }
  return "";
}


    public void printnode_l(String prefix){
	if (root!=null) {
	    if(root.left==null && root.right==null){}
	    else{
		if(root.left!=null && root.right!=null){
		    System.out.println(prefix+"  "+root.weight);
		    System.out.println(prefix+" /"+" \\");
		    System.out.println(prefix+root.left.weight+"   "+root.right.weight);
		}
		else{
		    if(root.left!=null && root.right==null){
			System.out.println(prefix+"  "+root.weight);
			System.out.println(prefix+" /");
			System.out.println(prefix+root.left.weight);
		    }
		    else{			
			if(root.left==null && root.right!=null){
			    System.out.println(prefix+"  "+root.weight);
			    System.out.println(prefix+"   \\");
			    System.out.println(prefix+" "+"   "+root.right.weight);
			}
		    }
		}
	    }
	}
    }
}