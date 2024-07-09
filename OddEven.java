import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();

        if(number%2==0)
        {
            System.out.println("It is even number");

        }
        else
        {
            System.out.println("it is odd number: ");
        }

        sc.close();
    }
}
