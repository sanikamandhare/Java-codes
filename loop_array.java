

public class loop_array {
    public static void main(String[] args) {
        int arr[][]={{10,20},{30,60}};

        /*for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }*/

        //for multidimentional

        /*for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++){
                System.out.println(arr[i][j]);
            }
        }*/

        /*for(int array:arr)
        {
            System.out.println(array);
        }*/

        int n=0;
        while(n<2)
        {
            int m=0;
            while(m<2)
            {
                System.out.println(arr[n][m]);
                m++;
            }
           n++;
        
        }
    }
}
