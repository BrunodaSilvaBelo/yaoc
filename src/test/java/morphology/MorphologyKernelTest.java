package morphology;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.image.BufferedImage;

import org.junit.jupiter.api.Test;

public class MorphologyKernelTest {
    @Test
    void assertionTest() {
        BufferedImage gray = new BufferedImage(1, 1,
                                               BufferedImage.TYPE_BYTE_GRAY);
        BufferedImage rgb = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        BufferedImage binary = new BufferedImage(1, 1,
                                                 BufferedImage.TYPE_BYTE_BINARY);

        Erode erosion = new Erode();
        assertAll("Types of images",
                  () -> assertThrows(AssertionError.class,
                                     () -> erosion.apply(gray)),
                  () -> assertThrows(AssertionError.class,
                                     () -> erosion.apply(rgb)),
                  () -> erosion.apply(binary));
    }

}
