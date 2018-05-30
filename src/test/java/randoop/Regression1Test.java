package randoop;
import org.junit.jupiter.api.Test;
public class Regression1Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass2 = erode1.getClass();
        java.lang.Class<?> wildcardClass3 = erode1.getClass();
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = erode1.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 97, 255);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45, (int) (short) 10);
// flaky:         histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram51 = new util.Histogram(intArray45, (int) (short) 100);
        util.Histogram histogram53 = new util.Histogram(intArray45, (int) '#');
        try {
            int int55 = histogram53.get(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram4 = null; // flaky: new util.Histogram(intArray2, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray12 = null; // flaky: histogram11.getData();
        java.lang.Class<?> wildcardClass13 = null; // flaky: histogram11.getClass();
        int[] intArray14 = null; // flaky: histogram11.getData();
        try {
// flaky:             histogram2.set(intArray14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
// flaky:         org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setOffset((int) '#');
        java.lang.Class<?> wildcardClass6 = null; // flaky: histogram1.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
// flaky:         histogram14.setOffset((int) (byte) 1);
// flaky:         histogram14.setOffset((int) '4');
        int[] intArray23 = null; // flaky: histogram14.getData();
// flaky:         histogram12.set(intArray23);
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram(intArray23, 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (short) 1);
// flaky:         histogram2.setOffset(32);
        try {
// flaky:             histogram2.put(97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 52, (int) 'a');
        histogram22.setWidth((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        java.lang.Class<?> wildcardClass7 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        try {
            util.Histogram histogram52 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, 10, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
        int int7 = histogram1.get((int) (short) 10);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        histogram9.put((int) (byte) 10);
        util.Histogram histogram13 = new util.Histogram((int) ' ');
        int[] intArray14 = histogram13.getData();
        histogram9.set(intArray14);
        util.Histogram histogram18 = new util.Histogram(intArray14, 100, (int) (byte) 10);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (byte) 100);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 255);
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
// flaky:         histogram39.setSize((int) (short) 10);
// flaky:         histogram39.setSize((int) (byte) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
// flaky:         histogram39.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList47, (int) 'a');
        histogram37.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram54 = null; // flaky: new util.Histogram(0);
// flaky:         histogram54.setSize((int) (short) 10);
// flaky:         histogram54.setSize((int) (byte) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
// flaky:         histogram54.set((java.util.List<java.lang.Integer>) intList62);
        util.Histogram histogram67 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) (short) 10, (int) (byte) 10);
        histogram37.set((java.util.List<java.lang.Integer>) intList62);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) (byte) 10);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) (short) 100, (int) (short) 100);
        histogram18.set((java.util.List<java.lang.Integer>) intList62);
        try {
            histogram1.set((java.util.List<java.lang.Integer>) intList62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setSize((int) '#');
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 10L);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 35, 52);
        java.lang.Class<?> wildcardClass38 = intList25.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        morphology.Threshold threshold1 = new morphology.Threshold(10.0f);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        util.Histogram histogram2 = new util.Histogram(1, 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = convolutionKernel6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        int int1 = util.RGBPixel.getRed((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        histogram34.setOffset(100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (byte) 100);
        histogram2.put((int) (byte) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
// flaky:         histogram21.setOffset(52);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
// flaky:         histogram45.setSize((int) 'a');
        int int53 = 0; // flaky: histogram45.get((int) (short) 0);
// flaky:         histogram45.setWidth(52);
        int[] intArray56 = null; // flaky: histogram45.getData();
// flaky:         histogram21.set(intArray56);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray56);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        util.Histogram histogram1 = new util.Histogram(100);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.put((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        int[] intArray8 = histogram7.getData();
        histogram3.set(intArray8);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, 52, (-1));
        util.Histogram histogram15 = new util.Histogram(intArray8, (int) (byte) 100, 1);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 100);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 255);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) '4');
        histogram15.set((java.util.List<java.lang.Integer>) intList25);
        histogram1.set((java.util.List<java.lang.Integer>) intList25);
        try {
            int int42 = histogram1.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray6);
        morphology.Threshold threshold10 = new morphology.Threshold(0.0f);
        float[] floatArray15 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode16 = new morphology.Erode(floatArray15);
        morphology.BaseMorphology baseMorphology17 = threshold10.compose((morphology.BaseMorphology) erode16);
        java.lang.Class<?> wildcardClass18 = erode16.getClass();
        morphology.BaseMorphology baseMorphology19 = null; // flaky: erode8.compose((morphology.BaseMorphology) erode16);
        java.awt.image.BufferedImage bufferedImage20 = null;
        try {
            java.awt.image.BufferedImage bufferedImage21 = erode16.apply(bufferedImage20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(wildcardClass18);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) ' ');
        histogram25.setOffset((int) (byte) 100);
        histogram25.setWidth((int) (short) 100);
        histogram25.setSize(0);
        histogram25.setWidth((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setOffset((int) '#');
// flaky:         histogram1.setSize((int) (byte) 0);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        int int17 = 0; // flaky: histogram9.get((int) (short) 0);
// flaky:         histogram9.setWidth(52);
        int[] intArray20 = null; // flaky: histogram9.getData();
        try {
// flaky:             histogram1.set(intArray20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (short) 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
// flaky:         histogram10.setSize((int) (short) 10);
// flaky:         histogram10.setSize((int) (byte) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
// flaky:         histogram10.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) 'a');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, 97, 255);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) ' ');
        try {
            int int33 = histogram31.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setOffset((int) '#');
// flaky:         histogram1.setSize((int) (byte) 0);
// flaky:         histogram1.setWidth(52);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = convolutionKernel7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 1, (int) '4');
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList41);
        try {
            util.Histogram histogram56 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList41, 35, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (byte) 100);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, 255);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
// flaky:         histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList64, (int) 'a');
        histogram54.set((java.util.List<java.lang.Integer>) intList64);
        histogram16.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) (short) 10, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList80);
        try {
            int int88 = histogram16.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        int int1 = util.RGBPixel.getBlue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setSize((int) (byte) 100);
        int[] intArray4 = histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
// flaky:         histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) 'a');
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) ' ', 100);
        histogram21.setOffset((int) (byte) 100);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        int int33 = 0; // flaky: histogram25.get((int) (short) 0);
        int[] intArray34 = null; // flaky: histogram25.getData();
        util.Histogram histogram37 = null; // flaky: new util.Histogram(intArray34, (int) ' ', (int) (short) -1);
// flaky:         histogram21.set(intArray34);
// flaky:         histogram1.set(intArray34);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10, 255);
        try {
            int int21 = histogram19.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
        try {
            util.Histogram histogram46 = null; // flaky: new util.Histogram(intArray41, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        histogram1.setSize((int) (short) 1);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
// flaky:         histogram6.setSize((int) 'a');
// flaky:         histogram6.setWidth(1);
// flaky:         histogram6.setWidth((int) '4');
        java.lang.Class<?> wildcardClass17 = null; // flaky: histogram6.getClass();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        int[] intArray33 = histogram32.getData();
// flaky:         histogram6.set(intArray33);
        try {
            histogram1.set(intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
// flaky:         histogram1.put((int) (short) 10);
// flaky:         histogram1.setOffset(0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram4 = new util.Histogram(intArray2, (int) (short) 10);
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray2, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.put((int) '#');
        try {
            int int11 = histogram7.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setWidth(0);
// flaky:         histogram3.setSize((int) 'a');
// flaky:         histogram3.setWidth((int) (byte) 100);
        int[] intArray10 = null; // flaky: histogram3.getData();
// flaky:         histogram1.set(intArray10);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray10, (int) (short) -1, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel4 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = convolutionKernel4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 1, 32);
        histogram39.setOffset((int) (short) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) 'a', (int) (short) 10);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 100);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 35);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
// flaky:         histogram44.setSize((int) (short) 10);
// flaky:         histogram44.setSize((int) (byte) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
// flaky:         histogram44.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) 'a');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) ' ', 100);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) (byte) 10, 255);
        histogram42.set((java.util.List<java.lang.Integer>) intList52);
        histogram42.setOffset(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97);
        histogram25.setWidth((int) 'a');
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        int[] intArray6 = null; // flaky: histogram2.getData();
        try {
// flaky:             histogram2.put((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = erode5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Threshold threshold9 = new morphology.Threshold((float) 1L);
        morphology.BaseMorphology baseMorphology10 = erode7.compose((morphology.BaseMorphology) threshold9);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = threshold9.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) 'a');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) '4', (int) 'a');
        int[] intArray37 = histogram36.getData();
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
// flaky:         histogram39.setSize((int) (short) 10);
// flaky:         histogram39.setSize((int) (byte) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
// flaky:         histogram39.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList47, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList47, (int) (byte) 100);
        histogram36.set((java.util.List<java.lang.Integer>) intList47);
        int[] intArray56 = histogram36.getData();
        histogram14.set(intArray56);
        histogram14.setOffset(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray56);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setOffset(1);
        int int21 = histogram14.get(0);
        histogram14.setWidth(100);
        histogram14.put(0);
        int[] intArray26 = histogram14.getData();
        try {
            util.Histogram histogram29 = null; // flaky: new util.Histogram(intArray26, (int) (short) 100, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        int int1 = util.RGBPixel.getBlue(255);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        util.Histogram histogram2 = new util.Histogram(100, 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (byte) 100);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, 255);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) ' ');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '4');
        histogram2.set((java.util.List<java.lang.Integer>) intList12);
        histogram2.put(52);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 52);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32);
        try {
            int int22 = histogram20.get(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = new util.Histogram(intArray6, 100, (int) (byte) 10);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (byte) 100);
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, 255);
        util.Histogram histogram31 = null; // flaky: new util.Histogram(0);
// flaky:         histogram31.setSize((int) (short) 10);
// flaky:         histogram31.setSize((int) (byte) 100);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
// flaky:         histogram31.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) 'a');
        histogram29.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(0);
// flaky:         histogram46.setSize((int) (short) 10);
// flaky:         histogram46.setSize((int) (byte) 100);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
// flaky:         histogram46.set((java.util.List<java.lang.Integer>) intList54);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (short) 10, (int) (byte) 10);
        histogram29.set((java.util.List<java.lang.Integer>) intList54);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (byte) 10);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (short) 100, (int) (short) 100);
        histogram10.set((java.util.List<java.lang.Integer>) intList54);
        try {
            util.Histogram histogram68 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList54, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        java.lang.Class<?> wildcardClass35 = histogram34.getClass();
        try {
            int int37 = histogram34.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        util.Histogram histogram1 = new util.Histogram(255);
        int int3 = histogram1.get((int) '#');
        try {
            histogram1.setSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 97, 255);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45, (int) (short) 10);
// flaky:         histogram5.set(intArray45);
        histogram1.set(intArray45);
        try {
            histogram1.setSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) ' ');
        try {
            util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) ' ');
        histogram2.put((int) (short) 0);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
// flaky:         histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (byte) 10);
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
// flaky:         histogram24.setSize((int) (short) 10);
// flaky:         histogram24.setSize((int) (byte) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
// flaky:         histogram24.set((java.util.List<java.lang.Integer>) intList32);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) (byte) 10);
        histogram21.set((java.util.List<java.lang.Integer>) intList32);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) 'a', (int) (short) 10);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, 100);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, 35);
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) 'a');
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) ' ', 100);
        util.Histogram histogram67 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) (byte) 10, 255);
        histogram47.set((java.util.List<java.lang.Integer>) intList57);
        histogram2.set((java.util.List<java.lang.Integer>) intList57);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel4 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel5 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = erode3.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = sobel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList3, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 100);
        util.Histogram histogram58 = null; // flaky: new util.Histogram(0);
// flaky:         histogram58.setSize((int) (short) 10);
// flaky:         histogram58.setSize((int) (byte) 100);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
// flaky:         histogram58.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram71 = new util.Histogram((java.util.List<java.lang.Integer>) intList66, (int) (short) 10, (int) (byte) 10);
        int[] intArray72 = histogram71.getData();
        histogram71.setWidth(97);
        histogram71.setOffset(1);
        util.Histogram histogram78 = null; // flaky: new util.Histogram(0);
