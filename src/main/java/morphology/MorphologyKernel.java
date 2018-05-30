package morphology;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public abstract class MorphologyKernel extends Kernel {

    // -1 for black
    // 0 for whatever
    // 1 for white
    protected int[] lookup = { 0, -1, 255 };

    public MorphologyKernel(float... values) {
        super(values);
    }

    @Override
    public BufferedImage apply(BufferedImage img) {
        int type = img.getType();
        int length = (int) Math.sqrt(matrix.length);
        assert type == BufferedImage.TYPE_BYTE_BINARY;
        Raster buffer = img.getRaster();
        int width = img.getWidth();
        int height = img.getHeight();
        int[] tmp = new int[width * height];
        int[] roi = new int[matrix.length];
        for (int j = 0; j < height; ++j) {
            for (int i = 0; i < width; ++i) {
                if (!((i != 0 && i != width - 1)
                      && (j != 0 && j != height - 1))) {
                    tmp[j * width + i] = border();
                    continue;
                }

                buffer.getPixels(i - 1, j - 1, length, length, roi);
                tmp[j * width + i] = condition(matrix, roi);
            }
        }

        BufferedImage result = new BufferedImage(width, height,
                                                 BufferedImage.TYPE_BYTE_BINARY);
        result.getRaster().setPixels(0, 0, width, height, tmp);
        return result;
    }

    protected abstract int condition(float[] matrix, int[] subset);

    protected abstract int border();
}
