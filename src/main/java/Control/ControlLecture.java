package Control;

import java.util.Scanner;

public class ControlLecture {
    public static void main(String[] args) {

        int age = -1;
        String name = null;
        if(name == null) { //no === in java bc theres no loose types, everything is strict only
            System.out.println("Invalid name");
        } else {
            System.out.println("Name is ok");
        }

        Scanner input = new Scanner("bobbobbobx");

        String myName = "bob";
        String otherName = input.next();

//        System.out.println(myName == otherName);
//
//        otherName = myName;
//        System.out.println(myName == otherName);
        //do NOT do this bc the way java handles string literals
        //whats being compared is the memory addesses, not the actual strings themselves

        //CORRECT WAY TO DO THIS
        System.out.println(myName.equals(otherName));
        //equals method checks the content of the string, which is what we are normally looking for

        //IF STATEMENTS
        if(myName.equals(otherName)) { //automatically assumes true, so same as myName.equals(otherName) == true
            System.out.println("clones!!!");
        }

        if(!myName.equals(otherName)) { //! means false
            // read this mentally as while myName does not equal otherName
            System.out.println("not clones!!!");
        }

        if (otherName.length() > 10) {
            System.out.println("long name");
        } else if (otherName.length() < 2) {
            System.out.println("wow");
        } else {
            System.out.println("somewhat normal name");
        }

        //SWITCH STATEMENT
        switch(otherName.length()) {
            case 10, 11 :
                System.out.println("long name");
                break;
            case 2 :
                System.out.println("wow");
                break;
            default:
                System.out.println("somewhat normal name");
        }
        //the following is a enhanced switch
        switch (otherName.length()) {
            case 10, 11 -> System.out.println("long name");
            case 2 -> System.out.println("wow");
            default -> System.out.println("somewhat normal name");
        }

       /* String msg = "";
        switch (otherName.length()) {
            case 10, 11 -> msg = "long name";
            case 2 -> {
                msg = "wow";
                msg = "wow";
                msg = "wow";
            }
            default -> msg = "somewhat normal name";
        }*/

        //even more simplified
        String msg = switch (otherName.length()) {
            case 10, 11 -> "long name";
            case 2 -> "wow";
            default -> "somewhat normal name";
        };

        System.out.println(msg);

        input.close();




        input = new Scanner(System.in);

        //LOOPS
        //while loops tests first before it executes
        //do while always executes at least one time

        String choice = "";
        boolean done = false;
        //ask user for a choice until they choose "quit"
        do {
            //prompt user to make a choice
            System.out.println("Make a choice: ");

            //get the choice via scanner
            choice = input.nextLine();

            System.out.println("You entered " + choice);

            //determine if we are done
            if (choice.equals("quit")) {
                done = true;
            }

        } while(!done);

        //OR USE A BREAK
       /* do {
            //prompt user to make a choice
            System.out.println("Make a choice: ");

            //get the choice via scanner
            choice = input.nextLine();

            System.out.println("You entered " + choice);

            //determine if we are done
            if (choice.equals("quit")) {
                done = true;
                break;
            }

        } while(true);*/

        //FOR i LOOP
        for (int i = 0; i < choice.length(); i++) {
            System.out.println(choice.charAt(i));
        }


        input.close();
    }
}

//Logical Operators
// true && false will look at first and if its true then it will evaluate the second
//BUT if false && true it wont even look at the second bc && just cannot be true so it "short circuits" and comes back false
//single & will force them to both be checked
//similarly || is only false if both are false so if an or sees true in the first it will "short circuit" and return true
//single | will force them to both be checked
