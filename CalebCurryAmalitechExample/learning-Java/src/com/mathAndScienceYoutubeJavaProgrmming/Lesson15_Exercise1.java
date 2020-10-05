package com.mathAndScienceYoutubeJavaProgrmming;

public class Lesson15_Exercise1 {

    /*Write a programme that uses the IF statements to output thee following text
    * If Felix is older than Eric, then output " Felix is older than Eric
    * If Eric is older than Azumah, then output "Samuel is Older than Azumah"
    * If Eric is the same age as Azumah, then output "Samuel is the same age as Azumah"
    * If Eric is the same age as Fui, then output "Samuel is the same age as Fui"
    *     * */

    public static void main(String[] args){
        int felix, eric, fui;

        felix = 14;
        eric = 6;
        fui = 6;

        if (felix > eric) System.out.println("Felix is older than Eric");
        if (eric > felix) System.out.println(" Eric is Older than Felix");
        if (eric == felix) System.out.println("Eric is the same age as Felix");
        if (eric == fui) System.out.println("Eric is the same age as Fui");


    }
}
