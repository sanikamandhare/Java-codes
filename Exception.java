public class Exception {
    public static void main(String[] args) {
        int a,b,c;
        try
        {
        a=10;
        b=0;
        c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero"+e);
        }
        
        System.out.println("End of program");
        System.out.println("Bye");
    }
}
