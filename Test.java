  

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree t = new AVLTree();
		t.root = t.insert(t.root, 10);
		t.root = t.insert(t.root, 20);
		t.root = t.insert(t.root, 30);
		t.root = t.insert(t.root, 40);
		t.root = t.insert(t.root, 50);
		t.root = t.insert(t.root, 25);
		t.preOrder(t.root);

	}

}