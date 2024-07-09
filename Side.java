import java.lang.*;
import java.util.*;

class Side {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter the value for side a : ");
        a= sc.nextInt();

        System.out.println("Enter the value for side b : ");
        b= sc.nextInt();

        System.out.println("Enter the value for side c : ");
        c= sc.nextInt();

        float side;
        double area;

        side = (a+b+c)/2f;
        System.out.println("Enter the value of side : "+ side);

        area = Math.sqrt(side*(side-a)*(side-b)*(side-c));
        System.out.println("The area of sides are : "+area);


    }
}
