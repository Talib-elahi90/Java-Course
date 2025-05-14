import java.io.IOException;

public class IterationStatement {
    public static void main(String[] args) throws IOException {
        // While repeats a statement or block while its controlling expression is true
        int n = 10;
        while (n > 0) {
            System.out.println("took " + n);
            n--;
        }
        int a = 10, b = 20;
        // This will not be displayed
        while (a > b)
            System.out.println("This will not be displayed");

        // find midpoint between i and j
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j)
            ; // no body in this loop

        System.out.println("Midpoint is " + i);

        // The do-while loop always executes its body at least once, because its
        // conditional expression is at the bottom of the loop.
        int num = 10;
        do {
            System.out.println("duck " + num);
            num--;
        } while (num > 0);

        // Using a do-while to process a menu selection
        char choice;
        do {
            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Choose one:");

            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '4':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
        }

        // for loop
        // int forLoop;
        // for (forLoop = 10; forLoop > 0; forLoop--)
        //     System.out.println("for loop. " + forLoop);

        // here, forLoop is declared inside of the for loop
        for (int forLoop = 10; forLoop > 0; forLoop--)
            System.out.println("for loop." + forLoop);
    }
}
