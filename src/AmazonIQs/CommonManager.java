package AmazonIQs;

import java.util.HashSet;
import java.util.Set;

class Node{
	 String data;
	 Node child1;
	 Node child2;
	 Node child3;
	 Node parent;

	Node(Node parent,String data,Node child1,Node child2,Node child3){
		this.data = data;
		this.parent = parent;
		this.child1 =child1;
		this.child2 =child2;
		this.child3=child3;
	}
	
	Node(){
	}
}
public class CommonManager {
	
	public static void main(String[] args) {
		
		Node m = new Node(null,"M",null,null,null);
		Node n = new Node(null,"N",null,null,null);
		
		Node bo = new Node(null,"Bo",null,null,null);
		Node pe = new Node(null,"Pe",null,null,null);
		Node po = new Node(null,"Po",null,null,null);
		
		Node d = new Node(null,"d",null,null,null);
		Node s = new Node(null,"Sam",null,null,null);
		Node mic = new Node(null,"Micheal",null,null,null);
		
		Node bill = new Node(null,"rootBill",d,s,mic);
		
		d.parent = s.parent = mic.parent =bill;
		bo.parent =pe.parent = po.parent = d; 
		m.parent =n.parent =pe;
		
		Node commonmng = printCommonManagerof(m,n);
		Node commonmng2 = printCommonManagerof(n,po);
		Node commonmng3 = printCommonManagerof(n,s);
		Node commonmng4 = printCommonManagerof(pe,n);
		
		String nomgr = "No common Manager";
		System.out.println("closestCommonManager(Milton, Nina) = Peter : " +  ((commonmng!=null)?commonmng.data:nomgr));
		System.out.println("closestCommonManager(Nina, Porter) = Dom : " +  ((commonmng2!=null)?commonmng2.data:nomgr));
		System.out.println("closestCommonManager(Nina, Samir) = Bill : " +  ((commonmng3!=null)?commonmng3.data:nomgr));
		System.out.println("closestCommonManager(Peter, Nina) = Peter : " +  ((commonmng4!=null)?commonmng4.data:nomgr));
	}

	private static Node printCommonManagerof(Node n1, Node n2) {
		Set<Node> ancestors = getAncestors(n1);
		if(ancestors==null) return null;
		Node parentOfSecondNode = n2.parent;
		while(parentOfSecondNode!=null)
		{
			if(ancestors.contains(parentOfSecondNode))
			{
				return parentOfSecondNode;
			}parentOfSecondNode = parentOfSecondNode.parent;
		}
		return null;
	}

	private static Set<Node> getAncestors(Node n1) {
		if(n1==null) return null;
		Set<Node> parents = new HashSet<Node>();
		Node n2parent = n1.parent; 
		while(n2parent!=null)
		{
			parents.add(n2parent);
			n2parent = n2parent.parent;
		}
		return parents;
	}

}
//closestCommonManager(Milton, Nina) = Peter 
//closestCommonManager(Nina, Porter) = Dom 
//closestCommonManager(Nina, Samir) = Bill 
//closestCommonManager(Peter, Nina) = Dom

//hence the O/p:
//	closestCommonManager(Milton, Nina) = Peter : Pe
//	closestCommonManager(Nina, Porter) = Dom : d
//	closestCommonManager(Nina, Samir) = Bill : rootBill
//	closestCommonManager(Peter, Nina) = Dom : d