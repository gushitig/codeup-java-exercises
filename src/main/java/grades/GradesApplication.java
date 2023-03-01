package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Object> students = new HashMap<>();

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
        students.put("Zebbenezer", zeb);

        System.out.println(students);










/*// obtaining values from the hash map by key
        usernames.get("Ryan"); // "ryanorsinger"
        usernames.get("Phillip"); // null
        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

// checking if keys or values are present
        usernames.containsKey("Justin"); // true
        usernames.containsValue("fmendozaro"); // true*/
    }
}
