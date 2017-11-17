package String;

public class LinkedListPalindrome {
	
	static Node head ;
	
	static class Node {
		
		int data;
		Node next;
		
		public Node(int d){
			data = d ;
			next = null ;
		}
	}
	
	boolean iSpalindrome(Node head){
		
		Node slow = head ;
		Node fast = head ;
		
		while (fast !=null && fast.next != null){
			fast = fast.next.next ;
			slow = slow.next;
			   if (fast != null) { // odd nodes: let right half smaller
			        slow = slow.next;
			    }
		}
		
		Node currnode = slow ;
		Node nextnode = null ;
		Node prevnode = null ;
		
		while ( currnode != null){
			nextnode = currnode.next ;
			currnode.next = prevnode ;
			prevnode = currnode ;
			currnode = nextnode ;
		}
		
		while (head.next != null || prevnode.next != null){
			if (head.data == prevnode.data){
				head = head.next;
				prevnode = prevnode.next ;
			}
			else
				return false ;
		}
		
		return true ;
	}
	
	void print(Node head){
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPalindrome ll = new LinkedListPalindrome();
			ll.head = new Node(1);
			ll.head.next = new Node(2);
			ll.head.next.next = new Node(2);
			ll.head.next.next.next = new Node(1);
			//ll.head.next.next.next.next = new Node(1);
			ll.print(head);
			System.out.println();
			boolean ifis = ll.iSpalindrome(head);
			if (ifis)
				System.out.println("LinkedList is a palindrome");
			else
				System.out.println("Linkedlist is not a palindrome");
			
	}

}
