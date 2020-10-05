package com.felixackuayi;

import java.sql.SQLOutput;

public class ComparisonOperators {

    public static void main(String args[]){
        //Compaison operators helps us to perform operations on two numbers

        int felixAge = 10;
        int ericAge = 5;

        boolean isFelixAgeOlderThanEricAge = ericAge < felixAge || ericAge >felixAge;
        System.out.println(isFelixAgeOlderThanEricAge);

        boolean isEricAgeOlderThanFelixAge = ericAge > felixAge || ericAge==felixAge;
        System.out.println(isEricAgeOlderThanFelixAge);

        System.out.println(felixAge>ericAge);
        System.out.println(felixAge<ericAge);

        System.out.println(felixAge == ericAge);
        System.out.println(felixAge != ericAge);
        System.out.println(felixAge>=ericAge);
        System.out.println(felixAge <= ericAge);
    }
}
