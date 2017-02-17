package com.explorer.binarytree;

import com.explorer.binarytree.SimpleBinaryTree.TreeNode;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = TreeUtil.getSimpleTree();
		System.out.println("pre Order");
		preOrder(root);
		System.out.println("\nIn Order");
		inOrder(root);
		System.out.println("\npost Order");
		postOrder(root);
	//	http://www.cmi.ac.in/~madhavan/courses/programming06/lecture12-21sep2006.txt
//you can consrtruct tree from pre and in order , post and in order but not with pre and post order
//		ex : 
//			1   1
//		2	       2
//		pre : [1,2]
//		post: [2,1]
//		However, if we impose additional structure on binary trees---for
//		instance, no node can have a right child without having a left
//		child---preorder and postorder traversals together uniquely fix
//		the shape of a tree.   Here is how we could do it, by example
		boolean result = compare(TreeUtil.getSimpleTree(),cloneTree(TreeUtil.getSimpleTree()));
		System.out.println("\ncompare "+result);
		TreeNode node = TreeUtil.getSimpleTree();
		TreeNode node2 = cloneTree(node);
		node2.right.left.value = 1;
		result = compare(node,node2);
		System.out.println("\ncompare "+result);
//		http://www.geeksforgeeks.org/if-you-are-given-two-traversal-sequences-can-you-construct-the-binary-tree/	
//		Therefore, following combination can uniquely identify a tree.
//
//		Inorder and Preorder.
//		Inorder and Postorder.
//		Inorder and Level-order.
//
//		And following do not.
//		Postorder and Preorder.
//		Preorder and Level-order.
//		Postorder and Level-order.
//
//		For example, Preorder, Level-order and Postorder traversals are same for the trees given in above diagram.
//
//		Preorder Traversal = AB
//		Postorder Traversal = BA
//		Level-Order Traversal = AB
//
//		So, even if three of them (Pre, Post and Level) are given, the tree can not be constructed.
		int ht = heightOfTree(root);
		System.out.println("Height of tree "+ht);
		for(int i = 1; i <= ht; i++){
			printAtLevel(root, i);
		}
		System.out.println("\nLeaf nodes");
		printLeaf(root);
		System.out.println("\nLeaf nodes Check");
		printLeafCheck(root);
		
		System.out.println("\nBoundary");
		printBoundary(root);
		
		int[] inorder ={40,50,30,100,1,5,10,6,2,3,60,20};
		int[] preorder ={100,50,40,30,60,10,5,1,6,2,3,20};
		int[] postorder ={40,30,50,1,5,3,2,6,10,20,60,100};
		int[] levelorder ={100,50,60,40,30,10,20,5,6,1,2,3};
		TreeNode resultNode = treeFromInOrderPreOrder(inorder,preorder);
		System.out.println("\nreference");
		inOrder(root);
		System.out.println("\nresult");
		inOrder(resultNode);
		
		resultNode = treeFromInOrderPostOrder(inorder,postorder);
		System.out.println("\nresult");
		inOrder(resultNode);
		
		resultNode = treeFromInOrderLevelOrder(inorder,levelorder);
		System.out.println("\nresult");
		inOrder(resultNode);
		
	}

	public static void preOrder(TreeNode node){
		if(node != null)
			System.out.print("["+node.value+"]");
		if(node.left != null)
			preOrder(node.left);
		if(node.right != null)
			preOrder(node.right);
	}
	public static void inOrder(TreeNode node){
		if(node == null)
			return;
		
		if(node.left != null)
			inOrder(node.left);
		
		if(node != null)
			System.out.print("["+node.value+"]");
		
		if(node.right != null)
			inOrder(node.right);
	}
	public static void postOrder(TreeNode node){
		if(node.left != null)
			postOrder(node.left);
		
		if(node.right != null)
			postOrder(node.right);
		
		if(node != null)
			System.out.print("["+node.value+"]");
	}
	
	public static boolean compare(TreeNode node1,TreeNode node2){
		
		if(node1 == null && node2 == null){
			return true;
		}
		
		if(node1 != null && node2 != null){
			return (node1.value == node2.value) && 
					compare(node1.left, node2.left) &&
					compare(node1.right, node2.right);
		}
		return false;
		
	}
	
	public static TreeNode cloneTree(TreeNode node){
		TreeNode n = null;
		if(node != null){
			n = new TreeNode(node.value);
			n.left = cloneTree(node.left);
			n.right = cloneTree(node.right);
		}
	return n;	
	}
	
	public static int heightOfTree(TreeNode node){
		if(node == null){
			return 0;
		}
		int left = heightOfTree(node.left) +1;
		int right = heightOfTree(node.right)+1;
		return left > right ? left : right;
	}
	
	public static void printAtLevel(TreeNode node, int height){
		if(height == 0 )
			return ;
		if(height ==1){
			System.out.print("["+node.value+"]");
		}else{
			if(node.left !=null)
			printAtLevel(node.left, height-1);
			if(node.right !=null)
			printAtLevel(node.right, height-1);
		}
	}
	
	public static void printLeaf(TreeNode node){
		if(node !=null ){
			if(node.left == null & node.right == null){
				System.out.print("["+node.value+"]");
			}
			printLeaf(node.left);
			printLeaf(node.right);
		}

	}
	
	public static void printLeafCheck(TreeNode node){
		if(node !=null ){
			printLeaf(node.left);
			if(node.left == null & node.right == null){
				System.out.print("["+node.value+"]");
			}
			printLeaf(node.right);
		}

	}
	
	
	public static void printBoundary(TreeNode node){
//		1. Print the left boundary in top-down manner.
//		2. Print all leaf nodes from left to right, which can again be sub-divided into two sub-parts:
//		…..2.1 Print all leaf nodes of left sub-tree from left to right.
//		…..2.2 Print all leaf nodes of right subtree from left to right.
//		3. Print the right boundary in bottom-up manner.
		printLeftBoundary(node);
		printLeaf(node.left);
		printLeaf(node.right);
		printRightBoundary(node.right);
	}

	public static void printLeftBoundary(TreeNode node) {
		if (node != null)
			if (node.left != null) {
				System.out.print("[" + node.value + "]");
				printLeftBoundary(node.left);
			} else if (node.right != null){
				System.out.print("[" + node.value + "]");
				printLeftBoundary(node.right);
			}
	}

	public static void printRightBoundary(TreeNode node) {
		if (node != null)
			if (node.right != null) {
				printRightBoundary(node.right);
				System.out.print("[" + node.value + "]");
			} else if(node.left != null){
				printRightBoundary(node.left);
				System.out.print("[" + node.left + "]");
			}
	}
	
	public static TreeNode treeFromInOrderPreOrder(int[] inorder, int[]preorder){
		return constructFromPreorder(inorder, preorder,0, inorder.length-1);
	}
	
	static int preindex = 0 ;
	public static TreeNode constructFromPreorder(int[] inorder, int[]preorder, int start, int end){
		if(preindex > preorder.length-1){
			return null;
		}
		TreeNode n = new TreeNode(preorder[preindex]);
		int i = findIndex(inorder, preorder[preindex]);
		preindex++;
		if(i-1 >= start){
			n.left = constructFromPreorder(inorder, preorder,start, i-1);
		}
		if(i+1<= end ){
			n.right=  constructFromPreorder(inorder, preorder, i+1, end);
		}
		return n;
	}
	
	
	public static int findIndex(int[] inorder, int value){
		for(int i = 0 ; i < inorder.length ; i++){
			if(inorder[i] == value)
				return i;
		}
		return 0;
	}
	public static TreeNode treeFromInOrderPostOrder(int[] inorder, int[]postorder){
		postindex = postorder.length-1;
		return constructFromPostorder(inorder, postorder,0, inorder.length-1);
	}
	static int postindex = 0 ;
	public static TreeNode constructFromPostorder(int[] inorder, int[]postorder, int start, int end){
		if(postindex < 0){
			return null;
		}
		TreeNode n = new TreeNode(postorder[postindex]);
		int i = findIndex(inorder, postorder[postindex]);
		postindex--;

		if(i+1<= end ){
			n.right=  constructFromPostorder(inorder, postorder, i+1, end);
		}
		
		if(i-1 >= start){
			n.left = constructFromPostorder(inorder, postorder,start, i-1);
		}
		return n;
	}
	public static TreeNode treeFromInOrderLevelOrder(int[] inorder, int[]levelorder){
		return constructFromLevelorder(inorder, levelorder,0, inorder.length-1);
	}
	
	public static TreeNode constructFromLevelorder(int[] inorder, int[]levelorder, int start, int end){

		int indexInorde = getFirstNodeIndex(levelorder, inorder , start, end);
		TreeNode n = new TreeNode(inorder[indexInorde]);

		if(indexInorde-1 >= start){
			n.left = constructFromLevelorder(inorder, levelorder,start, indexInorde-1);
		}
		if(indexInorde+1 <= end ){
			n.right=  constructFromLevelorder(inorder, levelorder, indexInorde+1, end);
		}
		return n;
	}
	
	public static int getFirstNodeIndex(int[]levelorder, int[]inorder , int start, int end){
		for(int i= 0 ; i < levelorder.length; i++){
			for(int j = start ; j <= end; j++){
				if(levelorder[i] == inorder[j]){
					return j;
				}
			}
		}
		return -1;
	}
}
