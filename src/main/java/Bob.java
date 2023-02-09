import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String response = "";
        String choice = "";
        boolean done = false;

        do {
            System.out.print("What's up? ");
            response = input.next();
            if (response.length() == 0) {
                System.out.println("Fine. Be that way!");
            } else if (response.endsWith("!"))  {
                System.out.println("Whoa, chill out!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else {
                System.out.println("Whatever.");
            }
            //get the choice
            System.out.println("Wanna keep chatting? [y/n]: ");
            choice = input.next();
            //determine if we are done
            if (choice.equals("n")) {
                done = true;
            }

        } while(!done);

    }
}
