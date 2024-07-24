class outerClass {
    void Display() {
        class innerClass {
            void innerDisplay() {
                System.out.println("Hello");
            }
        }
        innerClass i = new innerClass();
        i.innerDisplay();
    }
}

public class Local_inner {
    public static void main(String[] args) {
        outerClass o = new outerClass();
        o.Display();
    }
}