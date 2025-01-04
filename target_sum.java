
import java.util.Scanner;

class operation{
    static int pair_sum(int arr[],int target)
    {
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}

public class target_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n=sc.nextInt();

        System.out.println("Enter elements: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target sum: ");
        int target=sc.nextInt();


       System.out.println(operation.pair_sum(arr,target));


        
    }
}
