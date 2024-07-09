
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int rev=0;
        int m=n;

        while (n>0) 
        { 
            int r=n%10;
            rev=rev*10+r;
            n= n / 10;
            
        }
        System.out.println("The reverse number is " + rev);
        if(rev==m)
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }

    }
}
