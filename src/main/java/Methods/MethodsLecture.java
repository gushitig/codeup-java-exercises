package Methods;

import java.util.Scanner;

//all function must be declared outside of other functions but inside the main class "public class MethodsLecture"
//everything else goes inside main, for now at our level its the meat of our exercises "public static void main(String[] args)"



public class MethodsLecture {
    //declare, define method
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    //overloading is using the same function but different

    //no argument constructor
    public static String sayHello() {
        return String.format("Hello there!");
    }

    // overload with an int to print hello a number of times
    // show reuse by calling the no arg version
    public static String sayHello(int numRepeats) {
        String str = "";
        for (int i = 0; i < numRepeats; i++) {
            str += String.format("Hello there!\n");
        }
        return str;
    }

/*    public static String sayHello(int numRepeats) {
        String str = "";
        for (int i = 0; i < numRepeats; i++) {
            str += sayHello() + "!!\n");
        }
        return str;
    }*/

    private static void changeMyName(String oldName, String newName) {
        oldName = newName;
        System.out.println("oldName is now " + oldName);
    }

    private static int getNumberFromOneTo10(Scanner input) {
        System.out.println("Enter number from 1 to 10: ");
        int aNumber = input.nextInt();
        if(aNumber < 1 || aNumber > 10) {
            return getNumberFromOneTo10(input);
        }
        //otherwise you did it right so return it
        return aNumber;
    }







    public static void main(String[] args) {

        // technical diff between method and function
        //public - method visibility
        //static - this function is called on a class Math is an example of a static class, applicable in general, designed to be a helper method
        //void - no return value
        //main - name of the function
        //()- arguments, must define argument type string, int, etc




        // create a sayHello method with a string param
        // point out the parts of method signature
        // remind students of difference in DEFINING and CALLING a method
        System.out.println(MethodsLecture.sayHello("bob"));

        //if you are calling the function inside its own class you dont need to use the class name bc it is defined here
        System.out.println(sayHello("bob"));
        System.out.println(sayHello());
        System.out.println(sayHello(5));
        //java knows which one to call based on how you call it
        //if you use a string parameter it will call that one, if you use no parameter, it calls that one, if you use an int it calls tht one

        // overload with a sayHello method with no parameters
        // introduce NO ARG term



        // talk about passing by value and how to change a parameter's value OUTSIDE of the function
        // demo string changeMe function
        // 2 ways to change outside variable:
        // 1. pass it contained in an object (WILL SHOW NEXT WEEK)
        // 2. or make it global (show the static shuffle) and advise to be careful
        String myName = "jimbob"; //myName = "jimbob"; if you make a variable static it can only have one variable for the entire class
        changeMyName(myName, "bob");
        System.out.println(myName);



    //be as restrictive as possible and then give more permissions as you go if necessary so go void

        // fun with recursion!
    //recursion is a function calling itself

        // briefly go over codeup's count example
        // BRIEFLY use my fun w recursion slides to talk in more depth
        // maybe show my fibonacci examples


    //codeup teaches it as if you ask a user to enter a value between 1 and 10 and they dont you can keep asking

        Scanner input = new Scanner(System.in);
        int n = getNumberFromOneTo10(input);
        input.close();


    }


}