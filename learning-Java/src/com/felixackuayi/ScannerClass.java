package com.felixackuayi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerClass {

    //Scanner helps to take user input

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name;

        int age;

        System.out.println("Enterer You Name ");

        name = input.nextLine();

        System.out.println(" My Name Is : "+ name);


        System.out.println(" What is your new Age ");

        age = input.nextInt();

       int year  =  LocalDate.now().minusYears(age).getYear();
        System.out.println("You are born in :" + year);

        if(age < 18){
            System.out.println(" And you are not an Adult ");
        }
        else{
            System.out.println("You are an adult ");
        }
    }
}
