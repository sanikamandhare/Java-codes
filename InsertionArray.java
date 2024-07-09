public class InsertionArray {
    public static void main(String[] args) {
        
        int A[]= new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;

        int a=15;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]==6)
            {
                A[2]=a;
                for(i=A[2];i<A.length;i++)
                {
                    A[i]=A[i-1];
                }
            }
        }
        for(int x:A)
        {
            System.out.print(x+" ");
        }

    }
}
