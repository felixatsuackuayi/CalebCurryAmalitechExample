package com.felixackuayi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class packageImportClasses {

    public static void main(String args[]){
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        String s = new String(); ///Anything that comes from java.lang doesn't have import statement

        ;
    }
}
