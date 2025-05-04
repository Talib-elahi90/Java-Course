public class Arrays {
    public static void main(String[] args) {
        // One Dimensional Array
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");

        // OR
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
                30, 31 };
        System.out.println("April has " + monthDays[3] + " days.");

        // Average an array of values
        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Average is " + result / 5);

        // Multidimensional Arrays

        int twoD[][] = new int[4][5];
        int k = 0;
        for (int a = 0; a < twoD.length; a++) {
            for (int j = 0; j < twoD.length; j++) {
                twoD[a][j] = k;
                k++;
            }
        }
        for (int a = 0; a < twoD.length; a++) {
            for (int j = 0; j < twoD.length; j++) {
                System.out.print(twoD[a][j] + " ");
            }
            System.out.println();
        }

        // This program generates the following output:
        // 0 1 2 3 4
        // 5 6 7 8 9
        // 10 11 12 13 14
        // 15 16 17 18 19

        int twoD2[][] = new int[4][];
        twoD2[0] = new int[1];
        twoD2[1] = new int[2];
        twoD2[2] = new int[3];
        twoD2[3] = new int[4];
        int l, m, n = 0;
        for (l = 0; l < 4; l++) {
            for (m = 0; m < l + 1; m++) {
                twoD2[l][m] = n;
                n++;
            }
        }
        for (l = 0; l < 4; l++) {
            for (m = 0; m < l + 1; m++) {
                System.out.print(twoD2[l][m] + " ");
            }
            System.out.println();
        }

    }
}
