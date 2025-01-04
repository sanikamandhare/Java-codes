public class reverse_arr_loop {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int arr_2[]=new int[arr.length];

        for(int i=0;i<arr_2.length;i++)
        {
            arr_2[i]=arr[arr.length-1-i];
        }

        for(int i=0;i<arr_2.length;i++)
        {
            System.out.print(arr_2[i]+" ");
        }

    }
}
