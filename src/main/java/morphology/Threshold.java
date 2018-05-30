package morphology;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

public class Threshold implements BaseMorphology {

    float thresh = 0;

    public Threshold(float threshold) {
        this.thresh = threshold;
    }

    @Override
    public BufferedImage apply(BufferedImage img) {
        assert img.getType() == BufferedImage.TYPE_BYTE_GRAY;
        byte[] threshs = new byte[256];
        for (int i = 0; i < threshs.length; ++i) {
            threshs[i] = (byte) ((i > thresh) ? 0 : 255);
        }
        BufferedImageOp op = new LookupOp(new ByteLookupTable(0, threshs),
                                          null);

        BufferedImage result = new BufferedImage(img.getWidth(),
                                                 img.getHeight(),
                                                 BufferedImage.TYPE_BYTE_BINARY);
        result.setData(op.filter(img, null).getData());
        return result;
    }
}
