package ConsoleInputOutput;

import java.util.Scanner;


//import java.util.function.DoubleFunction;

public class ConsoleInputOutputLecture {
    public static void main(String[] args) {
        int a = 5;
        String b = "hello";
        String myName = "Bob";
        double c = 12.57;

        System.out.println("Howdy " + myName + " age: " + a + " makes " + c + " bucks per hour.");

        //souf doesnt automatically do a new line
        //can add one w a \n or %n
        System.out.printf("Howdy %s age: %+05d makes %.2f bucks per hour.%n", myName, a, c);
        //%s is a placeholder where a string variable will go then a comma and variable name
        //%d is a number variable placeholder
        //order in which the placeholders occur is the order in which the variables need to be provided after the comma

        System.out.printf("%d %s %.7f\n", a, b, c);
        // %.xf pad out the integer up to x spaces

        System.out.printf("%d %s %7.2f\n", a, b, c);
        //%7.2 is seven is total number of characters used to display this number with 2 decimal digits and the rest will be spaces of padding in the front

        //more java printf formatting options available

        //can take out the System.in and put in a string w multiple inputs seperated by spaces and its like hard coding input form the keyboard
        //Scanner input = new Scanner("4 5");
        Scanner input = new Scanner(System.in);
        //data type: scanner
        //input is only associated w a scanner
        // = means initialize
        //new
        //class: Scanner
        //(System.in) scanner needs to know where it will be getting its input - this one System.in is the keyboard, other options include a file



        System.out.print("Enter your name: ");
        //String aName = input.next();
        //next is a blocking function that just sits there and waits
        ///java is by default synchronous and waits to go line by line
        //next will wait until theres something entered from keyboard but not until enter is hit, but wont accept enter or white space only


//        aName = input.next();
//        System.out.println("Your OTHER name is  " + aName);
        //next alone only pulls out one word or "token" at a time
        //printed them as seperate tokens
        //solution is to:
//        String aName = input.nextLine();
//        System.out.println("Your name is  " + aName);
        //this includes everything up to the enter
        //this nextLine emptys the whole keyboard buffer

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);

        //when you go from nextInt or nextDouble to NextLine it saves an enter in the keyboard buffer so you need to get the new line char out of the buffer
        //this is stupid says docrob
        input.nextLine();

        String aName = input.nextLine();
        System.out.println("Your name is  " + aName);



        input.close();
        //must always clean up after yourself by using the close method bc it may be using resources, read documentation to see when and how youre supposed to close a new function to avoid a memory leak




        //!!!!!!! dont use doubles for money bc of the issue storing decimals creates error
    }
}

/*
printf
    show %s %d %f %n or \n, %t
    show %5.1f for rounding ON OUTPUT
    show """
scanner
    show import
    explain new
    explain difference between Class and object
    show next()
        explain token
        show multi-world input using next()
    call next() one too many times
    show hasNext()
    show nextLine()
    show nextInt()
        and then call next() after nextInt()
        how to fix? call nextLine() when done with nextInt
 */