package com.bridgelabz;

public class EvenOrodd {
    static void checkNumber(int p){
        if(p % 2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args){
        checkNumber(4);
    }
}
