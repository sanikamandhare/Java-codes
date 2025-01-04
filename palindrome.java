import java.util.Scanner;

public class palindrome{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        String input_string=sc.nextLine();

        String cleaned_string=input_string.replaceAll("\\s+","").toLowerCase();

        String reversed_string=new StringBuilder(cleaned_string).reverse().toString();

        if(input_string.equals(reversed_string))
        {
            System.out.println("it is palindrome");

        }
        else{
            System.out.println("it is not palindrome");
        }

        sc.close();
        }
}