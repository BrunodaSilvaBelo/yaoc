package morphology;

public class Erode extends MorphologyKernel {

    public Erode(float... values) {
        super(values);
    }

    @Override
    protected int condition(float[] matrix, int[] subset) {
        int length = (int) Math.sqrt(matrix.length);
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                if (lookup[(int) matrix[i * length + j] + 1] == -1)
                    continue;
                if (lookup[(int) matrix[i * length + j]
                           + 1] != lookup[subset[i * length + j] + 1])
                    return lookup[0];
            }
        }
        return lookup[lookup.length - 1];
    }

    @Override
    protected int border() {
        return lookup[0];
    }
}
