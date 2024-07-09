public class DeletingArray {
    public static void main(String[] args) {
        int A[] = {5, 9, 6, 10, 12, 7, 0, 0, 0, 0}; 
        int n = 6; 

        
        for (int i = 0; i < n; i++) {
            if (A[i] == 9) { 
                for (int j = i; j < n - 1; j++) {
                    A[j] = A[j + 1];
                }
                A[n - 1] = 0; 
                n--; 
                break;
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
