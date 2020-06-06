package geometry.polygons;

public class Trapez {
    int baseA;
    int height;
    int baseB;

    public Trapez(int baseA, int baseB, int height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double getArea() {

        return (baseA + baseB) / 2.0 * height;
    }
}
