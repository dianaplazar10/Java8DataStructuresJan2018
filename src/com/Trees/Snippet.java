package com.Trees;

import java.util.Stack;

//import javax.swing.tree.TreeNode;

public class Snippet {
	// Encodes a tree to a single string.
	public String serialize(Node root) {
	    if(root==null)
	        return null;
	 
	    Stack<Node> stack = new Stack<Node>();
	    stack.push(root);
	    StringBuilder sb = new StringBuilder();
	 
	    while(!stack.isEmpty()){
	        Node h = stack.pop();   
	        if(h!=null){
	            sb.append(h.data+",");
	            stack.push(h.right);
	            stack.push(h.left);  
	        }else{
	            sb.append("#,");
	        }
	    }
	 
	    return sb.toString().substring(0, sb.length()-1);
	}
	 
	// Decodes your encoded data to tree.
	public Node deserialize(String data) {
	    if(data == null)
	        return null;
	 
	    int[] t = {0};
	    String[] arr = data.split(",");
	 
	    return helper(arr, t);
	}
	 
	public Node helper(String[] arr, int[] t){
	    if(arr[t[0]].equals("#")){
	        return null;
	    }
	 
	    Node root = new Node(Integer.parseInt(arr[t[0]]));
	 
	    t[0]=t[0]+1;
	    root.left = helper(arr, t);
	    t[0]=t[0]+1;
	    root.right = helper(arr, t);
	 
	    return root;
	}
	
}

