package amalitechFiifi;

import java.util.Scanner;

public class pointSTVClassExample {
    public static void main(String[] args){
          
        int sum = 0;
        
        //This scanner class is to receive an input from a class
        Scanner tempCondition = new Scanner(System.in);

        System.out.println("Declare your sample days space of Temperature reading");
        
        //This like will collect User input and keep in variable container named tempCondition and pass nextInt()to it
        /*tempCondition.nextInt();*/
        
        //Now, the User inout is kept in tempCondition. To make it more easier,we will keep it in another variable
        
        int days = tempCondition.nextInt();
        
        //we will keep the values in an array 
        
        int [] arr  = new int[days];

        /*for (int i = 0; i < arr.length; i++) {*/

        for (int i = 0; i < days; i++) {

            System.out.println("Day " + i +1 + "s temp");

            arr[i] = tempCondition.nextInt();

            sum +=arr[i];
        }
        double average = sum/days;
        System.out.println("Average temp is equal to " + average);

        int count = 0;

        for (int i = 0; i < days; i++) {
                     if (arr[i] > average){
                         count++;
                     }
        }

        
        
        
    }
}
