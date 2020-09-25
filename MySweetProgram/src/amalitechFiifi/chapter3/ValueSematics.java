package com.amalitechFiifi.chapter3;

/* When primitive variables (int, double)
are passed as parameters, their values are copied.
– Modifying the parameter will not affect the variable passed in.
*/
public class ValueSematics {

    public static void main(String[] args){

       /*strange(13);*/

        int x = 23;
        strange(x);
        System.out.println("2. x = " + x);
    }

    public static void strange(int x) {
        x = x + 1;
        System.out.println("1. x = " + x);
    }

}
