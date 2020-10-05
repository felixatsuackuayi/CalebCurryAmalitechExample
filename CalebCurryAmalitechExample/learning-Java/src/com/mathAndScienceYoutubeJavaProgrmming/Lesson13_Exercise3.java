package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson13_Exercise3 {

    /*
    *   sailboat sail is triangular and has height of 14 ft. The length of the
    * base of the flag is 6ft. The formulae for the are of triangle os
    *
    * Area = base * height/2
    *
    * Write a program that calulates the area of this sail and display the result
    * */
    public static void main(String[] args){

        int height,base,area;

        height = 14;
        base =6;

        area = base * height/2;  //Note that assuming the value assigned to height as initialise was uneven it may have affected the final result becuase the variable type chosen is int

        System.out.println(" The area of the sail is " + area + "square feet");


    }
}
