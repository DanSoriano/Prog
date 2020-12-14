
public class BST {
	Node root;
	
	BST() {
		root = null;
	}
	
	void add(int data) {
		Node nodeObj = new Node(data);
		if(root == null) {
			root = nodeObj;
			return;
		} 
			Node pNode = root;
			while(pNode != null) {   //we assume that the root is the parent node; the code says "if the root is not null"
				if(data < pNode.data) {  // if the data that will be inserted is less than the parent node(root in this case)      
					if(pNode.left == null) {  
						pNode.left = nodeObj;    // for the data to go to the left
						return;
					}
					pNode = pNode.left;
					} else {
						if(pNode.right == null) {
						pNode.right = nodeObj;      // for the data to go to the right
						return;
					}
					pNode = pNode.right;
					
					
			}
		}
	}
	
	Node search(int searchData) {
		if(root == null) return null;
		Node pNode = root;
		while(pNode !=null) {
			if(searchData == pNode.data) {
				return pNode;
			} else if(searchData < pNode.data) {
				pNode = pNode.left;
			}else {
				pNode = pNode.right;
			}
		}
		return null;
	}


	void preOrderTraversal(Node root) {
		if(root == null) return;
		
		System.out.println(root.data + "");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		
		
	}
	
}