package String;

import String.MergeTwoSortedList.Node;

public class MergeTwoLists {
	
	static Node head1 , head2 ;
	
 static class Node{
		
		int data;
		Node next ;
		
		 Node(int d){
			data = d ;
			next = null ;
		}
	}
 
 private void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data + "->");
			head = head.next;
		}
	}
 
 
 Node mergenew (Node head1,Node head2){
	 Node curr1 = head1 ;
	 Node curr2 = head2 ;
	 while (head1 != null && head2!= null){
		 if ( head1.data < head2.data){
			 if (head1.next.data > head2.data || head1.next == null || head2.next == null){
				 Node newnode = new Node(head2.data);
				 head2= head2.next ;
				 newnode.next = head1.next ;
				 head1.next = newnode ;
				 
			 }
			 else {
				 head1 = head1.next ;
			 }
		 }
		 else {
			 if (head2.next.data > head1.data || head1.next == null || head2.next == null){
				 Node newnode = new Node(head1.data);
				 head1= head1.next ;
				 newnode.next = head2.next ; 
				 head2.next = newnode ;
				 
			 }
			 else {
				 head2 = head2.next ;
			 }
		 }
	 }
	 return curr1 ;
 }
 
 Node merge(Node  head1 , Node head2){
	 if (head1 == null) return head2;
	  if (head2 == null) return head1;

	  if (head1.data < head2.data) {
	    head1.next = merge(head1.next, head2);
	    return head1;
	  } 
	  else {
	    head2.next = merge(head2.next, head1);
	    return head2;
	  }
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoLists ll = new MergeTwoLists() ;
		ll.head1 = new Node(5) ;
		ll.head1.next = new Node(10) ;
		ll.head1.next.next = new Node(15) ;
		//ll.print(head1);
		
		ll.head2 = new Node(7) ;
		ll.head2.next = new Node(12) ;
		ll.head2.next.next = new Node(17) ;
		//ll.print(head2);
		
		
		/*Node newhead = ll.merge(head1, head2);
		ll.print(newhead);*/
		
		Node newhead = ll.mergenew(head1, head2);
		ll.print(newhead);
	}

}
