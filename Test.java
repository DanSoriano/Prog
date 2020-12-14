
public class Test {
	public static void main (String[] args) {
	BST t = new BST();
	
	//level 0
	t.add(10);
	
	
	//level 1
	t.add(9);
	t.add(26);
	
	//level 2
	t.add(7);
	t.add(17);
	t.add(32);
	
	//level 3
	t.add(3);
	t.add(8);
	t.add(14);
	t.add(21);
	
	//level 4
	t.add(15);
	t.add(18);
	
	t.preOrderTraversal(t.root); 
	
	System.out.println();
	Node found = t.search(1);
	
	if(found !=null) {
		System.out.println(found.data + " is found inside the BST...");
	} else {
		System.out.println("data not found...");
	}
	
		}
	
	}
	
	
	
	
