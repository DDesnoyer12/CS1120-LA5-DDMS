package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IOperation op;
	private IExpression left;
	private IExpression right;

	/**
	 * Constructor for BinaryExpression
	 * @param op An object of IOperation.
	 * @param left An object of IExpression, used for the left side of the operation.
	 * @param right An object of IExpression, used for the right side of the operation.
	 */
	public BinaryExpression(IOperation op, IExpression left, IExpression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	/**
	 * Performs the operation and returns the value.
	 * @return Returns the value given by the operation.
	 */
	@Override
	public Integer getValue() {
		return op.perform(left, right);
	}

}
