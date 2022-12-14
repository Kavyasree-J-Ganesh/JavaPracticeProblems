package com.bridgelabz;

public class PerfectNumbers {

    // Perfect number is a positive integer that is equal to the sum of its proper divisors.
    static void checkPerfectNumber(int num){
         int sum = 0;
         for(int i=1; i<=num/2; i++){
             if(num % i == 0){
                 sum = sum + i;
             }
         }
         if(sum == num){
             System.out.println("Perfect Number");
         }else {
             System.out.println("Not a Perfect Number");
         }
    }
    public static void main(String[] args){
        checkPerfectNumber(28);
    }
}
