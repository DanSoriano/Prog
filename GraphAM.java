public class GraphAM {
	int n;
	int [][] am;
	
	public GraphAM(int n) {
		this.n = n;
		am = new int[n][n];
	}
	
	public void addEdge(int start, int end) {
		am[start][end] = 1;
	}

	public void displayGraph() {
		System.out.println("Adjacency Matrix");
		System.out.println("----------------");
		for (int i=1; i<am.length; i++) {
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
			for (int j=1; j<am[i].length; j++) {
				System.out.print(am[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}