package com.amalitechFiifi.chapter3;

public class StringsAsParameters {

    public static void main(String[] args) {
        sayHello("Marty");
        String teacher = "Bictolia";
        sayHello(teacher);

        sayPassword(3030303);
    }
    public static void sayHello(String name) {
        System.out.println("Welcome, " + name);
    }


    static  void sayPassword(int code){

        System.out.println("The Password is " + code);
    }
}
