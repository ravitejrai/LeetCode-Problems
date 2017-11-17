package String;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	
	int data ;
	TreeNode left , right ;
	
	 TreeNode( int d ){
		data = d ;
		left = right = null ;
	}
}

public class InvertBinaryTree {
	
	TreeNode root ;
	
public TreeNode invertTree(TreeNode root) {
 	if ( root == null)
 		return null ;
 	TreeNode temp = root.right;
 	root.right = root.left ;
 	root.left = temp ;
		 invertTree(root.right) ;
		 invertTree(root.left) ;
		 
		 return root ;
		
    }

	
	void inorder(TreeNode root){
		if ( root != null ){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}	
	}

	public TreeNode invert(TreeNode root)
	{
		if(root==null) return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode node = q.poll();
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
			
		}
		
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvertBinaryTree tree = new InvertBinaryTree();
		
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(2);
		tree.root.left.left = new TreeNode(1);
		tree.root.left.right = new TreeNode(3);
		tree.root.right = new TreeNode(7);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(9);
		//tree.invertTree(tree.root);
		tree.invert(tree.root);
		tree.inorder(tree.root);
	}

}
