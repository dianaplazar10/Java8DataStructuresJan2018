package com.Trees;

import java.util.ArrayList;
import java.util.List;

//Java program for different tree traversals

/* Class containing left and right child of current
node and key value*/
//class Node
//{
// int key;
// Node left, right;
//
// public Node(int item)
// {
//     key = item;
//     left = right = null;
// }
//}

public class TreeTraversals
{
 // Root of Binary Tree
 Node root;

 TreeTraversals()
 {
     root = null;
 }

 /* Given a binary tree, print its nodes according to the
   "bottom-up" postorder traversal. */
 void printPostorder(Node node)
 {
     if (node == null)
         return;

     // first recur on left subtree
     printPostorder(node.left);

     // then recur on right subtree
     printPostorder(node.right);

     // now deal with the node
     System.out.print(node.data + " ");
 }

 /* Given a binary tree, print its nodes in inorder*/
 void printInorder(Node node)
 {
     if (node == null)
         return;

     /* first recur on left child */
     printInorder(node.left);

     /* then print the data of node */
     System.out.print(node.data + " ");

     /* now recur on right child */
     printInorder(node.right);
 }

 /* Given a binary tree, print its nodes in preorder*/
 void printPreorder(Node node)
 {
     if (node == null)
         return;

     /* first print data of node */
     System.out.print(node.data + " ");

     /* then recur on left sutree */
     printPreorder(node.left);

     /* now recur on right subtree */
     printPreorder(node.right);
 }


int height(Node node){
    if(node==null)
        return 0;
    if(node.left == null && node.right == null) {
        return 1;
    } else {
        return 1 + Math.max(height(node.left), height(node.right));
    }
}

void printLevelOrder(Node node)
{
    int h = height(root);
    for (int i=1; i<=h; i++)
        printGivenLevel(root, i);
}

/* Print nodes at the given level */
void printGivenLevel (Node root ,int level)
{
    if (root == null)
        return;
    if (level == 1)
        System.out.print(root.data + " ");
    else if (level > 1)
    {
        printGivenLevel(root.left, level-1);
        printGivenLevel(root.right, level-1);
    }
}
 
public int maxDepth(Node root) {
    if(root==null)
        return 0; 
    return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
}

public static int minDepth(Node root) {
    if (root == null) 
        return 0;
    return 1 + Math.min(minDepth(root.left), minDepth(root.right)); 
}
//alternate:
//public int minDepth(Node root) {
//    if(root == null)
//        return 0;
//    LinkedList<Node> nodes = new LinkedList<Node>();
//    LinkedList<Integer> counts = new LinkedList<Integer>();
//
//    nodes.add(root);
//    counts.add(1);
//
//    while(!nodes.isEmpty()){
//        Node curr = nodes.remove();
//        int count = counts.remove();
//
//        if(curr.left == null && curr.right == null)
//            return count;
//        if(curr.left != null){
//            nodes.add(curr.left);
//            counts.add(count+1);
//        }
//        if(curr.right != null){
//            nodes.add(curr.right);
//            counts.add(count+1);
//        }
//    }
//    return 0;
//}

public List<List<Integer>> findLeaves(Node root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    helper(result, root);
    return result;
}
 
// traverse the tree bottom-up recursively
private int helper(List<List<Integer>> list, Node root){
    if(root==null)
        return -1;
 
    int left = helper(list, root.left);
    int right = helper(list, root.right);
    int curr = Math.max(left, right)+1;
 
    // the first time this code is reached is when curr==0,
    //since the tree is bottom-up processed.
    if(list.size()<=curr){
        list.add(new ArrayList<Integer>());
    }
 
    list.get(curr).add(root.data);
 
    return curr;
}

 // Wrappers over above recursive functions
 void printPostorder()  {     printPostorder(root);  }
 void printInorder()    {     printInorder(root);   }
 void printPreorder()   {     printPreorder(root);  }
 void printLevelOrder()   {     printLevelOrder(root);  }
 

 // Driver method
 public static void main(String[] args)
 {
     TreeTraversals tree = new TreeTraversals();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);

     System.out.println("Preorder traversal of binary tree is ");
     tree.printPreorder();

     System.out.println("\nInorder traversal of binary tree is ");
     tree.printInorder();

     System.out.println("\nPostorder traversal of binary tree is ");
     tree.printPostorder();
     
     System.out.println("\nLevelorder traversal of binary tree is -----------------------");
     tree.printLevelOrder();
     
     System.out.println("\nMax depth of root of binary tree is -----------------------"+tree.maxDepth(tree.root));
 }
}
