package com.bridgelabz;

public class LeapYearOrNot {
    static void leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(" Leap year ");
        }else{
            System.out.println(" Not a Leap Year ");
        }
    }
    public static void main(String[] args){
        leapYear(1958);
    }
}
