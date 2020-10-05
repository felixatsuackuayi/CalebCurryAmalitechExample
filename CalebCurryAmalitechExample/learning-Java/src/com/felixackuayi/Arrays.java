package com.felixackuayi;

import java.sql.Array;

public class Arrays {

    public static void main(String[] args){

        //Arrays

        //These two are independent of each other. Arrays allows us to hold more than one values in a variable
        //they have different address in memory
        int zero = 0;
        int one = 1;

        int[] number = new int[3];//this is specying size of the array.Specifying the number of items you can keep
        System.out.println(java.util.Arrays.toString(number));

        number[0] = 0;
        number[1] = 1;
        number[2] = 2;

        System.out.println(java.util.Arrays.toString(number));

        int numbers[]  = {2,5,6,7,7};
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(numbers.length);

        String names[] = {"Kofi", "Mensah", "Atsu"};
        System.out.println(java.util.Arrays.toString(names));
        System.out.println(names.length);

        int num1[] = {10,20,30,40,50};
        int oneHundred = num1[4];
        int three = num1[3];

        System.out.println(oneHundred);
        System.out.println(three);

        System.out.println(num1.length-1);

        int four = num1[num1.length-1];
        System.out.println(four);

        int five = num1[num1.length-2];
        System.out.println(five);

        int six = num1[num1.length-3];
        System.out.println(six);
    }
}
