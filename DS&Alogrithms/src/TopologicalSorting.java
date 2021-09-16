import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopologicalSorting {

	public static void main(String[] args) {
		Graph graph = new Graph(6);
		graph.AddEdge(0, 2, false);
		graph.AddEdge(1, 4, false);
		graph.AddEdge(1, 2, false);
		graph.AddEdge(2, 3, false);
		graph.AddEdge(3, 5, false);
		graph.AddEdge(4, 5, false);
		
		for(ArrayList<Integer> l : graph.nodes) {
			
			System.out.print("neighbours of node " + graph.nodes.indexOf(l) + " are ") ; 
			for(Integer k : l) {
				System.out.print(" "+ k);
			}
			System.out.println();
		}
		
		System.out.println("Topological Sorting: ");
		TSorting(1, graph.nodes);
		
		
		
	}

	private static void TSorting(int i, ArrayList<ArrayList<Integer>> nodes) {
		// TODO Auto-generated method stub
		int[] inOrder = new int[nodes.size()];
		for(int k=0; k< nodes.size();k++) {
			
				for(int p : nodes.get(k)) {
					inOrder[p]++;
				}
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int z=0; z< inOrder.length; z++) {
			if(inOrder[z] == 0) {
				queue.add(z);
			}
		}
		
		while(!queue.isEmpty()) {
			int pop= queue.remove();
			System.out.println("value  " + pop);
			for(int k: nodes.get(pop)) {
				inOrder[k]--;
				if(inOrder[k] == 0) 
					queue.add(k);
			}
		}
	}


}

class TGraph{
	
	ArrayList<ArrayList<Integer>> nodes= new ArrayList<>();
	TGraph(int number){
		
		for(int i=0; i< number;i++) {
			  
			nodes.add(new ArrayList<>());
		}
		
	}
	
	void AddEdge(int a ,int b, boolean undir){
		
		nodes.get(a).add(b);
		if(undir) nodes.get(b).add(a);
	}

}


