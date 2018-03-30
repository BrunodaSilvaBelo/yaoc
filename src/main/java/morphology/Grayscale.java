package morphology;

import java.awt.image.BufferedImage;

import util.RGBPixel;

public class Grayscale implements BaseMorphology {

    @Override
    public BufferedImage apply(BufferedImage img) {
        int[] pixels = new int[img.getWidth() * img.getHeight()];
        int width = img.getWidth();
        int height = img.getHeight();
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                int pixel = img.getRGB(i, j);
                pixels[j * img.getWidth()
                       + i] = (int) (RGBPixel.getBlue(pixel) * 0.11f
                                     + RGBPixel.getGreen(pixel) * 0.59f
                                     + RGBPixel.getRed(pixel) * 0.3);
            }
        }

        BufferedImage result = new BufferedImage(width, height,
                                                 BufferedImage.TYPE_BYTE_GRAY);
        result.getRaster().setPixels(0, 0, result.getWidth(),
                                     result.getHeight(), pixels);
        return result;
    }
}
