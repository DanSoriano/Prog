
public class BTArray<T> {
	int levels;
	int limit;
	T[] storage;
	int root = 0;
	
	BTArray(int levels){
		limit = (int) Math.pow(2, levels) - 1;
		storage = (T[]) new Object[limit]; //created an array containe
		root = 0;
	};
	
	boolean isEmpty() {
		if(root==-1) return true;
		else return false;
	}
	
	void addRoot(T data) {
		storage[0] = data;
	}
	void addLeft(T data, int pIndex) { //adds the left node in the tree 
		storage[2*pIndex + 1] = data;  // piIndex stands for K 
	}
	
	void addRight (T data, int pIndex) {
		storage[2*pIndex + 2] = data; //right is greater than left
	}
	
	void  bfsVisit() { //looping in array; "breadth first search"
		for(int  i=0; i<storage.length; i++) {
			System.out.println(storage[i] +   "" );
		}
		
	}
	
	
}
	
	
	
	
	
