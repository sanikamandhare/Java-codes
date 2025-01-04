import java.util.Scanner;

public class reverse_digits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int reverse_num=0;

        while(n>0){
            reverse_num=reverse_num*10+n%10;
            n=n/10;
        }
        System.out.println("the reverse digits are:"+reverse_num);
        sc.close();
    }
}
