package com.bridgelabz;

public class GreatestOfThreeNumbers {
    static void greatest(int a, int b, int c){
        if(a > b){
            if(a > c){
                System.out.println( a + " is greatest " );
            }else {
                System.out.println( c + " is greatest " );
            }
        }else {
             if(b > c){
                 System.out.println( b + " is greatest ");
             }else{
                 System.out.println( c + " is greatest ");
             }
        }
    }
    public static void main(String[] args){
        greatest(2,20,15);
    }
}
