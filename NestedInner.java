class outerClass
{
    int x=10;
    class innerClass
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    public void outerDisplay()
    {
        innerClass i=new innerClass();
        i.innerDisplay();
    }
}

public class NestedInner {
    public static void main(String[] args) 
    {
        outerClass o =new outerClass();
        o.outerDisplay();
    }
}
