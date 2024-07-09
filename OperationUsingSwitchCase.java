
import java.util.Scanner;

class OperationUsingSwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic Operations : ");

        System.out.println("__MENU__");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter two number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        sc.nextLine();

        System.out.println("Select operation: ");
        String operation=sc.nextLine();
        operation=operation.toUpperCase();

        switch(operation)
        {
            case "ADD":System.out.println("The sum of two numbers is: "+(x+y));
            break;
            case "SUB":System.out.println("The difference of two numbers is: "+(x-y));
            break;
            case "MUL":System.out.println("The product of two numbers is: "+(x*y));
            break;
            case "DIV":System.out.println("The division of two numbers is: "+(x/y));
            break;
            default:System.out.println("Invalid");
            break;
        }

    }
}