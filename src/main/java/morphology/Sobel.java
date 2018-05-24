package morphology;

import java.util.Map;
import java.util.TreeMap;

public class Sobel extends ConvolutionKernel {
    public enum Direction {
                           UP, DOWN, LEFT, RIGHT
    }

    private static Map<Direction, float[]> sobels = new TreeMap<>();
    static {
        sobels.put(Direction.UP,
                   new float[] { 1f, 2f, 1f, 0f, 0f, 0f, -1f, -2f, -1f });
        sobels.put(Direction.DOWN,
                   new float[] { -1f, -2f, -1f, 0f, 0f, 0f, 1f, 2f, 1f });
        sobels.put(Direction.RIGHT,
                   new float[] { 1f, 0f, -1f, 2f, 0f, -2f, 1f, 0f, -1f });
        sobels.put(Direction.LEFT,
                   new float[] { -1f, 0f, 1f, -2f, 0f, 2f, -1f, 0f, 1f });
    }

    public Sobel(Direction direction) {
        super(sobels.get(direction));
    }
}
