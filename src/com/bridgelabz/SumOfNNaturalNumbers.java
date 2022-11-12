package com.bridgelabz;

public class SumOfNNaturalNumbers {
    static int sumOfNumbers(int a, int b){
        int sum = 0;

        for(int i=a; i<=b; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args){
        int q = sumOfNumbers(2, 25);
        System.out.println(q);
    }
}
