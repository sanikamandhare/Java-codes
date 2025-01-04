public class even_odd_pointer {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        int left=0,right=arr.length-1;

        while(left<right)
        {
            if(arr[left]%2!=0 && arr[right]%2==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                left--;
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2!=0)
            {
                right--;
            }
        }

        for(int num:arr)
        {
            System.out.print(num+" ");
        }


    }
}
