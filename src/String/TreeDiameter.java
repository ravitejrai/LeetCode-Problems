package String;

public class TreeDiameter {
	
	int max = 0 ;
	
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public int Diameter(Node root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(Node root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.left.right = new Node(7);
		root.left.left.left = new Node(8);

		TreeDiameter d = new TreeDiameter();
		System.out.println("Diameter of Tree:" + d.Diameter(root));

	}
}


