
import java.util.Scanner;

public class areaMethod {

    static double  area(double  l,double  b)
    {
        double a=l*b;
        return a;
    }

    static double  area(double r)
    {
        double a=Math.PI*r*r;
        return a;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lenght for rectangle: ");
        double lenght=sc.nextDouble();
        System.out.println("enter breadth: ");
        double breadth=sc.nextDouble();

        System.out.println("The area of rectangle is: "+area(lenght,breadth));

        System.out.println("Enter radius for circle: ");
        double radius=sc.nextDouble();

        System.out.println("Enter area of circle: "+ area(radius));
    }
}
