package com.amalitechFiifi.chapter3;

public class ParametersAndLoops {

    public static void main(String[] args) {
        chant(3);
        primeNumber(4,9);
        primeNumber(17,6);
        primeNumber(8,0);
        primeNumber(0,8);
    }
    public static void chant(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Just a salad...");
        }
    }

    public static void  primeNumber(int number, int count){
        for (int i = 1; i <= count; i++) {
            System.out.println(number);

        }
    }

}
