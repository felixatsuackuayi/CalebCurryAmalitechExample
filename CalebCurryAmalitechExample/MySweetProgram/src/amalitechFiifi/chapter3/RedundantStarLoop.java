package com.amalitechFiifi.chapter3;

public class RedundantStarLoop {

    public static void main(String[] args) {
        lineOf13();
        lineOf7();
        lineOf35();
        /*box10x3();
        box5x4();*/
    }

    public static void lineOf13() {
        for (int i = 1; i <= 13; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf7()
    {
        for (int i = 1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf35() {
        for (int i = 1; i <= 35; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
