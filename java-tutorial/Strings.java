// Strings is sequence of characters i,e texts.
public class Strings {

    public static void main(String[] args) {
        String name = "Talib";
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
        System.out.println(name.concat(" Ilahi"));
        System.out.println(name.join("Talib", "sda"));
    }
}