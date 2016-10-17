public class Receipt {
    public static void main(String[] args) {
        double taco = 5.00;
        double drink = 2.50;
        System.out.println("Subtotal:");
        System.out.println(taco + drink);
        System.out.println("Tax:");
        System.out.println((taco + drink) * 0.08);
        System.out.println("Tip:");
        System.out.println((taco + drink) * 0.15);
        System.out.printf("Total: $%.2f\n",(taco + drink) + 
                                (taco + drink) * 0.08 +
                                (taco + drink) * 0.15);
    }
   
}