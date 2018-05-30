package morphology;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BaseMorphologyTest {
    @Test
    void compositionTest() {
        int[] input = new int[13 * 13];
        Arrays.fill(input, 255);
        input[19] = 0;

        BufferedImage img = new BufferedImage(13, 13,
                                              BufferedImage.TYPE_BYTE_BINARY);
        img.getRaster().setPixels(0, 0, 13, 13, input);

        Erode erosion = new Erode(1, 1, 1, 1, 1, 1, 1, 1, 1);

        int[] a = new int[13 * 13];
        erosion.apply(erosion.apply(img)).getData().getPixels(0, 0, 13, 13, a);
        int[] b = new int[13 * 13];
        BaseMorphology.reduce(erosion, erosion).apply(img).getData()
                      .getPixels(0, 0, 13, 13, b);

        assertTrue(Arrays.equals(a, b));
    }
}
