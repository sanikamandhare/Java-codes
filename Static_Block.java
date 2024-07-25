class My {
    static int s;

    static {
        System.out.println("Block 1");
        s = 10;
    }

    static {
        System.out.println("Block 2");
    }

    My() {
        System.out.println("Constructor");
    }
}

public class Static_Block {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        My m = new My();
        System.out.println("Main method ends");
    }
}

