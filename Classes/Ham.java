public class Ham {
    public void a() {
        System.out.print("Ham a   ");
        b();
    }

    public void b() {
        System.out.print("Ham b   ");
    }

    public void c() {
        System.out.print("Ham c   ");
    }
    
    public String toString() {
        return "Ham"; 
    }
}