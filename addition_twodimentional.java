

public class addition_twodimentional {
    public static void main(String[] args) {
        int arr_1[][]=new int[2][2];
        arr_1[0][0]=1;
        arr_1[0][1]=2;
        arr_1[1][0]=3;
        arr_1[1][1]=4;

        System.out.println("The first array is: ");
        for(int i=0;i<arr_1.length;i++)
        {
            for(int j=0;j<arr_1[i].length;j++)
            {
                System.out.print(arr_1[i][j]+" ");
            }
            System.out.println();
        }

        int arr_2[][]=new int[2][2];
        arr_2[0][0]=5;
        arr_2[0][1]=6;
        arr_2[1][0]=7;
        arr_2[1][1]=8;

        System.out.println("The Second array is: ");
        for(int i=0;i<arr_2.length;i++)
        {
            for(int j=0;j<arr_2[i].length;j++)
            {
                System.out.print(arr_2[i][j]+" ");
            }
            System.out.println();
        }


        int sum[][]=new int[2][2];



        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[i].length;j++)
            {
                
                sum[i][j]=arr_1[i][j]+arr_2[i][j];
            }
        }

        System.out.println("The sum of first and second array is: ");

        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[i].length;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    
}
