package stack;

public class MainClass {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack(6);
		s.push(2);
		s.push(3);
		s.push(20);
		s.pop();
		System.out.println(s);
	}
}
