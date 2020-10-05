package com.amalitechFiifi.chapter2;

public class ArithmeticOperators {

    public static void main(String[] args){

        division();
        modulus();
    }

    static void division(){

        int fourteen = 14;
        int four = 4;

        int thirtyTwo = 32, five=5;
        int eightyFour = 84, ten=10;
        int oneFiftySix = 156, hundred =100;


        System.out.println(fourteen / four);
        System.out.println( thirtyTwo / five);
        System.out.println( eightyFour / ten);
        System.out.println(oneFiftySix / hundred);

    }

    static void modulus(){
        System.out.println("*******************************************************************");
        int fourteen = 14, four=4;
        int twoHundredAndEighteen = 218, five =5;
        int TwoHundredThirtyEightyFiveSeven = 230857, ten = 10;
        int SixBillionFiveEightMillionTwoHundredAndThirtySixThousandFourHundredAndEightyNine = 658236489,
                TenThousand =10000;
        int seven = 7, two=2;
        int FortyTwo=42, Two =2;

        System.out.println(fourteen % four);
        System.out.println(twoHundredAndEighteen % five);
        System.out.println(TwoHundredThirtyEightyFiveSeven % ten);
        System.out.println(SixBillionFiveEightMillionTwoHundredAndThirtySixThousandFourHundredAndEightyNine  % TenThousand);
        System.out.println( seven % 2);
        System.out.println(FortyTwo % Two);

    }


}
