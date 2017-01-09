package com.explorer.graph;

public class GraphUtil {
	public static Graph createSampleGraph(){
//		Graph g = new Graph(4);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 3);
//        return g;
		
		Graph g = new Graph(8);
        g.addEdge(4, 2);
        g.addEdge(4, 1);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(2, 6);
        g.addEdge(2, 5);
        g.addEdge(5, 7);
        g.addEdge(6, 7);
        g.addEdge(3, 6);
        g.addEdge(1, 3);
       
        return g;
	}
}
