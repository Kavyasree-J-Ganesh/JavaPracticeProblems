package com.bridgelabz;

public class SumOfNumbersInGivenRange {
    static void givenRange(int c, int d){
        int sum = 0;

        int i = c;
        while(i <= d){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        givenRange(5, 15);
    }
}
