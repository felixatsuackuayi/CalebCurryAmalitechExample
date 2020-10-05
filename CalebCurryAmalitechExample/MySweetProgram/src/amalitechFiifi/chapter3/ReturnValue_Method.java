package com.amalitechFiifi.chapter3;

public class ReturnValue_Method {

    public static void main(String [] args){


        System.out.println(slope(1, 3, 5, 11));

        System.out.println(fToC(20));

        double s = slope(0, 0, 6, 3);
        System.out.println("The slope is " + s);

    }

    public static double slope(int x1, int y1, int x2, int y2) {
        double dy = y2 - y1;
        double dx = x2 - x1;
        return dy / dx;
    }
 /*returns 2.0*/

    // Converts degrees Fahrenheit to Celsius.
    public static double fToC(double degreesF) {
        double degreesC = 5.0 / 9.0 * (degreesF - 32);
        return degreesC;
    }


    public static double slopes(int x1, int x2, int y1, int y2) {
        double dy = y2 - y1;
        double dx = x2 - x1;
        double result = dy / dx;
        return result;
    }

}
