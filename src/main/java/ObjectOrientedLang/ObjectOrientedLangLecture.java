package ObjectOrientedLang;

public class ObjectOrientedLangLecture {
    public static void main(String[] args) {

        //class is a class of students where the object is each student w info on each (name, grade, age, etc)
        //object- an instance of a class, a grouping of related information


        //two seperate objects, not related, cannot itterate through like we could in js bc these are not in an array together





        //CANNOT MAKE INSTANCE(same thing as object) VARIABLES PUBLIC SOOO
        //this is how we gotta do it
        //an object is an instance of the clsas


        //make people here in the main, constructors and set up are in the person class

        Person alex = new Person("Alex", "G", "S");
//        alex.setFirstName("Alex");
//        alex.setLastName("S");
//        alex.setMiddleName("G");
        System.out.println(alex.getFirstName());
        System.out.println(alex.sayHello());
        System.out.println(alex.getMiddleName());
//        Person.personCounter++;

        Person sue = new Person("Sue");
//        Person.personCounter++;
        sue.setFirstName("Sue");
        System.out.println(sue.sayHello());








    }

}
