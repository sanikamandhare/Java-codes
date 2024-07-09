import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string name: ");
        String name = sc.nextLine();

        if(name.matches("[01]+")) {
            System.out.println("Binary radix=2");
        } else if(name.matches("[0-7]+")) {
            System.out.println("Octal radix=8");
        } else if(name.matches("[0-9]+")) {
            System.out.println("Decimal radix=10");
        } else if(name.matches("[0-9A-Fa-f]+")) {
            System.out.println("Hexadecimal radix=16");
        } else {
            System.out.println("NAN");
        }
    }
}
