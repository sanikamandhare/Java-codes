import java.util.Scanner;

public class query_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={1,2,5,4,2};

        int frequency_arr[]=new int [100005];

        for(int i=0;i<arr.length;i++)
        {
            frequency_arr[arr[i]]++;
        }

        System.out.println("enter queries: ");
        int q=sc.nextInt();

        while(q>0)
        {
            System.out.println("enter number to be searched: ");
            int x=sc.nextInt();

            if(frequency_arr[x]>0)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
        
    }
}
