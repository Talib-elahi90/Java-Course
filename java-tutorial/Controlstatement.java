public class Controlstatement {

    public static void main(String[] args) {
        /*
         * if (dataAvailable)
         * ProcessData();
         * else
         * waitForMoreData();
         */
        int month = 4; // April
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";
        System.out.println("April is in the " + season + ".");

        // Output: April is in the Spring.

        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
        /*
         * Output:
         * i is zero.
         * i is one.
         * i is two.
         * i is three.
         * i is greater than 3.
         * i is greater than 3.
         */

        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }

        /*
         * Output:
         * i is less than 5
         * i is less than 5
         * i is less than 5
         * i is less than 5
         * i is less than 5
         * i is less than 10
         * i is less than 10
         * i is less than 10
         * i is less than 10
         * i is less than 10
         * i is 10 or more
         * i is 10 or more
         */

        int MONTH = 4;
        String sson;
        switch (MONTH) {
            case 12:
            case 1:
            case 2:
                sson = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                sson = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                sson = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                sson = "Autumn";
                break;
            default:
                sson = "Bogus Month";
        }
        System.out.println("April is in the " + sson + ".");

        // Output: April is in the Spring.
    }
}