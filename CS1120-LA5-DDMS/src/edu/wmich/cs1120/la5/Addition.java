package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * Performs an addition equation using the values of two 
	 * IExpression objects.
	 * @param left The Expression on the left side of the equation.
	 * 
	 * @param right The Expression on the right side of the equation.
	 * 
	 * @return Returns the sum of the values of both Expressions
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		return (left.getValue() + right.getValue());
	}

}
