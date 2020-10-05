package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson13_Exercise {
    /*
    * A backyard has deimsions along its border of 20, 18, 17, 24 feet
    * Write a program that stores these lengths in variables and calculates
    * the perimeter around the border of the yard. Display the output as:
    *
    * The perimeter of the yard is calculated  Answer > feet
    *
    * */
    public static void main(String [] main){

        int side1, side2,side3,side4;
        int perimeter;

        side1 = 20;
        side2 = 18;
        side3 = 17;
        side4 = 24;

        perimeter = side1 + side2 + side3 + side4;

        System.out.println("The perimeter of the yard is " + perimeter + " feet");

    }
}
