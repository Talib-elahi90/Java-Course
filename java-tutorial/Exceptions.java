public class Exceptions {

    public static void main(String[] args) {

        /*
         * for(int i = 10; i>=0; i--) {
         * // when 10 is divided bt 0 it occurs an exception (ArithmeticException).
         * System.out.println(10 / i);
         * }
         */


        // Handle Exception
        /*
         * try {
         * for (int i = 10; i >= 0; i--) {
         * System.out.println(10 / i); // when 10 is divided bt 0 it occurs an exception
         * (ArithmeticException).
         * }
         * } catch (ArithmeticException e) {
         * System.out.println("Number cannot divided by zero.");
         * }
         */


        // Another Exception
        // int number = Integer.parseInt("1"); // its fine
        // int number = Integer.parseInt("1x"); // it occurs Exception.
        // NumberFormatException: For input string: "1x"
        // System.out.println(number);


        // Handle this Exception
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter Number.");
        }


        // Both Exceptions can be handle.
        try {
            int number = Integer.parseInt("1a");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Cannot Parse 1a. ");
        } catch (ArithmeticException e) {
            System.out.println("Number cannot divided by zero.");
        }
        // If you don't know the exception use Exception class
        catch (Exception e) {
            System.out.println("Catch all exception.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // Finall block Always run
            System.out.println("Finally always run.");
        }

        
        // OR also you can use
        /*
         * catch (NumberFormatException | ArithmeticException e) {
         * // System.out.println("Cannot Parse 1a. ");
         * System.out.println(e.getMessage());
         * } finally {
         * Finall block Always run
         * System.out.println("Finally always run.");
         * }
         */

    }
}