import java.util.Scanner;

public class a_raise_b {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=1;

        for(int i=1;i<=b;i++)
        {
            result=result*a;
        }
        System.out.println("the result of a*b is: "+result);

        sc.close();
    }
}
