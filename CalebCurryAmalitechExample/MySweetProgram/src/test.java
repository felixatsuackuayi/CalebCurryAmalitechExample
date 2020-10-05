import java.util.Scanner;
/*Felix Atsu Ackuayi*/
public class test {

    //Collection: Is it used to collect items. Example is an Array

    public static void main(String [] args){

        Scanner input  = new Scanner(System.in);

        System.out.println("Please give your size ");
        int size = input.nextInt();


        int[] grade = new int[size];


        System.out.println("Enter " + size + " number. Press enter after each");
        for (int i =0; i < size; i++){
            grade[i] = input.nextInt();

        }
        input.close();

        for (int i = 0; i < size; i++) {
            System.out.print(grade[i]);
        }

        input.close();



    }


}
