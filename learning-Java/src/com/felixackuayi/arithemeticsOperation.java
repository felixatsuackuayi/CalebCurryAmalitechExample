package com.felixackuayi;

public class arithemeticsOperation {

    public static void main(String args[]){

        int ten = 10;
        int two = 2;
        int three = 3;

        int addition = ten + two;
        int multiplication = ten * two;
        int subtraction = 10 - 2;
        int modulus = 10 % three;
        int BODMAS = (ten * two  - three);

        int BODMAS1 = ((ten * two)  - three);//Body Order Division Multiplication Addition Subtraction -BODMAS
        int BODMAS2 = (ten * (two - three));
        int BODMAS3 = (ten * (two - three) + ten); // 10 x (-1) + 10 = -10 + 10


        System.out.println("\n\n" + addition + " , " +  multiplication + " , " + subtraction + " , "+modulus+ " , " + BODMAS
                                + " , " + BODMAS1 + " , " + BODMAS2 + " , " + BODMAS3);

    }
}
