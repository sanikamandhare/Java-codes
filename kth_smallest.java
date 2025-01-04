public class kth_smallest {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4};

        int k_num=2;

        int second_smallest=-1;
        int count=1;
        int smallest=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=smallest)
            {
                count++;
                if(k_num==count)
                {
                    second_smallest=arr[i];
                }
            }
        }
        System.out.println(second_smallest);

    }
}
