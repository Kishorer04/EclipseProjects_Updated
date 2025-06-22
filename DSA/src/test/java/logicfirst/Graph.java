package logicfirst;


import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class Graph {
	

	ArrayList<ArrayList<Integer>> adjList = new ArrayList();
	
	public Graph(int v) {
		
		for(int i=0;i<v;i++)
		{
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	
	 void addEdge(int u, int v)
	{
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	 
	 
	 void printAdjList() {
		 
		 for(int i=0;i<adjList.size();i++) //i --> vertex no.
		 {
			 System.out.println("Adj list of vertex "+ i);
			 
			 for(int j=0;j<adjList.get(i).size();j++)
			 {
				 System.out.println(" "+adjList.get(i).get(j));
			 }
			 
		 }
	 }
	 
	 
	public void bfs(int v) {  // v --> starting vertex
		
		int V = adjList.size();  // Total number of vertices
		
		boolean[] visited = new boolean[V];
		
		visited[v]= true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(v);
		
		
		while(q.size()!=0)
		{
			//dequeue
			int vertex = q.remove(); //By default removes head
			System.out.print(vertex+ " ");
			
			
			for(int i=0;i<adjList.get(vertex).size();i++)
			{
				int av = adjList.get(vertex).get(i);
				
				if(!visited[av])
				{
					q.add(av);
					
					visited[av]=true;
				}
			}
		}	
	}
	
	
	public void dfs(int v)
	{
		int V = adjList.size(); // Total number of vertices
		boolean[] visited = new boolean[V];
		
		dfs2(v,visited);
	}
	
	public void dfs2(int v, boolean[] visited)
	{
		visited[v]= true;
		System.out.print(v + " ");
		
		for(int i=0;i<adjList.get(v).size();i++)
		{
			int av = adjList.get(v).get(i);
			
			if(!visited[av])
				dfs2(av, visited);
		}
		
	}

}
