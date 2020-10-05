import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadJavaFile {

    public static void  main(String[] args) throws FileNotFoundException {

        //Scanner Constructor Overloads in Java
       /* Scanner input = new Scanner("text.txt\n\nmore\nYes");*/

        Scanner input = new Scanner(new File("student") );

        while (input.hasNextLine()){

            //If a file has another Line. I want to output to console
            System.out.println(input.nextLine());
        }

    }
}
