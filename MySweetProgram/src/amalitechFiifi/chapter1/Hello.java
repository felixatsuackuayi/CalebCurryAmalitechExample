package com.amalitechFiifi.chapter1;

public class Hello {
    public static void main(String[] args){

        System.out.println("Hello, world!");
        System.out.println();
        System.out.println("This program produces");
        System.out.println("fou of output");

        printStatement();
    }

    static void printStatement(){

        System.out.println("\ta \tb \tc");
        System.out.println("\\\\");
        System.out.println("'");
        System.out.println("\"\"\"");
        System.out.println("C: \nin\tthe downward spiral");
        System.out.println("\\hello\nhow\tare \"you\"?\\\\");
        System.out.println("/ \\ // \\\\ /// \\\\\\");
        System.out.println("This program prints a");
        System.out.println("quote from the Gettysburg Address.");
        System.out.println();
        System.out.println("\"Four score and seven years ago,");
        System.out.println("our 'fore fathers' brought forth on");
        System.out.println("this continent a new nation.\" ");

        System.out.println("A \"quoted\" String is");
        System.out.println("'much' better if you learn");
        System.out.println("the rules of \"escape sequence.\"");
        System.out.println();
        System.out.println("Also, \"\" represents an empty String.");
        System.out.println("Don't forget: use \\\" instead of \" !");
        System.out.println("'' is not the same as \"");

    }
}