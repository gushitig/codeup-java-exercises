public class Person {

    private String name;


    public void sayHello() {
        System.out.printf("Hello from %s!", name);
    }

    @Override
    public String toString() {
        return  name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // 1. Object basics
        Person cat = new Person("Cat");
        cat.sayHello();

        // 1. Understanding references
        /*Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); //true bc its comparing the contents
        System.out.println(person1 == person2); //false checkecking to see if they are the same object*/

        /*Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2); //true bc they both point to the same object*/

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //Jane
        System.out.println(person2.getName()); //Jane



    }



    //accessors
    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = name;
    }
}
