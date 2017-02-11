package linkedlist;

public class LinkedList {
	Node head;
	Node firstNode;

	class Node {
		int data;
		Node next;
	}

	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head != null) {
			head.next = newNode;
		}else{
			firstNode = newNode;
		}
		head = newNode;
	}

	public int middleElement() {
		Node fastPtr = firstNode;
		Node slowPtr = firstNode;
		for (; fastPtr.next != null;) {
			fastPtr = fastPtr.next.next;
			if(fastPtr==null){
				break;
			}
			slowPtr = slowPtr.next;
		}
		return slowPtr.data;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l.middleElement());
		
	}
}
