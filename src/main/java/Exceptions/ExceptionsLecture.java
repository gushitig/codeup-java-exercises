/*
package Exceptions;

public class ExceptionsLecture {

        public static void main(String[] args) {

            // throw an exception
            // no code executes until the exception is handled
            // show code underneath does not execute

            // why deliberately throw an exception?
            // to indicate that something abnormal or wrong happened
            // AND potentially respond to it in an appropriate way
                try {
                        throw new RuntimeException("boo");
                        //System.out.println("Will this code print?"); //no it wont
                } catch(RuntimeException e) {
                        System.out.println("a exception has occurred: ");
                } finally { //will execute regardless of the other two
                        //do clean up here like close files
                        System.out.println("finally code always executes");

                }
            // how to respond (handle) in an appropriate way?
            // show catch
            // can use above exception to catch it as soon as you throw it

            // show finally

            // use ArithmeticException as an example (div by 0)
                try {
                        int X = 5 / 0;
                } catch(ArithmeticException e) {
                        System.out.println("Don't divide by zero!");
                }


                try {
                        int [] nums = new int[10];
                        nums[11] = 4;
                } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("does the ArrayIndexOutOfBoundsException handler print");
                } catch(Exception e) {
                        System.out.println("does the exception handler print");
                }
                //the most specific exception will catch/print
                //all of the exception classes inherit from exception so there is a hierarchy


                //entire function bodies should be inside try catches
                //you dont want try catches inside try catches



            // use the ArrayIndexOutOfBounds example with multiple catches
            // most specific wins

            // SCOPE: declare a variable in the try block and try to use it anywhere else

                //the variable is only available  inside the try if declared there, so if you want to use it inside the catch, you must declare it outside the try catch

            // Checked exceptions
                //anyhting that is likely to throw an exception
            // use indentation preference example
            // show the CHOICE of throws or try/catch
            // when to throw or handle
                try {
                        throw new Exception("checked exception");

                } catch (Exception e) {
            //            throw new RuntimeException(e);
                }

                //ex your internet is down somewhere


                //clean coding practices make it more readable and easier to take care of
                //guidelines to try to keep your code as readable as possible
                //picking goo variabel names, good funcitionanmes, keeping functions and classes as small as possible
                //bundling up try catches properly in a single runtime exception or custom exception



            // Unchecked exceptions
                // that may happen but its unlikely
                //java doesnt force you the catch them




                //throw new Exception("checked exception");

                //add exception to method signature - tell java it is possible for mai to throw the exception class
                //dont do this in a real program
                //has to be handled in at least main or lower than that
                //String userInput = getUserInput();
                //red bc its unhandled
                try {
                        String userInput = getUserInput();
                } catch (Exception e) {
                        System.out.println("hey man chill out");
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                }
                //it looks like the program crashes but it actually continues on


                // Custom exceptions





        }

        //throws

        private static String getUserInput() throws Exception {
                throw new Exception("the user hates us!");
        }
        //add exception to method signature bc its not main



}
*/
