package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	/**
	 * a method to create an IExpression object depending on operator
	 * @param operator the operator used to calculate, add or subtract
	 * @param val1 the first value you want to calculate
	 * @param val2 the second value you want to calculate
	 * @return returns an Expression object to be calculated
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		Addition add = new Addition();
		Subtraction minus = new Subtraction();
		Literal a = new Literal(val1);
		Literal b = new Literal(val2);
		if (operator == '+') {
			IExpression exA = new BinaryExpression(add, a, b);
			return exA;
		}
		if (operator == '-') {
			IExpression exM = new BinaryExpression(minus, a, b);
			return exM;
		}
		return null;

	}

}
