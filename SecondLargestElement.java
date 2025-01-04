import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {-1, -1, -2, -3, -5, -2};

        Arrays.sort(arr);
        int kth_num = 3;
        int count = 1;
        int smallest = arr[arr.length - 1];
        int smallest_num = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != smallest) {
                smallest = arr[i];
                count++;
                if (count == kth_num) {
                    smallest_num = arr[i];
                    break;
                }
            }
        }
        System.out.println(smallest_num);
    }
}
