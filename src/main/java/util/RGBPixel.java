package util;

public class RGBPixel {
    public static int get_blue(int pixel) {
        return get_pixel(pixel, 0);
    }

    public static int get_green(int pixel) {
        return get_pixel(pixel, 1 << 3);
    }

    private static int get_pixel(int pixel, int mask) {
        return (pixel >> mask) & 0xff;
    }

    public static int get_red(int pixel) {
        return get_pixel(pixel, 1 << 4);
    }

    private RGBPixel() {

    }
}
