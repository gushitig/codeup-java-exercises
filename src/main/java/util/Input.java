package util;

import java.util.Scanner;

public class Input {
    private Scanner scannerInput;
    //class example bc its cleaner to initializing when declared
    //private Scanner scannerInput = new Scanner(System.in);


    public Input() {
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
        String choice = scannerInput.nextLine(); //calss exmaple = getString(); called encapsulation but it makes things clean and simple
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
        int userNum = scannerInput.nextInt();
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
        System.out.printf("Enter a decimal: ");
        double userNum = scannerInput.nextDouble();
        return userNum;
    }





    //accessors
/*    public String getScanner() {
        return scannerInput;
    }

    public void setScanner(String scanner) {
        this.scannerInput = scanner;
    }*/

}
