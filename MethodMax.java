public class MethodMax {
    
        static int MaxNumber(int x,int y)
        {
            if(x>y)
            {
                return x;
            }
            else
            {
                return y;
            }
        }
        public static void main(String[] args) 
        {
            int a=10;
            int b=15;

            System.out.println(MaxNumber(a, b));
        }
    
    }

