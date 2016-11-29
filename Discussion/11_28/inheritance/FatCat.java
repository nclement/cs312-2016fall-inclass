public class FatCat extends Cat {
    // We're getting even deeper in the inheritance hiearchy.
    // This is almost the same as normal cats, they just eat more.

    public FatCat(String name) {
        super(name);
    }

    // Fat cats need twice as much food as normal cats!
    @Override
    public int getFoodRequired() {
        return 2 * super.getFoodRequired();
    }
}
