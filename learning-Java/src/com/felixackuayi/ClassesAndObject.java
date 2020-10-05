package com.felixackuayi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClassesAndObject {

    //A class is a blueprint to print Anything that One want
    public static void main(String args[]){

        //A class that will help us create a camera Lense

        Lense lenseOne = new Lense("Sony","30mm",true);
        System.out.println(lenseOne.brand + lenseOne.isPrimeLense + lenseOne.focalLength);


        Lense lenseTwo = new Lense("Canon","40mm",true);
        System.out.println(lenseTwo.brand + lenseTwo.isPrimeLense + lenseTwo.focalLength);

        Lense lenseThree = new Lense("Nokia","100mm",false);
        System.out.println(lenseThree.brand + lenseThree.isPrimeLense + lenseThree.focalLength);


        Passport GhanaPassport = new Passport("GHC1010101",LocalDate.of(2025,1,2),"Ghana");
        
        Passport usPassport = new Passport("US_86868686",LocalDate.of(2040,3,3),"USA");




    }

    static class Lense{
          String brand;
          String focalLength;
          boolean isPrimeLense;

          //Constructor
          Lense(String brands,String focalLengths, boolean isPrimeLenses){

              this.brand = brands;
              this.focalLength = focalLengths;
              this.isPrimeLense = isPrimeLenses;



          }

    }

    static class Passport{
        String number;
        LocalDate expiryDate;
        String country;

        Passport(String numbers, LocalDate expiryDates, String Countries){
            this.number = numbers;
            this.expiryDate = expiryDates;
            this.country = Countries;
        }
    }
}
