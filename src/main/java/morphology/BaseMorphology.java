package morphology;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface BaseMorphology {
    static BufferedImage apply(BufferedImage img, BaseMorphology... morphs) {
        return apply(img, Arrays.asList(morphs));
    }

    static BufferedImage apply(BufferedImage img, List<BaseMorphology> morphs) {
        return morphs.stream().reduce(e -> new Identity().apply(e),
                                      BaseMorphology::compose)
                     .apply(img);
    }

    public BufferedImage apply(BufferedImage img);

    default BaseMorphology compose(BaseMorphology next) {
        return img -> next.apply(apply(img));
    }
}
