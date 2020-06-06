package geometry.polygons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TrapezTest {

    Trapez trapez;

    @BeforeEach
    void setUp() {
        trapez = new Trapez(6,4, 3);
    }

    @Test
    void getArea() {
        double expected = 15;
        double actual = trapez.getArea();
        assertThat(actual).isEqualTo(expected);
    }
}