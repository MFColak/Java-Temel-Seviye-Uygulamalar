package binaryTree;

public class Tree {
	private Node root;
	
	public Tree() {
		root=null;
	}
	
	public void insert(int id) {
		Node newNode = new Node();
		newNode.data=id;
		
		if (root==null) 
			root=newNode;
		else {
			Node current=root;
			Node parent;
			while (true) {
				parent=current;
				if (id< current.data) //sola git
				{
					current = current.leftChild;
					if  (current==null) {
						parent.leftChild = newNode; //sola ekle
						return;
					}
				}
				else { // saða git
					current = current.rigthChild;
					if(current==null) {
						parent.rigthChild=newNode; //saða ekle
						return;
					}
				}//else
			}//while
		}//else
	}//insert
	
	public Node find(int key) {
		Node current = root;
		while (current.data !=key) {
			if (key< current.data)
				current = current.leftChild;
			else
				current=current.rigthChild;
			if (current== null)
				return null;
		}
		return current;
	}
	
	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\n Preorder:");
			preOrder(root);
			break;
		case 2:
			System.out.print("\n Inorder:");
			inOrder(root);
			break;
		case 3:
			System.out.print("\n Postorder:");
			postOrder(root);
			break;
		}
		System.out.println("");
	}
	
	public void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rigthChild);
		}
	}
	
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rigthChild);
		}
	}
	
	public void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rigthChild);
			System.out.print(localRoot.data + " ");
		}
	}
	
}
