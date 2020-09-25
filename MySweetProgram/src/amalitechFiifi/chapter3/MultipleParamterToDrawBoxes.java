package com.amalitechFiifi.chapter3;

public class MultipleParamterToDrawBoxes {

    public static void main(String[] args) {
        line(13);
        line(7);
        line(35);
        System.out.println();
        box(10, 3);
        box(5, 4);
        box(20, 7);

        boxes(10,5);
        boxes(6,8);
        boxes(40,3);
    }
    // Prints the given number of stars plus a line break.
    public static void line(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void box(int number, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(number);
        }
        System.out.println();


    }

    // Prints a box of stars of the given size.
    public static void boxes(int width, int height) {
        line(width);
        for (int line = 1; line <= height - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= width - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        line(width);
    }

}
