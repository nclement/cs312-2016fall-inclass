import java.util.*;

public class Null {
    public static void main(String[] args) {
        String[] arr = new String[3];
        // Is null == null? Yes.
        System.out.println(arr[0] == arr[1]);
        try {
            // Cannot dereference null!!
            System.out.println(arr[0].equals(arr[1]));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("made it");
    }
}
