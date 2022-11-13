package com.bridgelabz;

public class AbundantNumber {

    // abundant numbers means the sum of its divisors should be greater than that number.
    static void checkNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > num) {
            System.out.println("The number is Abundant");
        } else {
            System.out.println("The number is not abundant");
        }
    }
    public static void main(String[] args){
        checkNumber(12);
    }
}
