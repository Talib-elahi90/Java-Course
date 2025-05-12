import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        System.out.println("Hay " + result);
    }
}