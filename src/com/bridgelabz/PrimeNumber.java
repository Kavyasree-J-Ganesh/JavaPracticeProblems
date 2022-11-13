package com.bridgelabz;

public class PrimeNumber {
    // prime number is the number only divisible by "1" and "that number itself".
    static String checkPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return "Not a Prime Number";
            }
        }
        return "Prime Number";
    }
    public static void main(String[] args){
        String p = checkPrime(9);
        System.out.println(p);
    }
}
