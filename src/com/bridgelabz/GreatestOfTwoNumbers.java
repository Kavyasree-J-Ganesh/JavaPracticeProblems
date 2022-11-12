package com.bridgelabz;

public class GreatestOfTwoNumbers {
    static void greatest(int r, int s){
        if(r > s){
            System.out.println( r + " is greater than " + s ); // string interpolation.
        }else {
            System.out.println( s + " is greater than " + r);
        }
    }
    public static void main(String[] args){
        greatest(14,12);
    }
}
