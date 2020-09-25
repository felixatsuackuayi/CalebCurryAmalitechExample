package com.amalitechFiifi.chapter2;

public class RepetitionOverARange {
    public static void main(String[] args){


        System.out.println("1 squared = " + 1 * 1);
        System.out.println("2 squared = " + 2 * 2);
        System.out.println("3 squared = " + 3 * 3);
        System.out.println("4 squared = " + 4 * 4);
        System.out.println("5 squared = " + 5 * 5);
        System.out.println("6 squared = " + 6 * 6);
        System.out.println("**********************************************");

        /* This condition means that
        * 1. First iteration = check if i is equals to 1,if True Perform task on line 1
        * 2. When done (i) will increase by one, so now 2, check if 2 is less than the condition i<=6,if true perform second condition
        * 3. It will keep checking till the condition is equals to the limit provided
        * */
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + " squared = " + (i * i));
        }

    }
}
