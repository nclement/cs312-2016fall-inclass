import java.util.*;
import java.io.*;

public class Quiz {
    public static void main(String[] args) throws IOException {
        // Setup.
        Scanner scan = new Scanner(new File("max_tokens_on_line.txt"));

        System.out.println(maxTokens(scan));
    }

    public static int maxTokens(Scanner sc) {
        int result = 0;
        // While there are still lines...
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // Find the number of tokens on the line, update result.
            result = Math.max(result, numTokens(line));
        }
        return result;
    }

    public static int numTokens(String line) {
        int result = 0;
        Scanner lineScanner = new Scanner(line);
        // While there are still tokens (we don't care what type they are)...
        while (lineScanner.hasNext()) {
            // Increment the counter.
            result++;
            lineScanner.next();
        }
        return result;
    }
}
