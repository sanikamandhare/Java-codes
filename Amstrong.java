
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("The number is: ");
        int n=sc.nextInt();
        int r;
        int sum=0;

        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println(sum);
        int m=n;
        if (m==n)
        {
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("it is not amstrong number");
        }
    }
}
