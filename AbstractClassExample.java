
abstract class Example
{
    public void meth1()
    {
        System.out.println("hello meth1");
    }
    abstract public void meth2();

}

class Example1 extends Example
{
    @Override
    public void meth2()
    {
        System.out.println("hello meth2");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Example e=new Example1();
        e.meth1();
        e.meth2();
    }
}
