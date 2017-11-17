package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	
	static Node root;
	
	static class Node {
		
		int data ;
		Node left, right ;
		
		Node (int d) {
			data = d ;
			left = right = null ;
		}
	 }
	
	static void inorder(Node root){
		if (root != null){
			if ( root.left != null){
				inorder(root.left);
		}
			System.out.print(root.data +" ");
			if ( root.right != null){
				inorder(root.right);
		}
		}
	}
	
	public List<Integer> inorderTraversal(Node root) {
	    List<Integer> list = new ArrayList<Integer>();

	    Stack<Node> stack = new Stack<Node>();
	    Node cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.data);
	        cur = cur.right;
	    }
	    System.out.println(list);
	    return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(1);
		root.right = new Node(2);
		root.right.left = new Node(3);
		inorder(root);
		InorderTraversal tree = new InorderTraversal();
		tree.inorderTraversal(root);
	}

}
