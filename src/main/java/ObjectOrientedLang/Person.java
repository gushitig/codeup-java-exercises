package ObjectOrientedLang;

class Person { //class HAS to be public in order to access it from another package
    //this person class is a blueprint for making a person object
        //data are properties
        //this is where we declare the blue print
        //all fields should be private visibility by default
        //usually use getters to find the property
        //called encapsulation - this hides the data type which prevents things from breaking later if you need to change the data type
        //and setters to change a field
        //at private that means classes outside of this one cannot access these fields
        private String firstName; //fields, instance variables, member variables
        private String lastName; //typically named as an adjective
        private String middleName;
        //one object cannot have different fields than other objects in the same calss
        //youd have to make another class
        // non static - each object has its own copy of each of these
        //static means theres one copy
        public static int personCounter = 0;

    //can generate it by code>generate>constructor
    public Person(String firstName, String middleName, String lastName) {
        personCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        System.out.println("three arg constructor called");

    }

    //constructors are normally public
        //no return type
        //HAS to take the name of the class
        //can have parameters if you want
        //have a body
        //this is where anything you want to do to the new object being made such as default values for example
        public Person() {
            this("", "", "");
            System.out.println("no arg constructor called");

        }

        //constructors can call other constructors
        //any code that is called when an object is crated belongs in a constructor

    public Person(String firstName) {
        this(firstName, "", ""); //this as in looking for another constructor within THIS class
        System.out.println("one arg constructor called");
    }

    //behaviors are functions
        //typically named as an action verb
        public String sayHello() { //dnot need to use getters and setters when youre inside the classs itself
            return String.format("Hello from %s %s! Person counter is %d", firstName, lastName, personCounter);
        } //no static here so this function can only be called on an object

        public static void main(String[] args) { //main is here so it can be tested
            //inside static functions you cannot access object level variables
            //this.middleName = "X";

            //wouldnt normally have a main here
            Person rick = new Person();
            rick.firstName = "Rick";
            rick.lastName = "Sanchez";
            System.out.println(rick.sayHello());
            // prints "Hello from Rick Sanchez!"

            Person sue = new Person();

            sue.firstName = "Sue";
            sue.lastName = "Smith";
            System.out.println(sue.sayHello());

            //THIS IS BAD PRACTICE DO NOT BE DOING THINGS OR EVEN HAVE A MAIN INSIDE THIS CLASS THAT CONTAINS THE OBJECTS

        }



        //accessors
        //code>generate>getter and setter


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }
    }

    //lets start thinking of objects as boxes that store information for us


