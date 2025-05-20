public class Jumpstatements {
    public static void main(String[] args) {
        // Using break
        // -First, It terminates a statement sequence in a switch statement.
        // -Second, it can be used to exit a loop
        // Third, it can be used as a “civilized” form of goto.

        // Using break to Exit a Loop
        for (int i = 0; i < 100; i++) {
            if (i == 10)
                break;
            System.out.println("i : " + i);

        }
        System.out.println("Exit for Loop.");

        // Using break to exit a while loop.
        int j = 0;
        while (j < 100) {
            if (j == 10) {
                break;
            }
            System.out.println("j : " + j);
            j++;
        }
        System.out.println("Exit while Loop.");

        System.out.println();
        // Using break as a civilized form of goto.

        boolean b = true;
        first: {
            second: {
                third: {
                    System.out.println("Before break.");
                    if (b) {
                        break second;
                    }
                    System.out.println("this won't execute.");
                }
                System.out.println("this won't execute.");
            }
            System.out.println("This is after the second block.");
        }

        // Using break to exit from nested loops
        outer: for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ":");
            for (int a = 0; a < 100; a++) {
                if (a == 10) {
                    break outer; // Exit both loops
                }
                System.out.print(" " + a);
            }
            System.out.println("This won't execute.");
        }
        System.out.println(" Loop end.");

        // Using continue
        System.out.println("Continue");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.println("");
        }

        outer: for(int i = 0; i<10; i++){
            for(int x = 0;x<10; x++){
                if(x > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * x));
            }
        }
        System.out.println();
    }
}
