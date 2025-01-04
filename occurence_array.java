
public class occurence_array {
    public static void main(String[] args) {
        int arr[]={2,5,1,5,8,5};

        int occurence_num=0;
        int target_element=5;
        
        for(int i=0;i<arr.length;i++)
        {
            if(target_element==arr[i])
            {
                occurence_num=occurence_num+1;
            }
        }
        System.out.print(occurence_num);
    }
}
