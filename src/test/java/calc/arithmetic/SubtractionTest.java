package calc.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    @Test
    void multiNumbers() {
        double base = 10000;
        double[] costs = {100, 300, 400, 2000};
        double expected = 7200;
        double actual = Subtraction.multiNumbers(base, costs);
        assertEquals(expected, actual);
    }
}