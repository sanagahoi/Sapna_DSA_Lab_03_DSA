package com.gl.dsa.lab3.assign_1.balancedBracket;

import java.util.HashSet;
import java.util.Set;

public class BracketUtils {
	static Set<BracketPair> bracketPairSet = new HashSet<>();

	static {
		BracketPair one = new BracketPair('(', ')');
		BracketPair two = new BracketPair('[', ']');
		BracketPair three = new BracketPair('{', '}');
		
		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);

	}

	static BracketPair getBracketPair(Character closedBracketChar) {
		
		for (BracketPair aBracketPair : bracketPairSet) {
			
			if (aBracketPair.getClosedChar().equals(closedBracketChar)) {
				
				return aBracketPair;
			}
		}
		return null;
	}
	
	public static Set<Character> getOpenBrackets() {
		
		Set<Character> results = new HashSet<>();
		
		for (BracketPair aBracketPair : bracketPairSet) {
			
			results.add(aBracketPair.getOpenChar());
		}
		return results;
	}

	public static Set<Character> getClosedBrackets() {
		
		Set<Character> results = new HashSet<>();
		
		for (BracketPair aBracketPair : bracketPairSet) {
			
			results.add(aBracketPair.getClosedChar());
		}
		return results;
	}
}
