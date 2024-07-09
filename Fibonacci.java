
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 0th term: ");
        int a=sc.nextInt();

        System.out.println("enter 1st term: ");
        int b=sc.nextInt();

        System.out.println("enter th number of series: ");
        int n=sc.nextInt();

        int c;
        System.out.print(a+","+b+",");

        for (int i=0;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
         }
    }
}
