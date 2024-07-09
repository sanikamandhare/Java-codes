import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of maths: ");
        int maths=sc.nextInt();
        System.out.println("Enter marks of Science: ");
        int Science=sc.nextInt();
        System.out.println("Enter marks of English: ");
        int English=sc.nextInt();

        int Total=maths+Science+English;

        float avg=Total%3f;

        if(avg>=70)
        {
            System.out.println("A Grade");
        }
        else if(avg<=60 &&avg<70)
        {
            System.out.println("B Grade");
        }
        else if(avg<=50 && avg<70)
        {
            System.out.println("C Grade");
        }
        if(avg<=40 && avg<60)
        {
            System.out.println("D Grade");
        }
        if(avg<40)
        {
            System.out.println("F Grade");
        }

        sc.close();

    }
}
