package com.explorer.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.explorer.binarytree.SimpleBinaryTree.TreeNode;

public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode simpleTreeRootNode = TreeUtil.getSimpleTree();

		System.out.println("Pre order");
		TreeTraversal.preOrderIterative(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " ")); 
		System.out.println();
		TreeTraversal.preorderRecursive(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " ")); 
		System.out.println();
		
		System.out.println("in order");
		TreeTraversal.inOrderIterative(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " ")); 
		System.out.println();
		TreeTraversal.inorderRecursive(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " ")); 
		System.out.println();
		
		System.out.println("post order");
		TreeTraversal.postOrderIterative(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		TreeTraversal.postorderRecursive(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " ")); 
		System.out.println();
		
		
		System.out.println("Level Order traversal");
		TreeTraversal.levelOrdertraversal(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("Spiral Order traversal");
		TreeTraversal.spiralOrdertraversal(simpleTreeRootNode).stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
	}

	/**
	 * Steps for PreOrder traversal are: 
	 * 	Visit the node. 
	 * 	Traverse the left
	 *  subtree in PreOrder Traverse the right subtree in PreOrder. 
	 * There can be two ways of implementing it 
	 * 	Recursive 
	 * 	Iterative
	 * 
	 * @return
	 */
	public static List<TreeNode> preOrderIterative(TreeNode rootNode) {
		List<TreeNode> output = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (rootNode == null) {
			return output;
		}
		stack.push(rootNode);
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			output.add(node);
			if (node.right != null)
				stack.push(node.right);
			if (node.right != null)
				stack.push(node.left);
		}
		return output;
	}
	
	public static List<TreeNode> inOrderIterative(TreeNode rootNode) {
		List<TreeNode> output = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (rootNode == null) {
			return output;
		}
		TreeNode currentNode = rootNode;
		while (!stack.empty() || currentNode != null) {
			
			if(currentNode!= null){
				stack.push(currentNode);
				currentNode = currentNode.left;
			}else{
				TreeNode node = stack.pop();
				output.add(node);
				currentNode= node.right;
			}
		}
		return output;
	}
	
	
	/**
	 * 
	 * 1.1 Create an empty stack
	 * 2.1 Do following while root is not NULL
	 *     a) Push root's right child and then root to stack.
	 *     b) Set root as root's left child.
	 * 2.2 Pop an item from stack and set it as root.
	 *     a) If the popped item has a right child and the right child 
	 *        is at top of stack, then remove the right child from stack,
	 *        push the root back and set root as root's right child.
	 *     b) Else print root's data and set root as NULL.
	 * 2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
	 * 
	 * @param rootNode
	 * @return
	 */
	public static List<TreeNode> postOrderIterative(TreeNode rootNode) {
		List<TreeNode> output = new ArrayList<>();

		if (rootNode == null)
			return output;

		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode current = rootNode;

		while (true) {

			if (current != null) {
				if (current.right != null)
					s.push(current.right);
				s.push(current);
				current = current.left;
				continue;
			}

			if (s.isEmpty())
				return output;
			current = s.pop();

			if (current.right != null && !s.isEmpty() && current.right == s.peek()) {
				s.pop();
				s.push(current);
				current = current.right;
			} else {
				output.add(current);
				current = null;
			}
		}

	}
	
	public static List<TreeNode> preorderRecursive(TreeNode node) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if(node!= null){
			result.add(node);
			
			List<TreeNode> left = preorderRecursive(node.left);
			result.addAll(left);
			List<TreeNode> right = preorderRecursive(node.right);
			result.addAll(right);
		}
		return result;
	}
	
	public static List<TreeNode> inorderRecursive(TreeNode node) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if(node!= null){
			List<TreeNode> left = inorderRecursive(node.left);
			result.addAll(left);
			
			result.add(node);
			
			List<TreeNode> right = inorderRecursive(node.right);
			result.addAll(right);
		}
		return result;
	}
	
	public static List<TreeNode> postorderRecursive(TreeNode node) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if(node!= null){
			List<TreeNode> left = postorderRecursive(node.left);
			result.addAll(left);
			
			List<TreeNode> right = postorderRecursive(node.right);
			result.addAll(right);
			
			result.add(node);
		}
		return result;
	}
	
	/**
	 * Do the following when queue is not empty
	 *    Pop a node from queue and print it
	 *    Push left child of popped node to queue if not null
	 *    Push right child of popped node to queue if not null
	 * 
	 * @param node
	 * @return
	 */
	public static List<TreeNode> levelOrdertraversal(TreeNode node) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (node == null)
			return result;
		queue.add(node);
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.poll();
			result.add(currentNode);
			if (currentNode.left != null)
				queue.add(currentNode.left);
			if (currentNode.right != null)
				queue.add(currentNode.right);
		}

		return result;
	}


	/**
	 * 	Create an empty stack s and push root to it.
	 * 	while stack is not NULL Do following
	 * 		Create a empty stack called tempStack.
	 * 		Pop a node from stack and push it to tempStack depending on directionFlag
	 * 		Change directionFlag to change the direction of traversal
	 * 		set stack=tempStack
	 * 
	 * @param node
	 * @return
	 */
	public static List<TreeNode> spiralOrdertraversal(TreeNode node) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if (node == null)
			return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);

		boolean directionflag = false;
		while (!stack.isEmpty()) {
			Stack<TreeNode> tempStack = new Stack<TreeNode>();

			while (!stack.isEmpty()) {
				TreeNode tempNode = stack.pop();
				result.add(tempNode);
				if (!directionflag) {
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
				} else {
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
				}
			}
			// for changing direction
			directionflag = !directionflag;

			stack = tempStack;
		}
		return result;
	}
}
