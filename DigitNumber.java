
import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println("The digits are: "+ r);
        }
        sc.close();
    }
}