// flaky:         histogram78.setSize((int) (short) 10);
// flaky:         histogram78.setSize((int) (byte) 100);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
// flaky:         histogram78.set((java.util.List<java.lang.Integer>) intList86);
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList86, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram93 = new util.Histogram((java.util.List<java.lang.Integer>) intList86, (int) (byte) 100);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList86, 255);
        histogram71.set((java.util.List<java.lang.Integer>) intList86);
        histogram56.set((java.util.List<java.lang.Integer>) intList86);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        try {
            int int33 = histogram14.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        histogram1.setOffset((int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        histogram1.setSize((int) (byte) 10);
        int int11 = histogram1.get((int) (short) 0);
        histogram1.setWidth((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (short) 1);
// flaky:         histogram2.setOffset(32);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
// flaky:         histogram11.setSize((int) 'a');
        int int19 = 0; // flaky: histogram11.get((int) (short) 0);
        int[] intArray20 = null; // flaky: histogram11.getData();
        util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray20, 35, (int) ' ');
        try {
// flaky:             histogram2.set(intArray20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
        try {
            int int14 = 0; // flaky: histogram1.get(97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList13);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (byte) 100);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, 255);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) ' ');
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (short) 100, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList13);
        try {
            util.Histogram histogram30 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (byte) 100);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = convolutionKernel9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 52);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
// flaky:         histogram4.setSize((int) 'a');
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
// flaky:         histogram28.setSize((int) (short) 10);
// flaky:         histogram28.setSize((int) (byte) 100);
// flaky:         histogram28.setSize((int) 'a');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram28.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, (int) '4');
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, 255);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97);
        java.lang.Class<?> wildcardClass62 = intList44.getClass();
        histogram2.set((java.util.List<java.lang.Integer>) intList44);
        try {
            util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) (short) 10);
        try {
            util.Histogram histogram25 = null; // flaky: new util.Histogram(intArray17, (int) '#', (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray8, 10, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
        try {
// flaky:             histogram21.setSize((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        int[] intArray12 = histogram2.getData();
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray12, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList13);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (short) 10, (int) (byte) 10);
        int[] intArray19 = histogram18.getData();
        histogram18.setWidth(97);
        histogram18.setWidth((int) (byte) 1);
        histogram18.setOffset((int) (byte) 1);
        histogram18.setWidth(100);
        histogram18.setWidth((int) 'a');
        util.Histogram histogram31 = new util.Histogram((int) (byte) 100);
        int[] intArray32 = histogram31.getData();
        util.Histogram histogram34 = new util.Histogram(intArray32, (int) (short) 10);
        histogram18.set(intArray32);
        try {
// flaky:             histogram2.set(intArray32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Threshold threshold6 = new morphology.Threshold((float) (byte) 0);
        morphology.BaseMorphology baseMorphology7 = null; // flaky: erode4.compose((morphology.BaseMorphology) threshold6);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = threshold6.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Threshold threshold5 = new morphology.Threshold((float) 10L);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        float[] floatArray9 = new float[] {};
        morphology.Erode erode10 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray9);
        morphology.Erode erode12 = new morphology.Erode(floatArray9);
        morphology.Erode erode13 = new morphology.Erode(floatArray9);
        morphology.BaseMorphology baseMorphology14 = sobel8.compose((morphology.BaseMorphology) erode13);
        morphology.BaseMorphology baseMorphology15 = threshold5.compose((morphology.BaseMorphology) erode13);
        morphology.BaseMorphology baseMorphology16 = erode3.compose((morphology.BaseMorphology) threshold5);
        java.lang.Class<?> wildcardClass17 = baseMorphology16.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction6.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) 'a', (int) (short) 10);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 100);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 35);
        try {
            util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        util.Histogram histogram1 = new util.Histogram((int) (short) 10);
        histogram1.setSize(255);
        int int5 = histogram1.get(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        util.Histogram histogram1 = new util.Histogram(1);
        try {
            int int3 = histogram1.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray19, (int) (short) -1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        int[] intArray0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intArray0, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass2 = erode1.getClass();
        morphology.Sobel.Direction direction3 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel4 = new morphology.Sobel(direction3);
        float[] floatArray7 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        float[] floatArray11 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel12 = null; // flaky: new morphology.ConvolutionKernel(floatArray11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) convolutionKernel12);
        morphology.BaseMorphology baseMorphology14 = sobel4.compose((morphology.BaseMorphology) convolutionKernel8);
        morphology.BaseMorphology baseMorphology15 = erode1.compose((morphology.BaseMorphology) sobel4);
        java.awt.image.BufferedImage bufferedImage16 = null;
        try {
            java.awt.image.BufferedImage bufferedImage17 = erode1.apply(bufferedImage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + morphology.Sobel.Direction.UP + "'", direction3.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) 'a', (int) (short) 10);
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) -1, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        int[] intArray26 = histogram25.getData();
        histogram25.setSize((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) ' ');
        histogram2.put((int) (short) 0);
        try {
            histogram2.put((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 100L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
// flaky:         histogram22.setSize((int) (short) 10);
// flaky:         histogram22.setSize((int) (byte) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
// flaky:         histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30, (int) (short) 10, (int) (byte) 10);
        histogram35.put((int) (short) 10);
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
// flaky:         histogram39.setSize((int) (short) 10);
// flaky:         histogram39.setSize((int) (byte) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
// flaky:         histogram39.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList47, (int) (short) 10, (int) (byte) 10);
        int[] intArray53 = histogram52.getData();
        histogram35.set(intArray53);
        int[] intArray55 = histogram35.getData();
        histogram20.set(intArray55);
        histogram20.setSize((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        int int20 = histogram16.get((int) (byte) 1);
        histogram16.put((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 100);
        try {
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, 0, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) '4', (int) 'a');
        int[] intArray34 = histogram33.getData();
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (byte) 100);
        histogram33.set((java.util.List<java.lang.Integer>) intList44);
        histogram14.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97, (int) (short) 100);
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (byte) -1, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 10, (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        int[] intArray0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intArray0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setSize(97);
        try {
// flaky:             histogram2.put(255);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a', (int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, 255);
        int int25 = histogram23.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
// flaky:         histogram21.setOffset(1);
        try {
            int int45 = 0; // flaky: histogram21.get(100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        float[] floatArray9 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel10 = null; // flaky: new morphology.ConvolutionKernel(floatArray9);
        float[] floatArray13 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel14 = null; // flaky: new morphology.ConvolutionKernel(floatArray13);
        morphology.BaseMorphology baseMorphology15 = null; // flaky: convolutionKernel10.compose((morphology.BaseMorphology) convolutionKernel14);
        morphology.BaseMorphology baseMorphology16 = erode6.compose((morphology.BaseMorphology) convolutionKernel14);
        java.awt.image.BufferedImage bufferedImage17 = null;
        try {
            java.awt.image.BufferedImage bufferedImage18 = erode6.apply(bufferedImage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray13);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intList0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        int[] intArray6 = histogram5.getData();
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray6, 0, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = sobel1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction0.equals(morphology.Sobel.Direction.LEFT));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        histogram2.setSize(32);
        int int7 = histogram2.get(0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
// flaky:         histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 97, 255);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49, (int) (short) 10);
// flaky:         histogram9.set(intArray49);
        histogram1.set(intArray49);
        try {
            util.Histogram histogram56 = null; // flaky: new util.Histogram(intArray49, (int) (short) 100, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
// flaky:         histogram1.put((int) (short) 10);
        int[] intArray26 = null; // flaky: histogram1.getData();
// flaky:         histogram1.put((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
// flaky:         histogram4.setSize((int) 'a');
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
// flaky:         histogram28.setSize((int) (short) 10);
// flaky:         histogram28.setSize((int) (byte) 100);
// flaky:         histogram28.setSize((int) 'a');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram28.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, (int) '4');
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, 255);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97);
        java.lang.Class<?> wildcardClass62 = intList44.getClass();
        histogram2.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 255, (int) '4');
        histogram66.setOffset(35);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, (int) (short) 10, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = sobel1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = convolutionKernel3.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, 0);
// flaky:         histogram2.setWidth(52);
// flaky:         histogram2.setOffset((int) (short) 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (short) 1);
// flaky:         histogram2.setOffset(32);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 10, (int) (byte) 10);
        int[] intArray25 = histogram24.getData();
        histogram24.setWidth(97);
        histogram24.setOffset(1);
        int int31 = histogram24.get(0);
        histogram24.setWidth(100);
        histogram24.put(0);
        int[] intArray36 = histogram24.getData();
        try {
// flaky:             histogram2.set(intArray36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass3 = direction0.getClass();
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = sobel4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction0.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 100);
        try {
            util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        int int7 = 0; // flaky: histogram1.get((int) ' ');
        try {
            int int9 = 0; // flaky: histogram1.get((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(1, (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setOffset(1);
        int int21 = histogram14.get(0);
        int[] intArray22 = histogram14.getData();
        histogram14.setSize(100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
// flaky:         histogram2.setSize(52);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
// flaky:         histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (byte) 10);
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
// flaky:         histogram24.setSize((int) (short) 10);
// flaky:         histogram24.setSize((int) (byte) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
// flaky:         histogram24.set((java.util.List<java.lang.Integer>) intList32);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) (byte) 10);
        histogram21.set((java.util.List<java.lang.Integer>) intList32);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, (int) 'a', (int) (short) 10);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList32, 100);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Threshold threshold5 = new morphology.Threshold((float) 10L);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        float[] floatArray9 = new float[] {};
        morphology.Erode erode10 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray9);
        morphology.Erode erode12 = new morphology.Erode(floatArray9);
        morphology.Erode erode13 = new morphology.Erode(floatArray9);
        morphology.BaseMorphology baseMorphology14 = sobel8.compose((morphology.BaseMorphology) erode13);
        morphology.BaseMorphology baseMorphology15 = threshold5.compose((morphology.BaseMorphology) erode13);
        morphology.BaseMorphology baseMorphology16 = erode3.compose((morphology.BaseMorphology) threshold5);
        java.awt.image.BufferedImage bufferedImage17 = null;
        try {
            java.awt.image.BufferedImage bufferedImage18 = threshold5.apply(bufferedImage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction6.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        int[] intArray0 = null;
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram(intArray0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram16 = new util.Histogram(intArray6, 32, 100);
        try {
            util.Histogram histogram18 = null; // flaky: new util.Histogram(intArray6, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        util.Histogram histogram2 = new util.Histogram(52, 97);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.put((-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 1, (int) '4');
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 1, 255);
        histogram56.setSize((int) (short) 10);
        util.Histogram histogram60 = null; // flaky: new util.Histogram(0);
// flaky:         histogram60.setSize((int) (short) 10);
// flaky:         histogram60.setSize((int) (byte) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
// flaky:         histogram60.set((java.util.List<java.lang.Integer>) intList68);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList68, (int) (short) 10, (int) (byte) 10);
        int[] intArray74 = histogram73.getData();
        histogram73.setWidth(97);
        histogram73.setOffset(1);
        int int80 = histogram73.get(0);
        int[] intArray81 = histogram73.getData();
        histogram56.set(intArray81);
        histogram56.setSize(2);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(intArray81);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        morphology.Grayscale grayscale0 = new morphology.Grayscale();
        float[] floatArray7 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        morphology.Sobel sobel11 = new morphology.Sobel(direction9);
        java.lang.Class<?> wildcardClass12 = direction9.getClass();
        morphology.Sobel sobel13 = new morphology.Sobel(direction9);
        morphology.BaseMorphology baseMorphology14 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) sobel13);
        morphology.BaseMorphology baseMorphology15 = grayscale0.compose((morphology.BaseMorphology) convolutionKernel8);
        java.awt.image.BufferedImage bufferedImage16 = null;
        try {
            java.awt.image.BufferedImage bufferedImage17 = grayscale0.apply(bufferedImage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction9.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass12);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        util.Histogram histogram1 = new util.Histogram(32);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (byte) -1);
        util.Histogram histogram5 = new util.Histogram(100, 10);
        int[] intArray6 = histogram5.getData();
        try {
// flaky:             histogram2.set(intArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        histogram14.setOffset((int) (byte) -1);
        util.Histogram histogram36 = new util.Histogram(100, 10);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(0);
// flaky:         histogram38.setSize((int) (short) 10);
// flaky:         histogram38.setSize((int) (byte) 100);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
// flaky:         histogram38.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (byte) 100);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, 255);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) ' ');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) '4');
        histogram36.set((java.util.List<java.lang.Integer>) intList46);
        histogram14.set((java.util.List<java.lang.Integer>) intList46);
        histogram14.setSize((int) (byte) 10);
        histogram14.setSize((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        histogram14.put((int) (short) 0);
        int[] intArray19 = histogram14.getData();
        histogram14.setWidth((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray1);
        morphology.Erode erode5 = new morphology.Erode(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        util.Histogram histogram2 = new util.Histogram(97, (int) 'a');
        int[] intArray3 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray1);
        float[] floatArray7 = new float[] {};
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode10 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode13 = new morphology.Erode(floatArray7);
        float[] floatArray16 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        float[] floatArray20 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel21 = null; // flaky: new morphology.ConvolutionKernel(floatArray20);
        morphology.BaseMorphology baseMorphology22 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) convolutionKernel21);
        morphology.BaseMorphology baseMorphology23 = erode13.compose((morphology.BaseMorphology) convolutionKernel21);
        morphology.BaseMorphology baseMorphology24 = convolutionKernel6.compose(baseMorphology23);
        morphology.Threshold threshold26 = new morphology.Threshold(0.0f);
        float[] floatArray31 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode32 = new morphology.Erode(floatArray31);
        morphology.BaseMorphology baseMorphology33 = threshold26.compose((morphology.BaseMorphology) erode32);
        morphology.Sobel.Direction direction34 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel35 = new morphology.Sobel(direction34);
        java.lang.Class<?> wildcardClass36 = sobel35.getClass();
        morphology.BaseMorphology baseMorphology37 = threshold26.compose((morphology.BaseMorphology) sobel35);
        morphology.BaseMorphology baseMorphology38 = baseMorphology24.compose((morphology.BaseMorphology) sobel35);
        java.awt.image.BufferedImage bufferedImage39 = null;
        try {
            java.awt.image.BufferedImage bufferedImage40 = sobel35.apply(bufferedImage39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray20);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(baseMorphology23);
        org.junit.Assert.assertNotNull(baseMorphology24);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction34.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(baseMorphology37);
        org.junit.Assert.assertNotNull(baseMorphology38);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (byte) 10);
        int[] intArray20 = histogram19.getData();
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
// flaky:         histogram22.setSize((int) (short) 10);
// flaky:         histogram22.setSize((int) (byte) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
// flaky:         histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList30, (int) (byte) 10);
        histogram19.set((java.util.List<java.lang.Integer>) intList30);
        histogram1.set((java.util.List<java.lang.Integer>) intList30);
        histogram1.setOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a', (int) ' ');
        try {
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        int int1 = util.RGBPixel.getRed((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        int[] intArray5 = histogram2.getData();
        int[] intArray6 = histogram2.getData();
        histogram2.setSize(0);
        try {
            histogram2.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.Sobel.Direction direction8 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel9 = new morphology.Sobel(direction8);
        morphology.Sobel sobel10 = new morphology.Sobel(direction8);
        java.lang.Class<?> wildcardClass11 = direction8.getClass();
        morphology.Sobel sobel12 = new morphology.Sobel(direction8);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel7.compose((morphology.BaseMorphology) sobel12);
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = convolutionKernel7.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction8.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass11);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32, (int) '4');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 52, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 100);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intList0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
        try {
// flaky:             histogram2.setSize((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        java.lang.Class<?> wildcardClass8 = null; // flaky: convolutionKernel7.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(1, 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        histogram2.setOffset((int) (short) -1);
        histogram2.setWidth(35);
        int[] intArray7 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, (int) (short) 0, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
// flaky:         histogram27.setSize((int) 'a');
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
// flaky:         histogram51.setSize((int) (short) 10);
// flaky:         histogram51.setSize((int) (byte) 100);
// flaky:         histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
// flaky:         histogram59.setSize((int) (short) 10);
// flaky:         histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
// flaky:         histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, (int) '4');
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        int[] intArray86 = histogram14.getData();
        util.Histogram histogram88 = new util.Histogram(intArray86, 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray86);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (short) 10, (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        util.Histogram histogram35 = new util.Histogram(intArray32, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        histogram7.setSize(52);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) '#', (int) (byte) 100);
        histogram17.put((int) '#');
        java.lang.Class<?> wildcardClass20 = histogram17.getClass();
        int[] intArray21 = histogram17.getData();
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (byte) 100);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, 255);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) ' ');
        histogram17.set((java.util.List<java.lang.Integer>) intList31);
        histogram7.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
// flaky:         histogram22.setSize((int) (short) 10);
// flaky:         histogram22.setSize((int) (byte) 100);
// flaky:         histogram22.setOffset((int) (byte) 1);
        util.Histogram histogram30 = new util.Histogram((int) ' ');
        int[] intArray31 = histogram30.getData();
// flaky:         histogram22.set(intArray31);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray31, 100, (int) (short) -1);
        histogram20.set(intArray31);
        try {
            histogram20.put((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
// flaky:         histogram14.setOffset((int) (byte) 1);
// flaky:         histogram14.setOffset((int) '4');
        int[] intArray23 = null; // flaky: histogram14.getData();
// flaky:         histogram12.set(intArray23);
// flaky:         histogram12.setWidth((int) (byte) 10);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology10 = erode5.compose((morphology.BaseMorphology) erode9);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode9.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) (short) 10);
        histogram22.setSize((int) (short) 0);
        histogram22.setWidth((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        java.lang.Class<?> wildcardClass7 = histogram2.getClass();
        histogram2.setWidth(0);
        int int11 = histogram2.get((int) (short) 1);
        int[] intArray12 = histogram2.getData();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 100);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 35);
        histogram58.setSize((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize(0);
        try {
// flaky:             histogram1.put((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology10 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode9);
        morphology.Threshold threshold12 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: baseMorphology10.compose((morphology.BaseMorphology) threshold12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: baseMorphology10.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology10);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
        try {
            int int11 = 0; // flaky: histogram1.get((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setSize((int) (byte) 100);
        int[] intArray4 = histogram1.getData();
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) 'a', (int) (short) 10);
        util.Histogram histogram40 = null; // flaky: new util.Histogram(0);
// flaky:         histogram40.setSize((int) (short) 10);
// flaky:         histogram40.setSize((int) (byte) 100);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
// flaky:         histogram40.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) (byte) 100);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, 255);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) ' ');
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) (short) 100, 255);
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) 'a');
        histogram38.set((java.util.List<java.lang.Integer>) intList48);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1, (int) '4');
        try {
            int int30 = histogram28.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        try {
            int int11 = 0; // flaky: histogram1.get((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
        int int43 = 0; // flaky: histogram21.get(1);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        util.Histogram histogram2 = new util.Histogram(35, 32);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) (short) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.setWidth((int) (byte) 100);
        histogram4.setOffset((int) (short) 100);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
// flaky:         histogram10.setSize((int) (short) 10);
// flaky:         histogram10.setSize((int) (byte) 100);
// flaky:         histogram10.setOffset((int) (byte) 1);
// flaky:         histogram10.setOffset((int) '4');
        int[] intArray19 = null; // flaky: histogram10.getData();
// flaky:         histogram4.set(intArray19);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray19, (int) (short) 100);
        util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray19, 97);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setSize((int) (short) 10);
// flaky:         histogram26.setSize((int) (byte) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) 'a');
// flaky:         histogram24.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) (short) 10, 1);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList34);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        histogram1.setSize(52);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        histogram9.setWidth((int) (byte) 100);
        histogram9.setOffset((int) (short) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
// flaky:         histogram15.setOffset((int) (byte) 1);
// flaky:         histogram15.setOffset((int) '4');
        int[] intArray24 = null; // flaky: histogram15.getData();
// flaky:         histogram9.set(intArray24);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(intArray24, (int) (short) 100);
// flaky:         histogram1.set(intArray24);
// flaky:         org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        int int1 = util.RGBPixel.getGreen(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        try {
            util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = histogram7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray19, (int) (byte) 0, 32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
// flaky:         histogram4.setSize((int) 'a');
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
// flaky:         histogram28.setSize((int) (short) 10);
// flaky:         histogram28.setSize((int) (byte) 100);
// flaky:         histogram28.setSize((int) 'a');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram28.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, (int) '4');
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, 255);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97);
        java.lang.Class<?> wildcardClass62 = intList44.getClass();
        histogram2.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 255, (int) '4');
        try {
            util.Histogram histogram69 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) 'a', (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32, (int) '4');
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 0, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 1, 0);
// flaky:         histogram2.setSize((int) '#');
        try {
// flaky:             histogram2.put((int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = convolutionKernel9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth((int) '4');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
// flaky:         histogram17.setSize((int) 'a');
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
// flaky:         histogram41.setSize((int) (short) 10);
// flaky:         histogram41.setSize((int) (byte) 100);
// flaky:         histogram41.setSize((int) 'a');
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram41.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, 10);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, 1, (int) '4');
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList57);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList57);
// flaky:         histogram1.setOffset(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        histogram1.setOffset((int) (byte) 10);
        histogram1.put(1);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (byte) -1);
        histogram14.setWidth(1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        try {
            util.Histogram histogram15 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setSize((int) (short) 10);
// flaky:         histogram26.setSize((int) (byte) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) 'a');
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, 97, 255);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, 97);
        java.lang.Class<?> wildcardClass45 = intList34.getClass();
        histogram18.set((java.util.List<java.lang.Integer>) intList34);
        histogram18.setOffset((int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        util.Histogram histogram1 = new util.Histogram(100);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.put((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        int[] intArray8 = histogram7.getData();
        histogram3.set(intArray8);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, 52, (-1));
        util.Histogram histogram15 = new util.Histogram(intArray8, (int) (byte) 100, 1);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 100);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 255);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) '4');
        histogram15.set((java.util.List<java.lang.Integer>) intList25);
        histogram1.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 32);
        try {
            int int44 = histogram42.get(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
        util.Histogram histogram47 = new util.Histogram(intArray41, (int) (byte) 100, (int) '4');
        util.Histogram histogram49 = new util.Histogram(intArray41, 35);
        util.Histogram histogram51 = new util.Histogram(intArray41, 255);
        try {
            util.Histogram histogram53 = new util.Histogram(intArray41, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
// flaky:         histogram2.setSize((int) (short) 0);
// flaky:         histogram2.setWidth(255);
        int[] intArray12 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setSize(35);
// flaky:         histogram2.setSize(97);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList6, (int) '#', (int) (byte) 100);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
// flaky:         histogram12.setSize((int) 'a');
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList28);
        histogram10.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 97);
        histogram1.set((java.util.List<java.lang.Integer>) intList28);
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList28, 10, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList6, (int) '#', (int) (byte) 100);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
// flaky:         histogram12.setSize((int) 'a');
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList28);
        histogram10.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 97);
        histogram1.set((java.util.List<java.lang.Integer>) intList28);
        java.lang.Class<?> wildcardClass39 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 0, (int) 'a');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) 1);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        util.Histogram histogram19 = new util.Histogram((int) ' ');
        int[] intArray20 = histogram19.getData();
        histogram14.set(intArray20);
        histogram14.setSize((int) (short) 0);
        histogram14.setSize((int) (short) 100);
        histogram14.setOffset(2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 1);
        int[] intArray3 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        morphology.Sobel sobel7 = new morphology.Sobel(direction0);
        morphology.Sobel sobel8 = new morphology.Sobel(direction0);
        morphology.Sobel sobel9 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = sobel9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
