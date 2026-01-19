package com.javawithsteven;

public class JavaArrays {
    public static void main(String[] args){
        System.out.println("Java Arrays Tutorial :");

        //Java Arrays
        int [] marks = {1,2,3,4,5};
        System.out.println(marks[0]);
        System.out.println(marks[3]);

        //Classical way to iterate an array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("This is for each loop : ");
        //for each loop
        for(int value:marks){
            System.out.println(value);
        }

        System.out.println("Multi Dimensional Arrays :");
        //Two dimensional arrays
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][1]);


        String [] names1 = {"Shaily","Steven","Shalini","Dollar"};
        for(String value:names1){
            System.out.println(value);
        }
    }
}
