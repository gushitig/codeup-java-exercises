package hello;

public class HelloWorld {
    public static void main(String[] args) {
        //the program starts here
        System.out.println("Hello world");
        //sout tab to create above line
        //same as console.log
        //ln means w a new line
        //dont need a browser to run java, we can run it right here in the command line
        System.out.print("Hello world");
        System.out.print("Hello world");
        //this is why we need ln so they arent on the same line
        System.out.print("Hello world\n");
        // \n means new line too
    }
}


/*
Java Intro Notes

Java is compiled while JS is interpreted

Java is statically typed and JS is dynamically typed

JS runs in the browser while Java runs almost everywhere


Resources folder is for things like images and text files

Root for java in maven is src/main/java
NEVER put java files directly in the java folder bc they always go in “packages” which is just s folder
Packages should be all lower case
Have a dot in the middle of the folder
Do not make a directory inside the package folder
Package is a directory in java where your source code goes
New java class should be properly capitalized (pascal case) not camel
Public class name is required to be the same as the file name


Root for tests are src/test/java


Main tab to create
Public static void main(String[] args) {
}

Public - it can be called by something on the outside
Void-
Main-anything from here will execute first
String-
Args- parameters


We dont push the target folder into GitHub, so we gitignore it
Byte code is not machine code. Its like middle layer for processing system maybe, but its specific to your computer so it wouldn’t make sense to share it to another computer


Terminal:
hello % javac HelloWorld.java
Ls -la

Running our program we dont include the file type
java hello.HelloWorld
package name . class name
Won’t ever really do this

But even on servers where you dont have a guy maven will build and run it for you w one command

 */