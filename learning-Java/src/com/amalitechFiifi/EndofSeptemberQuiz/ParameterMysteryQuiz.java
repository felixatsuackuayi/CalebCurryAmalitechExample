package com.amalitechFiifi.EndofSeptemberQuiz;

public class ParameterMysteryQuiz {

    public static void main(String[] args) {
        String x = "java";
        String y = "tyler";
        String z = "tv";
        String rugby = "hamburger";
        String java = "donnie";

        hamburger(x, y, z);
        hamburger(z, x, y);
        hamburger("rugby", z, java);
        hamburger(y, rugby, "x");
        hamburger(y, y, "java");
    }

    public static void hamburger(String y, String z, String x) {
        System.out.println(z + " and " + x + " like " + y);
    }

}
