package com.gl.dsa.lab3.assign_1.balancedBracket;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedBracketsIdentifier {

	private String brackets;

	private Set<Character> openBracketsSet;
	private Set<Character> closedBracketsSet;
	private Stack<Character> bracketsStack;

	BalancedBracketsIdentifier(String brackets) {

		this.brackets = brackets;

		closedBracketsSet = new HashSet<>();
		bracketsStack = new Stack<>();
	}

	public boolean checkBalanceOfBracket() {
		// if count of brackets string is not even
		if (brackets.length() % 2 != 0) {
			return false;
		}

		openBracketsSet = BracketUtils.getOpenBrackets();
		closedBracketsSet = BracketUtils.getClosedBrackets();

		for (int i = 0; i < brackets.length(); i++) {

			char aCharacter = brackets.charAt(i);

			// check character represents the open brackets--> ([{
			if (openBracketsSet.contains(aCharacter)) {

				bracketsStack.push(aCharacter);

			} else if (closedBracketsSet.contains(aCharacter)) {

				BracketPair bracketPairObj = BracketUtils.getBracketPair(aCharacter);
				Character openBktCharFrmStack = bracketsStack.pop();

				if (bracketPairObj.getOpenChar().equals(openBktCharFrmStack)) {
					// matched
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println("Invalid character ->" + aCharacter);
			}
		}

		boolean successCondition = bracketsStack.isEmpty();
		if (successCondition) {
			return false;
		} else {
			return true;
		}
	}
}