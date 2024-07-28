public class FinallyDemo {

    static void meth1() throws java.lang.Exception {
        try {
            throw new java.lang.Exception();
        } 
        finally {
            System.out.println("final statement");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        meth1();
    }
}
