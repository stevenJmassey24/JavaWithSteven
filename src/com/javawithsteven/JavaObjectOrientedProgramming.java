package com.javawithsteven;

public class JavaObjectOrientedProgramming {
    public static void main(String[] args){
        System.out.println("Hello OOPS concepts :");

        //Created Objects
        Main object1 = new Main();
        JavaRecursion object2 = new JavaRecursion();

        //Printing attribute through objects
        System.out.println("Created an object of the Main Class and fetched value of glb1 variable: " + object1.glb1);
        System.out.println("Created an object of the javaRecursion class and printed its hash code: " + object2);

        //Updating value of the attribute from another class
        object1.glb1 = 18;
        System.out.println("Updated the glb1 variable value = 24 of the Main Class to : " + object1.glb1);

        //Printing final attribute from JavaRecursion class
        System.out.println("Created an attribute glb2 in the JavaRecursion class with final");
        System.out.println("glb2 variable value : " + object2.glb2);

        //object2.glb2 = 1824;
        System.out.println("Updated value of a final attribute, it will throw error: java: cannot assign a value to final variable glb2");
        //java: cannot assign a value to final variable glb2

    }
}
