// Why is this abstract? This is a base class.
// It makes sense to have something that is "Pet-like", as in every pet
// has a name, every pet showsAffection somehow, and every pet needs food.
// But these are going to depend based on the actual animal.
// The reason it is abstracts is that there is no animal called Pet.
//
// extends Object is completely unnecessary, it's implicit in every Java class,
// but this will tell you how I can override toString() - this is because
// Object has a toString method that prints out the memory address.
public abstract class Pet extends Object {
    private static int HUNGER = 10;

    // Protected means my children can see this!
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public void showAffection() {
        System.out.println("I love my owner!");
    }

    public int getFoodRequired() {
        return Pet.HUNGER;
    }

    // Override is strictly for the programmer benefit, it's not required.
    @Override
    public String toString() {
        return this.name;
    }
}
