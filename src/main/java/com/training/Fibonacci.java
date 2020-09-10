package com.training;

public class Fibonacci {
    public long countFibonacci(int n) {
        long nThFibonacci = 0;

        if (n == 1) {
            nThFibonacci = 1;
        } else if (n > 1) {
            long nThFibonacci1 = 0;
            long nThFibonacci2 = 1;
            for (int i = 1; i != n; i++) {
                nThFibonacci = nThFibonacci1 + nThFibonacci2;
                nThFibonacci1 = nThFibonacci2;
                nThFibonacci2 = nThFibonacci;
            }
        }
        return nThFibonacci;

    }
}
