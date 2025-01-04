
import java.util.Scanner;

public class triplet_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length: ");
        int n=sc.nextInt();

        System.out.println("enter elements: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target num: ");
        int target_num=sc.nextInt();
        
        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int result=arr[i]+arr[j];
                for(int k=j+1;k<n;k++)
                {
                    if(result+arr[k]==target_num)
                    {
                        ans++;
                    }
                }
            }
        }
        System.out.println("the answer is :"+ans);

    }
}
