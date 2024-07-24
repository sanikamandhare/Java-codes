abstract class My
{
    abstract void Display();
}

class outer
{
    public void meth()
    {
        My m=new My() 
        {
            public void Display()
            {
                System.out.println("Hello");
            }
        };
        m.Display();
    }
}

public class Anonymous {
    public static void main(String[] args) {
        outer o=new outer();
        o.meth();
    }
}
