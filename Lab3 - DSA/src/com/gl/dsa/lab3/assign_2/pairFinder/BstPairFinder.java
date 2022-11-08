package com.gl.dsa.lab3.assign_2.pairFinder;

import java.util.HashSet;
import java.util.Set;

public class BstPairFinder {
	private BinarySearchTree bst;
	private boolean found;

	public BstPairFinder(BinarySearchTree bst) {
		this.bst = bst;
	}

	public void findPair(int sum) {
		Set<Integer> nodes = new HashSet<>();
		
		findInternalPair(bst.getRoot(), sum, nodes);
		
		if (!found) {
			System.out.println("nodes are not found");
		}
	}

	boolean findInternalPair(Node aNode, int sum, Set<Integer> nodes) {
		
		if (aNode == null) {
			return false;
		}
		found = findInternalPair(aNode.getLeftNode(), sum, nodes);
		if (found) {
			return true;
		}
		int difference = sum - aNode.getData();
		if (nodes.contains(difference)) {
			found = true;
			
			System.out.println("Pair is ("+ difference  + "," + aNode.getData()  + ")");
		
			return found;
		} else {
			nodes.add(aNode.getData());
		}
		if (!found) {
			return findInternalPair(aNode.getRightNode(), sum, nodes);

		} else {
			return true;
		}
	}
}
