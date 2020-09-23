import java.util.Scanner;

public class MySweetProgram
{
    public static void main(String [] args){

        System.out.println(" Hello Felix");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = new String("Atsu");

        int x;
        x = 5;


        System.out.println(x);

        System.out.println("*************************************************");

        if (s.equals("Atsu")){

            System.out.println("You are Felix");
        }else if (s.equals("Kofi")){
            System.out.println("You are ");
        }
        else
        {
            System.out.println("You are not welcome not welcomed");
        }
        System.out.println("******************************************");
        int i = 5;
        while (i < 10){
            System.out.println("i is: " + i );
            i++;
        }

        for (i = 0; i<=10; i++){
            System.out.println("i is = " + i);
        }

        System.out.println("************************************************");

        int a = 0;
        do {
            System.out.println("i is equal to " + i);
            i++;
        }
        while(i < 10);

        input.close();

    }
}

