package com.felixackuayi;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //This needs double quotes and don't forget the semi colon
        System.out.println("My First JAVA App");


        //Primitive data Types
        //1.Mean I am going to have a box type int and give it name number.And keep integer number 100
        int number = 100;
        String brand = "Amigoscode";
        Date date = new Date();

        String code = new String("code");

        Integer num = Integer.valueOf(40);

        System.out.println(date + "\n \n" + brand + "\n \n" + number + " \n\n"+ num);
        System.out.println();
        System.out.println(brand.contains(code));

        byte theByte = -128;
        short theShort = 8989;
        int theInt = 787838554;
        //The underscore allows you to visualize figures clearly

        int theInts = 22_222_2222;
        long theLong = 11111111111L;

        float pi = 3.14F;
        double doublePi = 3.1415; //For storing 15 decimal digits

        boolean isAdult = true;

        char a = 'a';

        System.out.println(theByte + " , "  + theShort + " , " + theInt + " , " + theLong + " , " + pi + " , " + doublePi + " , " + isAdult + " , " + a + " , " + theInts);


       /*NoN- Primitives */

        String name = new String("Amingoscode");

        LocalDate now =  LocalDate.now();
        System.out.println("\n\n"+ name.charAt(0) + " , "  + name.toUpperCase() + " , " + now + " , " + now.getMonth() + " , " + now.getDayOfWeek());
        System.out.println("\n\n" + now.getDayOfMonth() + " , " +  now.getDayOfYear());

        //Difference between Primitive nd Non Primitve

        int nums = 10;
        int  numBer = nums; //This means the value passed into nums is passed by copy into numBer

        nums = 100; //Which also means that if we change the value of nums ,it does not make any impact on the value of numBer.Meaning numBer remain untouched.
                    //Also numBe remains untouched because it lives in a different memory address
        System.out.println(" nums = " + nums + " , numBer = " + numBer);


        /*In reference types it is a bit different in how object re stored in memory so
        * we have an actual Object Person("Nathaniel") saved in a an example memory allocation addr:200
        * the we have father which is in reference to the Object Person("Nathaniel") is in  memory location addr: 201
        * created another reference type called mother in memory location addr: 2012 .Said mother is equals to father
        * instead of pointing direcctly to father it will point diectly to Object Person.
        * */

        Person father = new Person("Nathaniel");

        Person mother = father;

        System.out.println("Before Changing Alex ");
        System.out.println(father.name + " " + mother.name);


         father.name = "Theodora";
         mother.name="Mariam";

        System.out.println("After Changing Alex ");
        System.out.println(father.name + " " + mother.name);
    }

    static class Person{

        String name;

        Person(String name){

            this.name = name;
        }
    }
}
