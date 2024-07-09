public class Print2DArray {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4},
            {2, 4, 6, 8},
            {9, 4, 3, 7}
        };

        for (int i = 0; i < A[i].length; i++) 
        { 
            for (int j = 0; j < A[i].length; j++)
             { 
                System.out.print(A[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
