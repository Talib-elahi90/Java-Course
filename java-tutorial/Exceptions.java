public class Exceptions {

    public static void main(String[] args) {

        // for(int i = 10; i>=0; i--) {
        // System.out.println(10 / i); // when 10 is divided bt 0 it occurs an exception
        // (ArithmeticException).
        // }

        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i); // when 10 is divided bt 0 it occurs an exception (ArithmeticException).
            }
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Number cannot divided by zero.");
        }

        // Another Exception
        // int number = Integer.parseInt("1"); // its fine
        // int number = Integer.parseInt("1x"); // it occurs Exception. NumberFormatException: For input string: "1x"
        // System.out.println(number);

        // to handle this
        try {
            int number = Integer.parseInt("1x"); 
            System.out.println(number);
        } catch (NumberFormatException nfe) {
            // TODO: handle exception
            System.out.println("Input an integer.");
        }
    }
}