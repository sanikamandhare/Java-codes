
import java.util.Arrays;


class arr_method{
    void array_list()
    {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }
}

class array_creation{
    public static void main(String[] args) {
        arr_method obj=new arr_method();

        obj.array_list();
    }
}
