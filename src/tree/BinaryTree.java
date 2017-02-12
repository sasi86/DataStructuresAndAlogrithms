package tree;

import java.util.Stack;

public class BinaryTree {

	static class TreeNode {
		public TreeNode(int data) {
			this.data = data;
		}

		int data;
		TreeNode left;
		TreeNode right;
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		TreeNode node5 = new TreeNode(5);
		TreeNode node55 = new TreeNode(55);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		node10.left = node5;
		node50.left = node55;

		return rootNode;
	}

	static Stack<TreeNode> printSpiral(Stack<TreeNode> s, String flag) {
		Stack<TreeNode> printStack = new Stack<>();
		while (!s.isEmpty()) {
			TreeNode node = s.pop();
			if (node != null) {
				System.out.println(node.data);
				if (flag.equals("RL")) {
					printStack.push(node.left);
					printStack.push(node.right);
				} else {
					printStack.push(node.right);
					printStack.push(node.left);
				}
			}
		}
		return printStack;
	}

	static void inOrder(TreeNode node) {
		if (node != null) {
			System.out.println(node.data);
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	
	static int getMax(TreeNode node) {
		int max =0;
		if (node != null) {
			int value =node.data;
			int left = getMax(node.left);
			int right = getMax(node.right);
			if(left  > right){
				max = left;
			}else{
				max = right;
			}
			if(value > max){
				max = value;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Stack<TreeNode> s = new Stack<>();
		s.push(createBinaryTree());
		int i = 1;
		while (!s.isEmpty()) {
			if (i % 2 != 0)
				s = printSpiral(s, "RL");
			else
				s = printSpiral(s, "LR");
			i++;
		}
		System.out.println("----------------");
		inOrder(createBinaryTree());
		System.out.println("----------------");
		System.out.println(getMax(createBinaryTree()));
	}

}