// flaky:             histogram2.put(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) '#', (int) '#');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray16, 1);
        try {
            util.Histogram histogram25 = null; // flaky: new util.Histogram(intArray16, 0, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, 255);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray16, 0, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (byte) 100);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, 255);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
// flaky:         histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList64, (int) 'a');
        histogram54.set((java.util.List<java.lang.Integer>) intList64);
        histogram16.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) (short) 10, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList80);
        try {
            util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
// flaky:         histogram27.setSize((int) 'a');
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
// flaky:         histogram51.setSize((int) (short) 10);
// flaky:         histogram51.setSize((int) (byte) 100);
// flaky:         histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
// flaky:         histogram59.setSize((int) (short) 10);
// flaky:         histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
// flaky:         histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, (int) '4');
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        int[] intArray86 = histogram14.getData();
        util.Histogram histogram88 = new util.Histogram(intArray86, 100);
        int int90 = histogram88.get(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 9 + "'", int90 == 9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.setOffset(10);
        histogram14.setSize((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100);
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (-1), (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) -1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int int4 = 0; // flaky: histogram2.get((int) (byte) 1);
// flaky:         histogram2.setWidth((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        util.Histogram histogram14 = new util.Histogram(intArray9, (int) (short) 100, (int) (byte) 10);
        try {
            util.Histogram histogram16 = null; // flaky: new util.Histogram(intArray9, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        java.lang.Class<?> wildcardClass5 = erode4.getClass();
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        float[] floatArray10 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray10);
        float[] floatArray14 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel15 = null; // flaky: new morphology.ConvolutionKernel(floatArray14);
        morphology.BaseMorphology baseMorphology16 = null; // flaky: convolutionKernel11.compose((morphology.BaseMorphology) convolutionKernel15);
        morphology.BaseMorphology baseMorphology17 = sobel7.compose((morphology.BaseMorphology) convolutionKernel11);
        morphology.BaseMorphology baseMorphology18 = erode4.compose((morphology.BaseMorphology) sobel7);
        float[] floatArray21 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel22 = null; // flaky: new morphology.ConvolutionKernel(floatArray21);
        float[] floatArray25 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel26 = null; // flaky: new morphology.ConvolutionKernel(floatArray25);
        float[] floatArray29 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel30 = null; // flaky: new morphology.ConvolutionKernel(floatArray29);
        morphology.BaseMorphology baseMorphology31 = null; // flaky: convolutionKernel26.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology32 = null; // flaky: convolutionKernel22.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology33 = sobel7.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology34 = sobel2.compose((morphology.BaseMorphology) sobel7);
        java.awt.image.BufferedImage bufferedImage35 = null;
        try {
            java.awt.image.BufferedImage bufferedImage36 = sobel2.apply(bufferedImage35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + morphology.Sobel.Direction.UP + "'", direction6.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray14);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology16);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray29);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology31);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology32);
        org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(baseMorphology34);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        histogram7.setSize(52);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) '#', (int) (byte) 100);
        histogram17.put((int) '#');
        java.lang.Class<?> wildcardClass20 = histogram17.getClass();
        int[] intArray21 = histogram17.getData();
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (byte) 100);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, 255);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) ' ');
        histogram17.set((java.util.List<java.lang.Integer>) intList31);
        histogram7.set((java.util.List<java.lang.Integer>) intList31);
        java.lang.Class<?> wildcardClass45 = intList31.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
// flaky:         histogram19.setSize((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 10);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 1, (int) '4');
        histogram46.setWidth(255);
        util.Histogram histogram50 = new util.Histogram((int) ' ');
        histogram50.setWidth((int) (byte) 100);
        histogram50.setOffset((int) (short) 100);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
// flaky:         histogram56.setOffset((int) (byte) 1);
// flaky:         histogram56.setOffset((int) '4');
        int[] intArray65 = null; // flaky: histogram56.getData();
// flaky:         histogram50.set(intArray65);
        util.Histogram histogram68 = null; // flaky: new util.Histogram(intArray65, (int) (short) 100);
        util.Histogram histogram70 = null; // flaky: new util.Histogram(intArray65, 97);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) 'a');
// flaky:         histogram70.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) (short) 1, 32);
        histogram46.set((java.util.List<java.lang.Integer>) intList80);
        histogram16.set((java.util.List<java.lang.Integer>) intList80);
        int[] intArray91 = histogram16.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(intArray91);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        histogram1.setOffset((int) (byte) 10);
        try {
            histogram1.put((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology2 = null;
        morphology.BaseMorphology baseMorphology3 = threshold1.compose(baseMorphology2);
        org.junit.Assert.assertNotNull(baseMorphology3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
        util.Histogram histogram47 = new util.Histogram(intArray41, (int) (byte) 100, (int) '4');
        util.Histogram histogram49 = new util.Histogram(intArray41, 35);
        util.Histogram histogram51 = new util.Histogram(intArray41, 255);
        java.lang.Class<?> wildcardClass52 = histogram51.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = null; // flaky: intArray4.getClass();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray4, (int) '#', 52);
// flaky:         histogram10.setSize((int) (byte) 0);
// flaky:         org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass6 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.Erode erode3 = new morphology.Erode(floatArray1);
        float[] floatArray4 = new float[] {};
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.BaseMorphology baseMorphology6 = erode3.compose((morphology.BaseMorphology) erode5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode3.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(baseMorphology6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) (short) 10);
        try {
            int int24 = histogram22.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.Erode erode3 = new morphology.Erode(floatArray1);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = erode3.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (short) 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
// flaky:         histogram21.setWidth(100);
// flaky:         histogram21.setWidth((int) 'a');
        java.lang.Class<?> wildcardClass26 = null; // flaky: histogram21.getClass();
// flaky:         histogram21.setSize(32);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        int[] intArray6 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray6, 1, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = new util.Histogram(intArray17, 97);
        int int21 = histogram19.get(52);
        try {
            int int23 = histogram19.get(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.BaseMorphology baseMorphology8 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel7);
        java.lang.Class<?> wildcardClass9 = null; // flaky: baseMorphology8.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology8);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setSize(0);
// flaky:         histogram1.setWidth((int) (byte) 100);
        int[] intArray12 = null; // flaky: histogram1.getData();
// flaky:         histogram1.setWidth(0);
        java.lang.Class<?> wildcardClass15 = null; // flaky: histogram1.getClass();
// flaky:         org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15, (int) (short) 100);
        int[] intArray18 = histogram17.getData();
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray18, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        histogram14.put((int) (short) 0);
        util.Histogram histogram20 = new util.Histogram((int) (byte) 100);
        int[] intArray21 = histogram20.getData();
        util.Histogram histogram24 = new util.Histogram(intArray21, (int) ' ', 10);
        util.Histogram histogram26 = new util.Histogram(intArray21, (int) (byte) 10);
        histogram14.set(intArray21);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
// flaky:         histogram29.setSize((int) 'a');
        int int37 = 0; // flaky: histogram29.get((int) '4');
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
// flaky:         histogram39.setSize((int) (short) 10);
// flaky:         histogram39.setSize((int) (byte) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
// flaky:         histogram39.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList47, (int) (short) 10, (int) (byte) 10);
        int[] intArray53 = histogram52.getData();
        histogram52.setWidth(97);
        util.Histogram histogram57 = new util.Histogram((int) ' ');
        int[] intArray58 = histogram57.getData();
        histogram52.set(intArray58);
// flaky:         histogram29.set(intArray58);
        int[] intArray66 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram68 = new util.Histogram(intArray66, (int) 'a');
        util.Histogram histogram70 = new util.Histogram(intArray66, 100);
// flaky:         histogram29.set(intArray66);
        histogram14.set(intArray66);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray66);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.setSize(0);
        java.util.List<java.lang.Integer> intList35 = null;
        try {
            histogram7.set(intList35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 10, 52);
        try {
// flaky:             histogram20.put((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setSize((int) (short) 10);
// flaky:         histogram3.setSize((int) (byte) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
// flaky:         histogram3.set((java.util.List<java.lang.Integer>) intList11);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) (byte) 100);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, 255);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
// flaky:         histogram22.setSize((int) (short) 10);
// flaky:         histogram22.setSize((int) (byte) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30, intArray29);
// flaky:         histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList30, (int) 'a');
        histogram20.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) 10, (int) (byte) 10);
        histogram20.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (byte) 10);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (byte) 100);
        histogram1.set((java.util.List<java.lang.Integer>) intList45);
        try {
            util.Histogram histogram62 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) -1, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 100);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 35);
        try {
            util.Histogram histogram61 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) '#', (int) '#');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray16, 1);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(intArray16, 2, (int) (byte) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        histogram14.setOffset((int) (byte) -1);
        histogram14.setWidth((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Sobel.Direction direction3 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel4 = new morphology.Sobel(direction3);
        float[] floatArray7 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        float[] floatArray11 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel12 = null; // flaky: new morphology.ConvolutionKernel(floatArray11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) convolutionKernel12);
        morphology.BaseMorphology baseMorphology14 = sobel4.compose((morphology.BaseMorphology) convolutionKernel8);
        morphology.Threshold threshold16 = new morphology.Threshold(0.0f);
        float[] floatArray21 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode22 = new morphology.Erode(floatArray21);
        morphology.BaseMorphology baseMorphology23 = threshold16.compose((morphology.BaseMorphology) erode22);
        java.lang.Class<?> wildcardClass24 = erode22.getClass();
        morphology.Threshold threshold26 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology27 = erode22.compose((morphology.BaseMorphology) threshold26);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) erode22);
        morphology.BaseMorphology baseMorphology29 = erode2.compose((morphology.BaseMorphology) erode22);
        float[] floatArray30 = new float[] {};
        morphology.Erode erode31 = new morphology.Erode(floatArray30);
        morphology.ConvolutionKernel convolutionKernel32 = new morphology.ConvolutionKernel(floatArray30);
        float[] floatArray33 = new float[] {};
        morphology.Erode erode34 = new morphology.Erode(floatArray33);
        morphology.ConvolutionKernel convolutionKernel35 = new morphology.ConvolutionKernel(floatArray33);
        morphology.ConvolutionKernel convolutionKernel36 = new morphology.ConvolutionKernel(floatArray33);
        morphology.Erode erode37 = new morphology.Erode(floatArray33);
        morphology.Identity identity38 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology39 = erode37.compose((morphology.BaseMorphology) identity38);
        morphology.BaseMorphology baseMorphology40 = convolutionKernel32.compose((morphology.BaseMorphology) erode37);
        morphology.BaseMorphology baseMorphology41 = baseMorphology29.compose((morphology.BaseMorphology) convolutionKernel32);
        float[] floatArray44 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel45 = null; // flaky: new morphology.ConvolutionKernel(floatArray44);
        float[] floatArray48 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel49 = null; // flaky: new morphology.ConvolutionKernel(floatArray48);
        morphology.BaseMorphology baseMorphology50 = null; // flaky: convolutionKernel45.compose((morphology.BaseMorphology) convolutionKernel49);
        float[] floatArray51 = new float[] {};
        morphology.Erode erode52 = new morphology.Erode(floatArray51);
        morphology.ConvolutionKernel convolutionKernel53 = new morphology.ConvolutionKernel(floatArray51);
        morphology.ConvolutionKernel convolutionKernel54 = new morphology.ConvolutionKernel(floatArray51);
        morphology.BaseMorphology baseMorphology55 = null; // flaky: convolutionKernel45.compose((morphology.BaseMorphology) convolutionKernel54);
        morphology.BaseMorphology baseMorphology56 = baseMorphology41.compose(baseMorphology55);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + morphology.Sobel.Direction.UP + "'", direction3.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(baseMorphology23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(baseMorphology27);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(baseMorphology39);
        org.junit.Assert.assertNotNull(baseMorphology40);
        org.junit.Assert.assertNotNull(baseMorphology41);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray48);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology50);
        org.junit.Assert.assertNotNull(floatArray51);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology55);
        org.junit.Assert.assertNotNull(baseMorphology56);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        java.lang.Class<?> wildcardClass24 = intList17.getClass();
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, 0, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        int[] intArray50 = histogram49.getData();
// flaky:         histogram1.set(intArray50);
        util.Histogram histogram54 = new util.Histogram(1, (int) (short) 100);
        int[] intArray55 = histogram54.getData();
        util.Histogram histogram57 = new util.Histogram(intArray55, (int) '#');
        int[] intArray58 = histogram57.getData();
