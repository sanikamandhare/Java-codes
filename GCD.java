
import java.util.Scanner;

public class GCD {

    static int CommonDivisor(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                n=n-m;
            }
        }
        return m;
    }
    
    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value m: ");
        m=sc.nextInt();
        System.out.println("enter value for n: ");
        n=sc.nextInt();
        System.out.println("the greatest common divisor is: "+CommonDivisor(m,n));
    }
}
