class RotationArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=7;

        k=  k % arr.length;

        int rotate_array[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int new_index=(i+k)%arr.length;
            rotate_array[new_index]=arr[i];
        }

        for(int num:rotate_array)
        {
            System.out.print(num+" ");
        }

    }
}