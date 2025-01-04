public class without_space_rotation {
    
    public static void reverse_method(int arr[],int start,int end) {
        
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int k=7;

        k=k%arr.length;

        reverse_method(arr, 0, arr.length-1);

        reverse_method(arr, 0, k-1);

        reverse_method(arr, k, arr.length-k);

        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
