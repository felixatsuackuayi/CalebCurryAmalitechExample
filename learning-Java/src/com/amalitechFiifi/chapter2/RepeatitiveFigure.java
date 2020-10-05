package com.amalitechFiifi.chapter2;

public class RepeatitiveFigure {

    public static void main(String[] args) {
        drawLine();
        drawBody();
        drawLine();
    }
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 10; i++) {
            System.out.print("/\\");
        }
        System.out.println("+");
    }
    public static void drawBody() {
        for (int line = 1; line <= 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 20; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

}
