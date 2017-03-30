package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	private int value;
	/**
	 * Basic constructor for Literal class
	 * @param value the int you want to assign to value
	 */
	public Literal(int value) {
		this.value = value;
	}
	/**
	 * getter method for value
	 * @return returns the value wanted
	 */
	@Override
	public Integer getValue() {
		return value;
	}

}
