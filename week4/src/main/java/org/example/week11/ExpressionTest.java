package org.example.week11;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression str = new Square(new Addition(
                new Subtraction(new Square(new Numeral(10)),
                        new Numeral(3)), new Multiplication(new Numeral(4),
                new Numeral(3))));
        System.out.println(str);
        System.out.println(str.evaluate());

        str = new Division(str, new Numeral(0));
        System.out.println(str);
        System.out.println(str.evaluate());
    }
}
