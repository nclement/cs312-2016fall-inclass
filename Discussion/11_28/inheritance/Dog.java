public class Dog extends Pet {
    private static int HUNGER = 20;

    public Dog(String name) {
        super(name);
    }

    // Notice that this class doesn't have a showAffection.
    // but Java will look in this file when dog.showAffection() is called,
    // and it won't find it, but it will go to the parent Pet, where it is defined.

    // Dogs have different hunger levels than normal pets.
    @Override
    public int getFoodRequired() {
        return Dog.HUNGER;
    }

    @Override
    public String toString() {
        return "woof: " + super.toString();
    }
}
