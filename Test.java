
public class Test {
	
	public static void main(String[] args) {
		BTLinked t = new BTLinked();
		
		//level 0
		Node root = t.addRoot(4);
		t.addLeft(10 , root);
		t.addRight(29, root);
		t.addRight(5, root.left);
		t.postOrderTraversal(root);
		t.addLeft(7, root.left);
		t.addLeft(19, root.right);
		t.addRight(24, root.right);
		
		
		
		
  	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//BTArray<Integer> bTree = new BTArray(5); //the size of the array is now being computed and will be instantiated with null
		
		//level 0
		//bTree.addRoot(100);
		
		//level 1
		//bTree.addLeft(50, 0);
		//bTree.addRight(150, 0);
		
		//level 2
		//bTree.addRight(75, 1);
		//bTree.addLeft(125, 2);
		
		//level 3
		//bTree.addLeft(74, 4);
		//bTree.addRight(76, 4);
		//bTree.addLeft(124, 5);
		//bTree.addRight(130, 5);
		
		//level 4
		//bTree.addLeft(73, 9);
		//bTree.addRight(131, 12);
		
		
		//bTree.bfsTraverse();   //validating
		
	}

}
