
/** 
* Given two nodes of a tree, 
* method should return the deepest common ancestor of those nodes. 
* 
*  A 
*  | \ 
*  B  C 
*  /\  \ 
*  D E  H 
* /\ 
* G F 
* 
* commonAncestor(D, F) = B 
* commonAncestor(C, G) = A 
* commonAncestor(E, B) = A
*/ 
//Node commonAncestor(Node one, Node two); 


package com.Trees;

import java.util.HashSet;
import java.util.Set;

public class CommonAncestor {

    static class Node {
        Node(Node parent, Node right, Node left, String label) {
          this.parent = parent;
          this.right = right;
          this.left = left;
          this.label = label;
        }

        String label;
        Node left;
        Node right;
        Node parent;
        
        boolean isRoot() { return parent == null; }
        
        public String toString() {
            return label;
        }
      }

    
    //Collect all parent nodes of one node n1. 
    //get the parent node of n2 and check if it exists among the ancestor nodes of n1. If yes, then reassign th
    private static Node commonAncestor(Node n1, Node n2) {
        
        Set<Node> n1Ancestors = collectAncestors(n1);//collect parent 

        if (n1Ancestors.isEmpty()) return null;
        
        Node highestCommonParent = null;
        Node n2A = n2.parent;
        while(n2A != null) {
            if (n1Ancestors.contains(n2A)) 
            	//highestCommonParent = n2A; //returns highest ancestor using this stmt with the return ---(*)
            	return n2A;//returns immediate ancestor using this return nd null set at return ---(a)
            n2A = n2A.parent;
        }        
        return null;//--(a)
        //return highestCommonParent;//---(*)
    }
    
    private static Set<Node> collectAncestors(Node n) {
        Set<Node> result = new HashSet<Node>();
        Node p = n.parent;
        while(p != null) {
            result.add(p);
            p = p.parent;
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        Node G = new Node(null, null, null, "G");
        Node F = new Node(null, null, null, "F");
        
        Node E = new Node(null, null, null, "E");
        Node H = new Node(null, null, null, "H");
        
        Node D = new Node(null, G, F, "D"); G.parent = D; F.parent = D;
     
        Node B = new Node(null, D, E, "B"); D.parent = B; E.parent = B;
        
        Node C = new Node(null, null, H, "C"); H.parent = C;
        
        Node A = new Node(null, B, C, "A"); B.parent = A; C.parent = A;
        
        System.out.println(commonAncestor(D, F));
        System.out.println(commonAncestor(C, G));
        System.out.println(commonAncestor(E, B));
    }

}