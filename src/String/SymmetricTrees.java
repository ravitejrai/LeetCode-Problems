package String;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	
	int data ;
	Node1 left, right ;
	
	Node1 (int d) {
		data = d ;
		left = right = null ;
	}
 }
 
public class SymmetricTrees {
	
	Node1 root ;
	
	
/*	void BFS( Node1 root){
		Queue<Node1> q = new LinkedList<Node1>();
		if ( root == null){
			return ;
		}
		q.add(root);
		
		while(!q.isEmpty()){
			Node1 x = q.poll() ;
			System.out.println(x.data);
			if (root.left != null){
				q.add(root.left);
			
			}
			if ( root.right != null){
				q.add(root.right);
				
				if ()
				
			}
			root = q.peek() ;
		}
		
		
	}*/
	
	boolean check ( Node1 root1 , Node1 root2){
		if(root1 == null && root2 == null)
			return true ;
		if (root1!= null && root2!= null){
			if ( root1.data == root2.data) {
				if (check(root1.left,root2.right) && check(root1.right,root2.left)) {
					return true ;
				}
			}
		}
		return false ;
	}
	
	
	void inorder(Node1 root){
		if ( root != null ){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTrees tree = new SymmetricTrees();
		
		tree.root = new Node1(10);
		tree.root.left = new Node1(20);
		tree.root.right = new Node1(20);
		tree.root.right.left = new Node1(40);
		
	
		tree.root.left.left = new Node1(40);
		
		tree.inorder(tree.root);
		
		Node1 root1 = tree.root.left ;
		Node1 root2 = tree.root.right ;
		//tree.BFS(tree.root);
		
		boolean isSymmetric = tree.check(root1, root2) ;
		if (isSymmetric){
			System.out.println("Tree is Symmetric");
		}
		else
			System.out.println("Tree is not Symmetric");
	}

}
