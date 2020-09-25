package com.amalitechFiifi.chapter2;

public class SystemOutPrint {

    public static void  main(String[] args){

        int highestTemp = 5;
        for (int i = -3; i <= highestTemp / 2; i++) {
            System.out.print((i * 1.8 + 32) + " ");
        }

    }
}
