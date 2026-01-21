package com.javawithsteven;

import java.util.Scanner;

public class JavaMethodandMiniCalculator {

    static int sum(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        // System.out.println("Java Methods : ");
        //using sum method
        //System.out.println(sum(10,4));

        System.out.println("**Welcome To Mini Calculator**");
        float numb1, numb2;
        System.out.println("Enter the first number :");
        Scanner scan = new Scanner(System.in);
        numb1 = scan.nextFloat();
        System.out.println("Enter the second number :");
        Scanner scan2 = new Scanner(System.in);
        numb2 = scan.nextFloat();

        System.out.println("You have entered " + numb1 + " and " + numb2);

        System.out.println("Press 1 for Addition, 2 for Substraction, 3 for Multiplication and 4 for Division");
        Scanner scan3 = new Scanner(System.in);
        int options = scan3.nextInt();

        switch (options){
            case 1:
                System.out.println("Adding the numbers :");
                System.out.println(numb1 + numb2);
                break;
            case 2:
                System.out.println("Subtracting the numbers :");
                System.out.println(numb1 - numb2);
                break;
            case 3:
                System.out.println("Multiplying the numbers :");
                System.out.println(numb1*numb2);
                break;
            case 4:
                System.out.println("Dividing the numbers :");
                System.out.println(numb1 / numb2);
                break;
            default:
                System.out.println("This is not a valid option.");
        }

    }
}
