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
		
		rootNode.setchildren(node50, node60);
		node50.setchildren(node40, node30);
		node60.setchildren(node10, node20);
		
		return rootNode;
	}

}
