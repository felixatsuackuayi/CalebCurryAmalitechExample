package com.amalitechFiifi.chapter3;

public class MultipleParameters {
    public static void main(String[] args) {
        printNumber(4, 9);
        printNumber(17, 6);
        printNumber(8, 0);
        printNumber(0, 8);
    }

    /*• Call:
     methodName (value, value, ..., value);*/

    public static void printNumber(int number, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(number);
        }
        System.out.println();
    }

}
