package com.amalitechFiifi.chapter3;

public class ParameterLoopSaladExample {

    public static void main(String[] args) {
        chant(3);
        chant(7);
    }
    public static void chant(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Just a salad...");
        }
    }

}
