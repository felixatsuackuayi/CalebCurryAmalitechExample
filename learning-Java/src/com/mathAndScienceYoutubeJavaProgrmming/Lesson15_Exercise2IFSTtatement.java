package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson15_Exercise2IFSTtatement {

    /*
    * Exercise 2
    *
    * Car 1 has mileage 86000. Car 2 has mileage 101000
    * Write a program that uses IF statements to evaluate and output the following
    *
    * If Car 1 mileage is less than or equal to car 2, then output, "Car 1 mileage is Less than or equal to than Car 2"
    * If Car 2 has mileage of 101,000, then output "Car 2 has mileage of 10100."
    * If Car 2 hs mileage less than car 1, then output "I will eat my foot if this prints on the screen."
    *
    * */
    public static void  main(String[] args){

        int car1, car2;

        car1 = 86_000;
        car2 = 101_000;

        if ( car1 <= car2) System.out.println("Car 1 mileage is Less than or equal to than Car 2");
        if (car2 == 101000) System.out.println("Car 2 has mileage of " + car2);
        if (car2 < car1) System.out.println("I will eat my foot if this prints on the screen.");

    }
}
