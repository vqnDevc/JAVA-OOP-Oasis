package org.example.week3.GDC;

public class Solution {
    /**
     * Calculate GCD using Euclidean algorithm.
     *
     * @param a : int
     * @param b : int
     * @return : gcd of a,b
     */
    public static int  gcd(int a, int b) {
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

    public static void main(String[] args) {
        // Example usage
        int num1 = -1;
        int num2 = 0;

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
