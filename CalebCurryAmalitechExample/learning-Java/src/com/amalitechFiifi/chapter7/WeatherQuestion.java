package com.amalitechFiifi.chapter7;

import java.util.Scanner;

public class WeatherQuestion {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();  //User asked to input number of days Temperature reading.

        int[] temperatures = new int[days]; // After providing Number of days, we use it to set array limit to store days' temperatures.
        int sum = 0; //initialising a variable and name it sum.


        for (int i = 0; i < days; i++) { // read/store each day's temperature
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = console.nextInt();
            sum += temperatures[i];
        }

        double average = (double) sum / days;
        int count = 0; // see if each day is above average
        for (int i = 0; i < days; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
// report results
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");
    }
}
