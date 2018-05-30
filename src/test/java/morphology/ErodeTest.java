package morphology;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ErodeTest {
    @Test
    void useCaseTest() {
        int[] input = new int[13 * 13];
        Arrays.fill(input, 255);
        input[19] = 0;

        int[] expectedOutput = new int[13 * 13];
        Arrays.fill(expectedOutput, 1);

        for (int i = 0; i < 13; ++i) {
            for (int j = 0; j < 13; ++j) {
                if ((i + 1 <= 3 && i - 1 >= -1) && (j + 1 <= 8 && j - 1 >= 4)) {
                    expectedOutput[i * 13 + j] = 0;
                    continue;
                }
                if ((i != 0 && i != 12) && (j != 0 && j != 12))
                    continue;
                expectedOutput[i * 13 + j] = 0;
            }
        }
        BufferedImage img = new BufferedImage(13, 13,
                                              BufferedImage.TYPE_BYTE_BINARY);
        img.getRaster().setPixels(0, 0, 13, 13, input);

        Erode erosion = new Erode(1, 1, 1, 1, 1, 1, 1, 1, 1);
        img = erosion.apply(img);
        int[] output = new int[13 * 13];
        img.getRaster().getPixels(0, 0, 13, 13, output);
        assertTrue(Arrays.equals(output, expectedOutput));
    }

}
