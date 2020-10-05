package com.amalitechFiifi.chapter7;

public class accessingElement {

    public static void main(String[] args){

        int [] valuez = new int[4];

        valuez[0] = 5;
        valuez[1] =10;
        valuez[2] =20;
        valuez[3] = 30;

        int i = 0;

        while(i < valuez.length){

            System.out.print(valuez[i] + " ");
            i++;

        }

        System.out.println(/**************************************/);
        int[] numbers = new int[10];

        numbers[0] = 27;
        numbers[3] = -6;
        System.out.println(numbers[0]);
        if (numbers[3] < 0)
        {
            System.out.println("Element 3 is negative.");
        }

        System.out.println("*******************************************");
        for (int i1 = 0; i1 < numbers.length; i1++) {

           /* System.out.print(i1 + " ");
            System.out.println("*****************************************************");
            String newLine = System.getProperty("line.separator");
            System.getProperty("line.separator");*/
            System.out.print(numbers[i1] + " ");

        }
        System.out.println("*****************************");

        double[] results = new double[5];

        results[2] = 3.4;

        results[4] = -0.5;

        for (double result : results) {

            System.out.print(result + " ,");

        }


    }
}
