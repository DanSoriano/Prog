import java.util.Iterator;
import java.util.LinkedList;

public class GraphAL {
	int n;
	LinkedList<Integer>[] al;
	
	public GraphAL(int n) {
		
		this.n = n;
		al = new LinkedList[n];
		for(int i=0; i<al.length; i++) {
			al[i]  = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int start, int end) {
		al[start].add(end);
		
		
	}
	
	public void displayGraph() {
		System.out.println("Adjacency List");
		System.out.println("---------");
		for(int i=0; i<al.length; i++) {  //iterating in array
			switch(i) {
			case(1): System.out.print("a: ");
					break;
			case(2): System.out.print("b: ");
			break;
			case(3): System.out.print("c: ");
			break;
			case(4): System.out.print("d: ");
			break;
			case(5): System.out.print("e: ");
			break;
			}
			for(int j=0; j<al[i].size(); j++) {		//iterating in the linkedlist

				switch(al[i].get(j)) {
				case(1): System.out.print("a ");
						break;
				case(2): System.out.print("b ");
				break;
				case(3): System.out.print("c ");
				break;
				case(4): System.out.print("d ");
				break;
				case(5): System.out.print("e ");
				break;
				}
				
			}
			System.out.println();
		}
	}
	
	void BFS(int start) {
		boolean visited[] = new boolean[n]; // if the node is vsited or not; will set the values to flase
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		
		visited[start]= true;
		queue.add(start);
		
		while (queue.size() !=0){
			start = queue.poll();
//			System.out.print(start + " ");
			switch(start) {
			case(1): System.out.print("a ");
					break;
			case(2): System.out.print("b ");
			break;
			case(3): System.out.print("c ");
			break;
			case(4): System.out.print("d ");
			break;
			case(5): System.out.print("e ");
			break;
			}
			
			Iterator<Integer> i = al[start].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	private void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		switch(v) {
		case(1): System.out.print("a ");
				break;
		case(2): System.out.print("b ");
		break;
		case(3): System.out.print("c ");
		break;
		case(4): System.out.print("d ");
		break;
		case(5): System.out.print("e ");
		break;
		}
		
		Iterator<Integer> i = al[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}
	
	void DFS(int v) {
		boolean visited[] = new boolean[n];
		DFSUtil(v, visited);
	}
}
