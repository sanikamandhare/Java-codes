public class square_arrayProblem {
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};

        int ans[]=new int[arr.length];
        int k=arr.length-1;

        int left=0, right=arr.length-1;

        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[k]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k]=arr[right]*arr[right];
                right--;
            }
            k--;
        }

       

        for(int sum:ans)
        {
            System.out.print(sum+" ");
        }

    }
}
