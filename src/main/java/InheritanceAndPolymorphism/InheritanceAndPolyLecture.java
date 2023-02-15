/*
package InheritanceAndPolymorphism;

public class InheritanceAndPolyLecture {
    //inheritance allows for reduction of code duplication

    //Fighter is the superclass or supertype
    //Ninja is the subclass or subtype

    //java is a single inheritance language, so you can only inherit from one class, but can all inherit and use from all the way up the chain in its ancestry, but can only have one parent

    //keyword to do this is extends
    //Ninja extends Fighter

    //so if the super has a constructor, then the sub needs it too
    //subclasses do not inherit constructors

    public Ninja(String name) {
        super(name);
        numShurikens = 1; //special subclass Ninja initialization
    }

    //if you want to add an ability (method) to all fighters, put it in the Fighters class (file), but if its exclusive to the Ninja, define it in the Ninja class (file)
    //the super class doesnt have any access to the sub class
    //so the Ninja can hit and jump, but bob can only hit bc the jump was defined in the Ninja class only, and hit was defined in the Fighter class

    //subclasses can have variables that are specific to them
    private int numShurikens;

    //overriding a class or ability from fighter inside ninja is possible

    @Override //just an fyi annotation, you can take it out and the code will still work, so this isnt actually overriding anything
    public void taunt() {
       // super.taunt(); //how to call something in the sub class thats in the super class is by super.method name
        System.out.println("The ninja glares coldly.");
    }

    public void throwShuriken (Fighter poorBastard) {
        if (numShurikens <=0) {
            System.out.println("The ninja feels dumb (no more shuriken)");
            return;
        } else {
            numShurikens--;
            int currentHealth = poorBastard.getHealth();
            currentHealth -= (5 + strength);
            poorBastard.setHealth

        }
    }

    //private items in the super class is not visible in the sub class
    //can give access by changing private to protected
    //protected means the superclass and its subclasses are able to access it

    //by deafault the ninja inherits the fighters toString


    //POLYMORPHISM - one class can act like other classes
    //we express poly in java through inheritance, blank and blank
    //technically means many shapes
    //allows abstract references which means i can store a ninja as a fighter and reference it that way like store both ninjas and fighters in an array of fighters
    //ability for an object to act like other classes to express behaviours that act like other classes
    //inheritance is a form of polymorphism
    //a ninja is like a fighter

    Figther weirdo = new Ninja("Weirdo");
    //makes a new ninja but points to a fighter variable
    //benifit is that is we want an arena of both fighters and ninjas i dont want to keep track of two seprate arrays of fighters and ninjas, so i can put them all in an array of just fighters
    Fighter [] combatants = new Figther[5];
    combatants[0] = weirdo;

    //downside is if youre looping through an array of both then you cant use a ninja ability(throwShuriken), bc its not there since its a fighter reference
    //the fix is to check if that combatant is a ninja and if so then we can call that ability
    for (Fighter combatant : combatants) {
        if(combatant!= null) { //checking to make sure its a valid combatant
            if(combatant instanceof Ninja) { //this is how we check if its an instance of the subclass or not
                System.out.println("oooo this is a ninja");
                ((Ninja) combatant).throwShuriken(combatants[1]);
            } else {
                System.out.println("Bahh just a fighter");
            }

        }
    }


    //solid principles reference wikipedia.org/wiki/SOLID
    //the S is single responsibility principle where a function should just do one thing


    //public final class Fighter- create a class that cannot be subclassed, so we wouldnt be able to create Ninjas
    //so you cant build something that breaks the rule of immutability
    //ex is String is a final class, so cant subclass it
    //ex for us is if we didnt want Ninjas to have different types or subclasses we would make it final

    //when you make a variable final it essentially makes it a constant and can only be assigned a value once
    private final int MAX_HEALTH = 100;
    //screaming snake case (all caps w underscores) is a common format across multiple languages for constants
    //try not to have magic numbers, ise constants instead
    //this helps when reassigning, instead of changing all the 100s through out the program to 120 you can just change the constant once

    public final void taunt() {
        System.out.println("your mama wears combat boots");
    }
    //this means subclasses cant change this method


    //accsessors


    public int getNumShurikens() {
        return numShurikens;
    }

    public void setNumShurikens(int numShurikens) {
        this.numShurikens = numShurikens;
    }
}
*/
