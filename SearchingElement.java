public class SearchingElement {
    public static void main(String[] args) {
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key=12;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {
                System.out.println("the element is: "+A[i]);
            }
        }
    }
}
