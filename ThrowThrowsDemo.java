class NegativeDimentionException extends java.lang.Exception
{
    @Override
    public String toString()
    {
        return "Dimention cannot be negative";
    }
}


public class ThrowThrowsDemo
{
    static int area(int l,int b) throws NegativeDimentionException
    {
        if(l<0||b<0)
            throw new NegativeDimentionException();
        return l*b;
    }

    static void meth1() throws NegativeDimentionException
    {
        System.out.println("Area is: "+area(-10, 20));
    }
    public static void main(String[] args)
    {
        try{
        meth1();
        }
        catch(NegativeDimentionException e)
        {
            System.out.println(e);
        }
    }
}