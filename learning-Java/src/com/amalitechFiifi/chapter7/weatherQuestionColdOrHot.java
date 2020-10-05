package com.amalitechFiifi.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class weatherQuestionColdOrHot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of temperatures to process
        System.out.print("How many days' temperatures? ");
        int numDays = input.nextInt();
        int[] temps = new int[numDays];
        int tempSum = 0;

        // Ask for each of the temperatures (store in an array for later)
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = input.nextInt();
            tempSum += temps[i];
        }

        // Calculate the average and the number of temperatures above average.
        double averageTemp = (double)tempSum / numDays;
        int numAboveAve = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > averageTemp) {
                numAboveAve++;
            }
        }

        // Report results
        System.out.printf("Average temp = %.1f\n", averageTemp);
        System.out.println(numAboveAve + " days were above average.");
        System.out.println();
        System.out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Hottest days: " + temps[temps.length - 2] + ", " + temps[temps.length - 1]);
    }
}
