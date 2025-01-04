public class MultiplyTwoD {
    public static void main(String[] args) {
        int arr_1[][] = new int[2][3];
        arr_1[0][0] = 1;
        arr_1[0][1] = 2;
        arr_1[0][2] = 3;
        arr_1[1][0] = 4;
        arr_1[1][1] = 5;
        arr_1[1][2] = 6;

        System.out.println("The first array is: ");
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1[i].length; j++) {
                System.out.print(arr_1[i][j] + " ");
            }
            System.out.println();
        }

        int arr_2[][] = new int[3][2];
        arr_2[0][0] = 5;
        arr_2[0][1] = 6;
        arr_2[1][0] = 7;
        arr_2[1][1] = 8;
        arr_2[2][0] = 9;
        arr_2[2][1] = 10;

        System.out.println("The Second array is: ");
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_2[i].length; j++) {
                System.out.print(arr_2[i][j] + " ");
            }
            System.out.println();
        }

        // Dimensions for the result matrix
        int r = arr_1.length;           // Rows of arr_1
        int c = arr_2[0].length;        // Columns of arr_2
        int[][] mul = new int[r][c];    // Result matrix (2x2)

        // Multiplication Logic
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                for (int k = 0; k < arr_1[0].length; k++) { // Fixed iteration over common dimension
                    mul[i][j] += arr_1[i][k] * arr_2[k][j];
                }
            }
        }

        System.out.println("Multiplication of array is: ");
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
