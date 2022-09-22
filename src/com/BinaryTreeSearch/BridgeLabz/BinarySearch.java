package com.BinaryTreeSearch.BridgeLabz;

public class BinarySearch
{
	/*
	 * UC2- Check if all are added with using size Method in Binary Tree
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
		root = binaryTree.insertNode(root, 22);
		root = binaryTree.insertNode(root, 40);
		root = binaryTree.insertNode(root, 60);
		root = binaryTree.insertNode(root, 95);
		root = binaryTree.insertNode(root, 11);
		root = binaryTree.insertNode(root, 65);
		root = binaryTree.insertNode(root, 03);
		root = binaryTree.insertNode(root, 16);
		root = binaryTree.insertNode(root, 63);
		root = binaryTree.insertNode(root, 67);

		
		binaryTree.displayTree(root);
		
		Node size = new Node();
		int result = size.size(root);
		
		System.out.println("\n Size of Binary Tree :" +result);
	}
}


