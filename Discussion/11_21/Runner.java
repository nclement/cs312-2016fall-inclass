public class Runner {
    public static void main(String[] args) {
        // Square stuff.
        Square unit = new Square();
        Square square = new Square(2.0);

        System.out.println(unit);
        System.out.println(square);

        // Friend class.
        String[] roster = {"brady", "chandler", "kaitlyn", "alan"};
        Friend class312 = new Friend("");
        for (int i = 0; i < roster.length; i++) {
            Friend student = new Friend(roster[i]);
            class312 = class312.getFriendlier(student);
        }
        System.out.println(class312);

        // Quiz.
        City houston = new City("HOU", 1_000, 50.0);

        City nyc = new City("NYC", 1_000_000_000, 12.1);

        System.out.println(houston.toString());
        System.out.println(nyc);

        System.out.println(houston.isBigCity());
        System.out.println(nyc.isBigCity());

        System.out.println("population densities");
        System.out.println(nyc.populationDensity());
        System.out.println(houston.populationDensity());

        System.out.println(nyc.merge(houston));
    }
}
