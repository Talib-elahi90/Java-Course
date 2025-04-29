public class PrimitiveType {
    public static void main(String[] args) {
        /*
         * Name | Width | Range
         * long | 64 | –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * int | 32 | –2,147,483,648 to 2,147,483,647
         * short| 16 | –32,768 to 32,767
         * byte | 8 | –128 to 127
         */

        int num; // this declares a variable called num
        num = 50; // this assigns num the value 50
        System.out.println("This is num: " + num);

        num = num * 2;
        System.out.print("The value of num * 2 is ");
        System.out.println(num);

        // Output:
        // This is num: 50
        // The value of num * 2 is 100

        // Compute distance light travels using long variables.

        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000; // specify number of days here
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed * seconds; // compute distance
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");

        // This program generates the following output:
        // In 1000 days light will travel about 16070400000000 miles.


        
        // Compute the area of a circle.
        double pi, r, a;
        r = 10.8; // radius of circle
        pi = 3.1416; // pi, approximately
        a = pi * r * r; // compute area
        System.out.println("Area of circle is " + a);

        // Output
        // Area of circle is 366.436224
    }
}