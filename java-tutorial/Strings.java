// Strings is sequence of characters i,e texts.
public class Strings {

    public static void main(String[] args) {
        String name = "Talib";



        // Some usefull methods
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("  ".isBlank());
        System.out.println("  ".isEmpty()); // false because it contains white spaces
        System.out.println(name.length());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));
        System.out.println(name.startsWith("T"));
        System.out.println("  Hello   ".trim()); // Remove spaces
        System.out.println(name.replace("T", "H")); 
        System.out.println(name.charAt(0)); 
        System.out.println(name.charAt(2)); 
        System.out.println(name.concat(" Ilahi")); // Add with name variable

        // Equality in Strings
        String name1 = "Talib";
        String name2 = "Talib"; 

        String name3 = new String("Talib");
        System.out.println("Check equality with ==");
        System.out.println(name1 == name2);     //true 
        System.out.println(name1 == name3);     //false

        System.out.println(name1.equals(name3)); // true

        // If you want to convert an integer to a string 
        String number = String.valueOf(1);
        System.out.println(number); // 1 

        String format = String.format("number %s: ", number);
        System.out.println(format);  // Number 1

        String[] fNames = {"Ali", "Nawaz", "Yahya"};
        String join = String.join(" | ", fNames);
        System.out.println(join);
    }
}