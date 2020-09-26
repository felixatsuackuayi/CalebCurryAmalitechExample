package amalitechFiifi;

import java.util.LinkedList;

public class stackArrayList {

    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<String>();

        names.push("Uncle Fiifi");
        names.push("Uncle Sharaf");
        names.push("uncle Thomas");

        //note that they , pop(),remove,removeFirst all does the same thing.
        /*System.out.println(names.pop());
        System.out.println(names.remove());
        System.out.println(names.removeFirst());*/
        System.out.println(names.pop());
        System.out.println(names.remove());
        System.out.println(names.removeFirst());
    }
}
