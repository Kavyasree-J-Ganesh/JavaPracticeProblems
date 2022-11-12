package com.bridgelabz;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the Number ");
        int number = in.nextInt();

        int factorial = 1;
        for(int i=number; i>0; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
