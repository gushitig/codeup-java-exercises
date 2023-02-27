/*
package Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {

        //lists, sets, maps
        //lists - want a flexible array that you can resize
        //sets - built in mechanism to automatically get rid of duplicates for you
        //maps - very fast at doing precise lookups, search


        // ********* ARRAY LIST
        //want a flexible array that you can resize
        ArrayList<String> foods = new ArrayList<>();
                //right click to import (why tho?)
        //add elements
        foods.add("pizza");
        foods.add("shepherd's pie");
        System.out.println(foods);
        //prints a string version of itself without having to convert to a string like with arrays
        //can also just add elements to it more link in javascript

        //make a normal array
        String [] otherFoods = {"kibble", "bits"};
        //foods.addAll(Arrays.asList(otherFoods));
        //foods.addAll(Arrays.asList("bob", "sue"));
        //can batch add to the array list
        System.out.println(foods);

        //use array initializer
        foods = new ArrayList<>(); //initializes an empty array list
        //foods = new ArrayList<>(Arrays.asList("apple", "banana"));
        foods.add("pear");
        System.out.println(foods);

        //show size() instead of length
        //print size
        System.out.println(foods.size());
        foods.add("cake");
        System.out.println(foods.size());


        //get an element at a given index
        System.out.println(foods.get(foods.size() - 1));

        //show loops w ArrayList
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
        for (String food : foods) {
            System.out.println(food);
        }

        //show .indexOf()
        System.out.println(foods.indexOf("cake")); //3
        System.out.println(foods.indexOf("apple"));
        System.out.println(foods.indexOf("nutrigrain bar")); //-1 means not found
        foods.add("cake");
        System.out.println(foods.indexOf("cake"));
        //cannot find another cake after the first one (cant overload it w an index to start at)
        System.out.println(foods.lastIndexOf("cake"));
        //will show the last occurrence

        System.out.println(foods.contains("cake")); //true
        System.out.println(foods.contains("nutrigrain bar")); //false


        //show .remove()
        foods.remove("cake");
        System.out.println(foods);
        //removed one cake
        //show .removeAll (will need Arrays.asList() )
        //foods.removeAll(Arrays.asList("apple", "cake"));

        //show isEmpty()
        System.out.println(foods.isEmpty());

        //added an array list of weapons to fighter class



        // ********* HASHMAPS
        //search look up
        //really fast ways to look things up if you know what youre loooking for
        //key vs value
        //find  particular value by looking for its key, but you have to know the key

        //show hashmap
        //
        HashMap<String, Fighter> roster = new HashMap<>();
        //data type of key, data type of value
        roster.put("Knull", knull);
        //dont reuse the same key, they must all be unique
        System.out.println(roster);
        roster.put("Knull", null); //will just override the first one
        roster.putIfAbsent("Knull", null); //wont override if it already exists

        //show .get
        Fighter f1 = roster.get("knull"); //prints out the entry for knull
        System.out.println(f1);
        Fighter f1 = roster.get("knullxxxx"); //prints out the actual null bc does not exist

        //show .getOrDefault()
        Figther.getOrDefault("Knull", new Fighter("Bob"));
        //if knull is not there then choose the default bob
        System.out.println(f1);


        //show .containsKey()
        System.out.println((roster.containsKey("Knull"));//true
        System.out.println((roster.containsKey("Knullxx"));//false

        //show .containsValue
        //may need to define .equals() for this
        System.out.println(roster.containsValue(knull));//true
        Fighter checkFighter = new Fighter("knull");
        System.out.println(roster.containsValue(checkFighter));//false
        //how can i determine if they are the same fighter or object instead of just pointing to the same memory address
        //create our own equal
        //right click generate equals, select which fields you want to check will be the same (name for us rn)

        //show .replace w 2 or 3 args
        System.out.println(roster);
        roster.replace("Knull", null)
                //whose value do we want to replace then replace him with __
        //ex if knull was killed in battle hes replaced w a null
        System.out.println(roster);

        //show .remove
        System.out.println(roster.isEmpty()); //is it empty before removing knull - false
        roster.remove("Knull");
        System.out.println(roster.isEmpty()); //is it empty after removing knull - true


        // show .clear
        roster.put("Knull2", f1);
        System.out.println(roster);
        roster.clear();
        System.out.println(roster);
        //clears the whole roster


        //add some fighters back in
        roster.put("bob", new Fighter("Bob"));
        roster.put("sue", new Ninja("Sue"));
        roster.put("ragnar", new Fighter("Ragnar"));


        //iterate over the hashMap (prob shouldnt do this tho)
        //use .keySet() to return a list of all the keys
        Set<String> keys = roster.ketSet(); //grab the keys
        for (String key : keys) {//get the object behind the keys by iterating over one key at a time and use get
            Fighter aFighter = roster.get(key);
            System.out.println(aFighter);
        }


        // ******** SET
        //when you dont want duplicates of things
        //built in mechanism to automatically get rid of duplicates for you









    }
}
*/
