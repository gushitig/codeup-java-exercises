package Strings;

public class StringsLecture {
    public static void main(String[] args) {
        String bigString = "The quick brown fox jumped over the lazy dog.";
        //explain string immutability
        String myName = "bob";
        //immutable means it cannot be changed
        myName = "Robert";
        //so even tho the value of this string has changed to robert, bob is still stored in memory to be used later, bc strings are used all the time, so they dont want to make duplicates to preserve memory
        //a con of this is it can be wasteful of memory to esp if doing string building, so string cat in loops is potentially bad
        //solved this by making a string builder class

        //explain string conversion via concat
        //show simple way to convert int to string
        int age = 42;
        //String formattedAge = age; //cant do this bc java is strict in type
        String formattedAge = Integer.toString(age);
        String formattedAge2 = "" + age; //nice shortcut!

        //== compares objects, as in are these two objects pointing to the same thing
        //have to use the .equals() to make sure the values of what youre pointing to are the same


        System.out.println(myName.equals("Robert")); //putting the string variable first could cause it to crash bc the value could be null
        System.out.println("Robert".equals(myName)); //do this instead bc the string literal will never be null
        //startsWith
        //call methods on a string literal. weird
        System.out.println(myName.startsWith("Rob"));
        System.out.println(myName.startsWith("rob"));
        System.out.println("DocRob".startsWith("D"));

        //ends with
        System.out.println("DocRob".endsWith("Rob"));

        //charAt
        System.out.println("DocRob".charAt(2));

        //indexOf
        System.out.println("DocRob".indexOf("R")); //returns 3 (bc it starts counting at 0)
        System.out.println("DocRob".indexOf("ro")); //returns -1 (bc its case sensitive)
        //-1 means its not there
        System.out.println("The quick brown fox jumped over the lazy dog.".indexOf(" "));
        System.out.println("The quick brown fox jumped over the lazy dog.".indexOf(" ", 3 + 1));
        //now put it in a loop to find all of the spaces
        int index = -1;
        do {
            index = bigString.indexOf(" ", index + 1);
            if(index > -1) {
                System.out.println("Found a space at index: " + index);
            }

        } while (index > -1);

        //lastIndexOf
        System.out.println(bigString.lastIndexOf(" ", 39));
        //can go backwards from whatever index you give it

        //length
        System.out.println(bigString.length());

        //replace
        //String converted = bigString.replace(' ', '|'); //same thing just use single quotes for chars
        String converted = bigString.replaceAll(" ", "|");
        System.out.println(converted);

        //substring
        System.out.println(bigString.substring(2, 21));

        //toUpperCase and toLowerCase
        System.out.println(bigString.toUpperCase());

        //trim
        System.out.println(" \n     the quick    ".trim() + "XXXX" );

        // \n new line
        // \t tab
        // \\ \



    }
}
