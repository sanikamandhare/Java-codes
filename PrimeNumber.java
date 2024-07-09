
import java.util.Scanner;

public class PrimeNumber {
    
    static boolean isPrime(int n)
    {
        if(n<=2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.err.println(isPrime(num));
        sc.close();
    }
}
