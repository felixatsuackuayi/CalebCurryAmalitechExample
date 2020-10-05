package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson14_Exercise1CovertDegreeToFarenheit {

    /*
    * Exercise 1
    * Write a program to convert 14.0 degrees celcius to Ferenheit,
    * then print the result on the screen
    *
    * The equation for the conversion is:
    * farenheight = ( 9 /5) * celcius + 32
    * */

    public static void main(String[] args){

        double celcius, farenheit;

        celcius = 34.0;

        farenheit = (9.0/5.0) * celcius + 32; //Note that celcius and Farenheit are double floating position number so when you change to (9/5) the final value you get will be wrong
        System.out.println(celcius + " Celcius is equal to " + farenheit + " Farenheit.");

    }
}
