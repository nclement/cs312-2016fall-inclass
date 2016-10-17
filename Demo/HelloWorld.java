public class HelloWorld
{
    public static void main(String[] args)
    {
        // I want to print out the following text:
        //      / \ // \\ /// \\\
        System.out.println("/ \\ // \\\\ /// \\\\\\");
        System.out.println();
        /*
        This is one line
        and here is another
         * 
         * pooblic static void Main(Sterrring[] agrs);
         */
        System.out.println("This program produces"); 
        System.out.println("four lines of output");

        printWarning();
        // Really important warning
        printWarning();
        printWarning();
    }

    public static void printWarning() {
        System.out.println("This product causes diabetes");
        System.out.println("in lab rats and humans."); 
    }
}