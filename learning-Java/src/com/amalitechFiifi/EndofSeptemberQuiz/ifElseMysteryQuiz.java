package com.amalitechFiifi.EndofSeptemberQuiz;

public class ifElseMysteryQuiz {

    public static void main(String[] args){

        ifElseMystery(12, 12);
        ifElseMystery(7, 4);
        ifElseMystery(5, 8);
        ifElseMystery(3, 42);

    }

    public static void ifElseMystery(int a, int b) {
        if (a % 2 != 0) {
            a = a * 2;
        }
        if (a > 10) {
            b++;
        } else if (a < 10) {
            a--;
            b--;
        }

        System.out.println(a + " " + b);
    }



}
