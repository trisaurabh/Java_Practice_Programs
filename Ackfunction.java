class Ackfunction{
    
    public static void main(String[] args){
	if(args.length!=2){
	    System.out.println("The usage is Ack m n");
	}
	else{
	    System.out.println(Ack(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
    }
    
    public static int Ack(int m,int n){
	Stack p=new Stack();
	
	p.push(m);
	System.out.println(p.values[0]);
       	while(p.is_empty()==false){
	    m=p.pop();
	    if(m==0){
		n++;
	    }
	    else{
		if(n==0){
		    p.push(m-1);
		    n=1;
		}
		else{
		    p.push(m-1);
		    p.push(m);
		    n--;
		}
	    }
	}
	return n;
    }
}