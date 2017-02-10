package stack;

public class MainClass {
	public static void main(String[] args) throws Exception {
		LinkedListStack<Integer> s = new LinkedListStack<>();
		s.push(2);
		s.push(3);
		s.push(20);
		s.push(43);
		s.push(22);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}
}
