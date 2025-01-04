public class rotate_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int cyclic_array[]=new int[arr.length];

        cyclic_array[0]=arr[arr.length-1];


        for(int i=1;i<arr.length;i++)
        {
            cyclic_array[i]=arr[i-1];
        }

        for(int num:cyclic_array)
        {
            System.out.print(num+" ");
        }
    }
}
