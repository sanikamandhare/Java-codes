
public class IncreasingSizeArray {
    public static void main(String[] args) {
        int A[] = {8, 6, 10, 9, 2};
        int newA[] = new int[2 * A.length];

        for (int i = 0; i < A.length; i++) {
            newA[i] = A[i];
        }

        
        for (int x : newA) {
            System.out.print(x + " ");
        }
    }
}
