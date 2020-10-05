import java.util.LinkedList;

public class LinkedListArray {

    public static void main(String[] args){

        //This method can be used as a Queue & also as a Stack
        // Stack means (First In - Last Out)
        //Queue mmeans (First In -First Out)
        LinkedList<String > names = new LinkedList<String>();
        names.add("Caleb");
        names.add("Azumah");
        names.add("Victoria");
        names.add("Sir.Fiifi");
        names.add("S.Baah");
        names.add("Atsu Felix");

        System.out.println(names.remove()); System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());

    }

}
