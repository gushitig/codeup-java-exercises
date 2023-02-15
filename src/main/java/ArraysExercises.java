import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArraysExercises {



    static Arrays people;

    public Arrays getPeople() {
        return people;
    }

    public void setPeople(Arrays people) {
        this.people = people;
    }
    //will  return array of Person (give it an array of Person, give it new person
    public static Person[] addPerson (Person [] people, Person newPerson) {
        Person [] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }



    public static void main(String[] args) {

        // 1. Array basics
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //gotta use it bc otherwise its gibberish (an address or something?) and doesnt show the contents

        Person [] people = new Person[3];
        System.out.println(Arrays.toString(people));

        people[0] = new Person("Tig");
        people[1] = new Person("Nova");
        people[2] = new Person("Neptune");
        //System.out.println(Arrays.toString(people));
        //System.out.println(people[0]);


        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);

        }

        //class exmaple
        for(Person person : people) {
            System.out.println(person);
        } //to string call is implied here
        //people.for will auto fill this

        people = addPerson(people, new Person ("Beka"));
        System.out.println(Arrays.toString(people));









    }





}
