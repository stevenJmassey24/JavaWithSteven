package com.javawithsteven;

public class JavaVarArgs {
    public static void main(String[] args) {
        System.out.println("Learning Java Varargs :");

        System.out.println("The sum of 1,5,9,7,5,3,6,4,8,2 and 0 is " + sum(1,5,9,7,5,3,6,4,8,2,0));
        System.out.println("The sum of 1,5,9,7,6,4,8,2 and 0 is " + sum(1,5,9,7,6,4,8,2,0));
    }

    static int sum(int ...arr){
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
}
