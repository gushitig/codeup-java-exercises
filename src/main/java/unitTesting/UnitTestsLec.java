/*
package unitTesting;

public class UnitTestsLec {

    //test coverage
    //will never be able to test everything 100%

    //testing is important bc you dont want the end user to find your bugs

    //follow the same package structure in your test folder as your java folder, so its organized and easy to find
    //ex fighters are located in the adventure package so make the tests for fighters also in an adventure package

    //test class is the file
    //multiple testing methods contained inside

    //exceptions are signals, but errors are error

    //assertion is a programing error saying this needs to work otherwise i will crash
    //assertions determine whether the test passes or fails
//    @Test
//    public void testAlwaysTrue() {
//        assertTrue(true);
//    }
    //this must always be true obv
    //assert same, equals, notequals

    //unit testing is one of the exceptions for code being more than 150 lines
    //typically the more tests the bette your testing

    //this is normal java, so if you want to put loops you can, but keep tests very simple and focused

    //these unit tests are all public, so you cant test the private methods
    //just make a duplicate of the private method, make it public and name it privateMethodTest so only you can call it

    //can put checks in the constructor ex:
    public Fighter(String name) {
        if(name.length() < 3) {
            throw new IllegalArgumentException("Fighter name must be at least 3 chars");
        }
        this.name = name
        health = 100;
    }

    //goals of testing
    //1. find bugs
    //2. give confidence that its going to work how its supposed to

    //test driven development - write the test first then the code




    //THINGS YOU SHOULD TEST
    //logic in the program (ex fighters hitting and taking damage)
    //parameter boundary testing
//    (ex if im entering an int for age, whats the max and min?, int/doubles too low, too high, right at boundary)
//    (string empty, below min, above max, min, and max)
//    (objects null)
    //testing null if object or string
    //if string test empty string



}
*/
