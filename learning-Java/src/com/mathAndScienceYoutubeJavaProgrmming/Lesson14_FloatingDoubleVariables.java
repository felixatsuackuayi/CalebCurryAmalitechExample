package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson14_FloatingDoubleVariables {

    //double is a 64 bits and can hold numbers with decimal points. This takes lots of computer memory. So in anycase where you don't really need values after the decimal point
    //it's appropriate to use Float
    // Note: that 32.257999999999996, whenever we see repeating decimal as your answer
    // it should be appropriate to get a uniquely accurate ansser like 32.26. There are Java libraries that helps to
    //get such accurate numbers. This long decimal number is because of the way java calculate on it floating numbers
    //You run into such long issue when the two numbers under consideration are both decimal numbers
    public static void  main(String[] args){

        double inches, centimeters, inche, centimeter;

        int number1;
        double number2;
        double number3;

        inches = 12.7;

        inche = 12;

        centimeters = inches * 2.54;

        centimeter = inche * 2.54;

        System.out.println(inches + " inches is equal to " +
         centimeters + " centimeters");

        System.out.println(inche + " inches is equal to " +
                centimeter + " centimeters");

        number1 = 12/5;
        number2 = 12.0/5.0;
        number3 = 12/5;


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);



    }
}
