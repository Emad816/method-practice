package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println(isEven(6));
        System.out.println(isPositive(20));

    }

    public static boolean isEven(int number){

        if (number %2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPositive(double number){

        if (number > 0){
            return true;
        } else {
            return false;
        }
    }
}
