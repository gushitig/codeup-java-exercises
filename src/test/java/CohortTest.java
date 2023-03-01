import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort emptyCohort = null;
    private Cohort notEmptyCohort = null;

    private Student nova = null;
    private Student neptune = null;
    private Student becky = null;


    public static void main(String[] args) {

    }


    //if array list is created/empty
    @Test
    public void testStudentArrayListInitialization() {
        assertTrue(Cohort.getStudents().isEmpty());
    }

    //test that add student works
    @Test
    public void testAddStudent() {
        Student jethro = new Student(4, "jethro");
        emptyCohort.addStudent(jethro);

        assertEquals(4, notEmptyCohort);

    }

    @Test
    public void testAverageFromNotEmpty() {
        assertEquals(77.22, notEmptyCohort.getCohortAverage(), .01);
    }

    //test that avg works
    @Test
    public void testAverageFromEmpty() {
        assertEquals(Double.NaN, notEmptyCohort.getCohortAverage(), .01);
    }






}
