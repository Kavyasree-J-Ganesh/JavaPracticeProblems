package com.bridgelabz;

public class FibonacciSeriesUptoNthTerm {

    //fibonacci sequence is the sequence in which each number is equal to the sum of the preceding two numbers.

    static void fibonacciSeries(int num){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i=2; i<num; i++){
            int feb = first + second;
            first = second;
            second = feb;
            System.out.println(feb);
        }
    }
    public static void main(String[] args){
        fibonacciSeries(8);
    }

}
