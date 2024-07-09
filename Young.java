
import java.util.Scanner;

public class Young {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter an Age: ");
        int Age=sc.nextInt();

        if(Age>=14)
        {
            System.out.println("Person is Adult");
        }
        else
        {
            System.out.println("Person is younger");
        }

    }
}
