import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testCodeupString() {
        String codeup = "Codeup";
        assertSame("Codeup", codeup);
    }
    //assertSame determines if they are both pointing to the same object in memory
    //strings are immutable, so if you change the string, it creates a new one and points to the memory value instead, but the original string is still there


    @Test
    public void testEmptyStringArrayLists() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }
    //not the same bc arrays are like everything else in java, strings are just the exception
    //when you make new ones they make completely new objects in memory bc they are lists, not special objects like strings

    @Test
    public void testNumberArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testPHPNameContainsSomeLetters() {
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    @Test
    public void testLanguageStringJavaNull() {
        String language = null;
        // assertNull on the language variable
        assertNull(language);

        language = "Java";
        // assertNotNull on the language variable
        assertNotNull(language);


    }







}
