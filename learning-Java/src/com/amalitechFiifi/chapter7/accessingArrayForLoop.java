package com.amalitechFiifi.chapter7;

public class accessingArrayForLoop {
    public static void main(String[] args){
        int[] numbers = new int[8];
        numbers[1] = 3;
        numbers[4] = 99;
        numbers[6] = 2;
        int x = numbers[1];
        numbers[x] = 42;
        numbers[numbers[6]] = 11; // use numbers[6] as index

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers[i] + " , ");
        }

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        System.out.println( newLine);

        for (int i = 0; i < 8; i++) {
            numbers[i] = 2 * i;
            numbers[2] = 100;
            System.out.println( "" + numbers[i] + " ");


        }


        System.out.println( newLine);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }



    }
}
