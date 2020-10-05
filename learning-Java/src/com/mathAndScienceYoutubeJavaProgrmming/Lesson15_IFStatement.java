package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson15_IFStatement {

    /*
    * Relational Operators for Conditional Expressions
    * < Less Than
    * <=Less Than or Equal To
    * > Greater Than
    * >= Greater Than or Equal To
    * ==Equal
    * != Not Equal
    *
    * If(condition is true) run a Statement;
    * */

    public static void main(String[] args){

         int x,y;

         x = 3;
         y = 4;
         double a,b,c;

         if(x < y){

             System.out.println(" I am going to Church");
         }

         if (x==y){

             System.out.println(" x is equal to y");
         }

         a = 3.45;
         b = 4.25;
         c = 3.45;

         if(a == c)
             System.out.println("a is equal to c");

         if (b >= a)
             System.out.println("b is greater than or equal to a");

         if(a != b)
             System.out.println(" a is not equal to b");

         if (a != c)

             System.out.println("a is not equal to c");


    }
}
