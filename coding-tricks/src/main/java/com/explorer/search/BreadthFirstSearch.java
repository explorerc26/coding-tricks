package com.explorer.search;

import java.util.Iterator;
import java.util.LinkedList;

import com.explorer.graph.Graph;
import com.explorer.graph.GraphUtil;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Graph graph = GraphUtil.createSampleGraph();
		new BreadthFirstSearch().traverse(graph, 2);
	}

	
	public void traverse(Graph  g, int node){
        // set as false)
        boolean[] visited = new boolean[g.getTotalVertices()];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[node] = true;
        queue.add(node);
        while(!queue.isEmpty()){
        	int currentNode = queue.poll();
        	System.out.print(currentNode+" ");
        	Iterator<Integer> iterator = g.adjacencyLists[currentNode].listIterator();
        	while(iterator.hasNext()){
        		int n = iterator.next();
        		if(visited[n]== false){
        			visited[n]= true;
        			queue.add(n);
        		}
        		
        	}
        }
	}
}
