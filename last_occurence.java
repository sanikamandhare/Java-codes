public class last_occurence {
    public static void main(String[] args) {
        int arr[]={5,6,5,2,5};

        int target_element=5;

        int last_occurence_index=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target_element)
            {
                last_occurence_index=i;
            }
        }
        System.out.println(last_occurence_index);
    }
}
