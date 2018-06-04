class Makestack{
    public static void main(String[] args){
	Stack s=new Stack();

	int i=0;

	System.out.println(s.is_empty());

	for(i=0;i<100;i++){
	    s.push(i+239);
	}

	for(i=0;i<34;i++){
	    System.out.println(s.pop());
	    System.out.println(s.tos);
	}

	System.out.println(s.tos);

	System.out.println(s.values.length);

	System.out.println(s.is_empty());
    }
}
