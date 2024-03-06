package org.example.week3.Prime;

public class Solution {
    /**
     * Check prime number.
     *
     * @param n : int
     * @return : boolean
     */
    public static boolean isPrime (int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int a = 12;
        System.out.print(a + (isPrime(a) ? " is" : " is not") + " a prime number.");
    }
}
