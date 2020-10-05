package com.amalitechFiifi.chapter2;

public class ForLoop {
    public static void  main(String[] args){

        System.out.println("Homer says:");
        for (int i = 1; i <= 4; i++) { // repeat 4 times
            System.out.println("I am so smart");
        }
        System.out.println("S-M-R-T... I mean S-M-A-R-T");

        int [] numbers = {2,4,6,8,10};

        for (int number : numbers) {
            System.out.println("**************************************");
            System.out.println(number);
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println("I am so smart");
        }


    }
}
