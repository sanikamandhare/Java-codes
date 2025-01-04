public class count_num {
    public static void main(String[] args) {
        int arr[]={24,7,5,9,8,3};

        int num_elements=0;
        int target_element=5;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>target_element)
            {
                num_elements=num_elements+1;
            }
        }
        System.out.println(num_elements);
    }
}
