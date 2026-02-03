package com.javawithsteven;

public class JavaMethodOverloading {
    public static void main(String[] arg){
        System.out.println("Method Overload");
        hello();
        hello(24);

        System.out.println("The sum of 5 + 9 is " + sum(5,9));
        System.out.println("The sum of 5 + 9 + 3 is " + sum(5,9,3));
    }

    static int sum(int b, int c){
        return b + c;
    }
    static int sum(int b, int c, int d){
        return b + c + d;
    }

    static void hello(){
        System.out.println("Hello Steven!!");
    }
    static void hello(int a){
        System.out.println("Hello Steven " + a);
    }
}
