import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GraphAdjacencyList {

	public static void main(String[] args) {
		Graph graph = new Graph(7);
		graph.AddEdge(0, 1, true);
		graph.AddEdge(1, 2, true);
		graph.AddEdge(2, 3, true);
		graph.AddEdge(3, 5, true);
		graph.AddEdge(5, 6, true);
		graph.AddEdge(4, 5, true);
		graph.AddEdge(0, 4, true);
		graph.AddEdge(3, 4, true);
		
		for(ArrayList<Integer> l : graph.nodes) {
			
			System.out.print("neighbours of node " + graph.nodes.indexOf(l) + " are ") ; 
			for(Integer k : l) {
				System.out.print(" "+ k);
			}
			System.out.println();
		}
		
		System.out.println("Breadth first traversal of a graph:  ");
		breadthFirstSearch(1,graph.nodes);
		boolean[] visited = new boolean[graph.nodes.size()];
		System.out.println("Depth first traversal of a graph:  ");
		DepthFirstSearch(1,graph.nodes,visited);
		
		
	}

	private static void DepthFirstSearch(int i, ArrayList<ArrayList<Integer>> nodes, boolean[] visited) {
		// TODO Auto-generated method stub
		if(nodes == null) return;
		visited[i] = true;
		System.out.println(i);
		for(int p : nodes.get(i)) {
			if(!visited[p]) {
				DepthFirstSearch(p,nodes, visited);
			}
		}
			
	}

	private static void breadthFirstSearch(int source, ArrayList<ArrayList<Integer>> nodes) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> neighbours = nodes;
		Queue<Integer> queue= new LinkedList<Integer>();
		
		boolean[] visited = new boolean[nodes.size()];
		
		queue.add(source);
		visited[source]=true;
		
		while(!queue.isEmpty()) {
			int k =queue.remove();
			System.out.println(k);
			for(int p : nodes.get(k)) {
				if(!visited[p]) {
					queue.add(p);
					visited[p]=true;
				}
				
			}
		}
		
		
	}
}

class Graph{
	
	ArrayList<ArrayList<Integer>> nodes= new ArrayList<>();
	Graph(int number){
		
		for(int i=0; i< number;i++) {
			  
			nodes.add(new ArrayList<>());
		}
		
	}
	
	void AddEdge(int a ,int b, boolean undir){
		
		nodes.get(a).add(b);
		if(undir) nodes.get(b).add(a);
	}

}


