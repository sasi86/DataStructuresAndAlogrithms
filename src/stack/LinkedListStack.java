package stack;

public class LinkedListStack<T> {
	Node head;

	class Node {
		T t;
		Node next;
		
		@Override
		public String toString(){
			String str="";
			for(Node n = this; ;){
				str = str + n.toStr() + ",";
				n = n.next;
				if(n==null)
					break;
			}
			return str;
		}
		private String toStr(){
			return t.toString();
		}
	}

	public void push(T t) {
		if(isEmpty()){
			head = new Node();
			head.t = t;
		}else{
			Node oldNode = head;
			head = new Node();
			head.t = t;
			head.next = oldNode;
		}
	}
	
	public T pop() throws Exception{
		if(!isEmpty()){
			T poped = head.t;
			head = head.next;
			return poped;
		}else{
			throw new Exception("Empty Stack!!!");
		}
	}
	
	public T peek(){
		return head.t;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	@Override
	public String toString(){
		return head.toString();
		
	}
}
