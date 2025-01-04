
import java.util.Scanner;

public class addition {
    public int add_two_numbers(int a,int b){
        int ans=a+b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        addition add=new addition();
        int result=add.add_two_numbers(10,20);
        System.out.println(result);
        
    }
}
