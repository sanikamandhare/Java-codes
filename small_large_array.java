
import java.util.Arrays;

public class small_large_array {
    public static void main(String[] args) {
        int arr[]={5,8,1,3,6,2};

        Arrays.sort(arr);

        int smallest_element=0;
        int largest_element=0;
        for(int i=0;i<arr.length;i++)
        {
            smallest_element=arr[0];
            largest_element=arr[arr.length-1];
        }

        System.out.println(smallest_element+","+largest_element);


    }
}
