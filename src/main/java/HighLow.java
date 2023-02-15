import java.sql.SQLOutput;
import java.util.Scanner;

public class HighLow {



    public static int random() {
        // define the range
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        // generate random numbers within 1 to 100
        int rand = 0;
        rand = (int) (Math.random() * range) + min;
        return rand;
    }

   /* public static int guessing() {


    }*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = random();

        System.out.println("Guess the number the computer has picked: ");
        int guess = input.nextInt();

 /*       do {
            if (guess < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("Guess again: ");
                int guess = input.nextInt();
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
                System.out.println("Guess again: ");
                int guess = input.nextInt();
            }
            while(guess != randomNumber);

            System.out.println("GOOD GUESS!!!");*/



           /* do {
                System.out.printf("Dice one reads: %d. \nDice two reads: %d.\n Would you like to roll again? [y/n]: ", d1, d2);
                choice2 = input.next();
                //determine if we are done
                if (choice2.equals("n")) {
                    done2 = true;
                } else {
                    rollTwoDice(input);
                }

            } while(!done2);*/






        //class example
        int myNumber = (int)Math.floor(Math.random() * 100) + 1; //casting it into an int
        int userInput;
        int guesses = 0;


        do {
            System.out.println("Choose a number between 1 and 100:");
            userInput = MethodsExercises.getInteger(1, 100);

            compareGuess(userInput, myNumber);
            guesses++;
            if (guesses > 5){
                break;
            }

        }while(userInput != myNumber);
        System.out.println("Game over!");
        System.out.println("You made " + guesses + " guesses.");






        input.close();
    }

    public static void compareGuess(int userInput, int answer) {
        if (userInput > answer) {
            System.out.println("Lower");
        } else if (userInput < answer) {
            System.out.println("Higher");
        } else {
            System.out.println("Good Guess");
        }

    }


    //end class example
}
