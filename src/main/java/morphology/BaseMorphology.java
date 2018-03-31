package morphology;

import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface BaseMorphology {
    static BaseMorphology reduce(BaseMorphology... morphs) {
        return reduce(Arrays.asList(morphs));
    }

    static BaseMorphology reduce(List<BaseMorphology> morphs) {
        return morphs.stream().reduce(e -> new Identity().apply(e),
                                      BaseMorphology::compose);
    }

    public BufferedImage apply(BufferedImage img);

    default BaseMorphology compose(BaseMorphology next) {
        return img -> next.apply(apply(img));
    }
}
