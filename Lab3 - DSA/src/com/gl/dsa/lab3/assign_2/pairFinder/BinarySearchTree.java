package com.gl.dsa.lab3.assign_2.pairFinder;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insert(Integer value) {
		
		root = insert(value, root);
	}

	private Node insert(Integer value, Node rootNode) {

		if (rootNode == null) {
			return createNewNode(value);
		} else if (value <= rootNode.getData()) {

			Node leftNode = rootNode.getLeftNode();

			Node newNode = insert(value, leftNode);
			
			rootNode.setLeftNode(newNode);
			return rootNode;
			
		} else {
			
			Node rightNode = rootNode.getRightNode();
			
			Node newNode = insert(value, rightNode);
			
			rootNode.setRightNode(newNode);
			return rootNode;
		}
	}

	Node createNewNode(Integer data) {

		Node newNode = new Node(data);
		return newNode;
	}

	public void print() {

		preOrderTraversal();
	}

	public void preOrderTraversal() {

		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node node) {

		if (node == null) {
			return;
		}
		preOrderTraversal(node.getLeftNode());
		preOrderTraversal(node.getRightNode());
	}
}
