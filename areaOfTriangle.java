import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the base for triangle:");
        float base=sc.nextFloat();

        System.out.println("Enter height for triangle:");
        float height=sc.nextFloat();

        float area = (0.5f)*base*height;
        System.out.println("The Area of Triangle is "+area);

        sc.close();
        
    }
}
