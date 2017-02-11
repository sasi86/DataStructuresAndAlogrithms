package stack;

import java.util.Stack;

public class MainClass {
	public static void main(String[] args) throws Exception {
		LinkedListStack<Integer> s = new LinkedListStack<>();
		s.push(2);
		s.push(3);
		s.push(20);
		s.push(43);
		s.push(22);
		/*s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());*/
		stackclaa();
	}
	
	public static void stackclaa(){
		Stack<Integer> nos = new Stack<>();
		nos.push(10);
		nos.push(20);
		nos.push(25);
		System.out.println(nos.peek());
		Stack<Integer> sorted = sortStack(nos);
		while(!sorted.isEmpty()){
			System.out.println(sorted.pop());
		}
	}
	
	public static Stack sortStack(Stack<Integer> stack)
	 {
	  Stack<Integer> tempStack = new Stack<>();
	  while(!stack.isEmpty())
	  {
	   int currentData=stack.pop();
	   if(!tempStack.isEmpty())
		   System.out.println(""+tempStack.peek() +" > " + currentData);
	   while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
	    stack.push(tempStack.pop());
	    System.out.println(stack);
	    System.out.println(tempStack);
	         }
	   tempStack.push(currentData);
	   System.out.println(tempStack);
	  }
	  return tempStack;
	 }

}
