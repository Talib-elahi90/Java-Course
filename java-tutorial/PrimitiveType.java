public class PrimitiveType {
    public static void main(String[] args) {
        /*
         * Name | Width | Range
         * long |  64   | –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * int  |  32   | –2,147,483,648 to 2,147,483,647
         * short|  16   | –32,768 to 32,767
         * byte |   8   | –128 to 127
         */

         int num; // this declares a variable called num
         num = 50; // this assigns num the value 50
         System.out.println("This is num: " + num);

         num = num * 2;
         System.out.print("The value of num * 2 is ");
         System.out.println(num);
         
    }
    // Output:
    // This is num: 50
    // The value of num * 2 is 100 
}