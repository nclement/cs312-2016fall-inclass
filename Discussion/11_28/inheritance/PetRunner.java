public class PetRunner {
    public static void main(String[] args) {
        Pet[] animals = new Pet[5];

        // I have pets of all shapes and sizes.
        animals[0] = new Dog("Bessie");
        animals[1] = new Cat("Tom");
        animals[2] = new FatCat("Pig");
        animals[3] = new Dog("Toby");
        animals[4] = new Cat("Kitty");

        int totalFood = 0;
        // But every pet has some getFoodRequired method, some are different.
        // But java knows to call the "childmost" one.
        // This is called polymorphism.
        for (int i = 0; i < animals.length; i++)
            totalFood += animals[i].getFoodRequired();
        System.out.println(totalFood);

        // Compile error, not every pet can meow.
        /* for (int i = 0; i < animals.length; i++) */
        /*     animals[i].meow(); */
        /* System.out.println(totalWater); */

        // Pets show affection differently.
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].showAffection();
            System.out.println();
        }
    }
}
