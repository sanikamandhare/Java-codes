class filter_zero_one{

    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,0};

        int zeroes=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zeroes++;
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(zeroes>j)
            {
                arr[j]=0;
            }
            else{
                arr[j]=1;
            }
        }

        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
