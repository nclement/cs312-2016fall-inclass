public class Lamb extends Ham {
    public void b() {
        System.out.print("Lamb b ");
        super.c();
        c();
    }
    
    public void c() {
        System.out.print("Lamb c   ");
    }
}