import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in); // Create Scanner class object
        String result = scanner.nextLine(); // store String into a result variable .nextLine return string
        System.out.println("Hay " + result); // print result

        System.out.print("Your age? ");
        int age = scanner.nextInt(); // .nextInt return an Integer
        System.out.println(age);

        // Go explore .nextDouble, .nextBoolean ...  
    }

}