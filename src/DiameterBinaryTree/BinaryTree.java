package DiameterBinaryTree;

public class BinaryTree {
	
	TreeNode root;
	
	static class Height{
		int h;
	}
	
	//Complexity - O(n^2)
	//Traversing all nodes for height and again for diameter - O(n*n)
	public static int diameter(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		 
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		
		int lDiameter = diameter(node.left);
		int rDiameter = diameter(node.right);
		
		return (Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter)));
	}
	
	public int diameter() {
		return diameter(root);
	}
	
	//Complexity - O(n) 
	//Height is being calculated while taversing for diameter
	public static int diameterOpt(TreeNode node, Height height) {
		
		Height lh = new Height();
		Height rh = new Height();
		
		if(node == null) {
			height.h = 0;
			return 0;
		}
		
		int lDiameter = diameterOpt(node.left, lh);
		int rDiameter = diameterOpt(node.right, rh);
		
		height.h = Math.max(lh.h, rh.h) + 1;
		
		return (Math.max(lh.h + rh.h, Math.max(lDiameter, rDiameter)));
	}
	
	
	public int diameterOpt() {
		Height height = new Height();
		return diameterOpt(root, height);
	}
	public static int height(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return (Math.max(height(node.left), height(node.right)) + 1);
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(); 
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
  
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameterOpt()); 
        
	}
}
