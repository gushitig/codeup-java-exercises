import java.util.Scanner;

public class MethodsExercises {

    //add
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    //subtract
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    //multiply
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //divide
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    //modulus
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
    //multiLoop
    public static int multiLoop(int num1, int num2) {
        int num3 = num1;
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 < 0) {
            for (int i = 0; i < (-num2 - 1); i++) {
                num3 = num3 + num1;
            }
            return -num3;
        } else {
            for (int i = 0; i < (num2 - 1); i++) {
                num3 = num3 + num1;
            }
            return num3;
        }
    }
    //recursiveMultiplication
    public static int recursiveMultiplication(int num1, int num2) {
            if(num2 == 0) {
                return 0;
            } else if(num2 > 0) {
                return (num1 + recursiveMultiplication(num1, num2-1));
            } else {
                return -recursiveMultiplication(num1, -num2);
            }
    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);

        System.out.printf("getInteger: Enter a number between %d and %d: ", min, max);
        int userInput = input.nextInt();

        if (userInput >= min && userInput <= max) {
            //System.out.print(userInput);
            return userInput;
        } else {
            return getInteger(min, max);
        }

    }

    public static long factorial(Scanner input) {
        System.out.println("Factorial: Enter a number between 1 and 15: ");
        int userInput = input.nextInt();
        long fact = userInput;

        if (userInput >= 1 && userInput <= 15) {
            for (int i = userInput; i > 0; i--) {
                fact = fact * userInput;
            }
            System.out.println(fact);
            return fact;
        } else {
            return factorial(input);
        }

    }


    public static int roll(int num) {
        // define the range
        int max = num;
        int min = 1;
        int range = max - min + 1;
        // generate random numbers within 1 to num
        int rand = 0;
        rand = (int) (Math.random() * range) + min;
        return rand;
    }


    public static int rollTwoDice(Scanner input) {
        //Scanner inputDice = new Scanner(System.in);
        System.out.println("Enter the number of sides your dice have: ");
        int sides = input.nextInt();
        System.out.println("Ready to roll? [y/n]: ");
        String choice = input.next();
        if (choice.equals("y")) {
            return sides;
        } else {
            return rollTwoDice(input);
        }

    }




    public static void main(String[] args) {

        // 1. a, b, c
        System.out.println(add(2, 6));
        System.out.println(subtract(6, 2));
        System.out.println(multiply(6, 2));
        System.out.println(divide(6, 2));
        // d.
        System.out.println(modulus(6, 2));
        System.out.println(modulus(9, 2));
        System.out.println(divide(6, 0));
        //bonus a.
        System.out.println(multiLoop(3, 2));
        System.out.println(multiLoop(3, 0));
        System.out.println(multiLoop(3, -3));
        //bonus b.
        System.out.println(recursiveMultiplication(3, 2));
        System.out.println(recursiveMultiplication(3, 0));
        System.out.println(recursiveMultiplication(3, -3));

        // 2.
        getInteger(1, 10);

        // 3.
        Scanner input = new Scanner(System.in);
        long n = factorial(input);


        String choice = "";
        boolean done = false;
        //ask user for a choice until they choose "quit"
        do {
            System.out.printf("The factorial is: " + n + ". Would you like to try another number? [y/n]: ");
            choice = input.next();
            //determine if we are done
            if (choice.equals("n")) {
                done = true;
            } else {
                factorial(input);
            }

        } while(!done);




        // 4.
        //Scanner inputDie = new Scanner(System.in);
        int sides = rollTwoDice(input);

        int d1 = roll(sides);
        int d2 = roll(sides);

        String choice2 = "";
        boolean done2 = false;
        //ask user for a choice until they choose "quit"
        do {
            System.out.printf("Dice one reads: %d. \nDice two reads: %d.\n Would you like to roll again? [y/n]: ", d1, d2);
            choice2 = input.next();
            //determine if we are done
            if (choice2.equals("n")) {
                done2 = true;
            } else {
                rollTwoDice(input);
            }

        } while(!done2);

        input.close();








    }


}
