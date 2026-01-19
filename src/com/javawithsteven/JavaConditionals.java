package com.javawithsteven;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaConditionals {
    public static void main (String[] args){
        System.out.println("Java Conditionals :");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age  in numbers :");
        int age = scan.nextInt();

        //if else conditions
        if (age>5 && age<18){
            System.out.println("You are a teenager.");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        }
        else {
            System.out.println("You are a kid.");
        }

        //Switch statement in Java
        switch(age){
            case 18:
                System.out.println("You are 18 years old.");
                break;
            case 24:
                System.out.println("You are 24 years old.");
                break;
            case 50:
                System.out.println("You are 50 years old.");
                break;
            default:
                System.out.println("You doesn't fall under the age criteria.");
        }
        //break statement is used to stop the switch case statement if a match is found.
        // if break is not added, then java will run all the cases below the matched case.


        Scanner scan1= new Scanner(System.in);
        System.out.println("Which number of day is it in the week :");
        int numbofday = scan1.nextInt();

        switch (numbofday){
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Entered wrong day number. No such day exists.");
        }
    }
}