// flaky:         histogram1.set(intArray58);
// flaky:         histogram1.setSize((int) 'a');
        int[] intArray62 = null; // flaky: histogram1.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray58);
// flaky:         org.junit.Assert.assertNotNull(intArray62);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) (short) 1);
        histogram2.setWidth((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = histogram2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 97, 255);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45, (int) (short) 10);
// flaky:         histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram51 = new util.Histogram(intArray45, (int) '4');
        histogram51.setOffset(97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 1);
        try {
            int int3 = histogram1.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
// flaky:         histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, 100);
        histogram39.setWidth(10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray3);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode7 = new morphology.Erode(floatArray3);
        morphology.Identity identity8 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology9 = erode7.compose((morphology.BaseMorphology) identity8);
        morphology.BaseMorphology baseMorphology10 = convolutionKernel2.compose((morphology.BaseMorphology) erode7);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode7.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(255, (int) (short) -1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray17, (int) (short) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
// flaky:         histogram21.setOffset(1);
// flaky:         histogram21.setOffset((int) (short) -1);
        int[] intArray46 = null; // flaky: histogram21.getData();
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
// flaky:         org.junit.Assert.assertNotNull(intArray46);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        int[] intArray20 = histogram14.getData();
        histogram14.setWidth((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        histogram16.setOffset((int) 'a');
        try {
            histogram16.put((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        util.Histogram histogram2 = new util.Histogram(100, (int) '#');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10, 255);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
// flaky:         histogram1.setOffset((int) ' ');
// flaky:         histogram1.setOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = null; // flaky: histogram1.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setWidth(0);
// flaky:         histogram3.setSize((int) 'a');
// flaky:         histogram3.setWidth((int) (byte) 100);
        int[] intArray10 = null; // flaky: histogram3.getData();
// flaky:         histogram1.set(intArray10);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList21);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList21, (int) 'a');
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList21, 97, 255);
        histogram1.set((java.util.List<java.lang.Integer>) intList21);
        histogram1.setWidth((int) ' ');
// flaky:         org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        util.Histogram histogram19 = new util.Histogram((int) ' ');
        int[] intArray20 = histogram19.getData();
        histogram14.set(intArray20);
        try {
            util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray20, 0, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) 'a', (int) (short) 10);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 100);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 35);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
// flaky:         histogram44.setSize((int) (short) 10);
// flaky:         histogram44.setSize((int) (byte) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
// flaky:         histogram44.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) 'a');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) ' ', 100);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) (byte) 10, 255);
        histogram42.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, 2, 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram6 = new util.Histogram(intArray3, (int) (byte) 100, 97);
        histogram6.put((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset(32);
        histogram1.setSize((int) (short) 0);
        try {
            int int9 = histogram1.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.Identity identity11 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology12 = erode10.compose((morphology.BaseMorphology) identity11);
        morphology.BaseMorphology baseMorphology13 = convolutionKernel5.compose((morphology.BaseMorphology) identity11);
        float[] floatArray14 = new float[] {};
        morphology.Erode erode15 = new morphology.Erode(floatArray14);
        morphology.BaseMorphology baseMorphology16 = identity11.compose((morphology.BaseMorphology) erode15);
        float[] floatArray17 = new float[] {};
        morphology.Erode erode18 = new morphology.Erode(floatArray17);
        morphology.ConvolutionKernel convolutionKernel19 = new morphology.ConvolutionKernel(floatArray17);
        morphology.Erode erode20 = new morphology.Erode(floatArray17);
        morphology.ConvolutionKernel convolutionKernel21 = new morphology.ConvolutionKernel(floatArray17);
        java.lang.Class<?> wildcardClass22 = floatArray17.getClass();
        morphology.ConvolutionKernel convolutionKernel23 = new morphology.ConvolutionKernel(floatArray17);
        morphology.BaseMorphology baseMorphology24 = erode15.compose((morphology.BaseMorphology) convolutionKernel23);
        java.awt.image.BufferedImage bufferedImage25 = null;
        try {
            java.awt.image.BufferedImage bufferedImage26 = erode15.apply(bufferedImage25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(baseMorphology16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(baseMorphology24);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        util.Histogram histogram2 = new util.Histogram(10, (int) (byte) 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(10, 0);
        try {
// flaky:             histogram2.put((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 1, (int) '4');
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList41);
        try {
            util.Histogram histogram56 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (byte) -1, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        histogram8.put((int) (byte) 10);
        util.Histogram histogram12 = new util.Histogram((int) ' ');
        int[] intArray13 = histogram12.getData();
        histogram8.set(intArray13);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray13, 52, (-1));
        util.Histogram histogram20 = new util.Histogram(intArray13, (int) (byte) 100, 1);
        util.Histogram histogram22 = new util.Histogram(intArray13, (int) '4');
        util.Histogram histogram25 = new util.Histogram(1, (int) (short) 100);
        int[] intArray26 = histogram25.getData();
        histogram22.set(intArray26);
        histogram2.set(intArray26);
        util.Histogram histogram31 = new util.Histogram(1, (int) (short) 100);
        histogram31.setSize((int) '4');
        histogram31.setWidth(35);
        util.Histogram histogram37 = new util.Histogram((int) ' ');
        histogram37.put((int) (byte) 10);
        util.Histogram histogram41 = new util.Histogram((int) ' ');
        int[] intArray42 = histogram41.getData();
        histogram37.set(intArray42);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(intArray42, 52, (-1));
        util.Histogram histogram49 = new util.Histogram(intArray42, (int) (byte) 100, 1);
        util.Histogram histogram51 = new util.Histogram(intArray42, (int) '4');
        util.Histogram histogram54 = new util.Histogram(1, (int) (short) 100);
        int[] intArray55 = histogram54.getData();
        histogram51.set(intArray55);
        histogram31.set(intArray55);
        int[] intArray58 = histogram31.getData();
        histogram2.set(intArray58);
        try {
            util.Histogram histogram62 = null; // flaky: new util.Histogram(intArray58, (int) (byte) 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray58);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
// flaky:         histogram1.set(intArray10);
// flaky:         histogram1.setOffset((int) '4');
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 100);
        histogram56.setOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray8);
        morphology.BaseMorphology baseMorphology13 = erode7.compose((morphology.BaseMorphology) convolutionKernel12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 1);
        histogram2.setOffset(0);
        util.Histogram histogram7 = new util.Histogram(1, (int) (short) 100);
        histogram7.setSize((int) '4');
        histogram7.setWidth(35);
        util.Histogram histogram13 = new util.Histogram((int) ' ');
        histogram13.put((int) (byte) 10);
        util.Histogram histogram17 = new util.Histogram((int) ' ');
        int[] intArray18 = histogram17.getData();
        histogram13.set(intArray18);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray18, 52, (-1));
        util.Histogram histogram25 = new util.Histogram(intArray18, (int) (byte) 100, 1);
        util.Histogram histogram27 = new util.Histogram(intArray18, (int) '4');
        util.Histogram histogram30 = new util.Histogram(1, (int) (short) 100);
        int[] intArray31 = histogram30.getData();
        histogram27.set(intArray31);
        histogram7.set(intArray31);
        int[] intArray34 = histogram7.getData();
        histogram2.set(intArray34);
        int[] intArray36 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        int[] intArray5 = histogram2.getData();
        util.Histogram histogram8 = new util.Histogram(intArray5, (int) (byte) 10, (int) (byte) 100);
        histogram8.put(0);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (short) 10);
        histogram2.setWidth((int) (byte) 10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
// flaky:         histogram27.setSize((int) 'a');
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
// flaky:         histogram51.setSize((int) (short) 10);
// flaky:         histogram51.setSize((int) (byte) 100);
// flaky:         histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
// flaky:         histogram59.setSize((int) (short) 10);
// flaky:         histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
// flaky:         histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, (int) '4');
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        int[] intArray86 = histogram14.getData();
        try {
            util.Histogram histogram88 = null; // flaky: new util.Histogram(intArray86, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray86);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
        int int7 = histogram1.get((int) (short) 10);
        histogram1.setOffset(32);
        try {
            histogram1.put((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        java.lang.Class<?> wildcardClass35 = histogram34.getClass();
        util.Histogram histogram37 = new util.Histogram((int) ' ');
        int[] intArray38 = histogram37.getData();
        java.lang.Class<?> wildcardClass39 = histogram37.getClass();
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
// flaky:         histogram41.setSize((int) (short) 10);
// flaky:         histogram41.setSize((int) (byte) 100);
        util.Histogram histogram47 = null; // flaky: new util.Histogram(0);
// flaky:         histogram47.setSize((int) (short) 10);
// flaky:         histogram47.setSize((int) (byte) 100);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
// flaky:         histogram47.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList55, (int) 'a');
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList55, 97, 255);
// flaky:         histogram41.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram65 = null; // flaky: new util.Histogram(0);
// flaky:         histogram65.setSize((int) (short) 10);
// flaky:         histogram65.setSize((int) (byte) 100);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList73 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
// flaky:         histogram65.set((java.util.List<java.lang.Integer>) intList73);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList73, (int) 'a');
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList73, (int) '4', (int) 'a');
        int[] intArray81 = histogram80.getData();
        util.Histogram histogram83 = new util.Histogram(intArray81, (int) (short) 10);
// flaky:         histogram41.set(intArray81);
        histogram37.set(intArray81);
        util.Histogram histogram87 = new util.Histogram(intArray81, (int) (short) 100);
        histogram34.set(intArray81);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray81);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram17 = new util.Histogram((int) (byte) 100);
        int[] intArray18 = histogram17.getData();
        util.Histogram histogram21 = new util.Histogram(intArray18, (int) ' ', 10);
        util.Histogram histogram23 = new util.Histogram(intArray18, (int) (byte) 10);
        histogram15.set(intArray18);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        int[] intArray6 = histogram1.getData();
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        util.Histogram histogram2 = new util.Histogram((int) (short) 100, 97);
        histogram2.setSize((int) ' ');
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (byte) 100);
        histogram2.setSize(97);
        histogram2.setOffset((int) 'a');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intList0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
// flaky:         histogram19.setOffset(32);
        try {
// flaky:             histogram19.setSize((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        util.Histogram histogram1 = new util.Histogram(100);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.put((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        int[] intArray8 = histogram7.getData();
        histogram3.set(intArray8);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, 52, (-1));
        util.Histogram histogram15 = new util.Histogram(intArray8, (int) (byte) 100, 1);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 100);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 255);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) '4');
        histogram15.set((java.util.List<java.lang.Integer>) intList25);
        histogram1.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 32, (int) (byte) 100);
        histogram43.setOffset(10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setSize((int) (byte) 0);
        try {
            histogram14.put(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, 100);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', 35);
        histogram25.setOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        util.Histogram histogram1 = new util.Histogram(10);
        try {
            int int3 = histogram1.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
// flaky:         histogram4.setSize((int) 'a');
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
// flaky:         histogram28.setSize((int) (short) 10);
// flaky:         histogram28.setSize((int) (byte) 100);
// flaky:         histogram28.setSize((int) 'a');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram28.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, (int) '4');
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 1, 255);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97);
        java.lang.Class<?> wildcardClass62 = intList44.getClass();
        histogram2.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 255, (int) '4');
        try {
            util.Histogram histogram69 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) ' ');
        histogram25.setOffset((int) (byte) 100);
        histogram25.setWidth((int) (byte) 1);
        int int31 = histogram25.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        util.Histogram histogram10 = new util.Histogram(intArray7, 10, 52);
        histogram10.setWidth((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setOffset(1);
        int int21 = histogram14.get(0);
        int[] intArray22 = histogram14.getData();
        histogram14.setSize(10);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setSize((int) (short) 10);
// flaky:         histogram26.setSize((int) (byte) 100);
        util.Histogram histogram32 = null; // flaky: new util.Histogram(0);
// flaky:         histogram32.setSize((int) (short) 10);
// flaky:         histogram32.setSize((int) (byte) 100);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
// flaky:         histogram32.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, (int) 'a');
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, 97, 255);
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
// flaky:         histogram50.setSize((int) (short) 10);
// flaky:         histogram50.setSize((int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
// flaky:         histogram50.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList58, (int) 'a');
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList58, (int) '4', (int) 'a');
        int[] intArray66 = histogram65.getData();
        util.Histogram histogram68 = new util.Histogram(intArray66, (int) (short) 10);
// flaky:         histogram26.set(intArray66);
        util.Histogram histogram72 = new util.Histogram(intArray66, (int) (byte) 100, (int) '4');
        histogram14.set(intArray66);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray66);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode9 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = erode9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
