import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String input_string = sc.nextLine();

        String reversed_string=new StringBuilder(input_string).reverse().toString();

        System.out.println("the reversed string is: "+ reversed_string);

        sc.close();
    }
}
