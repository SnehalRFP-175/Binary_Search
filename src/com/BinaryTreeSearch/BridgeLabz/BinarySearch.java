package com.BinaryTreeSearch.BridgeLabz;

public class BinarySearch
{
	/*
	 * UC1- Create and Print the Binary Tree
	 */
	
	public Node createNewNode(int k) 
	{
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	//Creating Node
	public Node insertNode(Node node, int k) 
	{
		if (node == null) {
			return createNewNode(k);
		}
		if (k < node.data) {
			node.left = insertNode(node.left, k);
		} else if (k > node.data) {
			node.right = insertNode(node.right, k);
		}
		return node;

	}

	//Printing Tree
	public void displayTree(Node node) 
	{
		if (node == null) {
			return;
		}
		displayTree(node.left);
		System.out.print(node.data + " -> ");
		displayTree(node.right);
	}
	
	
	public static void main(String a[])
	{
		
		BinarySearch binaryTree = new BinarySearch();
		
		Node root = null;

		
		root = binaryTree.insertNode(root, 56);
		root = binaryTree.insertNode(root, 30);
		root = binaryTree.insertNode(root, 70);
		

		
		binaryTree.displayTree(root);
	}
}


