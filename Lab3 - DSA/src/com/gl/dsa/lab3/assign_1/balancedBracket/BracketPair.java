package com.gl.dsa.lab3.assign_1.balancedBracket;

public class BracketPair {
	private Character openChar;
	private Character closedChar;
	
	//by using constructor
	public  BracketPair(char openChar, char closedChar) {

		this.openChar = openChar;
		this.closedChar = closedChar;
	}
	public Character getOpenChar() {
		return openChar;
	}
	public void setOperchar(Character openChar) {
		this.openChar = openChar;
	}
	public Character getClosedChar() {
		return closedChar;
	}
	public void setClosedchar(Character closedChar) {
		this.closedChar = closedChar;
	}
}
