package feature;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import util.Histogram;

public class FirstOrder {
    public enum Feature {
                         MAX, MIN, MEAN, MEDIAN, KURTOSIS, SKEWNESS, SUM,
                         LOGSUM, INVERSESUM, SQUARESUM, VARIANCE, STDDEV, SIZE,
                         MOMENT1, MOMENT2, MOMENT3, MOMENT4, GEOMETRICMEAN,
                         HARMONICMEAN
    }

    private interface Lambda {
        public double run(int[] buffer);
    }

    private static Map<Feature, Lambda> functions = new TreeMap<>();
    static {
        functions.put(Feature.MAX,
                      buffer -> Arrays.stream(buffer).max().getAsInt());
        functions.put(Feature.MIN,
                      buffer -> Arrays.stream(buffer).min().getAsInt());
        functions.put(Feature.MEAN,
                      buffer -> Arrays.stream(buffer).average().getAsDouble());
        functions.put(Feature.MEDIAN,
                      buffer -> (functions.get(Feature.MAX).run(buffer)
                                 - functions.get(Feature.MIN).run(buffer))
                                / buffer.length);

        functions.put(Feature.KURTOSIS, buffer -> centralMoment(buffer, 4));
        functions.put(Feature.SKEWNESS, buffer -> centralMoment(buffer, 3));
        functions.put(Feature.SUM, buffer -> Arrays.stream(buffer).sum());
        functions.put(Feature.LOGSUM, buffer -> 1);
        functions.put(Feature.INVERSESUM, buffer -> 1);
        functions.put(Feature.SQUARESUM, buffer -> 1);
        functions.put(Feature.VARIANCE, buffer -> centralMoment(buffer, 2));
        functions.put(Feature.STDDEV,
                      buffer -> Math.sqrt(functions.get(Feature.VARIANCE)
                                                   .run(buffer)));
        functions.put(Feature.SIZE, buffer -> buffer.length);
        functions.put(Feature.MOMENT1,
                      buffer -> centralMoment(buffer, 1)
                                / functions.get(Feature.MEAN).run(buffer));
        functions.put(Feature.MOMENT2,
                      buffer -> functions.get(Feature.VARIANCE).run(buffer)
                                / functions.get(Feature.MEAN).run(buffer));
        functions.put(Feature.MOMENT3,
                      buffer -> functions.get(Feature.SKEWNESS).run(buffer)
                                / functions.get(Feature.MEAN).run(buffer));
        functions.put(Feature.MOMENT4,
                      buffer -> functions.get(Feature.KURTOSIS).run(buffer)
                                / functions.get(Feature.MEAN).run(buffer));
        functions.put(Feature.GEOMETRICMEAN, buffer -> 1);
        functions.put(Feature.HARMONICMEAN, buffer -> 1);
    }

    private static double centralMoment(int[] buffer, double e) {
        double mean = functions.get(Feature.MEAN).run(buffer);
        double result = 0.0;
        for (int i = 0; i < buffer.length; ++i) {
            result += Math.pow(buffer[i] - mean, e);
        }

        return result / buffer.length;
    }

    private Histogram            histogram;
    private Map<Feature, Double> features      = new TreeMap<>();
    private boolean              isFeatureInit = false;

    public FirstOrder(BufferedImage image) {
        int[] buffer = new int[image.getHeight() * image.getWidth()];
        DataBuffer dataBuffer = image.getRaster().getDataBuffer();
        for (int i = 0; i < dataBuffer.getSize(); ++i) {
            buffer[i] = dataBuffer.getElem(i);
        }
        histogram = new Histogram(buffer, 256);
    }

    public Map<Feature, Double> getAllFeatures() {
        if (!isFeatureInit) {
            for (Feature f : Feature.values()) {
                getFeature(f);
            }
        }
        return features;
    }

    public Double getFeature(Feature f) {
        Double result = features.get(f);
        if (result != null) {
            return result;
        }

        result = functions.get(f).run(histogram.getData());

        features.putIfAbsent(f, result);
        isFeatureInit = (features.size() == Feature.values().length);
        return result;
    }
}
