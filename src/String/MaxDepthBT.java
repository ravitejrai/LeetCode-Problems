package String;

class Node {
	
	int data;
	Node left , right ;
	
	Node (int data){
		this.data = data ;
		left = right = null ;
	}
}

public class MaxDepthBT {
	
	Node root ;
	
	static int maxDepth(Node root){
		
		if (root == null) {
			return 0;
		}
		int lDepth = maxDepth(root.left);
		int rDepth = maxDepth(root.right);
		
		if (lDepth > rDepth)
			return ( lDepth + 1) ;
		else
			return (rDepth + 1) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDepthBT tree = new MaxDepthBT();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
		
	    System.out.println("The max depth is :" + maxDepth(tree.root));
	}

}
