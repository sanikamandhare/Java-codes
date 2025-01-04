import java.util.Scanner;

class TwoDimensionalImplementationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
