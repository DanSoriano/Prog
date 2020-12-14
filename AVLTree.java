

public class AVLTree {
	Node root;
	
	AVLTree(){
		root = null;  // initially there is no data in the tree so the root would be null
	}
	
	int getHeight(Node n) {    //to monitor the present height of the tree
		if(n==null) {		//if the root is empty
			return 0;		// it will get out of the method
		}
		return n.height;   //will return the height or the farthest node(?)
	}
	
	int max(int a, int b) {
		return (a>b) ? a : b;   //testing which is higher; if a is higher than a return b vice versa
	}
	
	Node leftRotate(Node x) {
		//before rotation
		Node y = x.right;
		Node T2 = y.left;
		
		//after rotation
		y.left = x;
		x.right = T2;
		
		x.height = max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;
		
	}
	
	int getBalance(Node n) {
		if(n==null) return 0;
		
		return getHeight(n.left) - getHeight(n.right);   //returns the balance factor
	}
	
	Node rightRotate(Node x) {
		//before rotation
		Node y = x.left;
		Node T3 = y.right;
		
		//after rotation
		y.right = x;
		x.left = T3;
		
		x.height = max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;
	}
	
	Node insert(Node root, int data) {    //inserts new root node; accepts the present root node and the data to be inserted
		Node nodeObj = new Node(data);  //creating the new node that will be inserted
		if(root == null) return nodeObj;
		
		if(data < root.data) {                        //comparing the root node to the data that will be inserted
			root.left = insert(root.left, data);
		}else if(data > root.data) {
			root.right =insert(root.right, data);
		}else {
			return root;
		}
		
		//update height of root
		root.height = max(getHeight(root.left), getHeight(root.right)) + 1;
		
		//get balance factor of root
		int balance = getBalance(root);
		
		//left left insertion
		if(balance > 1 && data < root.left.data) {
			return rightRotate(root);
		}
		
		//right right insertion
		if(balance < -1 && data > root.right.data) {
			return leftRotate(root);
		}
		
		//left right insertion
		if(balance > 1 && data > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}
		
		//right left rotation
		if(balance < -1 && data < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
		return root;
	}
	
	void preOrder(Node root) {
		if(root == null) return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.data + " ");
	}

}