import java.util.Scanner;

class spiral_matrix{

    static void printArray(int arr[][])
    {
        for(int[] num:arr)
        {
            for(int array:num)
            {
                System.out.print(array+" ");
            }
            System.out.println();
        }

    }

    static void spiral_matrix_array(int arr[][],int r,int c)
    {
        int toprow=0, bottomRow=r-1,leftColumn=0,rightColumn=c-1;

        int totalElements=0;
        while(totalElements<r*c)
        {
            for(int j=leftColumn;j<=rightColumn && totalElements<r*c;j++)
            {
                System.out.print(arr[toprow][j]+" ");
                totalElements++;
            }
            toprow++;

            for(int i=toprow;i<=bottomRow && totalElements<r*c;i++)
            {
                System.out.print(arr[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;

            for(int j=rightColumn;j>=leftColumn && totalElements<r*c;j--)
            {
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            for(int i=bottomRow;i>=toprow && totalElements<r*c;i--)
            {
                System.out.print(arr[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;

        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of rows in array: ");
        int r=sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("the 2D array is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);

        System.out.println("the spiral order is: ");
        spiral_matrix_array(arr, r, c);


    }
}