import java.io.*;

public class Files {

    public static void main(String[] args) {
        try {
            File file = new File("foo.txt"); // give a path to create a file.
            if (!file.exists()) {
                // Add a new file
                file.createNewFile(); // must include try catch and throw exception.
                // File created.
            }
            // If you want to delete a file
            if (file.exists()){
                file.delete();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}