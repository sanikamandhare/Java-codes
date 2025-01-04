
import java.util.Arrays;

public class ClonningArray {
    // Method to print array elements
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 2, 9};

        System.out.println("The original array is:");
        printArray(arr); // Print original array

        // Cloning the array
        int arr_2[] = Arrays.copyOf(arr,4);

        System.out.println("The copied array is:");
        printArray(arr_2); // Print cloned array
    }
}
