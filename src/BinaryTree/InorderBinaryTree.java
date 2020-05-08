package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import DiameterBinaryTree.TreeNode;

public class InorderBinaryTree {

	TreeNode root;

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> nodeList = new ArrayList<Integer>();
		Stack<TreeNode> node = new Stack<TreeNode>();
		
		if(root == null)
			return nodeList;
		
		TreeNode current = root;
		
		while(current != null || !node.empty()) {
			while(current != null) {
				node.push(current);
				current = current.left;
			}
			
			current = node.pop();
			nodeList.add(current.val);
			current = current.right;
		}
		return nodeList;

	}

	public static void main(String[] args) {
		InorderBinaryTree tree = new InorderBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		List<Integer> nodeList = tree.inorderTraversal(tree.root);
		for(Integer i : nodeList) {
			System.out.print(i + " ");
		}
	}

}
