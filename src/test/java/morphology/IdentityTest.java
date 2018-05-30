package morphology;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class IdentityTest {
    @Test
    void applyTest() {
        int[] input = new int[13 * 13];
        Arrays.fill(input, 255);
        input[19] = 0;

        BufferedImage img = new BufferedImage(13, 13,
                                              BufferedImage.TYPE_BYTE_BINARY);
        img.getRaster().setPixels(0, 0, 13, 13, input);

        int[] output = new int[13 * 13];
        BaseMorphology identity = new Identity();
        BufferedImage outImg = identity.apply(img);
        outImg.getData().getPixels(0, 0, 13, 13, output);
        int[] expected = new int[13 * 13];
        img.getData().getPixels(0, 0, 13, 13, expected);
        assertAll("Images", () -> assertTrue(Arrays.equals(expected, output)),
                  () -> assertEquals(outImg.getType(), img.getType()));
    }
}
