package com.greatlearning.bstmain;

import com.greatlearning.bst.BST;
import com.greatlearning.bst.Node;

public class Main {

	public static void main(String[] args) {
		{
			BST tree = new BST();
			
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left = new Node(55);

			int order = 0;
			tree.createSkewedTree(tree.node, order);
			System.out.print("Rightly Skewed Tree is as following: ");
			tree.traverseRightSkewed(tree.headNode);
		}

}

}

