public class max_min_array {
    public static void main(String[] args) {
        int arr[]={1,6,3,9,5,2,8};

        /*int min_value=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(min_value>arr[i])
            {
                min_value=arr[i];
            }
        }
        System.out.println(min_value);*/

        int max_value=0;

        for(int i=0;i<arr.length;i++)
        {
            if(max_value<arr[i])
            {
                max_value=arr[i];
            }
        }
        System.out.println(max_value);
    }
}
