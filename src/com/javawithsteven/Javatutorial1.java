package com.javawithsteven;

public class Javatutorial1 {
    public static void main (String[] args) {
        System.out.println("Steven Massey");

        String Name1 = "Steven";
        String domain = "javawithSteven";
        System.out.println(Name1);
        System.out.println(domain.length());
        System.out.println(domain.toLowerCase());
        System.out.println(domain.toUpperCase());

        //Escape sequence characters
        System.out.println(Name1 + " \"FROM\" " + domain );
        System.out.println(Name1 + " \"FROM\\ " + domain );
        System.out.println(Name1 + " FROM\t" + domain );
        System.out.println(Name1 + " FROM\n" + domain );

        //System.out.println(Name1.contains("eve"));
        System.out.println(Name1.charAt(2));
        //System.out.println(Name1.endsWith("ve"));
        System.out.println(Name1.indexOf("sha"));
        System.out.println(Name1.indexOf("tev"));

        char[] nameChars = {'S', 't', 'e', 'v', 'e', 'n'};
        String Name2 = String.copyValueOf(nameChars);
        System.out.println(Name2);

        String Name3 = "  joy  ";
        System.out.println(Name3.trim());
        System.out.println(Name3);
    }
}
