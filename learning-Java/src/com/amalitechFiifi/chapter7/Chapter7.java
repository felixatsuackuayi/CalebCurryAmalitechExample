package com.amalitechFiifi.chapter7;

public class Chapter7 {

    public static void main(String[] args){

        int[] numbers = new int[8];
        numbers[1] = 3;
        numbers[4] = 99;
        numbers[6] = 2;
        int x = numbers[1];
        numbers[x] = 42;
        numbers[numbers[6]] = 11; // use numbers[6] as index

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // output: 0 4 11 0 44 0 0 2

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers[i] = 2 * i);
        }


        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }// output: 0 2 4 6 8 10 12 14

        int[] a = {1, 7, 5, 6, 4, 14,11};

        for (int i =0; i < a.length -1; i++){
            if(a[i] > a[i+1]){
                a[i + 1] = a[i + 1 ] * 2;
            }
        }
    }
}
