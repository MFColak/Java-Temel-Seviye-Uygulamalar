package binaryTree;

public class Node {
	public int data;
	public Node leftChild;
	public Node rigthChild;
	
	public void displayNode() {
		System.out.print('{');
		System.out.print(data);
		System.out.print("'} ");
	}
}
