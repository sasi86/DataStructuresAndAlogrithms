package stack;

public class Stack {
	int size;
	int[] elem;
	int top;
	
	public Stack(int size){
		this.size = size;
		this.elem = new int[size];
		top = -1;
	}
	
	public void push(int el) throws Exception{
		if(!isFull()){			
			elem[++top] = el; 
		}else{
			throw new Exception("Stack Full");
		}		
	}
	
	public int pop() throws Exception{
		if(!isEmpty()){
			elem[top--] = 0;
			return elem[top] ;
		}else{
			throw new Exception("Stack Empty");
		}
	}
	
	boolean isEmpty(){
		return (top == -1);
	}
	
	boolean isFull(){
		return ((size-1) == top);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i : elem){
			s.append(i);
			s.append(",");
		}
		s.append("]");
		return s.toString();
	}

}

