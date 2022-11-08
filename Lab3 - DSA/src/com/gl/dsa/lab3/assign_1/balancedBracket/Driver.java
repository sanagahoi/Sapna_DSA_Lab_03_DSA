package com.gl.dsa.lab3.assign_1.balancedBracket;

public class Driver {
	public static void main(String[] args) {
		test("([[{}]])");
		test("([[{}]]))");
		
	}

	static void test(String brackets) {
		
		BalancedBracketsIdentifier checker= new BalancedBracketsIdentifier(brackets);
		
		boolean result = checker.checkBalanceOfBracket();
		
		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}