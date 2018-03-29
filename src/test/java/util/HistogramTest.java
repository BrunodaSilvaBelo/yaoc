package util;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HistogramTest {

    @Test
    void creation() {
        assertAll("Ilegals constructors",
                  () -> assertThrows(AssertionError.class,
                                     () -> new Histogram(0)),
                  () -> assertThrows(AssertionError.class,
                                     () -> new Histogram(Integer.MIN_VALUE)));

        Histogram max = new Histogram(Integer.MAX_VALUE / 10);
        assertEquals(max.get(0), 0);

        int[] values = { 99, 97, 94, 88, 84, 81, 80, 77, 71, 25 };
        Histogram hist = new Histogram(values, 10, 10);
        assertAll("Values from array upon constructor",
                  () -> assertEquals(hist.get(2), 1),
                  () -> assertEquals(hist.get(7), 2),
                  () -> assertEquals(hist.get(8), 4),
                  () -> assertEquals(hist.get(9), 3));

        List<Integer> values2 = Arrays.asList(99, 97, 94, 88, 84, 81, 80, 77,
                                              71, 25);
        Histogram hist2 = new Histogram(values2, 10, 10);
        assertAll("Values from list upon constructor",
                  () -> assertEquals(hist2.get(2), 1),
                  () -> assertEquals(hist2.get(7), 2),
                  () -> assertEquals(hist2.get(8), 4),
                  () -> assertEquals(hist2.get(9), 3));

        int[] values3 = { 0, 0, 1, 2, 3, 9 };
        Histogram hist3 = new Histogram(values3, 10);
        assertAll("Values from array with default width",
                  () -> assertEquals(hist3.get(0), 2),
                  () -> assertEquals(hist3.get(1), 1),
                  () -> assertEquals(hist3.get(2), 1),
                  () -> assertEquals(hist3.get(3), 1),
                  () -> assertEquals(hist3.get(9), 1));

        List<Integer> values4 = Arrays.asList(0, 0, 1, 2, 3, 9);
        Histogram hist4 = new Histogram(values4, 10);
        assertAll("Values from list with default width",
                  () -> assertEquals(hist4.get(0), 2),
                  () -> assertEquals(hist4.get(1), 1),
                  () -> assertEquals(hist4.get(2), 1),
                  () -> assertEquals(hist4.get(3), 1),
                  () -> assertEquals(hist4.get(9), 1));
    }

    @Test
    void getting() {
        Histogram hist = new Histogram(2, 5);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> hist.get(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> hist.get(2));
        assertEquals(hist.get(0), 0);
    }

    @Test
    void offseting() throws NoSuchFieldException, SecurityException,
                     IllegalArgumentException, IllegalAccessException {
        List<Integer> values = Arrays.asList(99, 97, 94, 88, 84, 81, 80, 77, 71,
                                             25);
        Histogram hist = new Histogram(values, 10, 10);
        Field field = hist.getClass().getDeclaredField("offset");
        field.setAccessible(true);
        assertAll("Checking conditions to initial histogram",
                  () -> assertEquals(field.get(hist), 0),
                  () -> assertEquals(hist.get(2), 1));

        hist.setOffset(3);
        assertAll("Checking conditions after change",
                  () -> assertEquals(hist.get(2), 0),
                  () -> assertEquals(field.get(hist), 3));
    }

    @Test
    void putting() {
        Histogram hist = new Histogram(10, 10);
        int[] values = { 99, 97, 94, 88, 84, 81, 80, 77, 71, 25 };

        Arrays.stream(values).forEach(value -> hist.put(value));
        assertAll("Values from put", () -> assertEquals(hist.get(2), 1),
                  () -> assertEquals(hist.get(7), 2),
                  () -> assertEquals(hist.get(8), 4),
                  () -> assertEquals(hist.get(9), 3));
        assertAll("Ilegals values",
                  () -> assertThrows(ArrayIndexOutOfBoundsException.class,
                                     () -> hist.put(100)),
                  () -> assertThrows(ArrayIndexOutOfBoundsException.class,
                                     () -> hist.put(-1)));
    }

    @Test
    void setting() {
        Histogram hist = new Histogram(10, 10);

        int[] values = { 99, 97, 94, 88, 84, 81, 80, 77, 71, 25 };
        hist.set(values);
        assertAll("Values from array upon set",
                  () -> assertEquals(hist.get(2), 1),
                  () -> assertEquals(hist.get(7), 2),
                  () -> assertEquals(hist.get(8), 4),
                  () -> assertEquals(hist.get(9), 3));

        List<Integer> values2 = Arrays.asList(99, 97, 94, 88, 84, 81, 80, 77,
                                              71, 25);
        hist.set(values2);
        assertAll("Values from list upon set",
                  () -> assertEquals(hist.get(2), 1),
                  () -> assertEquals(hist.get(7), 2),
                  () -> assertEquals(hist.get(8), 4),
                  () -> assertEquals(hist.get(9), 3));

        int[] values3 = new int[values.length];
        Arrays.parallelSetAll(values3, (idx) -> values[idx] * -1);
        hist.set(values3);
        assertAll("Values from list upon set",
                  () -> assertEquals(hist.get(9 - 2), 1),
                  () -> assertEquals(hist.get(9 - 7), 2),
                  () -> assertEquals(hist.get(9 - 8), 4),
                  () -> assertEquals(hist.get(9 - 9), 3));
    }

    @Test
    void sizing() throws NoSuchFieldException, SecurityException,
                  IllegalArgumentException, IllegalAccessException {
        List<Integer> values = Arrays.asList(99, 97, 94, 88, 84, 81, 80, 77, 71,
                                             25);
        Histogram hist = new Histogram(values, 10, 10);
        Field field = hist.getClass().getDeclaredField("bins");
        field.setAccessible(true);
        assertAll("Checking conditions to initial histogram",
                  () -> assertEquals(((int[]) field.get(hist)).length, 10),
                  () -> assertEquals(hist.get(2), 1));

        hist.setSize(3);
        assertAll("Checking conditions after change",
                  () -> assertEquals(hist.get(2), 0),
                  () -> assertEquals(((int[]) field.get(hist)).length, 3));
    }

    @Test
    void widthing() throws NoSuchFieldException, SecurityException,
                    IllegalArgumentException, IllegalAccessException {
        List<Integer> values = Arrays.asList(99, 97, 94, 88, 84, 81, 80, 77, 71,
                                             25);
        Histogram hist = new Histogram(values, 10, 10);
        Field field = hist.getClass().getDeclaredField("width");
        field.setAccessible(true);
        assertAll("Checking conditions to initial histogram",
                  () -> assertEquals(field.getInt(hist), 10),
                  () -> assertEquals(hist.get(2), 1));

        hist.setWidth(3);
        assertAll("Checking conditions after change",
                  () -> assertEquals(hist.get(2), 0),
                  () -> assertEquals(field.getInt(hist), 3));
    }
}
