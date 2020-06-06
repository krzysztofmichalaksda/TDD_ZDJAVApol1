package calc.arithmetic;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Rozpoczynam testowanie!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("### Rozpoczynam kolejny test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("### Zakończyłem test!");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Testowanie zakończone");
    }

    @Test
    @DisplayName("Test nr 1 - dodawanie liczb z wynikiem 0")
    void multiNumberResultZero() {
        System.out.println("Test 1");
        double expected = 0;
        Double[] testData = {-100.0, 0.0, 100.0};
        double actual = Add.multiNumber(Arrays.asList(testData));
        assertEquals(expected, actual);
    }

    @Test
    void multiNumberResultGraterThenZero() {
        System.out.println("Test 2");
        Double[] testData = {-784.5, 0.0, 100.0, 234.9, -123.3, 326462.0, 432324.2};
        double actual = Add.multiNumber(Arrays.asList(testData));
        assertThat(actual)
                .isGreaterThan(100)
                .isNotNull()
                .isNotNegative();
    }

    @Test
    void numbersIntervalSum() {
        System.out.println("Test 3");
        int expected = 15;
        int first = 1;
        int second = 5;
        int actual = Add.numbersInterval(first, second);
        assertEquals(expected, actual, "### Test fail !!! @@@");
    }
}