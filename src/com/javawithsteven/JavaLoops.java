package com.javawithsteven;

public class JavaLoops {
    public static void main(String[] args){
        System.out.println("Java Loops :");

        //While Loops - the code will keep executing until the condition is true
        int i = 0;
        while(i<51){
            System.out.println(i);
            i += 1;
        }

        //Do While Loop - Will always execute once even when the condition is false
        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        }while(j>2);

       // For Loop - check condition and run loop
        for(int k = 0;k<=10;k++){
            System.out.println(k);
        }

        //Break statement in for loop
        for(int l = 0;l<=10;l++){
        if(l>2){
            break;
        }
        else {
            System.out.println(l);
        }
        }

        //Continue statement in for loop
        for(int m =0;m<=10;m++){
            if(m == 2){
                continue;
            }
            else {
                System.out.println(m);
            }
        }
    }
}
