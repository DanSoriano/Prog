public class Test {

	public static void main(String[] args) {
		GraphAL d = new GraphAL(6);
		
		d.addEdge(1, 2);
		d.addEdge(1, 4);
		d.addEdge(2, 4);
		d.addEdge(2, 1);
		d.addEdge(3, 3);
		d.addEdge(3, 5);
		d.addEdge(4, 5);
		d.addEdge(5, 3);
	
		d.displayGraph();
		
	
		GraphAM g = new GraphAM(6);
		
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(2, 4);
		g.addEdge(2, 1);
		g.addEdge(3, 3);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(5, 3);
		
		g.displayGraph();
		
		System.out.print("BFS: ");
		d.BFS(1);
		System.out.println();
		System.out.print("DFS: ");
		d.DFS(1);	
	}
}