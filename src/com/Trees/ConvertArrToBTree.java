 package com.Trees;

//Given an array whose elements are sorted in acsending order, convert it to a height balanaced binary search tree
/*Exmaples:
	Input : Array{1,2,3}
	Output : A Balanced BST
		2
	   / \
	  1   3
	  
	Input : Array{1,2,3}
	Output : A Balanced BST
	      3
	     / \
	    2   4
	   / 
	  1  */ 
//reference: http://www.programcreek.com/2013/01/leetcode-convert-sorted-array-to-binary-search-tree-java/


//Definition for binary tree
//class Node {
//	int val;
//	Node left;
//	Node right;
//
//	Node(int x) {
//		val = x;
//	}
//}

public class ConvertArrToBTree {
	
	public static void main(String[] args) {
		int[] sortedArray = {1,2,3};
		ConvertArrToBTree convertArrToBTree = new ConvertArrToBTree();
		Node node = convertArrToBTree.arrayToBinTree(sortedArray);
		//convertArrToBTree.printNodeWithChildren(node);
		convertArrToBTree.printLevelOrder(node);
		
		node=null;
		System.out.println("-----------------------------------");
		int[] sortedArray2 = {1,2,3,4};
		node = convertArrToBTree.arrayToBinTree(sortedArray2);
		//convertArrToBTree.printNodeWithChildren(node);
		convertArrToBTree.printLevelOrder(node);
	}
	public Node arrayToBinTree(int[] array) {
		if (array.length == 0)
			return null;

		return arrayToBinTree(array, 0, array.length - 1);
	}

	public Node arrayToBinTree(int[] array, int start, int end) {
		if (start > end)
			return null;
		int rootIndex = ((start + end) / 2);
		Node root = new Node(array[rootIndex]);
		root.left = arrayToBinTree(array, start, rootIndex - 1);
		root.right = arrayToBinTree(array, rootIndex + 1, end);

		return root;
	}
	
	public void printLevelOrder(Node rootNode)
	{
		int heightOfRoot=height(rootNode);
		for (int i = 1; i <=heightOfRoot; i++)
			printLevelOrderNodes(rootNode,i);
	}

	private void printLevelOrderNodes(Node rootNode, int level) {
	if(rootNode==null) return;
	if(level==1) System.out.println(rootNode.data);
	else if(level>1)
	{
		printLevelOrderNodes(rootNode.left,level-1);
		printLevelOrderNodes(rootNode.right,level-1);
	}
	
}

	//height
	private int height(Node node) 
	{
		if(node==null) return 0;
		if(node.left ==null && node.right==null) return 1;
		else 
			return 1+Math.max(height(node.left), height(node.right));
	}

	
	

	
//	if height = 3.. then place root at height +2 position
//	private void printNodeWithChildren(Node node) {
//		int height = height(node); 
//		String nodestr = "";
//		for(int i =0; i<(height+1);i++)
//			nodestr = nodestr+" "+node.val;
//		
//		if(node!=null)
//		{
//			System.out.println(nodestr);//node.val);
//			while(node.left!=null)
//				{
//					System.out.println("|");
//					System.out.println(node.left.val);
//					node.left = node.left.left;
//				}
//			while(node.right!=null)
//			{
//				System.out.println("\\");
//				System.out.println(node.right.val);
//				node.right = node.right.right;
//			}
//		}
//		
//	}
	
	
}