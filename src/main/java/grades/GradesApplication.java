package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    private static Input input;
    private static HashMap<String, Object> students = new HashMap<>();

    public static void main(String[] args) {

        //HashMap<String, Object> students = new HashMap<>();

        Student nova = new Student("Nova");
        Student neptune = new Student("Neptune");
        Student zeus = new Student("Zeus");
        Student zeb = new Student("Zeb");

        nova.addGrade(100);
        nova.addGrade(90);
        nova.addGrade(80);

        neptune.addGrade(65);
        neptune.addGrade(34);
        neptune.addGrade(78);

        zeus.addGrade(89);
        zeus.addGrade(72);
        zeus.addGrade(97);

        zeb.addGrade(35);
        zeb.addGrade(68);
        zeb.addGrade(55);

        students.put("SuPeRn0vA", nova);
        students.put("8thPlan3t", neptune);
        students.put("l1ghtn1n9K1n9", zeus);
        students.put("Zebbeneezer", zeb);

        //System.out.println(students);
        System.out.println(students.get("SuPeRn0vA"));

        input = new Input();

        while(true) {

            printMenu();

            int selection = input.getInt(0, 6);

            if (selection == 0) {
                System.out.println("Program exited.");
                break;
            } else {
                chooseOption(selection);
            }

        }



/*// obtaining values from the hash map by key
        usernames.get("Ryan"); // "ryanorsinger"
        usernames.get("Phillip"); // null
        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

// checking if keys or values are present
        usernames.containsKey("Justin"); // true
        usernames.containsValue("fmendozaro"); // true*/
    }



    private static void printMenu () {
        System.out.printf("""
                Welcome!
                
                Here are the GitHub usernames of our students:\s
                |SuPeRn0vA| |8thPlan3t| |l1ghtn1n9K1n9| |Zebbeneezer|
                
                What would you like to do?
                0 - Exit
                1 - Print student info
                2 - View all the grades
                3 - Overall class average
                4 - Print CSV report

                Enter your choice:\s""");

    }

    private static void chooseOption(int selection) {
        if (selection == 1) {
            printInfo();
        }
        if (selection == 2) {
            //allGrades();
        }
        if (selection == 3) {
            //classAverage();
        }
        if (selection == 4) {
            //csvReport();
        }
    }

    private static void printInfo() {
        input = new Input();
        String stu = input.getString("What student would you like to see more information on? ");
        if (students.containsKey(stu)){
            students.get(stu);


        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + stu + ".");
            boolean anotherStu = input.yesNo("Would you like to see another student? [y/n]: ");
            if (anotherStu == true) {
                printInfo();
            } else {
                printMenu();
            }
        }
    }
}
