package com.amalitechFiifi.chapter7;

public class arrayDeclaration {

    public static void  main(String[] args){

        int x = 2 *3 +1;

        /*System.out.println(x);*/

        int [] data = new int[x % 5 + 2];

          data[0] = 4;
          data[1] = 8;
          data[2] = 10;

        System.out.println(data[2]);


    }
}
