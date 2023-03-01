
package util;

import java.util.Scanner;

public class InputWErrorHandling {
    private Scanner scannerInput;
    //class example bc its cleaner to initializing when declared
    //private Scanner scannerInput = new Scanner(System.in);


    public InputWErrorHandling() {
        scannerInput = new Scanner(System.in);
    }

    public String getString() {
        return scannerInput.nextLine();
    }

    //bonus optional prompt
    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        System.out.print("[y/n]?: ");
        String choice = scannerInput.nextLine(); //calss example = getString(); called encapsulation but it makes things clean and simple
        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else if (choice.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    //bonus optional prompt
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();

    }



    public int getInt() {
        //int userNum = scannerInput.nextInt()
        int userNum = 0;

        try {
            String s = getString("Enter an integer: ");
            userNum = Integer.valueOf(s);

        } catch (NumberFormatException e) {
            System.out.println("Not a valid integer. Please try again.");
            userNum = getInt();
        }
        return userNum;
    }



    public int getInt(int min, int max) {

        int userNum = scannerInput.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInt(min, max);
        }
    }

    public int getInt(int min, int max, String prompt) {

        System.out.println(prompt);

        int userNum = scannerInput.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInt(min, max);
        }
    }

    //class example (utilizes previous methods)
    public int getIntClass(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int anInt = getInt();
        if(anInt < min || anInt > max) {
            System.out.printf("That was not a number between %d and %d: ", min, max);
        }
        return anInt;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %f and %f: ", min, max);
        double userNum = scannerInput.nextDouble();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("Number not within range.");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        double userNum = 0;

        try {
            String s = getString("Enter a decimal: ");
            userNum = Double.valueOf(s);

        } catch (NumberFormatException e) {
            System.out.println("Not a valid decimal. Please try again.");
            userNum = getDouble();
        }
        return userNum;



    }



    public int getBinary() {
        int userNum = 0;

        try {
            String s = getString("Enter a binary number: ");
            userNum = Integer.valueOf(s, 2);

        } catch (NumberFormatException e) {
            System.out.println("Not a valid binary number. Please try again.");
            userNum = getBinary();
        }
        return userNum;


    }

    public int getHex() {
        int userNum = 0;

        try {
            String s = getString("Enter a binary number: ");
            userNum = Integer.valueOf(s, 16);

        } catch (NumberFormatException e) {
            System.out.println("Not a valid hex number. Please try again.");
            userNum = getHex();
        }
        return userNum;


    }



}