// flaky:         histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, 100);
        int[] intArray40 = histogram39.getData();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.setWidth((int) (byte) 100);
        util.Histogram histogram33 = new util.Histogram((int) ' ');
        int[] intArray34 = histogram33.getData();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList38, (int) '#', (int) (byte) 100);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
// flaky:         histogram44.setSize((int) (short) 10);
// flaky:         histogram44.setSize((int) (byte) 100);
// flaky:         histogram44.setSize((int) 'a');
        util.Histogram histogram52 = null; // flaky: new util.Histogram(0);
// flaky:         histogram52.setSize((int) (short) 10);
// flaky:         histogram52.setSize((int) (byte) 100);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
// flaky:         histogram52.set((java.util.List<java.lang.Integer>) intList60);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList60, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram44.set((java.util.List<java.lang.Integer>) intList60);
        histogram42.set((java.util.List<java.lang.Integer>) intList60);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList60, 97);
        histogram33.set((java.util.List<java.lang.Integer>) intList60);
        histogram28.set((java.util.List<java.lang.Integer>) intList60);
        util.Histogram histogram73 = null; // flaky: new util.Histogram(0);
// flaky:         histogram73.setSize((int) (short) 10);
// flaky:         histogram73.setSize((int) (byte) 100);
// flaky:         histogram73.setSize((int) 'a');
        util.Histogram histogram81 = null; // flaky: new util.Histogram(0);
// flaky:         histogram81.setSize((int) (short) 10);
// flaky:         histogram81.setSize((int) (byte) 100);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
// flaky:         histogram81.set((java.util.List<java.lang.Integer>) intList89);
        util.Histogram histogram94 = new util.Histogram((java.util.List<java.lang.Integer>) intList89, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram73.set((java.util.List<java.lang.Integer>) intList89);
        util.Histogram histogram97 = new util.Histogram((java.util.List<java.lang.Integer>) intList89, 10);
        histogram28.set((java.util.List<java.lang.Integer>) intList89);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        histogram20.setWidth((int) (short) 0);
        histogram20.setOffset((int) (short) 1);
        int int26 = histogram20.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        java.lang.Class<?> wildcardClass37 = null; // flaky: histogram21.getClass();
// flaky:         histogram21.setSize((int) (byte) 0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intArray0, 52, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        histogram16.setSize(35);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
// flaky:         histogram20.setSize((int) 'a');
        int int28 = 0; // flaky: histogram20.get((int) (short) 0);
        int[] intArray29 = null; // flaky: histogram20.getData();
        util.Histogram histogram31 = null; // flaky: new util.Histogram(0);
// flaky:         histogram31.setSize((int) (short) 10);
// flaky:         histogram31.setSize((int) (byte) 100);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
// flaky:         histogram31.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (byte) 100);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, 255);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) ' ');
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList39);
        histogram16.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram54 = new util.Histogram((int) (byte) 100);
        int[] intArray55 = histogram54.getData();
        histogram16.set(intArray55);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intList0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
// flaky:         histogram21.setOffset(1);
// flaky:         histogram21.setOffset((-1));
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 2);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        try {
            util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel4 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.Threshold threshold6 = new morphology.Threshold(0.0f);
        float[] floatArray11 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode12 = new morphology.Erode(floatArray11);
        morphology.BaseMorphology baseMorphology13 = threshold6.compose((morphology.BaseMorphology) erode12);
        morphology.BaseMorphology baseMorphology14 = null; // flaky: convolutionKernel4.compose((morphology.BaseMorphology) erode12);
        java.awt.image.BufferedImage bufferedImage15 = null;
        try {
            java.awt.image.BufferedImage bufferedImage16 = erode12.apply(bufferedImage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(baseMorphology13);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        java.lang.Class<?> wildcardClass8 = histogram1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) (short) 1);
        histogram2.setOffset((-1));
        try {
            histogram2.put(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        try {
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) -1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        histogram16.setSize(35);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
// flaky:         histogram20.setSize((int) 'a');
        int int28 = 0; // flaky: histogram20.get((int) (short) 0);
        int[] intArray29 = null; // flaky: histogram20.getData();
        util.Histogram histogram31 = null; // flaky: new util.Histogram(0);
// flaky:         histogram31.setSize((int) (short) 10);
// flaky:         histogram31.setSize((int) (byte) 100);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
// flaky:         histogram31.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (byte) 100);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, 255);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) ' ');
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList39);
        histogram16.set((java.util.List<java.lang.Integer>) intList39);
        java.lang.Class<?> wildcardClass53 = intList39.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, 52, (int) (byte) -1);
        util.Histogram histogram7 = new util.Histogram(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
// flaky:         histogram1.setSize(1);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
// flaky:         histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (byte) 100);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 255);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
// flaky:         histogram34.setSize((int) (short) 10);
// flaky:         histogram34.setSize((int) (byte) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
// flaky:         histogram34.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) 'a');
        histogram32.set((java.util.List<java.lang.Integer>) intList42);
        java.lang.Class<?> wildcardClass48 = intList42.getClass();
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (short) 100);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList42);
// flaky:         histogram1.setSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
// flaky:         histogram2.setOffset(10);
// flaky:         histogram2.setSize((int) '4');
        util.Histogram histogram9 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray10 = histogram9.getData();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) '#', (int) (byte) 100);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
// flaky:         histogram20.setSize((int) 'a');
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
// flaky:         histogram28.setSize((int) (short) 10);
// flaky:         histogram28.setSize((int) (byte) 100);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
// flaky:         histogram28.set((java.util.List<java.lang.Integer>) intList36);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList36, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList36);
        histogram18.set((java.util.List<java.lang.Integer>) intList36);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList36, 97);
        histogram9.set((java.util.List<java.lang.Integer>) intList36);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList36, (int) (short) 10, (int) (short) 1);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        util.Histogram histogram14 = new util.Histogram(intArray9, (int) (short) 100, (int) (byte) 10);
        util.Histogram histogram17 = new util.Histogram(intArray9, 32, (int) (byte) 10);
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray9, (int) (short) 0, 255);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '4', (int) ' ');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 10);
        histogram19.setSize(35);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
// flaky:         histogram23.setSize((int) 'a');
        int int31 = 0; // flaky: histogram23.get((int) (short) 0);
        int[] intArray32 = null; // flaky: histogram23.getData();
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
// flaky:         histogram34.setSize((int) (short) 10);
// flaky:         histogram34.setSize((int) (byte) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
// flaky:         histogram34.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (byte) 100);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, 255);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) ' ');
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList42);
        histogram19.set((java.util.List<java.lang.Integer>) intList42);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList42);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass2 = erode1.getClass();
        float[] floatArray7 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.Erode erode9 = new morphology.Erode(floatArray7);
        morphology.BaseMorphology baseMorphology10 = erode1.compose((morphology.BaseMorphology) erode9);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
        try {
            util.Histogram histogram47 = null; // flaky: new util.Histogram(intArray41, 0, 255);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = new util.Histogram(intArray6, 100, (int) (byte) 10);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (byte) 100);
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, 255);
        util.Histogram histogram31 = null; // flaky: new util.Histogram(0);
// flaky:         histogram31.setSize((int) (short) 10);
// flaky:         histogram31.setSize((int) (byte) 100);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
// flaky:         histogram31.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) 'a');
        histogram29.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(0);
// flaky:         histogram46.setSize((int) (short) 10);
// flaky:         histogram46.setSize((int) (byte) 100);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
// flaky:         histogram46.set((java.util.List<java.lang.Integer>) intList54);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (short) 10, (int) (byte) 10);
        histogram29.set((java.util.List<java.lang.Integer>) intList54);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (byte) 10);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList54, (int) (short) 100, (int) (short) 100);
        histogram10.set((java.util.List<java.lang.Integer>) intList54);
        histogram10.put((int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray4);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray4);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        try {
            histogram1.put(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        morphology.Threshold threshold1 = new morphology.Threshold((float) ' ');
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10, 255);
        int[] intArray20 = histogram19.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        histogram2.setWidth(97);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
// flaky:         histogram1.set(intArray10);
        util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray10, 100, (int) (short) -1);
        int int16 = 0; // flaky: histogram14.get((int) (short) 10);
        int[] intArray17 = null; // flaky: histogram14.getData();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = null; // flaky: intArray4.getClass();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray4, (int) '#', 52);
        java.lang.Class<?> wildcardClass11 = null; // flaky: histogram10.getClass();
// flaky:         org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
// flaky:         histogram19.setSize((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 10);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 1, (int) '4');
        histogram46.setWidth(255);
        util.Histogram histogram50 = new util.Histogram((int) ' ');
        histogram50.setWidth((int) (byte) 100);
        histogram50.setOffset((int) (short) 100);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
// flaky:         histogram56.setOffset((int) (byte) 1);
// flaky:         histogram56.setOffset((int) '4');
        int[] intArray65 = null; // flaky: histogram56.getData();
// flaky:         histogram50.set(intArray65);
        util.Histogram histogram68 = null; // flaky: new util.Histogram(intArray65, (int) (short) 100);
        util.Histogram histogram70 = null; // flaky: new util.Histogram(intArray65, 97);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) 'a');
// flaky:         histogram70.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) (short) 1, 32);
        histogram46.set((java.util.List<java.lang.Integer>) intList80);
        histogram16.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram93 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 10, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97, 255);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
        int[] intArray9 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray9, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
// flaky:         org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 10L);
        morphology.Sobel.Direction direction2 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel3 = new morphology.Sobel(direction2);
        morphology.Sobel sobel4 = new morphology.Sobel(direction2);
        float[] floatArray5 = new float[] {};
        morphology.Erode erode6 = new morphology.Erode(floatArray5);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray5);
        morphology.Erode erode8 = new morphology.Erode(floatArray5);
        morphology.Erode erode9 = new morphology.Erode(floatArray5);
        morphology.BaseMorphology baseMorphology10 = sobel4.compose((morphology.BaseMorphology) erode9);
        morphology.BaseMorphology baseMorphology11 = threshold1.compose((morphology.BaseMorphology) erode9);
        float[] floatArray13 = new float[] { 0L };
        morphology.Erode erode14 = new morphology.Erode(floatArray13);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray13);
        java.lang.Class<?> wildcardClass16 = floatArray13.getClass();
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray13);
        morphology.Erode erode18 = new morphology.Erode(floatArray13);
        float[] floatArray20 = new float[] { 0L };
        morphology.Erode erode21 = new morphology.Erode(floatArray20);
        morphology.ConvolutionKernel convolutionKernel22 = new morphology.ConvolutionKernel(floatArray20);
        java.lang.Class<?> wildcardClass23 = floatArray20.getClass();
        morphology.ConvolutionKernel convolutionKernel24 = new morphology.ConvolutionKernel(floatArray20);
        morphology.ConvolutionKernel convolutionKernel25 = new morphology.ConvolutionKernel(floatArray20);
        morphology.BaseMorphology baseMorphology26 = erode18.compose((morphology.BaseMorphology) convolutionKernel25);
        morphology.BaseMorphology baseMorphology27 = threshold1.compose((morphology.BaseMorphology) erode18);
        java.awt.image.BufferedImage bufferedImage28 = null;
        try {
            java.awt.image.BufferedImage bufferedImage29 = erode18.apply(bufferedImage28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction2.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(baseMorphology26);
        org.junit.Assert.assertNotNull(baseMorphology27);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 97, (int) 'a');
        histogram52.setWidth((int) '#');
        int int56 = histogram52.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (byte) 100);
        histogram33.setOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, 255);
// flaky:         histogram19.setOffset(1);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        util.Histogram histogram19 = new util.Histogram((int) ' ');
        int[] intArray20 = histogram19.getData();
        histogram14.set(intArray20);
        try {
            util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray20, (int) (short) 10, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setOffset((int) (short) 100);
        int int17 = 0; // flaky: histogram1.get(1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) '4');
        histogram56.setOffset(10);
        histogram56.put((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) ' ');
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 32);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.setWidth((int) (byte) 100);
        util.Histogram histogram33 = new util.Histogram((int) ' ');
        int[] intArray34 = histogram33.getData();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList38, (int) '#', (int) (byte) 100);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
// flaky:         histogram44.setSize((int) (short) 10);
// flaky:         histogram44.setSize((int) (byte) 100);
// flaky:         histogram44.setSize((int) 'a');
        util.Histogram histogram52 = null; // flaky: new util.Histogram(0);
