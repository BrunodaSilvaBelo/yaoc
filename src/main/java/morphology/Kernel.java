package morphology;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;

public class Kernel implements BaseMorphology {
    private float[] matrix;

    public Kernel(float... values) {
        matrix = values;
    }

    @Override
    public BufferedImage apply(BufferedImage img) {
        int size = (int) Math.sqrt(matrix.length);
        BufferedImageOp op = new ConvolveOp(new java.awt.image.Kernel(size,
                                                                      size,
                                                                      matrix));
        return op.filter(img, null);
    }
}
