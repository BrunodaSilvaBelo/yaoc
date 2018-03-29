package feature;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.lang.reflect.Field;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;

import feature.FirstOrder.Feature;
import morphology.Grayscale;

public class FirstOrderTest {
    @Test
    public void isFeatureInit() throws Exception {
        BufferedImage image = ImageIO.read(ClassLoader.getSystemResource("hamster.jpg"));
        image = new Grayscale().apply(image);
        FirstOrder fo = new FirstOrder(image);

        Field field = fo.getClass().getDeclaredField("isFeatureInit");
        field.setAccessible(true);

        assertFalse(field.getBoolean(fo));

        fo.getFeature(Feature.KURTOSIS);
        assertFalse(field.getBoolean(fo));

        for (Feature f : FirstOrder.Feature.values()) {
            fo.getFeature(f);
        }
        assertTrue(field.getBoolean(fo));

        fo = new FirstOrder(image);
        assertFalse(field.getBoolean(fo));
        fo.getAllFeatures();
        assertTrue(field.getBoolean(fo));
    }
}
