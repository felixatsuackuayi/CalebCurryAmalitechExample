import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadJavaFileUsingArrayList {

    public static void main(String[] args) throws FileNotFoundException {

        //Scanner Constructor Overloads in Java
        /* Scanner input = new Scanner("text.txt\n\n more\nYes");*/



        Scanner input = new Scanner(new File("student"));

        //When we create an array List it means all the requirement must be considered as a List
        //We will be adding People to this list
        List<String> students = new ArrayList<String>();
        while (input.hasNextLine()) {
              students.add(input.nextLine());//adding to List
            //If a file has another Line. I want to output to console

        }

        //We will pull the items in the List out using the For Loop
        for (int i=0; i <students.size(); i++){
            System.out.println("name : " + students.get(i));
        }

    }
}