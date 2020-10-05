package com.felixackuayi;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class EnhancedForLoopBonusTipIDE {

    public static void main(String[] args){

        //Secret here is to get your Condition parameters you first type ex: numbers.for for it to give you the suggestion of conditional experession to choose
        int[] numbers = {2,4,5,6,7,8,9,10,11};
        String names[] = {"Akua","Kofi", "Ama", "Akos"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " , ");
        }

        for (int i = numbers.length - 1; i >= 0; i--) {


            System.out.print(numbers[i]+ "\n");
        }

        //Advance way to loop through arrays
        Arrays.stream(names).forEach(System.out::print);

        //Breaking out of loop

        for (String name : names) {

            if(name.equals("Akos")){
                System.out.print(" , "+ name);
                break;
            }
            System.out.println(name);

        }

        /*for (String name : names) {

            if (name.startsWith("\n A")){
                continue;
            }
            System.out.println(name);

        }*/
    }


}
