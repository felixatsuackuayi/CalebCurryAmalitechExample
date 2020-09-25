package com.amalitechFiifi.chapter3;

public class TypeCast {

    public static void main(String [] args){

        double result = (double) 19 / 5; // 3.8
        int result2 = (int) result; // 3
        int xx = (int) Math.pow(10, 3); // 1000


        System.out.println();
        double x = (double) 1 + 1 / 2; // 1
        double y = 1 + (double) 1 / 2; // 1.5

        //You can use parentheses to force evaluation order.
        int a=2,b=4,c=6;

       double average = (double) (a + b + c) / 3;
    }
}
