package com.amalitechFiifi.chapter1;

import java.util.Scanner;

public class TaxRate_RapMethod_Others {

    public static void main(String[] args)
    {

        //Variables for Sales Tax
        final double TAX_RATE = 0.055;
        double price;
        double tax;
        double total;
        String item;

        //Create Scanner object to receive input
        Scanner input = new Scanner(System.in);

        //Display prompts and get input
        System.out.println("Description of the Item: ");
        item = input.nextLine();
        System.out.println("Item Price: ¢");
        price = input.nextDouble();

        //Perform Calculations
        tax =  price * TAX_RATE;
        total = price + tax;


        //Display the results
        System.out.print(item + "    ¢");
        System.out.println(price);
        System.out.print("Tax        ¢");
        System.out.println(tax);
        System.out.print("Total      ¢");
        System.out.println(total);



        //alt gr 155 = ¢


		/*//create a Scanner object to read from the keyboard.
		Scanner keyboard = new Scanner(System.in);

		//Variables
		double hours; //The Number of hours worked
		double rate; //Hourly pay rate
		double pay; //Gross pay

		//Display prompts and receive input
		System.out.println("How many hours did you work?");
		hours = keyboard.nextDouble();
		System.out.println("How much are you paid per hour");
		rate = keyboard.nextDouble();

		//Perform Calculation

		if(hours<=40)
		{
			pay = hours * rate;
		}
		else
		{
			pay = (hours - 40) * (1.5) + rate * rate;
		}

		//Display the results to the user
		System.out.println("You've earned ¢" + pay);




		/*rap(); //Calling the rap method
		System.out.println();
		rap();

		System.out.println();
		System.out.println("The line below is from the sing method");
		sing();

		System.out.println(38 + 40 + .08);


//		total();

		/*}

	//other methods

	public static void rap()
	{
		System.out.println("Now this is the story all about ");
		System.out.println("My life got flipped turned upside-down ");

	}

	public static void sing()
	{
		System.out.println("I will sing of your Glory ");
		System.out.println("I will sing of Your beauty ");

	}

	public static void total()
	{
		int a, b, c, f;
		a=38;
		b=40;
		c=30;
		f = 2;
		int d=a+b+c+f;

		System.out.println("Subtotal:");
		//System.out.println(38+40+30 + 2);
		System.out.println(a+b+c+f);
		System.out.println(d);
		System.out.println("Tax:");
		System.out.println((38+40+30 + 2)* .08);
		System.out.println(d*.08);
		*/









    }
}
