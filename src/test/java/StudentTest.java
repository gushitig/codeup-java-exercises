import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    //construction of student - test the id and name exist after creation

    @Test
    public void testStudentCreation() {
        Student s1 = new Student(1, "Becky");
        assertEquals(1, s1.getId());
        assertEquals("Becky", s1.getName());
    }

    //if array list is created/empty
    @Test
    public void testStudentArrayListInitialization() {
        Student s1 = new Student(1, "Becky");
        assertTrue(s1.getGrades().isEmpty());
    }


    //functionality/logic - add a grade
    @Test
    public void testAddGrade() {
        Student s1 = new Student(1, "Becky");
        Integer [] grades1 = {100, 90, 80};
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(80); //doc rob made this a function since we use it multiple times

        assertArrayEquals(grades1, s1.getGrades().toArray(new Integer[grades1.length]));

        //docrob ex
        assertEquals(3, s1.getGrades().size());
        assertEquals(Integer.valueOf(100), s1.getGrades().get(0));

    }

    //average
    @Test
    public void testAverage() {
        Student s1 = new Student(1, "Becky");
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(80);
        s1.getGradeAverage();
        //System.out.println(s1.getGradeAverage());

        assertEquals(90.0, s1.getGradeAverage(), .01);
    }

    //average w no grades
    @Test
    public void testAverageNoGrades() {
        Student s1 = new Student(1, "Becky");
        s1.getGradeAverage();
        //System.out.println(s1.getGradeAverage());

        assertEquals(Double.NaN, s1.getGradeAverage(), .01);
    }


}
