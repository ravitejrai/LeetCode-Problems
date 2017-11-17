package String;
import String.TreeNode;

public class BinaryTreePathSum {
	
	TreeNode root ;
	int count = 0 ;
	int total = 0 ;
	
	public int pathSum(TreeNode root, int sum) { 
		if ( root == null)
			return 0 ;
        
        total += root.data ;
        if (total == sum){
            count++ ;
            total = 0 ;
        }
        
        pathSum(root.right ,sum);
        pathSum(root.left,sum);
        System.out.println();
        System.out.print(total + " " + count);
        return count ;
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
		BinaryTreePathSum tree = new BinaryTreePathSum();
		
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(2);
		tree.root.left.right.right = new TreeNode(1);
		tree.root.right = new TreeNode(-3);
		tree.root.right.right = new TreeNode(11);
		tree.inorder(tree.root);
		tree.pathSum(tree.root, 8);
	}

}
