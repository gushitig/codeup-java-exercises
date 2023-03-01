/*
package Fighter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {

    private Fighter bob = null;
    private Fighter noName = null;


    @Before
    public void initTestData() {
        bob = new Fighter("bob");
    }
    //any function annotated w before gets done before each test case
    //however, unit tests should be independent of each other
    //they can share stuff but one should never rely on the other
    //shouldnt really put multiple assertions in same method, but people do it

    @Test
    public void testAlwaysTrue() {
        assertTrue(true);
    }

    public void testFighterNameGetterMatchesConstructor () {
        //Fighter f1 = new Fighter("bob"); made this a global variable
        assertEquals("bob", bob.getName());
    }


    @Test
    public void testFighterNoName () {
        //Fighter bob = new Fighter("");
        assertEquals("Unknown fighter", noName.getName());
    }


    @Test
    public void testNoNameHitsBob () {
        noName.hit(bob);
        assertEquals(90, bob.getHealth());
    }
    //this is the stuff you really want to test - the logic, the meat of the software

    //this is normal java, so if you want to put loops you can, but keep tests very simple and focused

    @Test(expected = IllegalArgumentException.class) //this is saying this test will pass if it throws this exception otherwise it fails, try to keep the exception specific
    public void testFighterNameTooShort () {
        //test will pass if it throws an exception when making a fighter w a name too short
        Fighter foo = new Fighter("");

    }



    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }
    //when testing a double include a delta which is a margin of error







}
*/
