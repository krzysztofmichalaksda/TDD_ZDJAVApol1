package geometry.polygons;

public class Square {
    double base;

    public Square() {
        base = 1;
    }

    public Square(double base) {
        this.base = base;
    }

    public double getPerimeter() {
        return 4*base;
    }

    public double getArea() {
        return base*base;
    }
}
