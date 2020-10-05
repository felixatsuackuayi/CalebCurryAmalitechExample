package com.felixackuayi;

public class SwitchStatement {
    public static void main(String[] agrs){

        String gender = "Female";

        if (gender.equals("Female")){
            System.out.println("I am a female");
        }else if(gender.equals("Male")){
            System.out.println("I am Male");
        }else if (gender.equals("Prefer_not_to_Say")){

        }else
        {

        }

        //We can use SWITCH when we are to use if statement on a single variable/values
        switch (gender){

            case "Female":
                System.out.println("I am a Female");
                break;
            case "Male":
                System.out.println("I am a Male");
            break;

            case "Prefer_Not_To_Say":
                System.out.println("Prefer not to say");
                break;

            default:
                System.out.println("Unknown gender");

        }
    }
}
