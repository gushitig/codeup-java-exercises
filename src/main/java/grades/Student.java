package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private Arrays names;
    private ArrayList<Integer> grades;

    // returns the student's name
    public String getName() {
        return names.toString();
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
        double avg = ((double) total) / grades.size();
        return avg;
    }



    //constructor
    public Student(Arrays names, ArrayList<Integer> grades) {
        this.names = names;
        this.grades = new ArrayList<>();
    }
}