// flaky:         histogram52.setSize((int) (short) 10);
// flaky:         histogram52.setSize((int) (byte) 100);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
// flaky:         histogram52.set((java.util.List<java.lang.Integer>) intList60);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList60, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram44.set((java.util.List<java.lang.Integer>) intList60);
        histogram42.set((java.util.List<java.lang.Integer>) intList60);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList60, 97);
        histogram33.set((java.util.List<java.lang.Integer>) intList60);
        histogram28.set((java.util.List<java.lang.Integer>) intList60);
        try {
            histogram28.put((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        util.Histogram histogram2 = new util.Histogram(100, 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (byte) 100);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, 255);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) ' ');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '4');
        histogram2.set((java.util.List<java.lang.Integer>) intList12);
        histogram2.setOffset((int) (byte) -1);
        histogram2.setWidth((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        float[] floatArray9 = new float[] {};
        morphology.Erode erode10 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel13 = new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray9);
        morphology.Erode erode15 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel16 = new morphology.ConvolutionKernel(floatArray9);
        morphology.Erode erode17 = new morphology.Erode(floatArray9);
        morphology.Erode erode18 = new morphology.Erode(floatArray9);
        morphology.BaseMorphology baseMorphology19 = baseMorphology8.compose((morphology.BaseMorphology) erode18);
        java.awt.image.BufferedImage bufferedImage20 = null;
        try {
            java.awt.image.BufferedImage bufferedImage21 = erode18.apply(bufferedImage20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(baseMorphology19);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        int int1 = util.RGBPixel.getGreen(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) (short) 10);
        util.Histogram histogram25 = new util.Histogram(intArray17, 97, (int) (byte) 10);
        util.Histogram histogram27 = new util.Histogram(100);
        util.Histogram histogram29 = new util.Histogram((int) ' ');
        histogram29.put((int) (byte) 10);
        util.Histogram histogram33 = new util.Histogram((int) ' ');
        int[] intArray34 = histogram33.getData();
        histogram29.set(intArray34);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(intArray34, 52, (-1));
        util.Histogram histogram41 = new util.Histogram(intArray34, (int) (byte) 100, 1);
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
// flaky:         histogram43.setSize((int) (short) 10);
// flaky:         histogram43.setSize((int) (byte) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
// flaky:         histogram43.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (byte) 100);
        util.Histogram histogram60 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, 255);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) ' ');
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) '4');
        histogram41.set((java.util.List<java.lang.Integer>) intList51);
        histogram27.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, 32, (int) (byte) 100);
        histogram25.set((java.util.List<java.lang.Integer>) intList51);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        try {
            histogram16.put((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        histogram14.setOffset((int) (byte) -1);
        util.Histogram histogram36 = new util.Histogram(100, 10);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(0);
// flaky:         histogram38.setSize((int) (short) 10);
// flaky:         histogram38.setSize((int) (byte) 100);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
// flaky:         histogram38.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (byte) 100);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, 255);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) ' ');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) '4');
        histogram36.set((java.util.List<java.lang.Integer>) intList46);
        histogram14.set((java.util.List<java.lang.Integer>) intList46);
        histogram14.setSize((int) (byte) 10);
        histogram14.setOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
// flaky:         histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 97, 255);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49, (int) (short) 10);
// flaky:         histogram9.set(intArray49);
        histogram1.set(intArray49);
        histogram1.setOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 255, 255, (-1), 2, 97, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        try {
            util.Histogram histogram10 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setOffset(100);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        histogram7.put((int) (byte) 10);
        util.Histogram histogram11 = new util.Histogram((int) ' ');
        int[] intArray12 = histogram11.getData();
        histogram7.set(intArray12);
        try {
// flaky:             histogram1.set(intArray12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass16 = null; // flaky: histogram1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        int[] intArray5 = null; // flaky: histogram4.getData();
        try {
// flaky:             histogram2.set(intArray5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        try {
            int int22 = histogram20.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
// flaky:         histogram1.setSize(1);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
// flaky:         histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (byte) 100);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 255);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
// flaky:         histogram34.setSize((int) (short) 10);
// flaky:         histogram34.setSize((int) (byte) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
// flaky:         histogram34.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) 'a');
        histogram32.set((java.util.List<java.lang.Integer>) intList42);
        java.lang.Class<?> wildcardClass48 = intList42.getClass();
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (short) 100);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList42);
        int[] intArray52 = null; // flaky: histogram1.getData();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
// flaky:         org.junit.Assert.assertNotNull(intArray52);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray4, 52, 1);
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray4, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        util.Histogram histogram10 = new util.Histogram(intArray7, 10, 52);
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray7, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        java.lang.Class<?> wildcardClass50 = intList43.getClass();
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray4);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        java.lang.Class<?> wildcardClass10 = erode9.getClass();
        morphology.Sobel.Direction direction11 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel12 = new morphology.Sobel(direction11);
        float[] floatArray15 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel16 = null; // flaky: new morphology.ConvolutionKernel(floatArray15);
        float[] floatArray19 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel20 = null; // flaky: new morphology.ConvolutionKernel(floatArray19);
        morphology.BaseMorphology baseMorphology21 = null; // flaky: convolutionKernel16.compose((morphology.BaseMorphology) convolutionKernel20);
        morphology.BaseMorphology baseMorphology22 = sobel12.compose((morphology.BaseMorphology) convolutionKernel16);
        morphology.BaseMorphology baseMorphology23 = erode9.compose((morphology.BaseMorphology) sobel12);
        float[] floatArray26 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel27 = null; // flaky: new morphology.ConvolutionKernel(floatArray26);
        float[] floatArray30 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel31 = null; // flaky: new morphology.ConvolutionKernel(floatArray30);
        float[] floatArray34 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel35 = null; // flaky: new morphology.ConvolutionKernel(floatArray34);
        morphology.BaseMorphology baseMorphology36 = null; // flaky: convolutionKernel31.compose((morphology.BaseMorphology) convolutionKernel35);
        morphology.BaseMorphology baseMorphology37 = null; // flaky: convolutionKernel27.compose((morphology.BaseMorphology) convolutionKernel35);
        morphology.BaseMorphology baseMorphology38 = sobel12.compose((morphology.BaseMorphology) convolutionKernel35);
        morphology.BaseMorphology baseMorphology39 = convolutionKernel7.compose((morphology.BaseMorphology) convolutionKernel35);
        java.awt.image.BufferedImage bufferedImage40 = null;
        try {
            java.awt.image.BufferedImage bufferedImage41 = convolutionKernel7.apply(bufferedImage40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + morphology.Sobel.Direction.UP + "'", direction11.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology21);
        org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(baseMorphology23);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray34);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology36);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology37);
        org.junit.Assert.assertNotNull(baseMorphology38);
        org.junit.Assert.assertNotNull(baseMorphology39);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        int[] intArray50 = histogram49.getData();
// flaky:         histogram1.set(intArray50);
// flaky:         histogram1.put((int) (short) 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) '#', (int) (byte) 100);
        histogram61.put((int) '#');
        java.lang.Class<?> wildcardClass64 = histogram61.getClass();
        int[] intArray65 = histogram61.getData();
        util.Histogram histogram67 = null; // flaky: new util.Histogram(0);
// flaky:         histogram67.setSize((int) (short) 10);
// flaky:         histogram67.setSize((int) (byte) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
// flaky:         histogram67.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList75, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList75, (int) (byte) 100);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList75, 255);
        util.Histogram histogram86 = new util.Histogram((java.util.List<java.lang.Integer>) intList75, (int) ' ');
        histogram61.set((java.util.List<java.lang.Integer>) intList75);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList75);
        try {
            util.Histogram histogram91 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList75, (int) (byte) 0, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        histogram7.put((int) (byte) 10);
        util.Histogram histogram11 = new util.Histogram((int) ' ');
        int[] intArray12 = histogram11.getData();
        histogram7.set(intArray12);
        util.Histogram histogram16 = null; // flaky: new util.Histogram(intArray12, 52, (-1));
        util.Histogram histogram19 = new util.Histogram(intArray12, (int) (byte) 100, 1);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (byte) 100);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 255);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) ' ');
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) '4');
        histogram19.set((java.util.List<java.lang.Integer>) intList29);
        histogram1.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram47 = new util.Histogram(1, (int) (short) 100);
        int[] intArray48 = histogram47.getData();
        histogram1.set(intArray48);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray48);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, 52);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) 'a');
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) '4', (int) 'a');
        int[] intArray52 = histogram51.getData();
        util.Histogram histogram54 = new util.Histogram(intArray52, 97);
        histogram34.set(intArray52);
        histogram34.put((int) ' ');
        histogram34.setOffset((int) (byte) 100);
        int[] intArray60 = histogram34.getData();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray60);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
        util.Histogram histogram47 = new util.Histogram(intArray41, (int) (byte) 100, (int) '4');
        util.Histogram histogram49 = new util.Histogram(intArray41, 35);
        try {
            util.Histogram histogram51 = null; // flaky: new util.Histogram(intArray41, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) '#', (int) '#');
        int[] intArray21 = null; // flaky: histogram20.getData();
// flaky:         histogram20.setOffset(10);
// flaky:         histogram20.setSize(52);
// flaky:         histogram20.setOffset(0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        histogram1.put(52);
        histogram1.put((int) (short) 0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
// flaky:         histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram(1, (int) (short) 100);
        int[] intArray40 = histogram39.getData();
        util.Histogram histogram42 = new util.Histogram(intArray40, (int) '#');
        int[] intArray43 = histogram42.getData();
        histogram7.set(intArray43);
        util.Histogram histogram47 = new util.Histogram(intArray43, 10, 35);
        try {
            util.Histogram histogram50 = null; // flaky: new util.Histogram(intArray43, 0, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = sobel4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (short) 100);
        try {
            util.Histogram histogram57 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (-1), 32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        int int1 = util.RGBPixel.getRed(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        histogram13.setWidth((-1));
        histogram13.setWidth(255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97);
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) 'a');
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) '4', (int) 'a');
        int[] intArray52 = histogram51.getData();
        util.Histogram histogram54 = new util.Histogram(intArray52, 97);
        histogram34.set(intArray52);
        int[] intArray56 = histogram34.getData();
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram(intArray56, (int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray56);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        int[] intArray26 = histogram25.getData();
        java.lang.Class<?> wildcardClass27 = histogram25.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        histogram18.setWidth((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        util.Histogram histogram1 = new util.Histogram(100);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.put((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        int[] intArray8 = histogram7.getData();
        histogram3.set(intArray8);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, 52, (-1));
        util.Histogram histogram15 = new util.Histogram(intArray8, (int) (byte) 100, 1);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 100);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 255);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) '4');
        histogram15.set((java.util.List<java.lang.Integer>) intList25);
        histogram1.set((java.util.List<java.lang.Integer>) intList25);
        histogram1.setSize(255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97, 255);
        histogram16.setOffset((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        int[] intArray0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = convolutionKernel6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
// flaky:         histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 10);
        int[] intArray50 = histogram49.getData();
// flaky:         histogram1.set(intArray50);
        util.Histogram histogram54 = new util.Histogram(1, (int) (short) 100);
        int[] intArray55 = histogram54.getData();
        util.Histogram histogram57 = new util.Histogram(intArray55, (int) '#');
        int[] intArray58 = histogram57.getData();
// flaky:         histogram1.set(intArray58);
        try {
            util.Histogram histogram62 = null; // flaky: new util.Histogram(intArray58, (int) (short) -1, 255);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray58);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.put((int) (byte) 0);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
        histogram46.put((int) (short) 10);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
// flaky:         histogram50.setSize((int) (short) 10);
// flaky:         histogram50.setSize((int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
// flaky:         histogram50.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList58, (int) 'a');
        histogram46.set((java.util.List<java.lang.Integer>) intList58);
        histogram46.setOffset((int) (byte) -1);
        util.Histogram histogram68 = new util.Histogram(100, 10);
        util.Histogram histogram70 = null; // flaky: new util.Histogram(0);
// flaky:         histogram70.setSize((int) (short) 10);
// flaky:         histogram70.setSize((int) (byte) 100);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
// flaky:         histogram70.set((java.util.List<java.lang.Integer>) intList78);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, (int) (byte) 100);
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, 255);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, (int) ' ');
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, (int) '4');
        histogram68.set((java.util.List<java.lang.Integer>) intList78);
        histogram46.set((java.util.List<java.lang.Integer>) intList78);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList78, 97);
        histogram28.set((java.util.List<java.lang.Integer>) intList78);
        histogram28.setWidth((int) '4');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        int[] intArray17 = histogram16.getData();
        java.lang.Class<?> wildcardClass18 = histogram16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        histogram18.put(0);
        histogram18.put((int) (byte) 100);
        int int24 = histogram18.get(1);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setWidth(0);
// flaky:         histogram26.setSize((int) 'a');
// flaky:         histogram26.setWidth((int) (byte) 100);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
// flaky:         histogram34.setSize((int) (short) 10);
// flaky:         histogram34.setSize((int) (byte) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
// flaky:         histogram34.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
// flaky:         histogram50.setSize((int) (short) 10);
// flaky:         histogram50.setSize((int) (byte) 100);
// flaky:         histogram50.setSize((int) 'a');
        util.Histogram histogram58 = null; // flaky: new util.Histogram(0);
// flaky:         histogram58.setSize((int) (short) 10);
// flaky:         histogram58.setSize((int) (byte) 100);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
// flaky:         histogram58.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram71 = new util.Histogram((java.util.List<java.lang.Integer>) intList66, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram50.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList66, 10);
        int[] intArray75 = histogram74.getData();
// flaky:         histogram26.set(intArray75);
        histogram18.set(intArray75);
        int[] intArray78 = histogram18.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertNotNull(intArray78);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = null; // flaky: histogram1.getClass();
// flaky:         histogram1.setWidth((int) (byte) 100);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) '4', (int) 'a');
        int[] intArray34 = histogram33.getData();
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (byte) 100);
        histogram33.set((java.util.List<java.lang.Integer>) intList44);
        histogram14.set((java.util.List<java.lang.Integer>) intList44);
        try {
            util.Histogram histogram56 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) '4', 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
// flaky:         histogram21.put(1);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) ' ');
        util.Histogram histogram7 = new util.Histogram(intArray3, (int) '#');
        try {
            int int9 = histogram7.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        float[] floatArray4 = new float[] {};
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        morphology.BaseMorphology baseMorphology9 = erode3.compose((morphology.BaseMorphology) erode8);
        float[] floatArray10 = new float[] {};
        morphology.Erode erode11 = new morphology.Erode(floatArray10);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray10);
        morphology.Erode erode13 = new morphology.Erode(floatArray10);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray10);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray10);
        morphology.Erode erode16 = new morphology.Erode(floatArray10);
        morphology.BaseMorphology baseMorphology17 = baseMorphology9.compose((morphology.BaseMorphology) erode16);
        java.lang.Class<?> wildcardClass18 = baseMorphology9.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 97, 255);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45, (int) (short) 10);
