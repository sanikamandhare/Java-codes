import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        String str="";

        while (n>0) 
        { 
         int r=n%10;
         n=n/10;  
         str=str+r;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.print("Zero ");
                break;
                case '1':System.out.print("one ");
                break;
                case '2':System.out.print("two ");
                break;

            }
        }
    }
}
