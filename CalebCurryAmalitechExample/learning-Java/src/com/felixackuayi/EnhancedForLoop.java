package com.felixackuayi;

public class EnhancedForLoop {

    public static void main(String[] args){

        int [] numbers = {10,20,30,40,50,60,70,80,90};
        String names [] = {"Felix", " Atsu", " Ackuayi "};
        for(int i = 0; i<numbers.length; i++){

            System.out.print(numbers[i] + " , ");

            /*System.out.print(numbers[i+1] + " , " );*///Checking for the next neighbour
        }

        //This state that for numbers, take the individual numbers One By One and put it in a variable called number.
        //The difference is that with the above we have access to the index itself ,which is i=0)
        //Meaning to check for the next neighbour of an array we can't used the Enhanced Loop
        System.out.println("\n\n Enhanced For Loop");
        for(int number : numbers){

            System.out.print( number + " , " );


        }



        for (String name: names)
        {


            System.out.print(name);
        }
    }
}
