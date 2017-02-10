package stack;

public class StackType<T> {

	int size;
	Object[] elem;
	int top;

	public StackType(int size) {
		this.size = size;
		this.elem = new Object[size];
		top = -1;
	}

	public void push(T el) throws Exception {
		if (!isFull()) {
			elem[++top] = el;
		} else {
			throw new Exception("Stack Full");
		}
	}

	public T pop() throws Exception {
		if (!isEmpty()) {
			elem[top--] = null;
			return (T) elem[top];
		} else {
			throw new Exception("Stack Empty");
		}
	}

	boolean isEmpty() {
		return (top == -1);
	}

	boolean isFull() {
		return ((size - 1) == top);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (Object i : elem) {
			if (i != null) {
				s.append(",");
				s.append(i.toString());
				
			}

		}
		s.append("]");
		return s.toString();
	}

}
