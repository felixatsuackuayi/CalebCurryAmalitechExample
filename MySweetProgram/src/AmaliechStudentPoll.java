import java.util.Scanner;

public class AmaliechStudentPoll {

    public static void main(String[] args){

        Scanner food   = new Scanner(System.in);

        System.out.println("Do you want an online training or physical training. (ONLINE / PHYSICAL)");

        String answer = food.nextLine();

        if (answer.equals("ONLINE")){

            System.out.println("You will save money for advanced accommodation");
        }
        else if (answer.equals("PHYSICAL")){
            System.out.println("Have you considered the financial constraint now");
        } else
        {
            System.out.println("You have no qualms to complain about the outcome");
        }


    }
}
