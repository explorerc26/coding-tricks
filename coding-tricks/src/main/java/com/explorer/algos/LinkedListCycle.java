package com.explorer.algos;

public class LinkedListCycle {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static class Node {
        int data;
        Node next;
    }

	public static boolean hasCycle(Node head) {
	    
	    if(head == null) return false;
	    Node nextNode = head.next;
	    if(nextNode == null){
	       return false; 
	    }
	    Node nextNextNode = nextNode;
	    while (nextNode != null ){
	        
	        if(nextNode == null || nextNode.next == null){
	            return false;
	        }
	        nextNode = nextNode.next;
	        if(nextNextNode == null || nextNextNode.next == null || nextNextNode.next.next ==null){
	            return false;
	        }
	        nextNextNode = nextNextNode.next.next;
	        if(nextNextNode == nextNode){
	            return true;
	        }
	    }
	    return true;
	}
}
