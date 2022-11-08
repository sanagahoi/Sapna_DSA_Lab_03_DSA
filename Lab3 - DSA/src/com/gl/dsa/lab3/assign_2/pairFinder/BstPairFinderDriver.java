package com.gl.dsa.lab3.assign_2.pairFinder;

public class BstPairFinderDriver {
	public static void main(String[] args) {
		
		BstPairFindertest(130);
	}

	public static void BstPairFindertest(int sum) {

		BinarySearchTree Bst = BinarySearchTreeTest.sampleBinaryTree();
		BstPairFinder finder = new BstPairFinder(Bst);
		finder.findPair(sum);
	}

}
