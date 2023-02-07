package SyntaxTypesVariables;


public class SyntaxTypesVariables {
    public static void main (String[] args) {
        //main tab
        System.out.println("Hello World!");
        //sout tab
        {
            System.out.println("Code inside of curly braces should be indented");
            System.out.println("with four spaces");
        }


    //single line comment

    /* I take up one line */

    /**
     * I take up
     * multiple
     * lines
     */

    //data types dont matter as much now but try to use the smallest type that applies

        byte myByte = 127;
        myByte += 1;
        System.out.println(myByte);



     //strings
     //double quotes for things more than one character long
     //single quotes for just one character strings
     String mystring = "This is \n a string";
        System.out.println(mystring);

        //"\"" // => "
        //"\\" // => \
        //"\n" // => the newline character
        //"\t" // => the tab character



     //variables
        //since java is a strictly type language we must first declare the type of variable
        //variables are initialized when the variable is assigned, not when declared
        //can be done in two steps
        int theAnswer;
        String question;

        theAnswer = 42;
        question = "What is your favorite color?";

        //or in one
        int theAnswer2 = 42;
        String question2 = "What is your favorite color?";

//You should use camelCase for variable and method names, and PascalCase for class names.

        //constants denoted by keyword final
        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";


        //arithmetic/Assignment Operators
       /*        +	Addition
                -	Subtraction
                *	Multiplication
                /	Division
                %	Modulus*/

        //Unary Operator	Meaning
        //++	increment (pre and post)
        //--	decrement (pre and post)
        //+	Positive sign
        //-	Negative sign


        //casting -coercing a value of one type into another. There are two types of casting, implicit casting and explicit casting.

        //Implicit casting usually involves assigning a value of a less precise data type to a variable whose types is of a higher precision, or going from a more specific to a less specific type
        int myInteger = 900;
        long morePrecise = myInteger;


        //explicit casting involves going from a less specific type to a more specific type, or going from a higher precision type to a lower precision type
        double pi = 3.14159;
        int almostPi = (int) pi;


    }
}
