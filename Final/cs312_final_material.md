## CS 312 Fall 2016 Final Material

### Scanner

Iterate through every token. Do stuff based on types.

```java
public static void goThroughTokens(Scanner scan) {
    int numDoubles = 0;
    int numInts = 0;
    int numStrings = 0;

    // We have to be sure to call nextBlah in every case.
    // Or else infinite loop.
    while(scan.hasNext()) {
        if (scan.hasNextInt()) {
            int token = scan.nextInt();
            numInts++;
        } else if (scan.hasNextDouble) {
            int token = scan.nextDouble();
            numDoubles++;
        } else {
            String token = scan.next();
            numStrings++;
        }
    }
}
```

### Default Stuff (Because everything extends Object in Java)

The Object class has toString and equals defined.

Since everything has Object as a parent, everything has toString and equals defined.

```java
public class Empty {

}

public class EmptyRunner {
    public static void main(String[] args) {
        // Why can I call these? I didn't define any constructors.
        Empty e = new Empty();
        Empty f = new Empty();
        Empty g = e;

        // Can't do this.
        // Empty e = new Empty(10);

        // How can I use these methods? I didn't write any in the class.
        // false
        System.out.println(e.equals(f));

        // true
        System.out.println(e.equals(g));

        // same things
        System.out.println(e);
        System.out.println(e.toString());
    }
}
```

### Keyword This (when to use it?)

You don't, it's just for clarity.

One place we would HAVE to use it is the following, but if we just name the
"name" parameters something else (like theName), we have no problem.

```java
public class Student {
    private String name;

    public Student(String name) {
        // can't do this one, which name is using?
        // it's using the parameter one, never sets the instance variable.
        // name = name;

        // have to use "this"
        this.name = name;
    }
}
```

### Privates

```java
public class Person {
    private int goods;
}

public class TeachingAssistant extends Person {
    public void someMethod() {
        // Can't even touch parent's privates. Compile error.
        // int theGoods = super.goods;
    }
}

public class PersonRunner {
    public static void main(String[] args) {
        Person brady = new Person();

        // Definitely can't touch the goods. Compile error.
        // int theGoods = brady.goods;
    }
}
```

### ArrayLists (resizeable arrays)

```java
// Lives here.
import java.util.ArrayList;

ArrayList<String> data = new ArrayList<String>();

data.add("foo");
// ["foo"]

data.add("bar")
// ["foo", "bar"];

data.add(1, "baz");
// ["foo", "baz", "bar"];

// "baz"
String s = data.get(1);

data.remove(1);
// ["foo", "bar"];

// We can't do the following - runtime errors.
// data.add(1000, "no");
// data.get(1000);
// data.remove(1000);
```

### For Each Loop (Enhanced)

```java
String[] words = {"hello", "world"};

// Prints out
// hello
// world
for (String s : words) {
    System.out.println(s);
}

// Equivalent to the following
for (int i = 0; i < words.length; i++) {
    String s = words[i];
    System.out.println(s);
}
```

### Printf (print format)

Printf (stands for print format).

```java
// Left justified, inserts 2 spaces.
// 0__ test
System.out.printf("%-3d test\n", 0);

// Takes up more space than 3, does it anyways.
// 1000 test
System.out.printf("%-3d test\n", 1000);

// Right justified, inserts 2 spaces.
// __0 test
System.out.printf("%3d test\n", 0);

// Takes up more space than 3, does it anyways.
// 1000 test
System.out.printf("%3d test\n", 1000);

// Float printing, says I want 2 decimal points.
// 123.46
System.out.printf("%.2f\n", 123.45678);

// 123.40000
System.out.printf("%.5f\n", 123.4);
```

### Math

Pretty much all math methods return doubles!
Math methods are static.

```java
// How to round things.
int x = (int) Math.round(1.35);

// Some number in [0.0, 1.0).
double r = Math.random();

// Generate random numbers between a range [lo, hi).
int hi = 10;
int lo = 5;
int range = hi - lo;
int random = (int) (Math.random() * range) + lo;

```

### Random

```java
// lives here.
import java.util.Random;

Random rand = new Random();

// a can be 0, 1, 2. NOT 3.
int a = rand.nextInt(3);

// How can I get an even number between 4 and 8? {4, 6, 8}.
// get a random number in {0, 1, 2}.
int x = rand.nextInt(3);

// now it lives in {0, 2, 4};
int y = x * 2;

// add by the min value, now we have {4, 6, 8}.
int z = 4 + y;
```

### 2D arrays

```java
int[][] data = new int[10][20];

// 10
int rows = data.length;

// 20, be careful of index out of bounds, if data is empty.
int cols = data[0].length;

// Iterate through matrix.
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        int x = data[i][j];
    }
}
```

### Bounds checking

```java
// returns true if i can safely do data[i] without causing a runtime error.
public static boolean inBounds(int i, int[] data) {
    if (i >= 0 && i < data.length)
        return true;
    return false;
}
```

### Algorithms

Comparing all pairs.

```java
public void pairs(int[] data) {
    // This method produces all pairs (not unique).

    // For {}, this will generate nothing.

    // For {3}, this will generate nothing.

    // For {3, 5, 7}, this will generate the (x, y) pairs -
    // (3, 5), (3, 7)
    // (5, 3), (5, 7)
    // (7, 3), (7, 5)

    for (int i = 0; i < data.length; i++) {
        // The outer loop picks a x.
        int x = data[i];

        for (int j = 0; j < data.length; j++) {
            // If i == j, we are comparing an element to itself.
            if (i != j) {
                // The inner loop picks a y.
                int y = data[j];
            }
        }
    }
}

public void pairsUnique(int[] data) {
    // This method produces all pairs (unique).

    // For {}, this will generate nothing.

    // For {3}, this will generate nothing.

    // For {3, 5, 7}, this will generate the (x, y) pairs -
    // (3, 5), (3, 7)
    // (5, 7)

    for (int i = 0; i < data.length; i++) {
        // The outer loop picks a x.
        int x = data[i];

        // Starting at i+1 guarantees we do not have i == j, like in above.
        for (int j = i+1; j < data.length; j++) {
            // The inner loop picks a y.
            int y = data[j];
        }
    }
}
```

Checking adjacent elements.

Practice problems - [F06_P4](http://www.cs.utexas.edu/~scottm/cs312/handouts/tests/Fa06Final.pdf)

```java
public void adjacent(int[] data) {
    // For {}, this will generate nothing.

    // For {3}, this will generate nothing.

    // For {3, 5, 7}, this will generate the (current, previous) pairs -
    // (5, 3)
    // (7, 5)

    // Start at i = 1, and always look back.
    // This ensures no IndexOutOfBoundsException.
    for (int i = 1; i < data.length; i++) {
        int current = data[i];
        int previous = data[i-1];
    }
}
```
