
import java.util.Scanner;


public class count_Digit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int number_of_digits=0;

        while(n>0)
        {
            n=n/10;
            number_of_digits++;
        }
        System.out.println("Number of digits = "+number_of_digits);
        sc.close();
    }
}