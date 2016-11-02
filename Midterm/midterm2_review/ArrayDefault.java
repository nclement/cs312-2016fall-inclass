import java.util.*;
import java.io.*;

public class ArrayDefault {
    public static void main(String[] args) throws IOException {
        // default value 0.
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        // default value 0.0f.
        float[] floatArray = new float[10];
        System.out.println(Arrays.toString(floatArray));

        // default value ''.
        char[] charArray = new char[10];
        System.out.println(Arrays.toString(charArray));

        // default value is null. This is because it's an array of Objects.
        String[] StringArray = new String[3];

        // [null, null, null].
        System.out.println(Arrays.toString(StringArray));

        StringArray[0] = "asdf";
        // [asdf, null, null].
        System.out.println(Arrays.toString(StringArray));

        // We can have arrays of any object.
        Scanner[] scannerArray = new Scanner[3];

        // This throws null pointer exception since it is not initialized.
        /* scannerArray[0].hasNextLine(); */

        scannerArray[0] = new Scanner(System.in);
        // Now it will not throw since it is initialized.
        scannerArray[0].hasNextLine();
    }
}
