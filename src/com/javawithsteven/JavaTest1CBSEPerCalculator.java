package com.javawithsteven;

import java.util.Scanner;

public class JavaTest1CBSEPerCalculator {
    public static void main(String[] args){
        System.out.println("CBSE Percentage Calculator :");
        int marksPerSubject = 100;
        int numberOfSubjects = 5;
        int totalMaxMarks = marksPerSubject * numberOfSubjects;
        //System.out.println(totalMaxMarks);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks of English :");
        float mark1 = scan.nextFloat();

        System.out.println("Enter marks of Mathematics :");
        float mark2 = scan.nextFloat();

        System.out.println("Enter marks of Physics :");
        float mark3 = scan.nextFloat();

        System.out.println("Enter marks of Chemistry :");
        float mark4 = scan.nextFloat();

        System.out.println("Enter marks of Biology :");
        float mark5 = scan.nextFloat();

        float totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;

        System.out.println("Your marks are English :" + mark1 +
                ", Mathematics :" + mark2 + ", Physics :" + mark3 + ", Chemistry :" + mark4 + ", Biology :" + mark5 );

        System.out.println("Sum Total of the student marks : " + totalMarks);

        float percentage = (totalMarks/totalMaxMarks) * 100;

        System.out.println("Your overall percentage is :" + percentage + "%");

        scan.close();
    }
}
