import java.lang.reflect.Array;
import java.util.ArrayList;

public class Edureka {

    public static void main(String [] args){

        ArrayList myObj1 = new ArrayList();
        ArrayList myObj2 = new ArrayList();
        myObj1.add("E");
        myObj1.add("D");
        myObj2.add("E");
        myObj2.add(1,"D");
        System.out.println(myObj1.equals(myObj2));




    }
}
