// Topological Sorting

// A Java program to print topological
// sorting of a DAG
import java.io.*;
import java.util.*;

class Graph {
	// No. of vertices
	private int V;

	// Adjacency List as ArrayList of ArrayList's
	private ArrayList<ArrayList<Integer> > adj;

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new ArrayList<ArrayList<Integer> >(v);
		for (int i = 0; i < v; ++i)
			adj.add(new ArrayList<Integer>());
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) { adj.get(v).add(w); }

	// A recursive function used by topologicalSort
	void topologicalSortUtil(int v, boolean visited[],
							Stack<Integer> stack)
	{
		// Mark the current node as visited.
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent
		// to thisvertex
		Iterator<Integer> it = adj.get(v).iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i])
				topologicalSortUtil(i, visited, stack);
		}

		// Push current vertex to stack
		// which stores result
		stack.push(new Integer(v));
	}
	void topologicalSort()
	{
		Stack<Integer> stack = new Stack<Integer>();

		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		// Print contents of stack
		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");
	}

	// Driver code
	public static void main(String args[])
	{
		// Create a graph given in the above diagram
		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological "
						+ "sort of the given graph");
		// Function Call
		g.topologicalSort();
	}
}
