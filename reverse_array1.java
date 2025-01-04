public class reverse_array1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int reversed_elements[]= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            reversed_elements[i]=arr[arr.length-1-i];
            System.out.print(reversed_elements[i]+" ");
        }

        

    }
}
