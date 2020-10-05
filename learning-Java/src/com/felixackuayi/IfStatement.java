package com.felixackuayi;

public class IfStatement {

    public static void main(String args[]){

        int age = 18;

        if(age >= 18){

            System.out.println("Hurrayyyyyy....you are an adult \n");
        }
        System.out.println("I am not an adult");


        System.out.println("***********************************************************************");

        if (age >=18){
            System.out.println("Huraaayy ...You are an adult");
        }
        else
        {
            System.out.println("Unfortunately you are not an adult");
        }

        System.out.println("***********************************************************************");

        int ages = 17;

        if (ages >=18){
            System.out.println("Huraaaaaayyyy.....I am an adult");
        }
        else if(ages >= 16 & ages <18){
            System.out.println(" I am almost an Adult");
        }



        int agess = 15;

        if (agess >=18){
            System.out.println("Huraaaaaayyyy.....I am an adult");
        }
        else if(agess >= 16 & agess <18){
            System.out.println(" I am almost an Adult");
        }else{
            System.out.println("I am not an Adult");
        }




    }
}
