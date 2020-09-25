package com.amalitechFiifi.chapter1;

public class StaticMethod {

    public static void main(String [] args){

        rap();
        System.out.println();
        rap();

        System.out.println();
        makeBatter();
        bake();//1st Batch
        bake();//2nd Batch
        decorate();

        System.out.println();

        message1();
        message2();
        System.out.println("Done with message2");
    }

    static void rap(){
        System.out.println("Now this is the story all about how");
        System.out.println("My Life got flipped turned upside-down");
    }


    static void makeBatter(){

        //Step 1: Make the cake batter
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar");
        System.out.println("Beat in the eggs");
        System.out.println("Stir in the dry ingredients. ");
    }

    //Step 2: Bake a batch of cookies
    public static void bake(){
        System.out.println("Set the oven temperature. ");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
    }

    //Step 3: Decorate the cookies

    public static void decorate(){
        System.out.println("Mix ingredients for frosting");
        System.out.println("Spread frosting and sprinkles");
    }


    static void message1(){
        System.out.println("This is message1");
    }

    static void message2(){
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2");
    }
}
