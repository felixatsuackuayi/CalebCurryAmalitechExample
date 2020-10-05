package com.felixackuayi;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        //Methods are Block of codes which only runs when it is called
        //We passed data into a method called parameters

        //InbBuilt Methods
       /* System.out.println("Hello");*/

        String brand = "Samsung";
       /* System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("g"))*/;

        //Custom Method

        char[] letters = { 'A', 'A', 'B', 'B', 'C', 'D', 'D'};

        int count = countOccurrences(letters,'A');

        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter){

        int count = 0;

        for (char letter : letters){

            if (letter == searchLetter){
                count++;
            }
        }
        /*System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);*/
        /*return 0;*/
        return count;
    }
}
