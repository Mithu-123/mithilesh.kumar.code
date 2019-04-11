package GeeksForGeeks;

import java.util.Scanner;

class Node {

	public Node left;
	int data;
	public Node right;
}

public class BinarySearchTree {

	public static void main(String args[]) {
		Node root = null;
		int number_node;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of Node:");
		number_node = input.nextInt();
		for (int i = 0; i < number_node; i++) {
			root = createBinarySearchTree(root);
		}
		System.out.println("Printing Binary search Tree in Inorder Fashion before update:");
		inorder(root);
		updateParentDataWithSumOfChildData(root);
		System.out.println("\nPrinting Binary search Tree in Inorder Fashion after update :");
		inorder(root);

	}

	private static Node createBinarySearchTree(Node root) {
		Node new_node, temp1_node, temp2_node = null;
		new_node = new Node();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the data of Node:");
		new_node.data = input.nextInt();
		new_node.left = new_node.right = null;

		if (root == null) {
			root = temp2_node = temp1_node = new_node;

		} else {
			temp1_node = root;
			while (temp1_node != null) {
				temp2_node = temp1_node;
				if (new_node.data < temp1_node.data) {
					temp1_node = temp1_node.left;
				} else if (new_node.data > temp1_node.data) {
					temp1_node = temp1_node.right;
				}
			}
			if (new_node.data < temp2_node.data) {
				temp2_node.left = new_node;
			}

			if (new_node.data > temp2_node.data) {
				temp2_node.right = new_node;
			}

		}
		return root;
	}

	private static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(" " + root.data + " ");
		inorder(root.right);
	}

	private static void updateParentDataWithSumOfChildData(Node root) {
		if (root == null) {
			return;
		}
		updateParentDataWithSumOfChildData(root.left);
		updateParentDataWithSumOfChildData(root.right);
		if (root.left != null && root.right != null) {
			root.data = root.left.data + root.right.data;
		} else if (root.left != null) {
			root.data = root.data + root.left.data;

		} else if (root.right != null) {
			root.data = root.data + root.right.data;

		}

	}

}
