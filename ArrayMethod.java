class ArrayMethod
{
    static int modify(int A[])
    {
        A[0]=25;
         return A[0];
        
    }
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};
        modify(A);
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }
}