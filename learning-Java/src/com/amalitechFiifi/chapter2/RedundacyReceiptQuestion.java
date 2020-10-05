package com.amalitechFiifi.chapter2;

public class RedundacyReceiptQuestion {

    public static void main(String[] args){

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

        // Calculate total owed, assuming 8% tax / 15% tip
        int subtotal = 38 + 40 + 30;
        double tax = subtotal * .08;
        double tip = subtotal * .15;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);

    }
}
