package com.explorer.graph;

import java.util.LinkedList;

public class Graph {

	public LinkedList<Integer>[] adjacencyLists;

	public LinkedList<Integer>[] getAdjacencyLists() {
		return adjacencyLists;
	}
	public Graph(int vertices) {
		adjacencyLists = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyLists[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int from, int to){
		adjacencyLists[from].add(to);
	}
	public int getTotalVertices(){
		return adjacencyLists.length;
	}
}
