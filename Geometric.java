
import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter starting term: ");
        int a =sc.nextInt();

        System.out.println("enter common ratio : ");
        int r =sc.nextInt();

        System.out.println("enter number of term: ");
        int n =sc.nextInt();
        int term=a;

        for (int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*r;
        }    
        }
    }