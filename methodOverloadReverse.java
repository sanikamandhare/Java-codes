
import java.util.Scanner;

public class methodOverloadReverse {

    static int reverseNumber(int n)
    {

    int rev=0;
    {
        while(n!=0)
         {
            int r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        return (rev);
    }
    
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The reverse number is"+" "+reverseNumber(n));
        sc.close();
    }

}
