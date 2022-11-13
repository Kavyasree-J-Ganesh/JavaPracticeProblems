package com.bridgelabz;

public class NthFibonacciNumber {
    static void nThFibonacciNumber(int num) {
        int first = 0;
        int second = 1;
        int fib = 0;
        for (int i = 2; i < num; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        System.out.println(fib);
    }
        public static void main (String[] args){
            nThFibonacciNumber(7);
        }

    }