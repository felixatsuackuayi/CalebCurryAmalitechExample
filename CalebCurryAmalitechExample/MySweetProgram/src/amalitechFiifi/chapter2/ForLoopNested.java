package com.amalitechFiifi.chapter2;

public class ForLoopNested {

    public static void main(String[] args){

        /*The outer loop repeats 5 times; the inner one 10 times.
          – "sets and reps" exercise analogy*/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println(); // to end the line
        }


        System.out.println("***************************************************");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("***************************************************");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}

