package com.amalitechFiifi.chapter7;

public class ArrayTranverse {

    public static void main(String[] args){

                  //0,1,2,3,4,5,6
        int[] a = {1, 7, 5, 6, 4, 14, 11};
        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        System.out.println( newLine);

        for (int i = 0; i < a.length - 1; i++)
        {

            System.out.print(a[i] + " , ");
        }

        System.out.println( newLine);

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }


        System.out.println( newLine);






        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) { // a[0] > a[0+1] => a[0] > a[1] then perform what is in bracket; so 1 > 7 (false): ignore

                a[i + 1] = a[i + 1] * 2; // a[1]  = a[1] * 2 => a[1] = 7x2 = 14;

                System.out.println(a[i] + " ");
            }
        }

    }
}
