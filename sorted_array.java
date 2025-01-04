
import java.util.Arrays;
import java.util.Scanner;

public class sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter lenght of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter " + n + "elements: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int sort_arr[]=arr.clone();

        Arrays.sort(sort_arr);

        if(Arrays.equals(arr, sort_arr))
        {
            System.out.println("array is sorted");
        }
        else
        {
            System.out.println("array not sorted");
        }




    }
}
