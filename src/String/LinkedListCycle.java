package String;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	
	static Node head ;
	
	static class Node {
		
		int data;
		Node next ;
		
		public Node (int d){
			data = d ;
			next = null ;
		}
	}
	
	void printlist(Node node){
		while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
	}
	
	boolean Detectloop (Node node){
		
		Node curr1 = head.next.next;
		Node curr2 = head;
		while ( curr1.next != null ){
			
			if ( curr1 == curr2){
				removeloop(curr1 , curr2);
				return true ;
			}
			else{
			curr1 = curr1.next.next;
			curr2 = curr2.next ;
			}
		}
		return false ;
		
	}
	
	public boolean hasCycle(Node head) {
	    Set<Node> nodesSeen = new HashSet<>();
	    while (head != null) {
	        if (nodesSeen.contains(head)) {
	            return true;
	        } else {
	            nodesSeen.add(head);
	        }
	        head = head.next;
	    }
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListCycle ll = new LinkedListCycle();
		
		//Node newnode = new Node(5);
		LinkedListCycle.head = new Node(5);
		LinkedListCycle.head.next = new Node(10);
		LinkedListCycle.head.next.next = new Node(15) ;
		LinkedListCycle.head.next.next.next = new Node(20) ;
		LinkedListCycle.head.next.next.next.next = new Node(25) ;
		System.out.println("Printing the list");
		ll.printlist(head);
		System.out.println();
		System.out.println(ll.hasCycle(head));
		/*boolean exists = ll.Detectloop(head);
		if (exists)
			System.out.println("loop exists");
		else
			System.out.println("Loop doesnot exist");*/
		//Creating a loop
		System.out.println("Creating a loop for the list");
		LinkedListCycle.head.next.next.next.next.next = head.next ;
		/*exists = ll.Detectloop(head);
		if (exists)
			System.out.println("loop exists");
		else
			System.out.println("Loop doesnot exist");*/
		System.out.println(ll.hasCycle(head));
		/*System.out.println("Printing the list after deleting the loop");
		ll.printlist(head);*/
	}

	private void removeloop(Node curr1,Node curr2) {
		// TODO Auto-generated method stub
		curr1 = curr1.next.next;
		while ( curr1.next != null){
		if ( curr1.next == curr2.next){
				curr1.next = null ;
				curr2.next = null ;
		}
		else{
			curr1 = curr1.next.next;
			curr2 = curr2.next;
		}
		}
	}

}
