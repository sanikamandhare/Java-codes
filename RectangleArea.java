class DataHiding {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        if (l > 0) {
            length = l;
        } else {
            length = 0;
        }
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        if (b > 0) {
            breadth = b;
        } else {
            breadth = 0;
        }
    }

    public int area() {
        return length * breadth;
    }
}

class RectangleArea {
    public static void main(String[] args) {
        DataHiding d = new DataHiding();
        d.setLength(10);
        d.setBreadth(20);
        System.out.println("The area of the rectangle is: " + d.area());
    }
}
