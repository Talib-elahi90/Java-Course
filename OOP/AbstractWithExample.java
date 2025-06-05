package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbstractWithExample {
    public static void main(String[] args) throws Exception {
        String path = "D:\\java-full-course\\document.txt";
        new NumberExtractorReport().prepareAndSendReport(path);

        System.out.println();

        new EmailExtractor().prepareAndSendReport(path);
    }

}

abstract class ExtractReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    public String parse(String path) throws FileNotFoundException {
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "empty file";
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();

            if (matches) {
                out += nextLine + "\n";
            }
        }
        return out.isBlank() ? "empty file" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting Report" + getReportName() + "...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent Report" + getReportName());
    }
}

class NumberExtractorReport extends ExtractReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Number";
    }
}

class EmailExtractor extends ExtractReport {

    private static final Pattern PATTERN = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Emails";
    }

}