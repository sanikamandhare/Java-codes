
import java.util.Arrays;



class multi_arr
{
    void multidimentional_array(){

        int arr[][]={{12,13},{54,32},{37,88}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println("the length of array is: "+arr.length);
    }
}


public class multi_dimentional {
    public static void main(String[] args) {
        multi_arr obj=new multi_arr();
        obj.multidimentional_array();
    }
}
