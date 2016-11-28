public class Pet {
    private static int hunger = 10;

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public int getFoodRequired() {
        return Pet.hunger;
    }
}
