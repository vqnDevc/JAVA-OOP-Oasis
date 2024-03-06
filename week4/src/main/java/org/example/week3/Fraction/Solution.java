package org.example.week3.Fraction;
// Import your library
// Do not change the name of the Solution class
public class Solution {
    private int numerator;
    private int denominator;

    //getter, setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * Set denominator.
     * @param denominator : int
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    private static int gcd(int a, int b) {
        //Ensure that both numbers are non-negative
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    /**
     * Constructor default.
     */
    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Constructor with all field.
     * @param numerator : tu so
     * @param denominator : mau so
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.setDenominator(denominator);
    }

    /**
     * Reduce fraction.
     * @return : fraction
     */
    public Solution reduce() {
        int gdc = gcd(this.numerator, this.denominator);

        return new Solution(this.numerator / gdc, this.denominator / gdc);
    }

    /**
     * Add two fraction.
     * @param frac : fraction object.
     * @return : fraction
     */
    public Solution add(Solution frac) {
        this.numerator = (this.numerator * frac.getDenominator())
                + (this.denominator * frac.getNumerator());
        this.denominator = this.denominator * frac.getDenominator();

        return this.reduce();
    }

    /**
     * Subtract two fraction.
     * @param frac : fraction object
     * @return : fraction
     */
    public Solution subtract(Solution frac) {
        this.numerator = (this.numerator * frac.getDenominator())
                - (this.denominator * frac.getNumerator());
        this.denominator = this.denominator * frac.getDenominator();

        return this.reduce();
    }

    /**
     * Multiply two fraction.
     * @param frac : fraction object
     * @return : fraction
     */
    public Solution multiply(Solution frac) {
        this.numerator = this.numerator * frac.getNumerator();
        this.denominator = this.denominator * frac.getDenominator();
        return this.reduce();
    }

    /**
     * Divide two fraction.
     * @param frac : fraction object
     * @return : fraction
     */
    public Solution divide(Solution frac) {
        Solution temp = new Solution(frac.getDenominator(), frac.getNumerator());
        return this.multiply(temp).reduce();
    }

    /**
     * Compare two fraction.
     * @param obj : fraction object
     * @return : boolean
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            Solution temp = this.reduce();
            other = other.reduce();
            boolean result = (temp.getNumerator() == other.getNumerator())
                    && (temp.getDenominator() == other.getDenominator());

            return result;
        }
        return false;
    }
}   