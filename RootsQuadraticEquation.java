import java.lang.*;
import java.util.*;

class RootsQuadraticEquation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter the value for a: ");
        a = sc.nextInt();

        System.out.println("Enter the value for b: ");
        b= sc.nextInt();

        System.out.println("Enter the value for c: ");
        c= sc.nextInt();

        double r1,r2;

        r1 = (-b+ Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The value of r1 is: "+r1);

        r2 = (-b- Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The value of r1 is: "+r2);

        sc.close();

    }
}
