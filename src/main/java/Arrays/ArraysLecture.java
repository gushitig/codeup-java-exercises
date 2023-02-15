package Arrays;

import util.Input;

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {
        // describe what arrays are (simple diagram on board
        //int [] ages; //just declared, not initialized so not ready to use
        //in java arrays are FIXED sized things
        //when you initialized you have to give it a size and stick to it
        //not flexible creatures
        //System.out.println(ages); //wont even let us do anything w it bc its not initialized yet

        int[] ages = new int[10];
        //everything in a java array can only have the same type, so this one is ints only
        ages[0] = 42;
        ages[5] = 75;

        Input input = new Input();
        System.out.println("How many elements? ");
        int arrayLength = input.getInt();
        ages = new int[arrayLength];
        ages = new int[12]; //if we make a new array w more size but wipes out the 42 and 75, very uncommon bc arrays are so unflexible. used for things like days of the week, otherwise youd use an array list
        ages[11] = 25; //array out of bounds

        //System.out.println(Arrays.toString(ages)); //plugged in 0s for each bc we havent given them values
        // declare an array of ints
        // fixed length MUST KNOW AT THE TIME THE ARRAY DECLARATION EXECUTES

        // initial values of array elements
        // show how to print an array Arrays.toString()

        // accessing elements via bracket notation and indexes

        // array initializers if you know some/all values when writing the code (e.g., days of the week)
        String [] daysOfWeek = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
        System.out.println(Arrays.toString(daysOfWeek));
        // LOOPS and ARRAYS
        // fori
        /*for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
            daysOfWeek[i] = "blah";
        }
        System.out.println(Arrays.toString(daysOfWeek));*/


        // foreach
        for (String day: daysOfWeek) { //read it "for each day in daysOfWeek"
            System.out.println(day);
            day = "blah"; //wont actually change the values, need to use a fori in order to target each element
        }
        Arrays.fill(daysOfWeek, "blah"); //good for integers if you need -1s for some reason or somehting other than 0s
        System.out.println(Arrays.toString(daysOfWeek));

        // useful array static methods via the Arrays utility class

        // fill

        // equals
        String [] otherArray = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
        Arrays.fill(otherArray, "blah");
        System.out.println(daysOfWeek == otherArray); //false
        System.out.println(Arrays.equals(daysOfWeek, otherArray)); //true

        // copyOf
        String [] newArray = Arrays.copyOf(daysOfWeek, 10);
        System.out.println(Arrays.toString(newArray));

//        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
//        System.out.println(Arrays.toString(daysOfWeek));

        // sort
        String [] daysOfWeek2Sort = {"10", "4", "11", "Wed", "thurs", "Fri", "Sat"};
        Arrays.sort(daysOfWeek2Sort);
        System.out.println(Arrays.toString(daysOfWeek2Sort));
        //sorts charcter by character so 10 will come before 4
        //capitals come before lowercase





        // show an array of Person objects
/*        Fighter [] arena = new Fighter[5];
        System.out.println(Arrays.toString(arena));

        arena[0] = new Fighter("Knull");
        System.out.println(arena[0]);
        System.out.println(Arrays.toString(arena));

        */

        //go to class and go code>generate>toString and select which properties youd like it to display


    }
}