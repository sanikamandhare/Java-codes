
public class MultipleCatchBlock {
    public static void main(String[] args) {
    try
    {

    int A[]={10,0,30,40};

    try{
    int r=A[0]/A[1];
    System.out.println(r);
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }

    System.out.println(A[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}

}
}
