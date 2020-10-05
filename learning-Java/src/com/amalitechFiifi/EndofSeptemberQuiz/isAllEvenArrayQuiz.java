package com.amalitechFiifi.EndofSeptemberQuiz;

public class isAllEvenArrayQuiz {

    public static void main(String [] args){

        int[] list = {2, 4, 6, 8, 10, 208, 16, 7, 92, 14};
        System.out.println(isAllEven(list));
    }


    /*Passing a parameter array int[] to the method isAllEven*/
    public static boolean isAllEven(int[] list) {


        /*Iterating through the array per indexes and finding modulus of each element. If we happen to find any of the array
        elements not even the method is required to return False   */

        for (int september = 0; september < list.length; september++) {
            if (list[september] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
