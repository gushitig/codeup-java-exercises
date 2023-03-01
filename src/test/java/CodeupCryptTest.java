import org.junit.Test;

import static org.junit.Assert.*; //this * will import them all so you dont have to keep adding them one by one

public class CodeupCryptTest {

    //focus on testing hasPassword
    //takes a string that is a password
    //returns a string that is the hashed pw
    //replace vowels w numbers

    //string test w empty and null
    //logic - test each rule(5) works
    //also try a string without any vowels

    @Test
    public void testHashPwEmpty() {
        assertEquals("", CodeupCrypt.hashPassword(""));
    }

    @Test
    public void testHashPwLetterA() {
        assertEquals("4bc", CodeupCrypt.hashPassword("abc"));
    }

    @Test
    public void testHashPwLetterE() {
        assertEquals("3bc", CodeupCrypt.hashPassword("ebc"));
    }

    @Test
    public void testHashPwLetterI() {
        assertEquals("1bc", CodeupCrypt.hashPassword("ibc"));
    }

    @Test
    public void testHashPwLetterO() {
        assertEquals("0bc", CodeupCrypt.hashPassword("obc"));
    }

    @Test
    public void testHashPwLetterU() {
        assertEquals("9bc", CodeupCrypt.hashPassword("ubc"));
    }

    @Test
    public void testHashPwNoVowels() {
        assertEquals("bcxyz", CodeupCrypt.hashPassword("bcxyz"));
    }

    //so its easy to make  million test cases (ex every letter or string of letters) but at some point that becomes ridiculous, so use your judgement







}
