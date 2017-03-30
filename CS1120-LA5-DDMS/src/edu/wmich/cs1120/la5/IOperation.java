package edu.wmich.cs1120.la5;

public interface IOperation {
	/**
	 * Performs an equation using the values of two IExpression
	 * objects.
	 * 
	 * @param left
	 *            The Expression on the left side of the equation.
	 * 
	 * @param right
	 *            The Expression on the right side of the equation.
	 * 
	 * @return Returns a value depending on the operator (Subtraction, Addition etc)
	 */
	Integer perform(IExpression left, IExpression right);

}