// flaky:         histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram51 = new util.Histogram(intArray45, (int) (short) 100);
        util.Histogram histogram53 = new util.Histogram(intArray45, (int) '#');
        try {
            histogram53.put(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setSize(0);
// flaky:         histogram1.setWidth(10);
// flaky:         histogram1.setWidth((int) (short) -1);
// flaky:         histogram1.setOffset((int) 'a');
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setSize(0);
// flaky:         histogram1.setWidth((int) (byte) 100);
        int[] intArray12 = null; // flaky: histogram1.getData();
// flaky:         histogram1.setWidth(0);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) '#', (int) (byte) 100);
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
// flaky:         histogram24.setSize((int) (short) 10);
// flaky:         histogram24.setSize((int) (byte) 100);
// flaky:         histogram24.setSize((int) 'a');
        util.Histogram histogram32 = null; // flaky: new util.Histogram(0);
// flaky:         histogram32.setSize((int) (short) 10);
// flaky:         histogram32.setSize((int) (byte) 100);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
// flaky:         histogram32.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram24.set((java.util.List<java.lang.Integer>) intList40);
        histogram22.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, 97);
        try {
// flaky:             histogram1.set((java.util.List<java.lang.Integer>) intList40);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15, (int) (short) 100);
        int[] intArray18 = histogram17.getData();
        util.Histogram histogram21 = new util.Histogram(1, (int) (short) 100);
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = new util.Histogram(intArray22, (int) '#');
        histogram17.set(intArray22);
        histogram17.setOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        morphology.Sobel sobel9 = new morphology.Sobel(direction6);
        morphology.BaseMorphology baseMorphology10 = erode5.compose((morphology.BaseMorphology) sobel9);
        float[] floatArray11 = new float[] {};
        morphology.Erode erode12 = new morphology.Erode(floatArray11);
        morphology.ConvolutionKernel convolutionKernel13 = new morphology.ConvolutionKernel(floatArray11);
        morphology.Erode erode14 = new morphology.Erode(floatArray11);
        morphology.Erode erode15 = new morphology.Erode(floatArray11);
        morphology.Erode erode16 = new morphology.Erode(floatArray11);
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray11);
        morphology.BaseMorphology baseMorphology18 = erode5.compose((morphology.BaseMorphology) convolutionKernel17);
        java.awt.image.BufferedImage bufferedImage19 = null;
        try {
            java.awt.image.BufferedImage bufferedImage20 = erode5.apply(bufferedImage19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction6.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(baseMorphology18);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 10, (int) (byte) 10);
        int[] intArray25 = histogram24.getData();
        histogram24.setWidth(97);
        util.Histogram histogram29 = new util.Histogram((int) ' ');
        int[] intArray30 = histogram29.getData();
        histogram24.set(intArray30);
// flaky:         histogram1.set(intArray30);
        int[] intArray38 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram40 = new util.Histogram(intArray38, (int) 'a');
        util.Histogram histogram42 = new util.Histogram(intArray38, 100);
// flaky:         histogram1.set(intArray38);
        try {
            util.Histogram histogram45 = new util.Histogram(intArray38, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 10, (int) (short) -1);
        util.Histogram histogram9 = new util.Histogram(intArray3, 32, 35);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, 100);
        histogram22.setOffset(97);
        util.Histogram histogram26 = new util.Histogram((int) (byte) 100);
        int[] intArray27 = histogram26.getData();
        util.Histogram histogram29 = new util.Histogram((int) (byte) 100);
        int[] intArray30 = histogram29.getData();
        histogram26.set(intArray30);
        histogram22.set(intArray30);
        try {
            util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray30, (int) (short) -1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        float[] floatArray12 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel13 = null; // flaky: new morphology.ConvolutionKernel(floatArray12);
        float[] floatArray16 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: convolutionKernel13.compose((morphology.BaseMorphology) convolutionKernel17);
        morphology.BaseMorphology baseMorphology19 = null; // flaky: convolutionKernel9.compose((morphology.BaseMorphology) convolutionKernel17);
        java.lang.Class<?> wildcardClass20 = null; // flaky: convolutionKernel17.getClass();
        float[] floatArray21 = new float[] {};
        morphology.Erode erode22 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel23 = new morphology.ConvolutionKernel(floatArray21);
        morphology.Erode erode24 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel25 = new morphology.ConvolutionKernel(floatArray21);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) convolutionKernel25);
        morphology.BaseMorphology baseMorphology27 = sobel1.compose((morphology.BaseMorphology) convolutionKernel17);
        float[] floatArray33 = new float[] { 'a', 1, (short) -1, 100, '4' };
        morphology.Erode erode34 = null; // flaky: new morphology.Erode(floatArray33);
        morphology.BaseMorphology baseMorphology35 = sobel1.compose((morphology.BaseMorphology) erode34);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology18);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(floatArray21);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
        org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(baseMorphology35);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 10);
        histogram1.setSize((int) (byte) 1);
        histogram1.put(0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        int[] intArray1 = new int[] { '#' };
        util.Histogram histogram3 = new util.Histogram(intArray1, (int) 'a');
        try {
            util.Histogram histogram5 = new util.Histogram(intArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        histogram18.put(0);
        util.Histogram histogram22 = new util.Histogram((int) ' ');
        int[] intArray23 = histogram22.getData();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) '#', (int) (byte) 100);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
// flaky:         histogram33.setSize((int) 'a');
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
// flaky:         histogram41.setSize((int) (short) 10);
// flaky:         histogram41.setSize((int) (byte) 100);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
// flaky:         histogram41.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList49);
        histogram31.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, 97);
        histogram22.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, (int) '#');
        util.Histogram histogram64 = new util.Histogram((int) (short) 10, (int) (short) 10);
        util.Histogram histogram66 = null; // flaky: new util.Histogram(0);
// flaky:         histogram66.setSize((int) (short) 10);
// flaky:         histogram66.setSize((int) (byte) 100);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) 'a');
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 97, 255);
// flaky:         histogram66.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram90 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 97);
        histogram64.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram93 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) ' ');
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 35);
        histogram61.set((java.util.List<java.lang.Integer>) intList80);
        histogram18.set((java.util.List<java.lang.Integer>) intList80);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        int int33 = histogram14.get(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setOffset(100);
// flaky:         histogram1.setSize(2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, 255);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        histogram25.setSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        int[] intArray6 = null; // flaky: histogram2.getData();
        try {
// flaky:             histogram2.put(9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        int[] intArray8 = histogram1.getData();
        util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray8, 1, (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray17, (int) (short) 0, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        histogram1.setWidth(10);
        int int21 = histogram1.get(0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) ' ');
        try {
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10, (int) (short) 1);
        int[] intArray3 = histogram2.getData();
        try {
            int int5 = histogram2.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        histogram1.setOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
// flaky:         histogram1.put((int) (short) 10);
        int[] intArray26 = null; // flaky: histogram1.getData();
        util.Histogram histogram28 = new util.Histogram((int) ' ');
        histogram28.setWidth((int) (byte) 100);
        histogram28.setOffset((int) (short) 100);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
// flaky:         histogram34.setSize((int) (short) 10);
// flaky:         histogram34.setSize((int) (byte) 100);
// flaky:         histogram34.setOffset((int) (byte) 1);
// flaky:         histogram34.setOffset((int) '4');
        int[] intArray43 = null; // flaky: histogram34.getData();
// flaky:         histogram28.set(intArray43);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(intArray43, (int) (short) 100);
        util.Histogram histogram48 = null; // flaky: new util.Histogram(intArray43, 97);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
// flaky:         histogram50.setSize((int) (short) 10);
// flaky:         histogram50.setSize((int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
// flaky:         histogram50.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList58, (int) 'a');
// flaky:         histogram48.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList58, (int) (short) 1, 32);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList58);
// flaky:         histogram1.put((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        int[] intArray12 = histogram2.getData();
        try {
            util.Histogram histogram15 = new util.Histogram(intArray12, 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
// flaky:         histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram(1, (int) (short) 100);
        int[] intArray40 = histogram39.getData();
        util.Histogram histogram42 = new util.Histogram(intArray40, (int) '#');
        int[] intArray43 = histogram42.getData();
        histogram7.set(intArray43);
        util.Histogram histogram47 = new util.Histogram(intArray43, 10, 35);
        histogram47.setWidth(35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) -1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#', (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 32);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97);
        java.lang.Class<?> wildcardClass26 = intList15.getClass();
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 32, (int) '#');
        try {
            util.Histogram histogram32 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList15, 0, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel4 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel5 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel6 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
// flaky:         histogram5.setSize((int) (short) 10);
// flaky:         histogram5.setSize((int) (byte) 100);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
// flaky:         histogram5.set((java.util.List<java.lang.Integer>) intList13);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) 'a');
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) ' ', 100);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList13, (int) (byte) 10, 255);
        histogram2.set((java.util.List<java.lang.Integer>) intList13);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, 1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.put((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) (short) 0);
        try {
// flaky:             histogram2.put((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 100);
        histogram34.setSize(0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        int[] intArray3 = null; // flaky: histogram2.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 35, (int) (short) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray3, (int) (byte) 10, 100);
// flaky:         org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) ' ');
        histogram25.setOffset((int) (byte) 100);
        histogram25.setSize(97);
        util.Histogram histogram31 = null; // flaky: new util.Histogram(0);
// flaky:         histogram31.setSize((int) (short) 10);
// flaky:         histogram31.setSize((int) (byte) 100);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
// flaky:         histogram31.set((java.util.List<java.lang.Integer>) intList39);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) '4', (int) ' ');
        histogram25.set((java.util.List<java.lang.Integer>) intList39);
        try {
            util.Histogram histogram48 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList39, 0, 32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray4 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel5 = null; // flaky: new morphology.ConvolutionKernel(floatArray4);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        morphology.BaseMorphology baseMorphology10 = null; // flaky: convolutionKernel5.compose((morphology.BaseMorphology) convolutionKernel9);
        morphology.BaseMorphology baseMorphology11 = sobel1.compose((morphology.BaseMorphology) convolutionKernel5);
        morphology.Threshold threshold13 = new morphology.Threshold(0.0f);
        float[] floatArray18 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode19 = new morphology.Erode(floatArray18);
        morphology.BaseMorphology baseMorphology20 = threshold13.compose((morphology.BaseMorphology) erode19);
        java.lang.Class<?> wildcardClass21 = erode19.getClass();
        morphology.Threshold threshold23 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology24 = erode19.compose((morphology.BaseMorphology) threshold23);
        morphology.BaseMorphology baseMorphology25 = null; // flaky: convolutionKernel5.compose((morphology.BaseMorphology) erode19);
        morphology.Threshold threshold27 = new morphology.Threshold(1.0f);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: baseMorphology25.compose((morphology.BaseMorphology) threshold27);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(baseMorphology20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(baseMorphology24);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology25);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology28);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.setSize(0);
        histogram7.setOffset((int) (byte) 10);
        histogram7.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray16, 97, 10);
        int[] intArray25 = null; // flaky: histogram24.getData();
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram(intArray25, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        float[] floatArray12 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel13 = null; // flaky: new morphology.ConvolutionKernel(floatArray12);
        float[] floatArray16 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: convolutionKernel13.compose((morphology.BaseMorphology) convolutionKernel17);
        morphology.BaseMorphology baseMorphology19 = null; // flaky: convolutionKernel9.compose((morphology.BaseMorphology) convolutionKernel17);
        java.lang.Class<?> wildcardClass20 = null; // flaky: convolutionKernel17.getClass();
        float[] floatArray21 = new float[] {};
        morphology.Erode erode22 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel23 = new morphology.ConvolutionKernel(floatArray21);
        morphology.Erode erode24 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel25 = new morphology.ConvolutionKernel(floatArray21);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) convolutionKernel25);
        morphology.BaseMorphology baseMorphology27 = sobel1.compose((morphology.BaseMorphology) convolutionKernel17);
        float[] floatArray28 = new float[] {};
        morphology.Erode erode29 = new morphology.Erode(floatArray28);
        morphology.ConvolutionKernel convolutionKernel30 = new morphology.ConvolutionKernel(floatArray28);
        morphology.ConvolutionKernel convolutionKernel31 = new morphology.ConvolutionKernel(floatArray28);
        morphology.Erode erode32 = new morphology.Erode(floatArray28);
        morphology.ConvolutionKernel convolutionKernel33 = new morphology.ConvolutionKernel(floatArray28);
        morphology.Erode erode34 = new morphology.Erode(floatArray28);
        morphology.BaseMorphology baseMorphology35 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) erode34);
        java.lang.Class<?> wildcardClass36 = erode34.getClass();
        java.awt.image.BufferedImage bufferedImage37 = null;
        try {
            java.awt.image.BufferedImage bufferedImage38 = erode34.apply(bufferedImage37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology18);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(floatArray21);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
        org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(floatArray28);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intArray0, 1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass2 = erode1.getClass();
        morphology.Sobel.Direction direction3 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel4 = new morphology.Sobel(direction3);
        float[] floatArray7 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        float[] floatArray11 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel12 = null; // flaky: new morphology.ConvolutionKernel(floatArray11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) convolutionKernel12);
        morphology.BaseMorphology baseMorphology14 = sobel4.compose((morphology.BaseMorphology) convolutionKernel8);
        morphology.BaseMorphology baseMorphology15 = erode1.compose((morphology.BaseMorphology) sobel4);
        float[] floatArray18 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel19 = null; // flaky: new morphology.ConvolutionKernel(floatArray18);
        float[] floatArray22 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel23 = null; // flaky: new morphology.ConvolutionKernel(floatArray22);
        float[] floatArray26 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel27 = null; // flaky: new morphology.ConvolutionKernel(floatArray26);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: convolutionKernel23.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology29 = null; // flaky: convolutionKernel19.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology30 = sobel4.compose((morphology.BaseMorphology) convolutionKernel27);
        float[] floatArray31 = new float[] {};
        morphology.Erode erode32 = new morphology.Erode(floatArray31);
        morphology.ConvolutionKernel convolutionKernel33 = new morphology.ConvolutionKernel(floatArray31);
        morphology.ConvolutionKernel convolutionKernel34 = new morphology.ConvolutionKernel(floatArray31);
        morphology.ConvolutionKernel convolutionKernel35 = new morphology.ConvolutionKernel(floatArray31);
        morphology.BaseMorphology baseMorphology36 = null; // flaky: convolutionKernel27.compose((morphology.BaseMorphology) convolutionKernel35);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '" + morphology.Sobel.Direction.UP + "'", direction3.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology28);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray31);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology36);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
// flaky:         histogram9.setSize((int) (short) 10);
// flaky:         histogram9.setSize((int) (byte) 100);
// flaky:         histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.setWidth(0);
        int int36 = histogram7.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = new util.Histogram(intArray17, 97);
        histogram19.setSize((int) 'a');
        histogram19.setWidth(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
        int[] intArray12 = null; // flaky: histogram1.getData();
        java.lang.Class<?> wildcardClass13 = null; // flaky: histogram1.getClass();
// flaky:         histogram1.setWidth(0);
        try {
// flaky:             histogram1.put((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
// flaky:         histogram1.setWidth(2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) '4');
        int[] intArray7 = null; // flaky: histogram4.getData();
        util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray7, (int) (short) 1);
        try {
// flaky:             histogram2.set(intArray7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 10, (int) (byte) 10);
        int[] intArray25 = histogram24.getData();
        histogram24.setWidth(97);
        util.Histogram histogram29 = new util.Histogram((int) ' ');
        int[] intArray30 = histogram29.getData();
        histogram24.set(intArray30);
// flaky:         histogram1.set(intArray30);
        try {
            util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray30, (int) (short) 100, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        util.Histogram histogram2 = new util.Histogram(35, 10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass18 = intList12.getClass();
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram4 = new util.Histogram(intArray2, (int) (short) 10);
        util.Histogram histogram6 = new util.Histogram((int) 'a');
        histogram6.setSize((int) (byte) 10);
        histogram6.setOffset((int) (byte) 10);
        util.Histogram histogram12 = new util.Histogram((int) ' ');
        histogram12.put((int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((int) ' ');
        int[] intArray17 = histogram16.getData();
        histogram12.set(intArray17);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray17, 52, (-1));
        util.Histogram histogram24 = new util.Histogram(intArray17, (int) (byte) 100, 1);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setSize((int) (short) 10);
// flaky:         histogram26.setSize((int) (byte) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) (byte) 100);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, 255);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) ' ');
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, (int) '4');
        histogram24.set((java.util.List<java.lang.Integer>) intList34);
        histogram6.set((java.util.List<java.lang.Integer>) intList34);
        histogram4.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList34, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
// flaky:         histogram20.setSize((int) 'a');
        int int28 = 0; // flaky: histogram20.get((int) (short) 0);
        int[] intArray29 = null; // flaky: histogram20.getData();
        util.Histogram histogram32 = null; // flaky: new util.Histogram(intArray29, (int) ' ', (int) (short) -1);
// flaky:         histogram16.set(intArray29);
        histogram16.setOffset(100);
        int int37 = histogram16.get((int) (byte) 10);
        int int39 = histogram16.get(9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setSize(0);
// flaky:         histogram1.setWidth((int) (byte) 100);
        try {
            int int13 = 0; // flaky: histogram1.get((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) 'a');
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) '4', (int) 'a');
        int[] intArray34 = histogram33.getData();
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (byte) 100);
        histogram33.set((java.util.List<java.lang.Integer>) intList44);
        histogram14.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 97, (int) (short) 100);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 10, 100);
        try {
            util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        util.Histogram histogram1 = new util.Histogram(255);
        int int3 = histogram1.get((int) '#');
        histogram1.setWidth(1);
        int int7 = histogram1.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray4, 52, 1);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray4, 32);
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(255, (-1));
        util.Histogram histogram4 = new util.Histogram(100);
        util.Histogram histogram6 = new util.Histogram((int) ' ');
        histogram6.put((int) (byte) 10);
        util.Histogram histogram10 = new util.Histogram((int) ' ');
        int[] intArray11 = histogram10.getData();
        histogram6.set(intArray11);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(intArray11, 52, (-1));
        util.Histogram histogram18 = new util.Histogram(intArray11, (int) (byte) 100, 1);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (byte) 100);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 255);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) ' ');
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) '4');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        histogram4.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 32);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 10);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        int int1 = util.RGBPixel.getRed((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        try {
            util.Histogram histogram26 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, 2);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, (int) (short) 1, (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) (short) 10);
        util.Histogram histogram25 = new util.Histogram(intArray17, 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass13 = null; // flaky: histogram12.getClass();
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList6, (int) '#', (int) (byte) 100);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
// flaky:         histogram12.setSize((int) 'a');
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList28);
        histogram10.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, 97);
        histogram1.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, 97, 255);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41, (int) (short) 10);
