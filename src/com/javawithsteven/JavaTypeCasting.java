package com.javawithsteven;

import java.util.Scanner;

public class JavaTypeCasting {
    public static void main(String[] args){
        System.out.println("Java Type Casting - converting one data type into anther.");

        /*
        Two Types of Casting :
        1. Widening Casting : converting a smaller type to a larger type size
        ex. byte -> short -> char -> int -> long -> float -> double
        2. Narrowing Casting : converting a large type to a smaller type size
        ex. double -> float -> long -> int -> char -> short -> byte
         */

        System.out.println("Widening Casting : ");
        int int1 = 10;
        double double1 = int1;

        System.out.println(int1);
        System.out.println(double1);

        System.out.println("Narrowing Casting : ");
        double double2 = 24.5d;
        int int2 = (int) double2;

        System.out.println(double2);
        System.out.println(int2);


        System.out.println("Real Life Example :");
        String Scenario1 =  "Calculating the percentage of the Student :";
        System.out.println(Scenario1);
        Scanner scan = new Scanner(System.in);
        int marks1 = scan.nextInt();
        System.out.println("Your Marks is " + marks1 + " out of 500.");
        int maxscore = 500;

        double percentage = (double)  marks1 / maxscore * 100.0d;
        System.out.println("Your Percentage is " + percentage + "%");
        System.out.println(Math.round(percentage));
    }
}
