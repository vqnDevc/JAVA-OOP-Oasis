package org.example.week3.Fibo;

import java.util.Scanner;

public class Solution {
    /**
     * Calculate fibonacci number index n.
     *
     * @param n : index
     * @return : fibonacci number
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution fibo = new Solution();
        long input = sc.nextLong();
        System.out.print(fibo.fibonacci(input));
        sc.close();
    }
}
