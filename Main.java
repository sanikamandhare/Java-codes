
import java.util.Scanner;

class Algebra{
    int a;
    int b;

    Algebra(int x,int y)
    {
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }
    int sum(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        Algebra obj=new Algebra(x, y);
        System.out.println("the addition is: "+obj.add());
        System.out.println("the sub is: "+obj.sum());
        System.out.println("the mul is: "+obj.mul());

    }
}