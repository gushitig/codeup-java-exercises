import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1.a
        int j = 5;
        while (j <= 15) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("");

        // 1.b
        long t = 2;
        do {
            System.out.println(t);
            t = t * t;
        } while (t < 1000000);

        // 1.c
        for(int i = 5; i <= 15; i += 1) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for(long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }

        // 2.
        for(int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 3.
        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int num = input.nextInt();
        String n = "Number";
        String sq = "Squared";
        String cu = "Cubed";

        //System.out.format("%10 number %n");
        System.out.format("%-8s | %-8s | %-8s%n", n, sq, cu);
        System.out.format("-------- | -------- | -------- %n");

        for(int i = 1; i <= num; i += 1) {

            System.out.format("%-8d | %-8d | %-8d %n", i, i * i, i * i * i);
        }

        // 4.

        String choice = "";
        int grade = -1;
        boolean done = false;
        //ask user for a choice until they choose "quit"
        do {
            //prompt user to enter a grade
            System.out.println("Enter a numerical grade: ");
            grade = input.nextInt();
            System.out.println("You entered " + grade);
            //display the letter grade
            if (grade >= 88 ) {
                System.out.println("That's an: A");
            } else if (grade >= 80)  {
                System.out.println("That's an: B");
            } else if (grade >= 67) {
                System.out.println("That's an: C");
            } else if (grade >= 60) {
                System.out.println("That's an: D");
            } else {
                System.out.println("That's an: F");
                }
            //get the choice
            System.out.println("Would you like to enter another grade? [Type yes or no]: ");
            choice = input.next();
            //determine if we are done
            if (choice.equals("no")) {
                done = true;
            }

        } while(!done);


        input.close();






    }


}
