
import java.util.Scanner;

public class array_sum_query {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size: ");
        int n=sc.nextInt();

        System.out.println("enter array elements: ");
        int arr[]=new int [n+1];

        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        arr[1]=arr[1];
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }

        System.out.println("Enter the number of queries to be performed: ");
        int q=sc.nextInt();

        while(q>0)
        {
            System.out.println("enter the range l and r to be sum: ");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int sum=0;
            if(l>1)
            {
                sum=arr[r]-arr[l-1];
            }
            else{
                sum=arr[r];
            }
            System.out.println("the sum of range l to r is: "+sum);

            
            q--;
        }

        




         

    }
}