// flaky:         histogram1.set(intArray41);
// flaky:         histogram1.setWidth(10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) (short) 1);
        histogram2.setWidth((int) (short) 0);
        try {
            histogram2.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction0.equals(morphology.Sobel.Direction.LEFT));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass5 = floatArray0.getClass();
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        util.Histogram histogram10 = new util.Histogram(intArray7, 10, 52);
        util.Histogram histogram12 = new util.Histogram(intArray7, (int) 'a');
        histogram12.setWidth((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = histogram7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology11 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode10);
        float[] floatArray14 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel15 = null; // flaky: new morphology.ConvolutionKernel(floatArray14);
        float[] floatArray18 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel19 = null; // flaky: new morphology.ConvolutionKernel(floatArray18);
        float[] floatArray22 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel23 = null; // flaky: new morphology.ConvolutionKernel(floatArray22);
        morphology.BaseMorphology baseMorphology24 = null; // flaky: convolutionKernel19.compose((morphology.BaseMorphology) convolutionKernel23);
        morphology.BaseMorphology baseMorphology25 = null; // flaky: convolutionKernel15.compose((morphology.BaseMorphology) convolutionKernel23);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: erode5.compose((morphology.BaseMorphology) convolutionKernel23);
        java.awt.image.BufferedImage bufferedImage27 = null;
        try {
            java.awt.image.BufferedImage bufferedImage28 = erode5.apply(bufferedImage27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray22);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology24);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology25);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: intArray3.getClass();
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.put((int) (short) 10);
        histogram14.put((int) (short) 0);
        util.Histogram histogram20 = new util.Histogram((int) (byte) 100);
        int[] intArray21 = histogram20.getData();
        util.Histogram histogram24 = new util.Histogram(intArray21, (int) ' ', 10);
        util.Histogram histogram26 = new util.Histogram(intArray21, (int) (byte) 10);
        histogram14.set(intArray21);
        util.Histogram histogram30 = new util.Histogram(intArray21, 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 10, 10);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(intArray16, 9);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        try {
            int int24 = histogram22.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode10 = new morphology.Erode(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        int[] intArray36 = histogram16.getData();
        int int38 = histogram16.get(10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        float[] floatArray12 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel13 = null; // flaky: new morphology.ConvolutionKernel(floatArray12);
        float[] floatArray16 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: convolutionKernel13.compose((morphology.BaseMorphology) convolutionKernel17);
        morphology.BaseMorphology baseMorphology19 = null; // flaky: convolutionKernel9.compose((morphology.BaseMorphology) convolutionKernel17);
        java.lang.Class<?> wildcardClass20 = null; // flaky: convolutionKernel17.getClass();
        float[] floatArray21 = new float[] {};
        morphology.Erode erode22 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel23 = new morphology.ConvolutionKernel(floatArray21);
        morphology.Erode erode24 = new morphology.Erode(floatArray21);
        morphology.ConvolutionKernel convolutionKernel25 = new morphology.ConvolutionKernel(floatArray21);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) convolutionKernel25);
        morphology.BaseMorphology baseMorphology27 = sobel1.compose((morphology.BaseMorphology) convolutionKernel17);
        float[] floatArray28 = new float[] {};
        morphology.Erode erode29 = new morphology.Erode(floatArray28);
        morphology.ConvolutionKernel convolutionKernel30 = new morphology.ConvolutionKernel(floatArray28);
        morphology.ConvolutionKernel convolutionKernel31 = new morphology.ConvolutionKernel(floatArray28);
        morphology.Erode erode32 = new morphology.Erode(floatArray28);
        morphology.ConvolutionKernel convolutionKernel33 = new morphology.ConvolutionKernel(floatArray28);
        morphology.Erode erode34 = new morphology.Erode(floatArray28);
        morphology.BaseMorphology baseMorphology35 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) erode34);
        java.awt.image.BufferedImage bufferedImage36 = null;
        try {
            java.awt.image.BufferedImage bufferedImage37 = erode34.apply(bufferedImage36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology18);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(floatArray21);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
        org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(floatArray28);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology35);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        util.Histogram histogram10 = new util.Histogram(intArray7, 10, 52);
        util.Histogram histogram13 = new util.Histogram(intArray7, 35, 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) 'a');
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
// flaky:         histogram21.set(intArray40);
        util.Histogram histogram43 = new util.Histogram(intArray40, (int) (byte) 100);
        int int45 = histogram43.get((int) (short) 1);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = histogram1.getClass();
        histogram1.setWidth((int) (byte) -1);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(0);
// flaky:         histogram8.setSize((int) (short) 10);
// flaky:         histogram8.setSize((int) (byte) 100);
// flaky:         histogram8.setSize((int) 'a');
        int int16 = 0; // flaky: histogram8.get((int) (short) 0);
        int[] intArray17 = null; // flaky: histogram8.getData();
// flaky:         histogram1.set(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (byte) 10);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
// flaky:         histogram1.set(intArray10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setWidth(35);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setOffset(100);
// flaky:         histogram1.setSize(100);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(97, (-1));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        util.Histogram histogram2 = new util.Histogram(97, 97);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intArray0, 2, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        histogram2.setSize((int) '#');
        histogram2.setWidth((-1));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
// flaky:         histogram7.setOffset((int) (byte) 1);
// flaky:         histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
// flaky:         histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, 255);
// flaky:         histogram19.setWidth(35);
// flaky:         histogram19.put((int) '#');
// flaky:         histogram19.put(9);
// flaky:         histogram19.setSize((int) (short) 0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97, (int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97, 2);
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        int[] intArray3 = null; // flaky: histogram2.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 35, (int) (short) 100);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray3, 97);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray3, 9, 2);
// flaky:         org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(10);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        histogram9.setWidth((int) (byte) 100);
        histogram9.setOffset((int) (short) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
// flaky:         histogram15.setOffset((int) (byte) 1);
// flaky:         histogram15.setOffset((int) '4');
        int[] intArray24 = null; // flaky: histogram15.getData();
// flaky:         histogram9.set(intArray24);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(intArray24, (int) (short) 100);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(intArray24, 97);
// flaky:         histogram29.setWidth(100);
        util.Histogram histogram33 = new util.Histogram((int) ' ');
        int[] intArray34 = histogram33.getData();
        java.lang.Class<?> wildcardClass35 = histogram33.getClass();
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
// flaky:         histogram43.setSize((int) (short) 10);
// flaky:         histogram43.setSize((int) (byte) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
// flaky:         histogram43.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) 'a');
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, 97, 255);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram61 = null; // flaky: new util.Histogram(0);
// flaky:         histogram61.setSize((int) (short) 10);
// flaky:         histogram61.setSize((int) (byte) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
// flaky:         histogram61.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) 'a');
        util.Histogram histogram76 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) '4', (int) 'a');
        int[] intArray77 = histogram76.getData();
        util.Histogram histogram79 = new util.Histogram(intArray77, (int) (short) 10);
// flaky:         histogram37.set(intArray77);
        histogram33.set(intArray77);
        util.Histogram histogram83 = new util.Histogram(intArray77, (int) (short) 100);
        util.Histogram histogram85 = new util.Histogram(intArray77, (int) '#');
        java.lang.Class<?> wildcardClass86 = intArray77.getClass();
// flaky:         histogram29.set(intArray77);
// flaky:         histogram1.set(intArray77);
// flaky:         org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int[] intArray8 = null; // flaky: histogram1.getData();
        util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray8, 10, 9);
// flaky:         histogram11.setWidth((int) '#');
// flaky:         org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        histogram16.setOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 1);
        histogram2.setOffset(0);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
// flaky:         histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) '4');
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
// flaky:         histogram24.setSize((int) (short) 10);
// flaky:         histogram24.setSize((int) (byte) 100);
// flaky:         histogram24.setSize((int) 'a');
        util.Histogram histogram32 = null; // flaky: new util.Histogram(0);
// flaky:         histogram32.setSize((int) (short) 10);
// flaky:         histogram32.setSize((int) (byte) 100);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
// flaky:         histogram32.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram24.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, 10);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, 1, (int) '4');
        histogram51.setWidth(255);
        util.Histogram histogram55 = new util.Histogram((int) ' ');
        histogram55.setWidth((int) (byte) 100);
        histogram55.setOffset((int) (short) 100);
        util.Histogram histogram61 = null; // flaky: new util.Histogram(0);
// flaky:         histogram61.setSize((int) (short) 10);
// flaky:         histogram61.setSize((int) (byte) 100);
// flaky:         histogram61.setOffset((int) (byte) 1);
// flaky:         histogram61.setOffset((int) '4');
        int[] intArray70 = null; // flaky: histogram61.getData();
// flaky:         histogram55.set(intArray70);
        util.Histogram histogram73 = null; // flaky: new util.Histogram(intArray70, (int) (short) 100);
        util.Histogram histogram75 = null; // flaky: new util.Histogram(intArray70, 97);
        util.Histogram histogram77 = null; // flaky: new util.Histogram(0);
// flaky:         histogram77.setSize((int) (short) 10);
// flaky:         histogram77.setSize((int) (byte) 100);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
// flaky:         histogram77.set((java.util.List<java.lang.Integer>) intList85);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList85, (int) 'a');
// flaky:         histogram75.set((java.util.List<java.lang.Integer>) intList85);
        util.Histogram histogram93 = new util.Histogram((java.util.List<java.lang.Integer>) intList85, (int) (short) 1, 32);
        histogram51.set((java.util.List<java.lang.Integer>) intList85);
        histogram21.set((java.util.List<java.lang.Integer>) intList85);
        histogram2.set((java.util.List<java.lang.Integer>) intList85);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        histogram16.setWidth(35);
        histogram16.setWidth(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
// flaky:         histogram27.setSize((int) 'a');
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
// flaky:         histogram51.setSize((int) (short) 10);
// flaky:         histogram51.setSize((int) (byte) 100);
// flaky:         histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
// flaky:         histogram59.setSize((int) (short) 10);
// flaky:         histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
// flaky:         histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, (int) '4');
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        int[] intArray86 = histogram14.getData();
        util.Histogram histogram88 = new util.Histogram(intArray86, 100);
        java.lang.Class<?> wildcardClass89 = intArray86.getClass();
        util.Histogram histogram92 = new util.Histogram(intArray86, (int) (byte) 10, (int) '#');
        try {
            util.Histogram histogram94 = new util.Histogram(intArray86, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) 10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        int int18 = histogram16.get(0);
        histogram16.put((int) (short) 0);
        try {
            histogram16.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 0, 255);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray3);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode7 = new morphology.Erode(floatArray3);
        morphology.Identity identity8 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology9 = erode7.compose((morphology.BaseMorphology) identity8);
        morphology.BaseMorphology baseMorphology10 = convolutionKernel2.compose((morphology.BaseMorphology) erode7);
        float[] floatArray13 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel14 = null; // flaky: new morphology.ConvolutionKernel(floatArray13);
        float[] floatArray17 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel18 = null; // flaky: new morphology.ConvolutionKernel(floatArray17);
        float[] floatArray21 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel22 = null; // flaky: new morphology.ConvolutionKernel(floatArray21);
        morphology.BaseMorphology baseMorphology23 = null; // flaky: convolutionKernel18.compose((morphology.BaseMorphology) convolutionKernel22);
        morphology.BaseMorphology baseMorphology24 = null; // flaky: convolutionKernel14.compose((morphology.BaseMorphology) convolutionKernel22);
        java.lang.Class<?> wildcardClass25 = null; // flaky: convolutionKernel22.getClass();
        float[] floatArray26 = new float[] {};
        morphology.Erode erode27 = new morphology.Erode(floatArray26);
        morphology.ConvolutionKernel convolutionKernel28 = new morphology.ConvolutionKernel(floatArray26);
        morphology.Erode erode29 = new morphology.Erode(floatArray26);
        morphology.ConvolutionKernel convolutionKernel30 = new morphology.ConvolutionKernel(floatArray26);
        morphology.BaseMorphology baseMorphology31 = null; // flaky: convolutionKernel22.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology32 = baseMorphology10.compose((morphology.BaseMorphology) convolutionKernel22);
        java.awt.image.BufferedImage bufferedImage33 = null;
        try {
            java.awt.image.BufferedImage bufferedImage34 = convolutionKernel22.apply(bufferedImage33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray21);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology23);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology24);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(floatArray26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology31);
        org.junit.Assert.assertNotNull(baseMorphology32);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.put((-1));
        histogram14.setSize((int) (byte) 100);
        histogram14.setOffset((int) ' ');
        histogram14.setSize(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }
}
