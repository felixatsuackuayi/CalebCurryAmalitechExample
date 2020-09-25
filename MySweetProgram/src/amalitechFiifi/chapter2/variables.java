package com.amalitechFiifi.chapter2;

public class variables {

    public static void main(String[] args){
       int numbers = 38 + 40 + 30;

        // Calculate total owed, assuming 8% tax / 15% tip
        //this logic has lots of redundancy
        /*System.out.println("Subtotal:");
        System.out.println(38 + 40 + 30);
        System.out.println("Tax:");
        System.out.println((38 + 40 + 30) * .08);
        System.out.println("Tip:");
        System.out.println((38 + 40 + 30) * .15);
        System.out.println("Total:");
        System.out.println(38 + 40 + 30 +
                (38 + 40 + 30) * .08 +
                (38 + 40 + 30) * .15);*/

        System.out.println("Subtotal:");
        System.out.println(numbers);
        System.out.println("Tax:");
        System.out.println((numbers) * .08);
        System.out.println("Tip:");
        System.out.println((numbers) * .15);
        System.out.println("Total:");
        System.out.println(numbers +
                (numbers) * .08 +
                (numbers) * .15);
    }


}
