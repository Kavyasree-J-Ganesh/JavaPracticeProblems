package com.bridgelabz;

public class FactorOfNumber {
    static void findFactors(int num){
        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(num); // a number is a factor of that number itself.
    }
    public static void main(String[] args){
        findFactors(21);
    }
}
