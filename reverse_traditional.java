
import java.util.Scanner;

public class reverse_traditional{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String input_string=sc.nextLine();

        String reverse_string="";

        for(int i=input_string.length()-1;i>=0;i--)
        {
            reverse_string=reverse_string+input_string.charAt(i);
        }
        System.out.println("reverse string :"+ reverse_string);
    }
}