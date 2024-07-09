import java.lang.*;
import java.util.Scanner;

class SumTwoNumber {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
         int a,b,c;
         System.out.println("Enter two number: ");
         a=s.nextInt();
         b=s.nextInt();
         c=a+b;
         System.out.println("Sum of two numbers: "+c);

         s.close();
    }
}
