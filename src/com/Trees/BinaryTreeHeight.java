package com.Trees;

import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

//Question: Print the longest path from root to leaf in a binary tree

//Refer : https://www.careercup.com/question?id=5769623971561472
//first calculate the height of the binary tree. Then store the nodes in an array and print when the height is equal to the array length. 

//This class includes:
//1)Print vertical sum of binary trees ( http://www.java2blog.com/2015/11/vertical-sum-of-binary-tree-in-java.html#AfWMUtX63SdSTb2d.99)
//2)



public class BinaryTreeHeight {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[10];
        int counter=0;
        Node node = new Node(5);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.left.left.left = new Node(7);
        node.left.left.right = new Node(8);
        node.left.right =  new Node(3);
        //node.left.right.left =  new Node(9);
        node.right =  new Node(6);
        node.right.left = new Node(11);
        node.right.left.left = new Node(15);
        node.right.left.left.right = new Node(10);
        
        //if 2 longest path
        //node.right.left.left.left = new Node(40);//prints both the paths
        
        node.right.right = new Node(12);
        int h = height(node);
        printLongestPath(node, arr, counter, h);
        
        
        printLeaves(node);
        
        System.out.println("Vertical sum of binary tree will be:");  
        TreeMap<Integer,Integer> treeNodeMap=new TreeMap<Integer,Integer>();  
        printVertivalSumOfBinaryTree(node, treeNodeMap, 0);  
        for(Entry<Integer,Integer> entry:treeNodeMap.entrySet())  
        	System.out.println(entry.getValue());  
    }
    


	//tree looks like this:
    /*
     *      5
     *  /       \
     *  2        6
     * / \      / \
     * 1  3    11  12
     * /\      /
     *7  8    15
     *         \
     *         10
     */
    private static void printLongestPath(Node node, int arr[], int counter, int h){
        if(node==null) {
            return;
        }
        arr[counter++] = node.data; ///IMPORTANT 
        if(node.left == null && node.right == null){
            printArray(arr,counter, h);
        }
        printLongestPath(node.left, arr, counter, h);
        printLongestPath(node.right, arr, counter, h);

    }
    private static void printArray(int arr[], int counter, int h){
        if(counter==h) {
            for (int i = 0; i < counter; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    //return height as 1 if no children nodes, If node is null, return height 0
    //else, return max of heights of right and left child + 1(height of the root node)
    private static int height(Node node){
        if(node==null)
            return 0;
        if(node.left == null && node.right == null) {
            return 1;
        }
        else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }
    
    //PRINT LEAF NODES
    //1)Using Recursive
    //2)Using Iterative/Stack
  //very similar to  printLongestPath.. that prints only nodes with longest path with check for tree height and counter. 
    //However, here its even simpler.

    private static void printLeaves(Node node) { 
		if(node==null) return;
		if(node.left==null && node.right==null) 
		{
			System.out.println(node.data);
		}
		else {
			printLeaves(node.left);
			printLeaves(node.right);
		}
		
	}
    
    public static void printLeafNodesIteratively(Node root) 
    { 
    	if (root == null) { return; } 
    	
    	Stack<Node> stack = new Stack<>(); 
    	stack.push(root); 
    	
    	while (!stack.isEmpty()) 
    	{ 
    		Node node = stack.pop(); 
    		if (node.right != null) { stack.add(node.right); } 
    		if (node.left != null) { stack.add(node.left); } 
    		if (node.left == null && node.right == null) { System.out.printf("%d ", node.data); } 
    	} 
    }
    
    
 // prints vertical sum in binary tree  
    public static void printVertivalSumOfBinaryTree(Node startNode,TreeMap<Integer,Integer> treeNodeMap,int level) {  
     if(startNode==null)  
     {  return;  }  
       
     // Decrease level by 1 when iterating left child  
     printVertivalSumOfBinaryTree(startNode.left,treeNodeMap,level-1);  
       
     if(treeNodeMap.get(level)!=null)  
     {  
            // Adding current node data to previous stored value to get the sum  
          Integer sum=treeNodeMap.get(level)+startNode.data;  
            treeNodeMap.put(level, sum);  
     }  
     else  
     {  
       
      treeNodeMap.put(level, startNode.data);  
     }  
    // Increase level by 1 when iterating left child  
     printVertivalSumOfBinaryTree(startNode.right,treeNodeMap,level+1);  
       
    }  

    //------------------------------------------------------------------------
    //refer: http://codereview.stackexchange.com/questions/82150/printing-a-tree-level-by-level
    
//    public void printLevelWise(Node root) {
//        List<List<Node>> levels = traverseLevels(root);
//
//        for (List<Node> level : levels) {
//            for (Node node : level) {
//                System.out.print(node.value + " ");
//            }
//            System.out.println();
//        }
//    }
//    
//    private List<List<Node>> traverseLevels(Node root) {
//        if (root == null) {
//            return Collections.emptyList();
//        }
//        List<List<Node>> levels = new LinkedList<>();
//
//        Queue<Node> nodes = new LinkedList<>();
//        nodes.add(root);
//
//        while (!nodes.isEmpty()) {
//            List<Node> level = new ArrayList<>(nodes.size());
//            levels.add(level);
//
//            for (Node node : new ArrayList<>(nodes)) {
//                level.add(node);
//                if (node.left != null) {
//                    nodes.add(node.left);
//                }
//                if (node.right != null) {
//                    nodes.add(node.right);
//                }
//                nodes.poll();
//            }
//        }
//        return levels;
//    }
    //------------------------------------------------------------------------
    
}
