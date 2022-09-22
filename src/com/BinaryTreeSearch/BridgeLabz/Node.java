package com.BinaryTreeSearch.BridgeLabz;

public class Node 
{
	int data;
	Node left;
	Node right;
	
	public static int size(Node node) {
		// TODO Auto-generated method stub
		return (size1(node));
	}
	
	private static int size1(Node node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}
}
