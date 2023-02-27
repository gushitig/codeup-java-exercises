import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String response = "";

        System.out.println("Enter something: ");

        response = input.nextLine();

        System.out.println("You entered: " + response);

        //3a.
        if (StringUtils.isNumeric(response)) {
            System.out.println(response + " is a number.");
        } else {
            System.out.println(response + " is not a number.");
        }



        //3b.

        System.out.println("Flipped case: " + StringUtils.swapCase(response));


        //3c.

        System.out.println("Reversed: " + StringUtils.reverse(response));













        input.close();

    }
}
