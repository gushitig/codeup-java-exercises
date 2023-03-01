package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
        double avg = total / grades.size();
        return avg;
    }

    //constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }



}
