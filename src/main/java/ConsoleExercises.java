import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        // 1.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f\n", pi);

        //Explore the Scanner Class
        Scanner input = new Scanner(System.in);

        // 1.
        System.out.println("Enter your favorite number: ");
        int number = input.nextInt();
        System.out.println("Your number is: " + number);
        //if its not an int it breaks the program

        // 2.
        input.nextLine();
        System.out.print("Enter your 3 favorite words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        System.out.println(" " + number);
        System.out.printf("Your words are: %s %s %s \n", word1, word2, word3);
        //less than 3 it waits for one more
        //more than 3 it just prints the first 3 and keeps the others in the buffer

        // 3.
        input.nextLine();
        System.out.print("Enter a sentence: ");
        //4
        String sentence = input.nextLine();
        System.out.printf("Your Sentence is: %s \n", sentence);
        //no because next only does the first token, so must use nextLine

        //Calculate the perimeter and area of Codeup's classrooms
        // 1.
        System.out.print("Enter the width of the room (in feet): ");
        String width = input.nextLine();
        System.out.print("Enter the width of the room(in feet): ");
        String length = input.nextLine();
        System.out.print("Enter the height of the room(in feet): ");
        String height = input.nextLine();
        // 2.
        double volume = Double.parseDouble(height) * Double.parseDouble(width) * Double.parseDouble(length);
        double area = Double.parseDouble(width) * Double.parseDouble(length);
        double perimeter = (Double.parseDouble(width) * 2) + (2 * Double.parseDouble(length));

        System.out.printf("The volume is : %.2f cubed ft, the area is: %.2f sq ft, and the perimeter is: %.2f feet", volume, area, perimeter);

        //BONUS
        //added volume, but dont know what useDelimiter does










        input.close();





    }
}
