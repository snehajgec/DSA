package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import DiameterBinaryTree.TreeNode;

public class LevelOrderBinaryTree {

	TreeNode root;

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> nodeList = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null) {
			return nodeList;
		}

		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			list = new ArrayList<Integer>();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}	
			}
			nodeList.add(list);
		}

		return nodeList;

	}

	public static void main(String[] args) {
		LevelOrderBinaryTree tree = new LevelOrderBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		List<List<Integer>> nodeList = tree.levelOrder(tree.root);
		for (List<Integer> list : nodeList) {
			System.out.print("[");
			for (Integer i : list) {
				System.out.print(i + ", ");
			}
			System.out.print("]");
			System.out.println();
		}

	}

}
