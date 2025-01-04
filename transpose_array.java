public class transpose_array {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[i].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                
            }
            
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();

    }
}
}