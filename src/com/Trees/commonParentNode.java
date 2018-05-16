package com.Trees;


/** 
* Given two nodes of a tree, 
* method should return the deepest common ancestor of those nodes. 
* 
* A 
* / \ 
* B C 
* / \ \ 
* D E H 
* / \ 
* G F 
* 
* commonAncestor(D, F) = B 
* commonAncestor(C, G) = A 
* commonAncestor(E, B) = B 
*/ 
//Node commonAncestor(Node one, Node two); 



//same as CommonAncestor 
//However, CommonAncestor is easier to understand-- This was not studies.


public class commonParentNode {
	
	  static class Node 
	  {
		  String x;
		  Node left;
		  Node right;
		  Node parent;
		  
		  Node(Node parent, String x) {
	      this.parent = parent;this.x =x;
	    }
	  }

	  static Node getRoot(Node node) {	//returns parents node if parent node !=null
	    while(node.parent != null) {
	      node = node.parent;
	    }
	    return node;
	  }
	  
	  static Node deep1(Node a1, Node a2) {
	    Node tmp = a1;
	    Node root = getRoot(tmp);
	    return common(root, a1.x, a2.x);
	  }
	  
	  static Node common(Node root, String a, String b) {
	    if(root == null) return null;
	    if(root.x == a || root.x == b) {
	      return root;
	    }
	    Node lChild = common(root.left, a, b);
	    Node rChild = common(root.right, a, b);
	    if(lChild != null && rChild != null) {
	      return root;
	    }
	    return lChild != null ? lChild : rChild;
	  }
	  
	  public static void main(String... args ) {
	    Node a = new Node(null, "A");
	    Node b = new Node(a, "B");
	    Node c = new Node(a, "C");
	    a.left = b; 
	    a.right = c;

	    Node d = new Node(b, "D");
	    Node e = new Node(b, "E");
	    b.left = d;
	    b.right = e;

	    Node h = new Node(c, "H");
	    c.right = h;

	    Node g = new Node(d, "G");
	    Node f = new Node(d, "F");
	    d.right = f;
	    d.left = g;
	 

	    System.out.println(deep1(d,f).x);
	    System.out.println(deep1(c,g).x);
	    System.out.println(deep1(e,b).x);
	  }
	
	}