/* 
*  A 
*  | \ 
*  B  C 
*  /\  \ 
*  D E  H 
* /\ 
* G F 
*/

package com.Trees;

import java.util.HashSet;
import java.util.Set;

import com.Trees.CommonAncestor.Node;

public class DistBtw2Nodes {
	
	
	public static void main(String[] args) {
		Node G = new Node(null, null, null, "G");
        Node F = new Node(null, null, null, "F");
        
        Node E = new Node(null, null, null, "E");
        Node H = new Node(null, null, null, "H");
        
        Node D = new Node(null, G, F, "D"); G.parent = D; F.parent = D;
     
        Node B = new Node(null, D, E, "B"); D.parent = B; E.parent = B;
        
        Node C = new Node(null, null, H, "C"); H.parent = C;
        
        Node root = new Node(null, B, C, "A"); B.parent = root; C.parent = root;	
        
        printDistBtwNodes(root,G, E);
        
	}

	private static void printDistBtwNodes(Node root, Node g, Node e) {
		Node commonImmediateNode = commonImmediateAncestor(g,e);
		//int distOfRootToCommonParentNode= 0;
		int distBtwNodes = 0;
		if(commonImmediateNode!=null && g!=null && e!=null)
		{
			//distOfRootToCommonParentNode= distOfRootToCommonParentNode(commonImmediateNode);
			distBtwNodes = distBtw_node_n_CommonAncestor(g,commonImmediateNode) + distBtw_node_n_CommonAncestor(e,commonImmediateNode);// - 2*distOfRootToCommonParentNode;
		}
			System.out.println("The distance between the 2 nodes is " + distBtwNodes);
	}

	private static int distBtw_node_n_CommonAncestor(Node n1, Node commonImmediateNode) {
		int distance = 0;
		Node parent = n1.parent;
		while(parent!=null)
		{ distance=distance+1;
			if(parent == commonImmediateNode)
			{
				parent=null;
			}
			else 
			{
				parent=parent.parent;
			}
		}
		return distance;
		
	}

	private static Node commonImmediateAncestor(Node n1, Node n2){
		Set<Node> allAncestors = getAncestors(n1); 
		if(allAncestors==null) return null;
		while(n2.parent!=null)
		{
			if(allAncestors.contains(n2.parent))				
				return n2.parent;
			n2=n2.parent;
		}
		return null;
	}

	private static Set<Node> getAncestors(Node g) {
		Set<Node> parents = new HashSet<>();
		if(g.parent == null) return null;
		while(g.parent !=null) 
		{
			parents.add(g.parent);
			g=g.parent; 
		}
		return parents;
	}

}
