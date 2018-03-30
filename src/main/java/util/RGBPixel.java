package util;

public class RGBPixel {
    public static int getBlue(int pixel) {
        return getPixel(pixel, 0);
    }

    public static int getGreen(int pixel) {
        return getPixel(pixel, 1 << 3);
    }

    private static int getPixel(int pixel, int mask) {
        return (pixel >> mask) & 0xff;
    }

    public static int getRed(int pixel) {
        return getPixel(pixel, 1 << 4);
    }

    private RGBPixel() {

    }
}
