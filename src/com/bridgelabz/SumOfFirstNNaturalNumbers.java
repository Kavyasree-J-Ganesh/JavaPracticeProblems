package com.bridgelabz;

public class SumOfFirstNNaturalNumbers {
    static int sumOfNumbers(int r){
        int sum = 0;

        for(int i=1; i<=r; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        int k = sumOfNumbers(10);
        System.out.println(k);
    }
}
