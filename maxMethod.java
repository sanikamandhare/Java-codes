
public class maxMethod {

    static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }   
        else
        {
            return b; 
        }
    }

    static float max(float a,float b)
    {
        if(a>b)
        {
            return a;
        }   
        else
        {
            return b; 
        }
    }

    static int max(int a,int b,int c)
    {
        if(a>b&&a>c)
        {
            return a;
        }   
        else if (b>c)
        {
            return b; 
        }
        else
        {
            return c;
        }
    }

    public static void main(String[] args) {
       
        System.out.println(max(10,15,90));
    }
}
