package com.javawithsteven;

import java.util.Scanner;

public class JavaRecursion {

    final int glb2 = 2418;

    public static void main(String[] args){
        System.out.println("Java Recursion :");

        int a = 5;
        System.out.println("The value of Factorial x is : " + factorial(a));
        System.out.println("The value of Factorial x is : " + factorial_iterative(a));


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits for Fibonacci Number :");
        int b = scan.nextInt();

        System.out.println("The Fibonacci Series is : ");
        for(int i=0;i<=b;i++) {
            System.out.print(fib(i) + " ");
        }
        scan.close();
    }

    //Fibonacci Number
    static int fib(int c){
        if(c==0) return 0;
        if(c==1) return 1;
        return fib(c-1) + fib(c-2);
    }

    static int factorial(int x){
        if(x==0||x==1){
            return 1;
        }
        else {
            return x * factorial(x-1);
        }
    }

    static int factorial_iterative(int x){
        if (x==0||x==1){
            return 1;
        }
        else {
            int finalFactorial = 1;
            for(int i=1;i<=x;i++){
                finalFactorial *= i;
            }
            return finalFactorial;
        }
    }
}
