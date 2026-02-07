package com.javawithsteven;

import java.util.Scanner;

public class Main {
    int glb1 = 24;

    public static  void main (String[] args) {
        System.out.println("Hello World");

        /*
        Variables :
        Variables are containers which store data values
        ex. string, int, float, char, boolean

        How to declare variables :
        syntax - <datatype> <Variable name> = <value>;

        Rules for constructing name of variables in Java :
        1. Can contain digits, underscores, dollar_signs, letters
        2. Should begin with a letter, $ or _
        3. Java is 'case-sensitive' language which means that Steven and steven are two different variables altogether
        4. Should not contain whitespaces
        5. You cannot use reserved keywords from Java
         */

        String name = "Steven";
        System.out.println("Hello Master " + name);

        int n1 = 24, n3 = 6, n4 = 10;
        float n2 = 24.24F;
        boolean isMale = true;
        System.out.println(n1 +""+ n3);
        System.out.println(n2);
        System.out.println(isMale);

        /*
        Two types of Java Data Types :
        1. Primitive - Store simple values directly and are not objects
           Store simple, single values
           have a fixed size
           are not objects
           variables have default values (only for class/instance variables)
        2. Non-Primitive or Reference Data Type - Store references to objects and include classes, arrays, and interfaces
           store the memory address of an object
           size is not fixed
           can access methods and fields
           default value is null (for class/instance variables)
         */

        //Primitive example

        byte u = 56;
        System.out.println(u);

        //byte u1 = 156; Give below error since it is out of range of the byte data type
        //System.out.println(u1);  java: incompatible types: possible lossy conversion from int to byte

        char a1 = 'S', a2 = 'D';
        System.out.println(a1 +""+ a2);

        //Primitive example ended

        //Non-Primitive example

        /*
        Operators in Java

            Operand, Operator, Operand = Result
            4           +           7  = 11

            Types of operators in java
            1. Arithmetic operators
            2. Assignment operators
            3. Logical operators
            4. Comparison operators
         */

        //Arithmetic Operators Example
        int num1 = 45, num2 = 78;
        System.out.println("The sum of num1 + num2 is " + (num1 + num2));
        System.out.println("The sum of num1 - num2 is " + (num1 - num2));
        System.out.println("The sum of num1 / num2 is " + (num1 / num2));
        System.out.println("The sum of num1 * num2 is " + (num1 * num2));
        System.out.println("The sum of num1 % num2 is " + (num1 % num2));
        System.out.println("Incremented num1 by one " + (++num1));
        System.out.println("Incremented num1 by one " + (++num1));
        System.out.println("Decremented num1 by one " + (--num1));
        System.out.println("Incremented num1 by one " + (++num1));
        //Arithmetic Operators Example Ended

        //Assignment Operators Example
        int num3 = 35, num4 = 48, num5 = 50, num6 = 32, num7 = 23;
        num3 += 5;
        num4 -= 8;
        num5 *= 2;
        num6 /= 16;
        num7 %= 3;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        //Assignment Operators Example Ended

        /*
        Comparison Operators types :
        1. == : checks for equality of two values
        2. != : checks if two values are not equal
        3. <  : checks if value is less than other
        4. >  : checks if value is greater than other
        5. <= : checks if value is less than equal to the other
        6. >= : checks if value is greater than equal to the other
         */

        //Comparison Operators Example

        //Comparison Operators Example Ended

        /*
        Logical Operators types:
        1. && - Logical and operator - returns true only if both conditions are true
        2. || - Logical or operator - returns true if any one condition is true
        3. ! - Logical not - reverse the result from true to false and vice versa
         */

        //Taking user input in Java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input :");
        String input = scan.nextLine();
        System.out.println(input);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a integer :");
        int input1 = scan1.nextInt();
        System.out.println(input1);

    }
}
