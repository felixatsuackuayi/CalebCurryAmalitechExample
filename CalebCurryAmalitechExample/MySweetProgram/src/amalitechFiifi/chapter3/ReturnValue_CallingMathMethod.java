package com.amalitechFiifi.chapter3;

/*The Math methods do not print to the console.
– Each method produces ("returns") a numeric result.
– The results are used as expressions (printed, stored, etc.).
*/

public class ReturnValue_CallingMathMethod {

    public static void main(String[] args){

        double squareRoot = Math.sqrt(121.0);
        System.out.println(squareRoot); // 11.0
        int absoluteValue = Math.abs(-50);
        System.out.println(absoluteValue); // 50
        System.out.println(Math.min(3, 7) + 2); // 5

        System.out.println();


        /*Math.abs(-1.23)*/
        double absoluteValues = Math.abs(-1.23);
        System.out.println(absoluteValues);

        /*Math.pow(3, 2)*/
        double powerValue =  Math.pow(3, 2);
        System.out.println(powerValue);

        /*Math.pow(10, -2)*/
        double powerValue1 =  Math.pow(10, -2);
        System.out.println(powerValue1);

        /*Math.sqrt(121.0) - Math.sqrt(256.0)*/

        double squareRoots = Math.sqrt(121.0);
        double Square = Math.sqrt(256.0);

        System.out.println(squareRoots - Square);

        /*Math.round(Math.PI) + Math.round(Math.E) */

        double roundValue = Math.round(Math.PI);
        double roundA = Math.round(Math.E);

        System.out.println(roundValue + roundA);

        /*Math.abs(Math.min(-3, -5))*/

        double min = Math.min(-3, -5);
        double abs = Math.abs(min);

        System.out.println(abs);


    }

}
