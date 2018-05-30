package morphology;

public abstract class Kernel implements BaseMorphology {
    protected float[] matrix;

    public Kernel(float... values) {
        int length = (int) Math.sqrt(values.length);
        assert length
               * length == (int) values.length : "The matrix must be square";
        matrix = values;
    }
}
