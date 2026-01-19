package com.javawithsteven;

public class JavaTryCatch {
    public static void main(String[] args){
        System.out.println("Java Try Catch - prints the error, and keep on executing the code :");

        //try catch with no issue
        int [] numb1 = {1, 2, 3, 4, 5};
        try{
            System.out.println(numb1[3]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Try Catch executed.");

        //try catch with issue
        int [] numb2 = {11, 12, 13, 14, 15};
        try{
            System.out.println(numb2[5]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Try Catch executed.");

    }
}
