
import java.util.Scanner;

class Cuboid {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);

        int lenght,breadth,height;

        System.out.println("Enter the lenght : ");
        lenght=sc.nextInt();
        
        System.out.println("Enter the breadth: ");
        breadth=sc.nextInt();

        System.out.println("Enter the height : ");
        height=sc.nextInt();

        int areaOfFront= lenght*height;

        int areaOfBack= lenght*height;

        int areaOfRight= breadth*height;

        int areaOfLeft= breadth*height;
    
        int areaOfTop= lenght*breadth;

        int areaOfBottom= lenght*breadth;

        int Volume=lenght*breadth*height;
        System.out.println("The volume of cuboid is :"+Volume);

        int TotalArea = areaOfFront+areaOfBack+areaOfRight+areaOfLeft+areaOfTop+areaOfBottom;
        System.out.println("The toatal area is: "+TotalArea);

        sc.close();

    }
}
