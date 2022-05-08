package com.greatlearning.bst;

public class Node {

	public int value;
	public Node right;
	public Node left;

	public Node(int item) {
		value = item;
		left = right = null;
	}
}
