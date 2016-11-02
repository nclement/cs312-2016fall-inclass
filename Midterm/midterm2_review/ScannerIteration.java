import java.util.*;

public class ScannerIteration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        goThroughEachLine(scan);

        goThroughASingleLine("hello I am brady");
    }

    public static void goThroughEachLine(Scanner scan) {
        int numLines = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            numLines++;
        }
        System.out.println(numLines);
    }

    public static void goThroughASingleLine(String line) {
        Scanner lineScanner = new Scanner(line);
        int numTokens = 0;
        while (lineScanner.hasNext()) {
            String token = lineScanner.next();
            numTokens++;
        }
        System.out.println(numTokens);
    }
}
