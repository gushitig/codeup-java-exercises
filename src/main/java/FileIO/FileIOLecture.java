/*
package FileIO;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileIOLecture {

    //read up on enums

    public static void main(String[] args) {
        //persistence - data that persists
        //files, database
        //files are simpler but much more primitive than databases
        //not the best tool all the time

        //absolute paths: specified from the filesystem root, will work regardless of where you are
        //relative paths: relative to the current working directory

        //path object
        //use paths.get to get a path ref to
        Path aDir = Paths.get("adir");
        Path aFile = Paths.get("adir", "afile.txt");

        System.out.println(Files.exists(aDir));

        if(!Files.exists(aDir)) {
            try {
                Files.createDirectory(aDir);
                System.out.println("Directory created");
            } catch (IOException e) {
                System.out.println("CreateDirectory exception: " + e.getMessage());
            }
        } else {
            System.out.println("This file exists already.");
        }
        //checked exception bc all kinds of weird things can happen w files and theres a big chance it wont be able to find it

        //if(!Files.exists(aFile)) {
        //an alternative to using an if/else to first check if the file already exists
            try {
                Files.createFile(aFile);
                System.out.println("The file has been created.");
            } catch(FileAlreadyExistsException e) { //the more specific the catch the higher up it needs to be
                System.out.println("File exists");

            } catch (IOException e) {
                System.out.println("createFile exception: " + e.getMessage());
                e.printStackTrace();//tells us which exception is thrown
            }
        } else {
            System.out.println("The file exists!");
        } //dont need thi now since we created another catch

        //dont use single letter variable names except i in a loop or e in an exception

    //a lot of indentation in code is considered messy code. try to keep it under 5, but more like 3 or 4

    //notExists is a thing also if you dont wanna use !


        List<String> fruits = Arrays.asList("apple", "pear", "banana");


        try {
            //Files.write(aFile, fruits);
            //this will over write, but if we add
            //, StandardOpenOption.APPEND is will append the file
            List<String> fileStrings = Files.readAllLines(aFile);
            System.out.println(fileStrings.size());
            System.out.println(fileStrings);
        } catch (IOException e){
            System.out.println("file write exception : " + e.getMessage());
        }





        Fighter bob = new Fighter("bob");
        System.out.println(bob.toFileString());
       // List<String> fighterStrings =

        //file.write is very basic. it writes strings only, so we need to turn bob into a string

        public String toFileString() {
            return String.format(%s, %d, %d, name, health, strength);
        } //(this should be created in the fighter class tho)


        ///builder or factory method - creates an object form a file string
        paublic static Fighter fromFileString (String fileString) {
            //file format is name, health, strength
            String [] pieces = filesString.split(",");
            Fighter fighter = new Fighter(pieces[0]);
            figther.setHealth(Integer.parseInt(pieces[1]));
            figther.setStrength(Integer.parseInt(pieces[2]));
            return fighter;

        } //(this should be created in the fighter class tho)




        //contact manager project
        //command line/terminal colros in java
        //ascii art
        //5. overwrite the file
        //bonus all have 10 digits only

        //fields for Contact
            //name - req
            //number -req
            //first - optional
            //last - optional
            //email - optional

        //classes
        //contact
        //main
        //contacts manager



        //project development
        //backlog - list of things to do



//make  branches to do seperate tasks
//using git hubs task manager has a button for this

//do all your work in branches then merge to main
//code>compare & pull request>will show changes
//push in small bits and pieces
//you can make the pull request, but dont approve your own requests

//merge button if its fine then the branch is closed

    }



}
*/
