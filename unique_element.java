

public class unique_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1,3};

      /*   Arrays.sort(arr);
        int unique_num=-1;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                unique_num=arr[i];
            }
        }
        System.out.println(unique_num);*/

        int unique_num=0;

        for(int element:arr)
        {
            unique_num^=element;
        }
        System.out.println(unique_num);
    }

}
