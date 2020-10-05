package com.amalitechFiifi.EndofSeptemberQuiz;

import java.util.Arrays;

public class ZeroOutQuizSeptember2020 {

    public static void main(String[] args){


        int[] a1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int[] a2 = {2, 3, 4};

        zeroOut(a1,a2);

    }


    public static void zeroOut(int[] a1, int[] a2) {

        //Looping through the difference in length between the arrays.

        for (int i = 0; i <= a1.length - a2.length; i++) {

            int count = 0; //initializing a counter

            //Looping through the 1st & 2nd array and compare their corresponding values.
            for (int j = 0; j < a2.length; j++) {

                //If there is a match we increment the counter but if there is no match nothing happens

                if (a1[i + j] == a2[j]) {

                    count++;

                }

            }

            //After comparing the corresponding values if the value of the counter is same as the length of the second array,then we replace all values that we matched with zero.
            if (count == a2.length) { // found it

                for (int j = 0; j < a2.length; j++) {

                    a1[i + j] = 0;

                }

            }

        }
        System.out.print(Arrays.toString(a1));
    }

}
