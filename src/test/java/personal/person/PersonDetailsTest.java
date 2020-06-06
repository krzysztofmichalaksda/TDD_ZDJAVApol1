package personal.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDetailsTest {

    @Test
    void checkAgeChildMin() {
        PersonDetails person = new PersonDetails("Janek", "Nowak", 1);
        String expected = "Dziecko";
        assertEquals(expected, person.checkAge());
    }

    @Test
    void checkAgeChildMax() {
        PersonDetails person = new PersonDetails("Janek", "Nowak", 9);
        String expected = "Dziecko";
        assertEquals(expected, person.checkAge());
    }

    @Test
    void checkAgeTeanMin() {
        PersonDetails person = new PersonDetails("Jan", "Nowak", 11);
        String expected = "Nastolatek";
        assertEquals(expected, person.checkAge());
    }

    @Test
    void checkAgeTeanMax() {
        PersonDetails person = new PersonDetails("Jan", "Nowak", 17);
        String expected = "Nastolatek";
        assertEquals(expected, person.checkAge());
    }

    @Test
    void checkAgeAdult() {
        PersonDetails person = new PersonDetails("Janusz", "Nowak", 18);
        String expected = "Dorosły";
        assertEquals(expected, person.checkAge());
    }
}