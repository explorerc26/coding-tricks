package com.explorer.search;

import java.util.Iterator;
import java.util.Stack;

import com.explorer.graph.Graph;
import com.explorer.graph.GraphUtil;

public class DepthFirstSearch {
	
	public static void main(String[] args) {
		Graph graph = GraphUtil.createSampleGraph();
		new DepthFirstSearch().traverse(graph, 4);
	}

	public void traverse(Graph g, int node) {
        // set as false)
        boolean[] visited = new boolean[g.getTotalVertices()];
 
        // Create a stack for DFS
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(node);
		visited[node] = true;
		while(!stack.isEmpty()){
			int currentNode=stack.pop();  
			System.out.print(currentNode + "\t"); 
        	Iterator<Integer> iterator = g.adjacencyLists[currentNode].listIterator();
        	while(iterator.hasNext()){
        		int n = iterator.next();
        		if(visited[n]== false){
        			visited[n]= true;
        			stack.add(n);
        		}
        	}
		}
		
	}
}
