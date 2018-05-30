package morphology;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class KernelTest {
    @Test
    void assertionTest() {
        assertAll("Illegals contructors",
                  () -> assertThrows(AssertionError.class,
                                     () -> new Erode(1, 1)),
                  () -> assertThrows(AssertionError.class,
                                     () -> new Erode(1, 2, 3)),
                  () -> assertThrows(AssertionError.class,
                                     () -> new Erode(3, 3, 3, 3, 3)),
                  () -> assertThrows(AssertionError.class,
                                     () -> new Erode(4, 4, 4, 4, 4, 4)));
    }
}
