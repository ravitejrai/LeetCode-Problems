package String;

public class MergeTwoSortedList {
	
	static Node head1 , head2 , tail , tail1,head3,tail3;
	
	class Node{
		
		int data;
		Node next ;
		
		 Node(int d){
			data = d ;
			next = null ;
		}
	}
	
	public void add(int n){
		Node newnode = new Node(n);
		if ( head1 == null){
			head1= newnode ;
			 tail = newnode ;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	
	public void add1(int n){
		Node newnode = new Node(n);
		if ( head2 == null){
			head2= newnode ;
			 tail1 = newnode ;
		}
		else
		{
			tail1.next = newnode;
			tail1 = newnode;
		}
	}
	
	public void add3(int n){
		Node newnode = new Node(n);
		if ( head3 == null){
			head3= newnode ;
			 tail3 = newnode ;
		}
		else
		{
			tail3.next = newnode;
			tail3 = newnode;
		}
	}
	
	public void merge (Node head1 , Node head2){
		while ( head1 != null && head2 != null){
				if ( head1.data < head2.data) {
					add3(head1.data);	
					head1 = head1.next ;
				}
				else if ( head1.data == head2.data){
					add3(head1.data);
					head1 = head1.next ;
					head2 = head2.next ;	
				}
				else{	
					add3(head2.data);
					head2 = head2.next ;
					}
			}
				
				while(head1!=null)
				{
					add3(head1.data);
					head1 = head1.next ;
				}
	
				while(head2!=null)
				{
					add3(head2.data);
					head2 = head2.next ;
				}
		
		
	}
		private void print(Node head)
		{
			while(head!=null)
			{
				System.out.println(head.data);
				head = head.next;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedList ll = new MergeTwoSortedList();
		ll.add(10);
		ll.add(20);
		//ll.add(30);*/
/*
		ll.add1(30);
		ll.add1(40);
		ll.add1(50);*/
		ll.print(head1);
		//ll.print(ll.head2);
		ll.merge(ll.head1, ll.head2);
	//	ll.print(ll.head3);
		
		
	}

}
