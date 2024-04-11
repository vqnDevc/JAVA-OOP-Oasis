package org.example.week11;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    public double division(double left, double right) throws ArithmeticException {
        return left / right;
    }
    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }
}
