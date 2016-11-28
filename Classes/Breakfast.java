public class Breakfast {
    public static void main(String[] args) {
        Spam sp = new Spam();
        sp.b();
        System.out.println();
        
        Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()}; 
        
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]); 
            food[i].a();
            System.out.println();
            food[i].b();
            System.out.println();
            System.out.println();
        }
    }
}