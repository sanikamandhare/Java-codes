
import java.util.Scanner;

class Useradix{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useRadix(2);
        System.out.println("enter the binary number: ");
        int x = sc.nextInt();
        System.out.println("The decimal number is: "+x);
        sc.close();


    }
}