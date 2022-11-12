package com.bridgelabz;

public class PositiveOrNegative {
    static void checkNumber(int x){
        if(x > 0) {
            System.out.println("Number is Positive");
        } else if (x < 0) {
            System.out.println("Number is Negative");
        } else{
            System.out.println("Number is Zero");
        }
    }
    public static void main(String[] args){
    checkNumber(-5);
    }
}
