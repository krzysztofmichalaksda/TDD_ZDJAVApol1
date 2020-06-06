package geometry.polygons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(3);
    }

    @Test
    void getPerimeter() {
        double expected = 12;
        double actual = square.getPerimeter();
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        double expectedArea = 9;
        double actualArea = square.getArea();
        assertEquals(expectedArea, actualArea);
    }
}