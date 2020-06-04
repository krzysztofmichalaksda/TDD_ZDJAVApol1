package calc.arithmetic;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    void addTest() {
        int expected = 33;
        int a = 11;
        int b = 22;
        int actual = a + b;
        assertEquals(expected, actual);
    }

    @Test
    void multiNumberResultZero() {
        double expected = 0;
        Double[] testData = {-100.0, 0.0, 100.0};
        double actual = Add.multiNumber(Arrays.asList(testData));
        assertEquals(expected, actual);
    }

    @Test
    void multiNumberResultGraterThenZero() {
        Double[] testData = {-784.5, 0.0, 100.0, 234.9, -123.3, 326462.0, 432324.2};
        double actual = Add.multiNumber(Arrays.asList(testData));
        assertThat(actual)
                .isGreaterThan(0)
                .isNotNull()
                .isNotNegative();
    }

    @Test
    void numbersIntervalSum() {
        int expected = 15;
        int first = 1;
        int second = 5;
        int actual = Add.numbersInterval(first, second);
        assertEquals(expected, actual);
    }
}