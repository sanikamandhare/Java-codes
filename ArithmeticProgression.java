
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter starting term: ");
        int a=sc.nextInt();

        System.out.println("Enter the distance: ");
        int d=sc.nextInt();

        System.out.println("Enter how many terms in series: ");
        int n=sc.nextInt();
        int term=a;

        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }
    }
}