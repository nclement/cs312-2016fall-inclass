public class PetRunner {
    public static void main(String[] args) {
        Pet[] pets = new Pet[10];

        for (int i = 0; i < 5; i++)
            pets[i] = new Cat(i + "");

        for (int i = 5; i < 10; i++)
            pets[i] = new Pet(i + "");

        for (int i = 0; i < 10; i++)
            System.out.println(pets[i].getFoodRequired());
    }
}
