package com.bridgelabz;

public class SumOfDigit {
    static int sumOfDigitOfNumber(int num){
        int sum = 0;
        while(num > 0) {
            int mod = num % 10;
            sum = sum + mod;
            num = num / 10; // divide the number by 10 in each step
        }
        return sum;
    }
    public static void main(String[] args){
        int digitSum = sumOfDigitOfNumber(341);
        System.out.println(digitSum);
    }
}
