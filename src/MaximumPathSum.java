
public class MaximumPathSum {
	
	static int res;
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(findMaxPathSum(root));
		
	}
	
	public static int findMaxPathSum(TreeNode root) {
		res = Integer.MIN_VALUE;
		findMaxPathSumUtil(root);
		return res;
	}
	
	public static int findMaxPathSumUtil(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = findMaxPathSumUtil(root.left);
		int right = findMaxPathSumUtil(root.right);
		
		int max_single = Math.max(Math.max(left, right) + root.val, root.val);
		
		int max_top = Math.max(max_single, left + right + root.val);
		
		res = Math.max(res, max_top);
		
		return max_single;
	}
}
