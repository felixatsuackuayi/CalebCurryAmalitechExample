package com.amalitechFiifi.chapter7;

public class accessingArray {
    public static void main(String[] args){

        //defining array limit
        int[] numbers = new int[8];
        numbers[1] = 3; //at index 1: we pass Number 3 to it
        numbers[4] = 99; //at index 4 we pass 99 b=number to it
        numbers[6] = 2; // at index 6 we pass 2 to it
        int x = numbers[1]; //Here we keeping the number (3) which we kelpt in index 1 from the top (begining of the array into variable X
        numbers[x] = 42; // Now that X contain 3, we pass it into array. Now, 42 is been passed to index 3
        numbers[numbers[6]] = 11; // Here 2 is passed as an index. And 11 is passed as value for index 2.

        System.out.println(numbers[x]);
        System.out.println(numbers[numbers[6]]);
        System.out.println(numbers[6]);
        System.out.println(x);
        System.out.println(numbers[4]);
        System.out.println(numbers[3]);

        for (int number : numbers) {

            System.out.print( number + " , " );

        }



    }
}
