package com.amalitechFiifi.chapter2;

public class LoopTablePrint {

    public static void  main(String[] args) {
        /*2 7 12 17 22*/
        /*17 13 9 5 1*/


        //To print a character multiple times, use a for loop.
        for (int j = 1; j <= 4; j++) {
            System.out.print("."); // 4 dots
        }


        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            System.out.println(line);
        }


        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= line; k++) {
                System.out.print(line);
            }
            System.out.println();
        }


        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            System.out.print(line);
            for (int j = 1; j <= (line - 1); j++) {
                System.out.print(".");
            }
            System.out.println();
        }


        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            System.out.print(line);
            for (int j = 1; j <= (line - 1); j++) {
                System.out.print(".");
            }
            System.out.println();
        }


        for (int i = 1; i <= 100; i++) {
            System.out.print("/");
        }


        for (int i = 1; i <= 100; i++) { // OK
            System.out.print("\\");
        }
        int i = 5;






    }




}
