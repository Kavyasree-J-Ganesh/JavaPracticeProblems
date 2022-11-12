package com.bridgelabz;

public class PowerOfNumber {
    static int power(int a, int b){
        int mul = 1;
        for(int i=0; i<b; i++) {
            mul = mul * a;
        }
        return mul;
    }
    public static void main(String[] args){
        int r = power(3,4);
        System.out.println(r);
    }
}
