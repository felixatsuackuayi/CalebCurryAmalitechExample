package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson13_IntergerArithmetic {

    public static void  main(String[] args){
        int num1, num2, num3, num4;


        int sum, difference;
        int multiply, divide;



        num1 = 10;
        num2 = 3;
        num3 = 5;
        num4 = 2;

        sum = num1 + 5;
        difference = num3 - num2;


        System.out.println("num1 plus 5 = " + sum);
        System.out.println("num3 minus num2 = " + difference);

        multiply = num3 * num4;
        System.out.println();
        System.out.println();
        System.out.println("num3 times num4 = " + multiply);

        System.out.println();

        divide = num1/num4;
        System.out.println("num1 divided by num4 - " + divide + "\n\n");
        System.out.println("Original num1 = " + num1);

        num1 = num1 * 6;
        System.out.println(" new value of num1 is = " + num1);
    }
}
