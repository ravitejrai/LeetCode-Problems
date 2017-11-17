package String;

import String.TreeNode;


public class ConvertBSTtoGreaterTree {
	
	TreeNode root ;
	int sum = 0 ;
	
	public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null ;
        convertBST(root.right);
        sum += root.data ;
        root.data = sum;
        convertBST(root.left);
        
      
        return root ;
    }
	
	
	
	void inorder(TreeNode root){
		if ( root != null ){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertBSTtoGreaterTree tree = new ConvertBSTtoGreaterTree();
		
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(2);
		tree.root.left.left = new TreeNode(1);
		tree.root.left.right = new TreeNode(3);
		tree.root.right = new TreeNode(7);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(9);
		//tree.inorder(tree.root);
		tree.convertBST(tree.root);
		tree.inorder(tree.root);
		 
	}

}
