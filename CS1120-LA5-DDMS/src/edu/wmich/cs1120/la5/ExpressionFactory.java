package edu.wmich.cs1120.la5;

public class ExpressionFactory {

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
