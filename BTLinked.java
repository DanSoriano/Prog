
public class BTLinked<T> {
	Node root;
	
	BTLinked(){
		root = null;  //empty binary tree
	}
	
	boolean isEmpty() {      //to test if binary tree is empty
		if(root == null) return true;
		return false;
	}
	
	Node addRoot(T data) {
		 return new Node(data);  // adds data to the root
	}
	
	void addLeft(T data, Node pNode) {				//adds data to the left
		Node nodeObj = new Node(data);
		pNode.left = nodeObj;
	}
	
	void addRight(T data, Node pNode) {				//adds data to the right
		Node nodeObj = new Node(data);
		pNode.right = nodeObj;

	}
	
	void preOrderTraversal(Node root) {
		if(root == null) return;
		
		System.out.println(root.data.toString() + "");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		
	}
	
	void postOrderTraversal(Node root) {
		if(root == null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data.toString() + "");
	}
	void inOrderTraversal(Node root) {
		if(root == null) return;
		
		inOrderTraversal(root.left);
		System.out.println(root.data.toString() + "");
		inOrderTraversal(root.right);
		
	
	}
}
