package com.bridgelabz;

public class ReverseOfNumber {
    static void reverseNumber(int num){
        int reverse = 0;
        while(num >0){
            int mod = num % 10;
            reverse = reverse * 10 + mod;
            num = num / 10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        reverseNumber(1234);
    }
}
