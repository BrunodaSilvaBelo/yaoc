package morphology;

import java.awt.image.BufferedImage;

import util.RGBPixel;

public class Grayscale implements BaseMorphology {

    @Override
    public BufferedImage apply(BufferedImage img) {
        int[] pixels = new int[img.getWidth() * img.getHeight()];

        for (int i = 0; i < img.getWidth(); ++i) {
            for (int j = 0; j < img.getHeight(); ++j) {
                int pixel = img.getRGB(i, j);
                pixels[j * img.getWidth()
                       + i] = (int) (RGBPixel.get_blue(pixel) * 0.11f
                                     + RGBPixel.get_green(pixel) * 0.59f
                                     + RGBPixel.get_red(pixel) * 0.3);
            }
        }

        BufferedImage result = new BufferedImage(img.getWidth(),
                                                 img.getHeight(),
                                                 BufferedImage.TYPE_BYTE_GRAY);
        result.getRaster().setPixels(0, 0, result.getWidth(),
                                     result.getHeight(), pixels);
        return result;
    }
}
