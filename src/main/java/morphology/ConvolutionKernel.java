package morphology;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;

public class ConvolutionKernel extends Kernel {
    public ConvolutionKernel(float... values) {
        super(values);
    }

    @Override
    public BufferedImage apply(BufferedImage img) {
        int size = (int) Math.sqrt(matrix.length);
        BufferedImageOp op = new ConvolveOp(new java.awt.image.Kernel(size,
                                                                      size,
                                                                      matrix),
                                            ConvolveOp.EDGE_NO_OP, null);

        BufferedImage result = new BufferedImage(img.getWidth(),
                                                 img.getHeight(),
                                                 img.getType());
        op.filter(img, result);
        return result;
    }
}
