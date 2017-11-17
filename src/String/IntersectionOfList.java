package String;

import java.util.HashSet;

public class IntersectionOfList {
	
	static Node head1, head2 ;
	
	static class Node {
		int data ;
		Node next ;
		
		public Node (int d){
			data = d ;
			next = null;
		}
	}
	
	void printlist(Node head){
		while ( head != null){
			System.out.print(head.data + " ");
			head = head.next ;
		}
	}
	
	static void checkintersection(Node head1 , Node head2){
		HashSet<Integer> nodesseen = new HashSet<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet<Node> common = new HashSet<Node>();
		
		while (head1 != null) {
	        nodesseen.add(head1.data);
	        head1 = head1.next;
		}
		
		 while (head2 != null){
     		if (nodesseen.contains(head2.data)){
     			hs.add(head2.data);
     			head2 = head2.next ;
     		}
     		else
     			head2 = head2.next ;
     		}
		 
		 System.out.println(hs);
	        
		
/*		for (Node x : nodesseen){
			if (hs.contains(x)){
				common.add(x);
			}
		}*/
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfList ll = new IntersectionOfList();
			
		ll.head1 = new Node(5);
		ll.head1.next = new Node(10);
		ll.head1.next.next = new Node(15);
		ll.head1.next.next.next = new Node(20);
		System.out.println("First List");
		ll.printlist(head1);
		System.out.println();
		System.out.println("Second List");
		ll.head2 = new Node(10);
		ll.head2.next = new Node(15);
		ll.head2.next.next = new Node(20);
		ll.head2.next.next.next = new Node(25);
		ll.printlist(head2);
		checkintersection(head1,head2);
		
		
	}

}
