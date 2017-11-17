package String;

public class ArrayToBST {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	 public TreeNode sortedArrayToBST(int[] num) {
	      return sortedArrayToBST(num, 0, num.length - 1);
		}

		public TreeNode sortedArrayToBST(int[] num, int start, int end) {
			if (start <= end) {
				int mid = (start + end) / 2;
				TreeNode left = sortedArrayToBST(num, start, mid - 1);
				TreeNode right = sortedArrayToBST(num, mid + 1, end);
				TreeNode node = new TreeNode(num[mid]);
				node.left = left;
				node.right = right;
				return node;
			}
			return null;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,4,5} ;
		ArrayToBST AB = new ArrayToBST();
		System.out.println(AB.sortedArrayToBST(num));
	}

}
