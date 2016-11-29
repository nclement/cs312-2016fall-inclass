public class Cat extends Pet {
    private static int HUNGER = 5;

    public Cat(String name) {
        // This method could have easily been "this.name = name";
        // But my parent does the exact same thing.
        // I don't have to write the same code if I use super.
        // This may seem silly now but it will be more helpful when writing
        // larger classes.
        super(name);
    }

    public void meow() {
        System.out.println("Meow");
    }

    // Cats show affection a little bit differently.
    @Override
    public void showAffection() {
        System.out.println(this.name + " bit you");
        super.showAffection();
    }

    // Cats also require a different amount of food.
    @Override
    public int getFoodRequired() {
        return Cat.HUNGER;
    }

    @Override
    public String toString() {
        return "meow: " + super.toString();
    }
}
