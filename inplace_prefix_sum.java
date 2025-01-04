public class inplace_prefix_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        arr[0]=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }

        for(int print_array:arr)
        {
            System.out.print(print_array+" ");
        }
    }
}
