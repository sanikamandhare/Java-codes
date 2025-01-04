public class firstRepeatingElement {
    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3};

        int ans=-1;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ans=arr[i];
                    break;
                }
            }
            
        }
        System.out.println(ans);
    }
}
