
abstract class AbstractShape {
    abstract public double perimeter(double radius);
    abstract public double area(double radius);
    abstract public double rectangleArea(double length, double breadth);
}

class Circle extends AbstractShape {
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public double rectangleArea(double length, double breadth) {
        throw new UnsupportedOperationException("Not applicable for Circle");
    }
}

class Rectangle extends AbstractShape {
    @Override
    public double area(double radius) {
        throw new UnsupportedOperationException("Not applicable for Rectangle");
    }

    @Override
    public double perimeter(double radius) {
        throw new UnsupportedOperationException("Not applicable for Rectangle");
    }

    @Override
    public double rectangleArea(double length, double breadth) {
        return length * breadth;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        AbstractShape a = new Circle();
        System.out.println("Circle Area: " + a.area(10));
        System.out.println("Circle Perimeter: " + a.perimeter(15));

        AbstractShape b = new Rectangle();
        System.out.println("Rectangle Area: " + b.rectangleArea(10, 15));
    }
}

