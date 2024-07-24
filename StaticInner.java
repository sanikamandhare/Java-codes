class outer{
    static  int x=15;

    static class innerClass{
        void Display()
        {
            System.out.println(x);
        }
    }
}

public class StaticInner {
    public static void main(String[] args)
    {
        outer.innerClass oi=new outer.innerClass();
        oi.Display();
    }
}
