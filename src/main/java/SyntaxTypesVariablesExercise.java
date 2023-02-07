public class SyntaxTypesVariablesExercise {
    public static void main(String[] args) {
        //1
        int myFavoriteNumber = 52;
        System.out.println(myFavoriteNumber);

        //2
        String myString = "Aint no sunshine when she's gone";
        System.out.println(myString);

        //3
        //myString = 'c';
        //cant bc a character is not a string

        //4
        //myString = 3.14159;
        //wont work bc its a double not a string


        //5
        double myNumber = 3.14;
        System.out.println(myNumber);
        //error "variable myNumber might not have been initialized"

        //6
        //error "incompatible types: possible lossy conversion from double to long"

        //7
        //all possible integer values will fit into a long, but theres no where to store a decimal

        //8
        //decimal and integer numbers are entirely different types. For the numeric types in Java, you can always assign a value of lesser precision to a type of greater precision, but not the other way around.

        //9
        //possible lossy conversion from double to float
        //its like trying to squeeze an 8 byte number into a 4 byte box
        //change float to double or float myNumber = 3.14f;

        //10
        /*int x = 5;
        System.out.println(x++);
        System.out.println(x);*/

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        //the first is post increment
        //the second is preincrement

        //11
        //String class = "bebbey";
        //error not a statement
        //bc its a reserved word

        //12
        /*String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;*/
        //because three is a string not the int 3
        //int three = (int) "three";
        //second one doesnt work bc you cant save an int as a string, first doesnt work but gives more of a time out error since youre trying to trick it thru an object

        //13
        int y = 4;
        //y = y + 5;
        y += 5;
        System.out.println(y);

        int d = 3;
        int g = 4;
        //g = g * d;
        g *= d;
        System.out.println(g);

        int t = 10;
        int c = 2;
        //t = t / c;
        //c = c - t;
        t /= c;
        c -= t;
        System.out.println("t" + t);
        System.out.println(c);

        //14
        //if its larger it wont work

















    }
}
