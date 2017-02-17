package com.explorer.binarytree;

import com.explorer.binarytree.SimpleBinaryTree.TreeNode;

public class TreeUtil {

	public static TreeNode getSimpleTree(){
		TreeNode rootNode = new TreeNode(100);

		TreeNode node10 = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);
		TreeNode node50 = new TreeNode(50);
		TreeNode node60 = new TreeNode(60);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		
		rootNode.setchildren(node50, node60);
		node50.setchildren(node40, node30);
		node60.setchildren(node10, node20);
		node10.setchildren(node5, node6);
		node5.setchildren(node1, null);
		node6.setchildren(null, node2);
		node2.setchildren(null, node3);
		return rootNode;
	}


}
