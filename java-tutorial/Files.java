import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {
        // File create and delete.
        /*
         * try {
         * File file = new File("foo.txt"); // give a path to create a file.
         * if (!file.exists()) {
         * // Add a new file
         * file.createNewFile(); // must include try catch and throw exception.
         * // File created.
         * }
         * // If you want to delete a file
         * if (file.exists()){
         * file.delete();
         * }
         * } catch (Exception e) {
         * System.out.println(e.getMessage());
         * }
         */

        // Write data in file
        File file = createFile("java-tutorial/data.txt");
        // writeFile(file, false);
        updateWriteFile(file, true);
        readFile(file);

    }

    private static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    // private static void writeFile(File file, boolean append) {
    //     try {
    //         FileWriter fileWriter = new FileWriter(file, append); // If you want to append data used true in second
    //                                                               // args.
    //         PrintWriter write = new PrintWriter(fileWriter);
    //         write.println("Software Engineer.");
    //         write.flush();
    //         write.close();

    //     } catch (IOException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }

    }

    // We don't need these methods (flush or close) file if we used try with resources.
    private static void updateWriteFile(File file, boolean append) {
        try (
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter write = new PrintWriter(fileWriter)) {
            write.println("Pakistan.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}