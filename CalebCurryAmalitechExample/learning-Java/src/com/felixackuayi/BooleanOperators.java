package com.felixackuayi;

public class BooleanOperators {

    public static void main(String[] args){

        boolean isAdult = false;
        boolean isStudent = true;

        System.out.println(isAdult && isStudent);//&& means both expression  should be true for the output to be TRUE.So this will have FALSE output
        System.out.println(isAdult || isStudent);//Means OR and this will expect any of the expression to be TRUE for the OUTPUT to be TRUE.

         boolean isAtsuAMember = true;

        System.out.println((! isAdult || isStudent) && isAtsuAMember);

        String name = "Felix";
        System.out.println(
                (10> 8 || 2 <=2) && isAdult && name.contains("F"));
    }
}
