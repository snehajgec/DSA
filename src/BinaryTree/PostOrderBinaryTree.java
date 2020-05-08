package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import DiameterBinaryTree.TreeNode;

public class PostOrderBinaryTree {
	TreeNode root;

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> nodeList = new ArrayList<Integer>();
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		
		if(root == null) {
			return nodeList;
		}
		
		TreeNode current = root;
		stack1.push(current);
		
		while(!stack1.empty()) {
			TreeNode temp = stack1.pop(); 
			stack2.push(temp);
			
			if(temp.left != null) {
				stack1.push(temp.left);
			}
			if(temp.right != null) {
				stack1.push(temp.right);
			}
		}
		
		while(!stack2.empty()) {
			nodeList.add(stack2.pop().val);
		}
		return nodeList;
	}

	public static void main(String[] args) {
		PostOrderBinaryTree tree = new PostOrderBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		List<Integer> nodeList = tree.postorderTraversal(tree.root);
		for (Integer i : nodeList) {
			System.out.print(i + " ");
		}
	}
}
