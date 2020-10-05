package com.amalitechFiifi.EndofSeptemberQuiz;

public class printMultipleSolution {

    public static void main(String[] args){

         printMultiples(3, 5);
         printMultiples(7,3);
    }


    public static void printMultiples(int n, int m)

    {
        System.out.print("The first " + m + " multiples of " + n + " are  " + n );

        for (int i = 2; i <= m; i++) {System.out.print(", " + i * n);

        }
        System.out.println();

    }
}
