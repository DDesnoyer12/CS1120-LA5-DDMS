package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * Performs a subtraction equation using the values of two
	 * IExpression objects.
	 * @param left The IExpression on the left side of the equation.
	 * 
	 * @param right The IExpression on the right side of the equation
	 * 
	 * @return Returns the difference between the values of two 
	 * IExpression objects.
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		return (left.getValue() - right.getValue());
	}

}