//package org.example.week11;

public class Square extends Expression {
    private final Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
