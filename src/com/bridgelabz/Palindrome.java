package com.bridgelabz;

public class Palindrome {
    static void checkPalindrome(int num){
        int reverse = 0;
        int i = num;
        while(i>0){
            int mod = i % 10;
            reverse = reverse * 10 + mod;
            i = i / 10;
        }
        if(reverse == num){
            System.out.println(" Number is Palindrome ");
        }else{
            System.out.println(" Number is Not Palindrome ");
        }
    }
    public static void main(String[] args){
        checkPalindrome(12321);
    }
}
