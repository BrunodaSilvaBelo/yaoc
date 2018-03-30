package util;

import java.util.Arrays;
import java.util.List;

public class Histogram {
    int[] bins;
    int   width  = 0;
    int   offset = 0;

    public Histogram(int size) {
        this(size, 1);
    }

    public Histogram(int size, int width) {
        assert size > 0 : "Size must be greater than 0";
        this.width = width;
        bins = new int[size];
    }

    public Histogram(int[] list, int size) {
        this(list, size, 1);
    }

    public Histogram(int[] list, int size, int width) {
        this(size, width);
        set(list);
    }

    public Histogram(List<Integer> list, int size) {
        this(list, size, 1);
    }

    public Histogram(List<Integer> list, int size, int width) {
        this(size, width);
        set(list);
    }

    public int get(int idx) {
        return bins[idx];
    }

    public int[] getData() {
        return bins.clone();
    }

    public void put(int value) {
        if (value + offset < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ++bins[(value + offset) / width];
    }

    public final void set(int[] list) {
        bins = new int[bins.length];

        int min = Arrays.stream(list).min().getAsInt();
        if (min < 0) {
            offset = Math.abs(min);
        }
        Arrays.stream(list).forEach(item -> ++bins[(item + offset) / width]);
    }

    public final void set(List<Integer> list) {
        int[] aux = new int[list.size()];
        Arrays.parallelSetAll(aux, idx -> list.get(idx));
        set(aux);
    }

    public void setOffset(int offset) {
        this.offset = offset;
        setSize(bins.length);
    }

    public void setSize(int size) {
        bins = new int[size];
    }

    public void setWidth(int width) {
        this.width = width;
        setSize(bins.length);
    }
}
