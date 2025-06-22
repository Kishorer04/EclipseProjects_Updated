package logicfirst;

public class GraphRepresentation {

	public static void main(String[] args) {
		
	    //Representation using Adjacency Matrix 	
		int[][] graph = {
				
				{0,1,0,0,1},				
				{1,0,1,0,1},
				{0,1,0,1,0},
				{0,0,1,0,1},
				{1,1,0,1,0}
				
		                };
		
		Graph g = new Graph(5); // no. of vertices is 5
		
		g.addEdge(0,1);
		g.addEdge(2,3);
		g.addEdge(1,2);
		g.addEdge(3,4);
		g.addEdge(0,4);
		g.addEdge(1,4);
		
		g.printAdjList();	
		
		g.bfs(0);
		
		System.out.println();
		
		g.dfs(0);
	}
}
