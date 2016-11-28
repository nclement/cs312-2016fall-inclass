public class Cat extends Pet {
    private static int hunger = 5;

    private String name;

    public Cat(String name) {
        super(name);
    }

    public int getFoodRequired() {
        return Cat.hunger;
    }
}
