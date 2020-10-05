package com.amalitechFiifi.chapter3;

import java.util.Scanner;

public class ScanMeClass {
    public static void main(String[] args)
    {

        Scanner console = new Scanner(System.in);
        Scanner consoles = new Scanner(System.in);
        double height;
        double weight;
        double bmi;

        //PPT Example
        System.out.print("How old are you? "); // prompt
        int age = console.nextInt();
        System.out.println("You typed " + age);




        System.out.print("How old are you? ");
        int ages = consoles.nextInt();
        int years = 65 - ages;
        System.out.println(years + " years to retirement!");

        System.out.println("*****************************************************************");

       /* Scanner console = new Scanner(System.in);*/
        System.out.print("Please type two numbers: ");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int product = num1 * num2;
        System.out.println("The product is " + product);


        /*Scanner console = new Scanner(System.in)*/;
        System.out.print("What is your name? ");
        String name = console.next();
        name = name.toUpperCase();
        System.out.println(name + " has " + name.length() +
                " letters and starts with " + name.substring(0, 1));



       /* Scanner console = new Scanner(System.in);*/
        System.out.print("Type your name, playa: ");
        String names = console.nextLine();
// split name into first/last name and initials
        String first = names.substring(0, names.indexOf(" "));
        String last = names.substring(name.indexOf(" ") + 1);
        last = last.toUpperCase();
        String fInitial = first.substring(0, 1);
        System.out.println("Your gangsta name is \"" + fInitial +
                ". Diddy " + last + " " + first + "-izzle\"");
        /*****************************************************/

        System.out.println("This program reads data for two preople and");
        System.out.println("computes their body mass index (BMI)");

        System.out.println("Enter the next person's information: ");
        System.out.print("Enter Height in Inches: ");
        height = console.nextDouble();
        System.out.print("Enter Weight in Pounds: ");
        weight = console.nextDouble();

        bmi=(weight/(height*height))*703;

        System.out.println("BMI = " + bmi);


        if(bmi<18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi<25)
        {
            System.out.println("normal");
        }
        else if(bmi<30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }


		/*System.out.print("What percentage did you earn? ");
		int percent = console.nextInt();
		if (percent >= 90) {
		    System.out.println("You got an A!");
		}
		if (percent >= 80 && percent<90) {
		    System.out.println("You got a B!");
		}
		if (percent >= 70 && percent<80) {
		    System.out.println("You got a C!");
		}
		if (percent >= 60 && percent<70) {
		    System.out.println("You got a D!");
		}
		if (percent < 60) {
		    System.out.println("You got an F!");
		}
		else
	    {
	    	System.out.println("Somewhat Crazy!");
	    }
*/
		/*The if statement

		int age;
		Scanner input = new Scanner(System.in);

		//Prompt user for age
		System.out.println("Please enter your age");
		age = input.nextInt();

		if(age<18)
		{
			System.out.println("You're not Qualified");
		}
		else
		{
			System.out.println("Congratulations You're Most Qualified for this event.");
		}*/


    }
}