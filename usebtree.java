class usebtree{
    public static void main(String[] args){
	int i;
	Btree tree=new Btree();

	tree.append(8);
	tree.append(3);
	tree.append(10);
	tree.append(1);
	tree.append(6);
	tree.append(14);
	tree.append(4);
	tree.append(7);
	tree.append(13);
	
	
	System.out.println();
	//System.out.println(tree.height);
	//tree.print_tree();


	System.out.println();
	tree.print_tree();
	inorder(tree.root);
	//	inorder(tree.root);
	System.out.println();
	bfs(tree.root);
    }

    public static void inorder(Tnode m){
	if(m==null){}
	else{	
	    if(m.left!=null){
		inorder(m.left);
	    }
	    
	    System.out.print(" "+m.weight+" ");
	
	    if(m.right!=null){
		inorder(m.right);
	    }
	}
    }

    public static void bfs(Tnode m){
	Tnode n;
	TQueue q=new TQueue();
	if(m==null){
	}
	else{
	    q.push(m);
	    while(q.isqempty()==false){
		n=q.pop();
		System.out.print(" "+n.weight+" ");
		if(n.left!=null){
		    q.push(n.left);
		}
		if(n.right!=null){
		    q.push(n.right);
		    //System.out.println();
		}		
	    }	    
	}
    }
}