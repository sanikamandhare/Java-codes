import java.util.Arrays;
public class kth_largest {
    public static void main(String[] args) {
        int arr[]={1,1,4,9,6,2};

        Arrays.sort(arr);

        int k_value=3;

        int largest_number=arr[arr.length-1];

        int third_largest=-1;

        int count=1;

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=largest_number)
            {
                count++;
                if(count==k_value)
                {
                    third_largest=arr[i];
                    break;
                }
            }
        }
        System.out.println(third_largest);
    }
}
