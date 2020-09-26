import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class StackReadingFile {

    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<String>();

        /*try {
            Scanner input = new Scanner(new File("test"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
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
