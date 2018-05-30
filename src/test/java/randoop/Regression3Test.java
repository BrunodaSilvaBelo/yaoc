package randoop;

import org.junit.jupiter.api.Test;

public class Regression3Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 10, (int) (byte) -1);
        // flaky: histogram2.setSize(97);
        try {
            // flaky: histogram2.setSize((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6,
                                                        intArray5);
        util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList6,
                                                        (int) '#',
                                                        (int) (byte) 100);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
        // flaky: histogram12.setSize((int) (short) 10);
        // flaky: histogram12.setSize((int) (byte) 100);
        // flaky: histogram12.setSize((int) 'a');
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28,
                                                         intArray27);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram12.set((java.util.List<java.lang.Integer>) intList28);
        histogram10.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        97);
        histogram1.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) '#');
        util.Histogram histogram43 = new util.Histogram((int) (short) 10,
                                                        (int) (short) 10);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
        // flaky: histogram45.setSize((int) (short) 10);
        // flaky: histogram45.setSize((int) (byte) 100);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
        // flaky: histogram51.setSize((int) (short) 10);
        // flaky: histogram51.setSize((int) (byte) 100);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59,
                                                         intArray58);
        // flaky: histogram51.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList59,
                                                        (int) 'a');
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList59,
                                                        97, 255);
        // flaky: histogram45.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList59,
                                                        97);
        histogram43.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList59,
                                                        (int) ' ');
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList59,
                                                        35);
        histogram40.set((java.util.List<java.lang.Integer>) intList59);
        try {
            util.Histogram histogram78 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList59, (int) (short) -1, 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'",
                                    boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'",
                                    boolean60 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
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
            java.awt.image.BufferedImage bufferedImage26 = convolutionKernel23.apply(bufferedImage25);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15,
                                                         intArray14);
        // flaky: histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        97, 255);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33,
                                                         intArray32);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41,
                                                        (int) (short) 10);
        // flaky: histogram1.set(intArray41);
        // flaky: histogram1.put((int) (byte) -1);
        // flaky: histogram1.setOffset((int) (byte) 10);
        int int50 = 0; // flaky: histogram1.get((int) '4');
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'",
                                    int50 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1,
                                                       (int) (short) 1);
        histogram2.setOffset((-1));
        histogram2.setSize(10);
        histogram2.setOffset(0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth(1);
        // flaky: histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
        // flaky: histogram1.setWidth((int) '4');
        // flaky: histogram1.setSize((int) '4');
        // flaky: histogram1.setWidth((int) (byte) 0);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        // flaky: histogram21.setSize((int) 'a');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37,
                                                         intArray36);
        // flaky: histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        10);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        1, (int) '4');
        java.lang.Class<?> wildcardClass49 = histogram48.getClass();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53,
                                                         intArray52);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList53,
                                                        (int) '#',
                                                        (int) (byte) 100);
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
        // flaky: histogram59.setSize((int) (short) 10);
        // flaky: histogram59.setSize((int) (byte) 100);
        // flaky: histogram59.setSize((int) 'a');
        util.Histogram histogram67 = null; // flaky: new util.Histogram(0);
        // flaky: histogram67.setSize((int) (short) 10);
        // flaky: histogram67.setSize((int) (byte) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75,
                                                         intArray74);
        // flaky: histogram67.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram59.set((java.util.List<java.lang.Integer>) intList75);
        histogram57.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) ' ');
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        2, 10);
        histogram48.set((java.util.List<java.lang.Integer>) intList75);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList75);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'",
                                    int13 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'",
                                    boolean54 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'",
                                    boolean76 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        morphology.Sobel sobel7 = new morphology.Sobel(direction0);
        morphology.BaseMorphology baseMorphology8 = null;
        morphology.BaseMorphology baseMorphology9 = sobel7.compose(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(baseMorphology9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 10);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        52);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        32);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10);
        try {
            int int24 = histogram22.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        int[] intArray23 = histogram22.getData();
        util.Histogram histogram26 = new util.Histogram(1, (int) (short) 100);
        int[] intArray27 = histogram26.getData();
        util.Histogram histogram29 = new util.Histogram(intArray27, (int) ' ');
        util.Histogram histogram31 = new util.Histogram(intArray27, (int) '#');
        util.Histogram histogram34 = null; // flaky: new util.Histogram(intArray27, 35, (-1));
        histogram22.set(intArray27);
        histogram22.setWidth(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram6 = new util.Histogram(intArray3,
                                                       (int) (byte) 100, 97);
        histogram6.setWidth((-1));
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = histogram1.getClass();
        histogram1.setWidth((int) (byte) -1);
        try {
            int int8 = histogram1.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
        // flaky: histogram26.setSize((int) (short) 10);
        // flaky: histogram26.setSize((int) (byte) 100);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34,
                                                         intArray33);
        // flaky: histogram26.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList34,
                                                        (int) 'a');
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList34,
                                                        97, 255);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList34,
                                                        97);
        java.lang.Class<?> wildcardClass45 = intList34.getClass();
        histogram18.set((java.util.List<java.lang.Integer>) intList34);
        util.Histogram histogram48 = new util.Histogram(100);
        util.Histogram histogram50 = new util.Histogram((int) ' ');
        histogram50.put((int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((int) ' ');
        int[] intArray55 = histogram54.getData();
        histogram50.set(intArray55);
        util.Histogram histogram59 = null; // flaky: new util.Histogram(intArray55, 52, (-1));
        util.Histogram histogram62 = new util.Histogram(intArray55,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram64 = null; // flaky: new util.Histogram(0);
        // flaky: histogram64.setSize((int) (short) 10);
        // flaky: histogram64.setSize((int) (byte) 100);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72,
                                                         intArray71);
        // flaky: histogram64.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram79 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) (byte) 100);
        util.Histogram histogram81 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        255);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) ' ');
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) '4');
        histogram62.set((java.util.List<java.lang.Integer>) intList72);
        histogram48.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        32);
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        10);
        histogram18.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) 'a', 97);
        try {
            util.Histogram histogram98 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList72, (int) (short) 0, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'",
                                    boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'",
                                    boolean73 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        util.Histogram histogram2 = new util.Histogram((int) 'a',
                                                       (int) (byte) 100);
        histogram2.setSize(97);
        histogram2.setWidth((int) '#');
        histogram2.setWidth((int) (byte) 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28,
                                                         intArray27);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
        // flaky: histogram35.setSize((int) (short) 10);
        // flaky: histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43,
                                                         intArray42);
        // flaky: histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 100,
                                                        (int) (short) 100);
        int int56 = histogram54.get(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'",
                                    int56 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
        // flaky: histogram18.setSize((int) (short) 10);
        // flaky: histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26,
                                                         intArray25);
        // flaky: histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        histogram14.setOffset((int) (byte) -1);
        histogram14.setSize(35);
        histogram14.setWidth((int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        float[] floatArray10 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray10);
        morphology.Erode erode12 = new morphology.Erode(floatArray10);
        morphology.BaseMorphology baseMorphology13 = sobel1.compose((morphology.BaseMorphology) erode12);
        float[] floatArray14 = new float[] {};
        morphology.Erode erode15 = new morphology.Erode(floatArray14);
        morphology.Erode erode16 = new morphology.Erode(floatArray14);
        morphology.Sobel.Direction direction17 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel18 = new morphology.Sobel(direction17);
        float[] floatArray21 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel22 = null; // flaky: new morphology.ConvolutionKernel(floatArray21);
        float[] floatArray25 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel26 = null; // flaky: new morphology.ConvolutionKernel(floatArray25);
        morphology.BaseMorphology baseMorphology27 = null; // flaky: convolutionKernel22.compose((morphology.BaseMorphology) convolutionKernel26);
        morphology.BaseMorphology baseMorphology28 = sobel18.compose((morphology.BaseMorphology) convolutionKernel22);
        morphology.Threshold threshold30 = new morphology.Threshold(0.0f);
        float[] floatArray35 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode36 = new morphology.Erode(floatArray35);
        morphology.BaseMorphology baseMorphology37 = threshold30.compose((morphology.BaseMorphology) erode36);
        java.lang.Class<?> wildcardClass38 = erode36.getClass();
        morphology.Threshold threshold40 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology41 = erode36.compose((morphology.BaseMorphology) threshold40);
        morphology.BaseMorphology baseMorphology42 = null; // flaky: convolutionKernel22.compose((morphology.BaseMorphology) erode36);
        morphology.BaseMorphology baseMorphology43 = erode16.compose((morphology.BaseMorphology) erode36);
        float[] floatArray44 = new float[] {};
        morphology.Erode erode45 = new morphology.Erode(floatArray44);
        morphology.ConvolutionKernel convolutionKernel46 = new morphology.ConvolutionKernel(floatArray44);
        float[] floatArray47 = new float[] {};
        morphology.Erode erode48 = new morphology.Erode(floatArray47);
        morphology.ConvolutionKernel convolutionKernel49 = new morphology.ConvolutionKernel(floatArray47);
        morphology.ConvolutionKernel convolutionKernel50 = new morphology.ConvolutionKernel(floatArray47);
        morphology.Erode erode51 = new morphology.Erode(floatArray47);
        morphology.Identity identity52 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology53 = erode51.compose((morphology.BaseMorphology) identity52);
        morphology.BaseMorphology baseMorphology54 = convolutionKernel46.compose((morphology.BaseMorphology) erode51);
        morphology.BaseMorphology baseMorphology55 = baseMorphology43.compose((morphology.BaseMorphology) convolutionKernel46);
        morphology.BaseMorphology baseMorphology56 = baseMorphology13.compose((morphology.BaseMorphology) convolutionKernel46);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction17.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray25);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(baseMorphology37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(baseMorphology41);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology42);
        org.junit.Assert.assertNotNull(baseMorphology43);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertNotNull(baseMorphology53);
        org.junit.Assert.assertNotNull(baseMorphology54);
        org.junit.Assert.assertNotNull(baseMorphology55);
        org.junit.Assert.assertNotNull(baseMorphology56);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        histogram1.setSize((int) (byte) 10);
        util.Histogram histogram11 = new util.Histogram((int) ' ');
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
        // flaky: histogram13.setWidth(0);
        // flaky: histogram13.setSize((int) 'a');
        // flaky: histogram13.setWidth((int) (byte) 100);
        int[] intArray20 = null; // flaky: histogram13.getData();
        // flaky: histogram11.set(intArray20);
        // flaky: histogram1.set(intArray20);
        org.junit.Assert.assertNotNull(intArray6);
        // flaky: org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 0, (int) (short) 100);
        // flaky: histogram2.setOffset((int) (byte) 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass9 = convolutionKernel8.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        100, (int) (byte) 10);
        util.Histogram histogram22 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int[] intArray23 = null; // flaky: histogram22.getData();
        // flaky: histogram19.set(intArray23);
        int[] intArray25 = histogram19.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        10);
        int[] intArray26 = histogram25.getData();
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
        // flaky: histogram28.setSize((int) (short) 10);
        // flaky: histogram28.setSize((int) (byte) 100);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36,
                                                         intArray35);
        // flaky: histogram28.set((java.util.List<java.lang.Integer>) intList36);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList36,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList36,
                                                        (int) (byte) 100);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList36,
                                                        255);
        util.Histogram histogram47 = null; // flaky: new util.Histogram(0);
        // flaky: histogram47.setSize((int) (short) 10);
        // flaky: histogram47.setSize((int) (byte) 100);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55,
                                                         intArray54);
        // flaky: histogram47.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        (int) 'a');
        histogram45.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram62 = null; // flaky: new util.Histogram(0);
        // flaky: histogram62.setSize((int) (short) 10);
        // flaky: histogram62.setSize((int) (byte) 100);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70,
                                                         intArray69);
        // flaky: histogram62.set((java.util.List<java.lang.Integer>) intList70);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList70,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram45.set((java.util.List<java.lang.Integer>) intList70);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList70,
                                                        (int) (byte) 10);
        util.Histogram histogram81 = new util.Histogram((java.util.List<java.lang.Integer>) intList70,
                                                        (int) (short) 100,
                                                        (int) (short) 100);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList70,
                                                        (int) '4');
        histogram25.set((java.util.List<java.lang.Integer>) intList70);
        try {
            int int86 = histogram25.get(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'",
                                    boolean37 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'",
                                    boolean56 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'",
                                    boolean71 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
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
        morphology.Threshold threshold27 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: baseMorphology25.compose((morphology.BaseMorphology) threshold27);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(baseMorphology20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(baseMorphology24);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology25);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology28);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        97, 255);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        // flaky: histogram9.set(intArray49);
        histogram1.set(intArray49);
        histogram1.setSize(10);
        histogram1.setSize(97);
        util.Histogram histogram60 = new util.Histogram(1, (int) (short) 100);
        int[] intArray61 = histogram60.getData();
        util.Histogram histogram63 = new util.Histogram(intArray61, (int) '#');
        util.Histogram histogram66 = new util.Histogram(intArray61,
                                                        (int) (byte) 10, 10);
        int[] intArray67 = histogram66.getData();
        histogram1.set(intArray67);
        util.Histogram histogram71 = new util.Histogram(intArray67,
                                                        (int) (short) 1, 10);
        util.Histogram histogram74 = new util.Histogram(intArray67, 52, 52);
        try {
            util.Histogram histogram76 = null; // flaky: new util.Histogram(intArray67, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray67);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setWidth(0);
        // flaky: histogram19.setSize((int) 'a');
        // flaky: histogram19.setWidth((int) (byte) 100);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
        // flaky: histogram27.setSize((int) (short) 10);
        // flaky: histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35,
                                                         intArray34);
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        35);
        histogram16.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        (int) '4');
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        35, 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'",
                                    boolean36 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        util.Histogram histogram8 = new util.Histogram(intArray3,
                                                       (int) (byte) 10, 10);
        int[] intArray9 = histogram8.getData();
        int[] intArray10 = histogram8.getData();
        histogram8.setWidth(0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass2 = sobel1.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.LEFT + "'",
                                    direction0.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 10);
        // flaky: histogram2.setWidth(3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (short) 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
        // flaky: histogram10.setSize((int) (short) 10);
        // flaky: histogram10.setSize((int) (byte) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18,
                                                         intArray17);
        // flaky: histogram10.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) 'a');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        97, 255);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        97);
        histogram2.set((java.util.List<java.lang.Integer>) intList18);
        java.lang.Class<?> wildcardClass30 = intList18.getClass();
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) (short) 10,
                                                        (int) (byte) 100);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) ' ',
                                                        (int) (byte) 10);
        try {
            util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'",
                                    boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        histogram7.setSize(52);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13,
                                                         intArray12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList13,
                                                        (int) '#',
                                                        (int) (byte) 100);
        histogram17.put((int) '#');
        java.lang.Class<?> wildcardClass20 = histogram17.getClass();
        int[] intArray21 = histogram17.getData();
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
        // flaky: histogram23.setSize((int) (short) 10);
        // flaky: histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31,
                                                         intArray30);
        // flaky: histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) (byte) 100);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        255);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) ' ');
        histogram17.set((java.util.List<java.lang.Integer>) intList31);
        histogram7.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'",
                                    boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, 52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = null; // flaky: histogram5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, (int) '4');
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, 255);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        97);
        histogram58.put((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        // flaky: histogram7.setOffset((int) (byte) 1);
        // flaky: histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
        // flaky: histogram1.set(intArray16);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 10, 52);
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 0, (int) '#');
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        morphology.Erode erode6 = new morphology.Erode(floatArray1);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        // flaky: histogram2.setSize((int) (short) 0);
        // flaky: histogram2.setWidth(255);
        int[] intArray12 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setSize(35);
        util.Histogram histogram16 = null; // flaky: new util.Histogram(0);
        // flaky: histogram16.setSize((int) (short) 10);
        // flaky: histogram16.setSize((int) (byte) 100);
        // flaky: histogram16.setSize((int) 'a');
        int int24 = 0; // flaky: histogram16.get((int) (short) 0);
        // flaky: histogram16.setWidth(52);
        int[] intArray27 = null; // flaky: histogram16.getData();
        // flaky: histogram2.set(intArray27);
        int[] intArray29 = null; // flaky: histogram2.getData();
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'",
                                    int24 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray27);
        // flaky: org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.Erode erode5 = new morphology.Erode(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass7 = floatArray0.getClass();
        java.lang.Class<?> wildcardClass8 = floatArray0.getClass();
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        util.Histogram histogram2 = new util.Histogram((int) '4', 100);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = convolutionKernel8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.put((int) (byte) 0);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram46.put((int) (short) 10);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
        // flaky: histogram50.setSize((int) (short) 10);
        // flaky: histogram50.setSize((int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58,
                                                         intArray57);
        // flaky: histogram50.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList58,
                                                        (int) 'a');
        histogram46.set((java.util.List<java.lang.Integer>) intList58);
        histogram46.setOffset((int) (byte) -1);
        util.Histogram histogram68 = new util.Histogram(100, 10);
        util.Histogram histogram70 = null; // flaky: new util.Histogram(0);
        // flaky: histogram70.setSize((int) (short) 10);
        // flaky: histogram70.setSize((int) (byte) 100);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78,
                                                         intArray77);
        // flaky: histogram70.set((java.util.List<java.lang.Integer>) intList78);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        (int) (byte) 100);
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        255);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        (int) ' ');
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        (int) '4');
        histogram68.set((java.util.List<java.lang.Integer>) intList78);
        histogram46.set((java.util.List<java.lang.Integer>) intList78);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList78,
                                                        97);
        histogram28.set((java.util.List<java.lang.Integer>) intList78);
        histogram28.setSize(1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'",
                                    boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'",
                                    boolean79 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15,
                                                        (int) (short) 100);
        histogram17.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        float[] floatArray10 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray10);
        float[] floatArray14 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel15 = null; // flaky: new morphology.ConvolutionKernel(floatArray14);
        float[] floatArray18 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel19 = null; // flaky: new morphology.ConvolutionKernel(floatArray18);
        morphology.BaseMorphology baseMorphology20 = null; // flaky: convolutionKernel15.compose((morphology.BaseMorphology) convolutionKernel19);
        morphology.BaseMorphology baseMorphology21 = null; // flaky: convolutionKernel11.compose((morphology.BaseMorphology) convolutionKernel19);
        java.lang.Class<?> wildcardClass22 = null; // flaky: convolutionKernel19.getClass();
        float[] floatArray23 = new float[] {};
        morphology.Erode erode24 = new morphology.Erode(floatArray23);
        morphology.ConvolutionKernel convolutionKernel25 = new morphology.ConvolutionKernel(floatArray23);
        morphology.Erode erode26 = new morphology.Erode(floatArray23);
        morphology.ConvolutionKernel convolutionKernel27 = new morphology.ConvolutionKernel(floatArray23);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: convolutionKernel19.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology29 = erode7.compose((morphology.BaseMorphology) convolutionKernel27);
        float[] floatArray31 = new float[] { 0L };
        morphology.Erode erode32 = new morphology.Erode(floatArray31);
        morphology.Erode erode33 = new morphology.Erode(floatArray31);
        float[] floatArray34 = new float[] {};
        morphology.Erode erode35 = new morphology.Erode(floatArray34);
        morphology.BaseMorphology baseMorphology36 = erode33.compose((morphology.BaseMorphology) erode35);
        float[] floatArray37 = new float[] {};
        morphology.Erode erode38 = new morphology.Erode(floatArray37);
        morphology.ConvolutionKernel convolutionKernel39 = new morphology.ConvolutionKernel(floatArray37);
        morphology.Erode erode40 = new morphology.Erode(floatArray37);
        morphology.Erode erode41 = new morphology.Erode(floatArray37);
        morphology.ConvolutionKernel convolutionKernel42 = new morphology.ConvolutionKernel(floatArray37);
        morphology.Erode erode43 = new morphology.Erode(floatArray37);
        morphology.Threshold threshold45 = new morphology.Threshold((float) 10L);
        morphology.Sobel.Direction direction46 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel47 = new morphology.Sobel(direction46);
        morphology.Sobel sobel48 = new morphology.Sobel(direction46);
        float[] floatArray49 = new float[] {};
        morphology.Erode erode50 = new morphology.Erode(floatArray49);
        morphology.ConvolutionKernel convolutionKernel51 = new morphology.ConvolutionKernel(floatArray49);
        morphology.Erode erode52 = new morphology.Erode(floatArray49);
        morphology.Erode erode53 = new morphology.Erode(floatArray49);
        morphology.BaseMorphology baseMorphology54 = sobel48.compose((morphology.BaseMorphology) erode53);
        morphology.BaseMorphology baseMorphology55 = threshold45.compose((morphology.BaseMorphology) erode53);
        morphology.BaseMorphology baseMorphology56 = erode43.compose((morphology.BaseMorphology) threshold45);
        morphology.BaseMorphology baseMorphology57 = baseMorphology36.compose(baseMorphology56);
        morphology.BaseMorphology baseMorphology58 = erode7.compose(baseMorphology57);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray18);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology20);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology21);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(floatArray23);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertNotNull(baseMorphology36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertTrue("'" + direction46 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction46.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(baseMorphology54);
        org.junit.Assert.assertNotNull(baseMorphology55);
        org.junit.Assert.assertNotNull(baseMorphology56);
        org.junit.Assert.assertNotNull(baseMorphology57);
        org.junit.Assert.assertNotNull(baseMorphology58);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        java.lang.Class<?> wildcardClass17 = histogram16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        int int20 = histogram16.get((int) (byte) 1);
        histogram16.setOffset(3);
        int[] intArray23 = histogram16.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'",
                                    int20 == 0);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass4 = floatArray0.getClass();
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (byte) 100);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        255);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) ' ');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) '4');
        histogram13.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (byte) 100,
                                                        (int) ' ');
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        35);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100, 255);
        int int25 = histogram23.get((int) (byte) 0);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
        // flaky: histogram27.setSize((int) (short) 10);
        // flaky: histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35,
                                                         intArray34);
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        (int) '4', (int) ' ');
        histogram23.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        (int) '4');
        try {
            util.Histogram histogram46 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) (short) 0, (int)
                                               // (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'",
                                    int25 == 2);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'",
                                    boolean36 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15,
                                                        (int) (short) 100);
        int[] intArray18 = histogram17.getData();
        histogram17.setWidth(0);
        histogram17.setWidth((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10,
                                                       (int) '#');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray5 = new float[] {};
        morphology.Erode erode6 = new morphology.Erode(floatArray5);
        morphology.Erode erode7 = new morphology.Erode(floatArray5);
        morphology.Sobel.Direction direction8 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel9 = new morphology.Sobel(direction8);
        float[] floatArray12 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel13 = null; // flaky: new morphology.ConvolutionKernel(floatArray12);
        float[] floatArray16 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: convolutionKernel13.compose((morphology.BaseMorphology) convolutionKernel17);
        morphology.BaseMorphology baseMorphology19 = sobel9.compose((morphology.BaseMorphology) convolutionKernel13);
        morphology.Threshold threshold21 = new morphology.Threshold(0.0f);
        float[] floatArray26 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode27 = new morphology.Erode(floatArray26);
        morphology.BaseMorphology baseMorphology28 = threshold21.compose((morphology.BaseMorphology) erode27);
        java.lang.Class<?> wildcardClass29 = erode27.getClass();
        morphology.Threshold threshold31 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology32 = erode27.compose((morphology.BaseMorphology) threshold31);
        morphology.BaseMorphology baseMorphology33 = null; // flaky: convolutionKernel13.compose((morphology.BaseMorphology) erode27);
        morphology.BaseMorphology baseMorphology34 = erode7.compose((morphology.BaseMorphology) erode27);
        morphology.BaseMorphology baseMorphology35 = convolutionKernel4.compose(baseMorphology34);
        java.awt.image.BufferedImage bufferedImage36 = null;
        try {
            java.awt.image.BufferedImage bufferedImage37 = convolutionKernel4.apply(bufferedImage36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction8.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(baseMorphology32);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(baseMorphology34);
        org.junit.Assert.assertNotNull(baseMorphology35);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = erode9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram14.put((int) (short) 10);
        histogram14.put((int) (short) 0);
        int[] intArray19 = histogram14.getData();
        int[] intArray20 = histogram14.getData();
        try {
            int int22 = histogram14.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Threshold threshold6 = new morphology.Threshold((float) (byte) 0);
        morphology.BaseMorphology baseMorphology7 = null; // flaky: erode4.compose((morphology.BaseMorphology) threshold6);
        java.lang.Class<?> wildcardClass8 = threshold6.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        // flaky: histogram7.setOffset((int) (byte) 1);
        // flaky: histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
        // flaky: histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
        // flaky: histogram23.setSize((int) (short) 10);
        // flaky: histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31,
                                                         intArray30);
        // flaky: histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) 'a');
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) (short) 1, 32);
        java.lang.Class<?> wildcardClass40 = intList31.getClass();
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        int int1 = util.RGBPixel.getRed(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10,
                                                       (int) (short) 1);
        histogram2.setWidth(1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        util.Histogram histogram18 = new util.Histogram(intArray16,
                                                        (int) (byte) 10);
        util.Histogram histogram20 = new util.Histogram(intArray16,
                                                        (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
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
        float[] floatArray11 = new float[] {};
        morphology.Erode erode12 = new morphology.Erode(floatArray11);
        morphology.Erode erode13 = new morphology.Erode(floatArray11);
        morphology.Erode erode14 = new morphology.Erode(floatArray11);
        morphology.Erode erode15 = new morphology.Erode(floatArray11);
        java.lang.Class<?> wildcardClass16 = floatArray11.getClass();
        morphology.Erode erode17 = new morphology.Erode(floatArray11);
        morphology.BaseMorphology baseMorphology18 = convolutionKernel2.compose((morphology.BaseMorphology) erode17);
        morphology.Sobel.Direction direction19 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel20 = new morphology.Sobel(direction19);
        float[] floatArray23 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel24 = null; // flaky: new morphology.ConvolutionKernel(floatArray23);
        float[] floatArray27 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel28 = null; // flaky: new morphology.ConvolutionKernel(floatArray27);
        morphology.BaseMorphology baseMorphology29 = null; // flaky: convolutionKernel24.compose((morphology.BaseMorphology) convolutionKernel28);
        morphology.BaseMorphology baseMorphology30 = sobel20.compose((morphology.BaseMorphology) convolutionKernel24);
        morphology.Threshold threshold32 = new morphology.Threshold(0.0f);
        float[] floatArray37 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode38 = new morphology.Erode(floatArray37);
        morphology.BaseMorphology baseMorphology39 = threshold32.compose((morphology.BaseMorphology) erode38);
        java.lang.Class<?> wildcardClass40 = erode38.getClass();
        morphology.Threshold threshold42 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology43 = erode38.compose((morphology.BaseMorphology) threshold42);
        morphology.BaseMorphology baseMorphology44 = null; // flaky: convolutionKernel24.compose((morphology.BaseMorphology) erode38);
        morphology.BaseMorphology baseMorphology45 = baseMorphology18.compose((morphology.BaseMorphology) erode38);
        java.lang.Class<?> wildcardClass46 = erode38.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction19.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray27);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(baseMorphology39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(baseMorphology43);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology44);
        org.junit.Assert.assertNotNull(baseMorphology45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        97, 255);
        util.Histogram histogram18 = new util.Histogram((int) ' ');
        histogram18.put((int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((int) ' ');
        int[] intArray23 = histogram22.getData();
        histogram18.set(intArray23);
        java.lang.Class<?> wildcardClass25 = intArray23.getClass();
        histogram16.set(intArray23);
        histogram16.setOffset(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth(1);
        // flaky: histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
        util.Histogram histogram15 = new util.Histogram((int) ' ');
        histogram15.setWidth((int) (byte) 100);
        histogram15.setOffset((int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        // flaky: histogram21.setOffset((int) (byte) 1);
        // flaky: histogram21.setOffset((int) '4');
        int[] intArray30 = null; // flaky: histogram21.getData();
        // flaky: histogram15.set(intArray30);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(intArray30, (int) (short) 100);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray30, 97);
        // flaky: histogram35.setWidth(100);
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
        java.lang.Class<?> wildcardClass41 = histogram39.getClass();
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
        // flaky: histogram43.setSize((int) (short) 10);
        // flaky: histogram43.setSize((int) (byte) 100);
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
        // flaky: histogram49.setSize((int) (short) 10);
        // flaky: histogram49.setSize((int) (byte) 100);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57,
                                                         intArray56);
        // flaky: histogram49.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        (int) 'a');
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        97, 255);
        // flaky: histogram43.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram67 = null; // flaky: new util.Histogram(0);
        // flaky: histogram67.setSize((int) (short) 10);
        // flaky: histogram67.setSize((int) (byte) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75,
                                                         intArray74);
        // flaky: histogram67.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram79 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) 'a');
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) '4', (int) 'a');
        int[] intArray83 = histogram82.getData();
        util.Histogram histogram85 = new util.Histogram(intArray83,
                                                        (int) (short) 10);
        // flaky: histogram43.set(intArray83);
        histogram39.set(intArray83);
        util.Histogram histogram89 = new util.Histogram(intArray83,
                                                        (int) (short) 100);
        util.Histogram histogram91 = new util.Histogram(intArray83, (int) '#');
        java.lang.Class<?> wildcardClass92 = intArray83.getClass();
        // flaky: histogram35.set(intArray83);
        // flaky: histogram1.set(intArray83);
        util.Histogram histogram96 = new util.Histogram(intArray83,
                                                        (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'",
                                    int13 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'",
                                    boolean58 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'",
                                    boolean76 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = new util.Histogram((int) (byte) 100);
        int[] intArray28 = histogram27.getData();
        util.Histogram histogram30 = new util.Histogram(intArray28,
                                                        (int) (short) 10);
        histogram14.set(intArray28);
        util.Histogram histogram34 = new util.Histogram(intArray28, 52,
                                                        (int) ' ');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
        // flaky: histogram36.setSize((int) '4');
        // flaky: histogram36.setWidth((int) (byte) 0);
        // flaky: histogram36.setOffset((int) ' ');
        // flaky: histogram36.setOffset((int) (byte) 1);
        int[] intArray45 = null; // flaky: histogram36.getData();
        // flaky: histogram34.set(intArray45);
        histogram34.setSize((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
        // flaky: org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19,
                                                         intArray18);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray25 = histogram24.getData();
        histogram24.setWidth(97);
        util.Histogram histogram29 = new util.Histogram((int) ' ');
        int[] intArray30 = histogram29.getData();
        histogram24.set(intArray30);
        // flaky: histogram1.set(intArray30);
        util.Histogram histogram34 = new util.Histogram((int) 'a');
        histogram34.setSize((int) (byte) 10);
        histogram34.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass39 = histogram34.getClass();
        int[] intArray40 = histogram34.getData();
        util.Histogram histogram43 = new util.Histogram(intArray40, 10, 52);
        util.Histogram histogram45 = new util.Histogram(intArray40, (int) 'a');
        // flaky: histogram1.set(intArray40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10,
                                            1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
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
        float[] floatArray39 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel40 = null; // flaky: new morphology.ConvolutionKernel(floatArray39);
        morphology.BaseMorphology baseMorphology41 = erode34.compose((morphology.BaseMorphology) convolutionKernel40);
        java.awt.image.BufferedImage bufferedImage42 = null;
        try {
            java.awt.image.BufferedImage bufferedImage43 = erode34.apply(bufferedImage42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology18);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology19);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(floatArray21);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology26);
        org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(floatArray28);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertNotNull(baseMorphology41);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) ' ');
        histogram25.setOffset((int) (byte) 100);
        histogram25.setWidth((int) (byte) 1);
        int[] intArray30 = histogram25.getData();
        try {
            util.Histogram histogram33 = null; // flaky: new util.Histogram(intArray30, (int) (short) -1, (int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
        // flaky: histogram12.setSize((int) (short) 10);
        // flaky: histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20,
                                                         intArray19);
        // flaky: histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                        (int) (byte) 100);
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                        255);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                        (int) ' ');
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList20);
        try {
            util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                            (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'",
                                    boolean21 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int[] intArray8 = null; // flaky: histogram1.getData();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray8, 1);
        // flaky: histogram10.setWidth((int) '#');
        // flaky: org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17,
                                                        (int) (byte) 100,
                                                        (int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        util.Histogram histogram18 = new util.Histogram(intArray16,
                                                        (int) (byte) 10);
        util.Histogram histogram20 = new util.Histogram((int) ' ');
        histogram20.setWidth((int) (byte) 100);
        histogram20.setOffset((int) (short) 100);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
        // flaky: histogram26.setSize((int) (short) 10);
        // flaky: histogram26.setSize((int) (byte) 100);
        // flaky: histogram26.setOffset((int) (byte) 1);
        // flaky: histogram26.setOffset((int) '4');
        int[] intArray35 = null; // flaky: histogram26.getData();
        // flaky: histogram20.set(intArray35);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(intArray35, (int) (short) 100);
        util.Histogram histogram40 = null; // flaky: new util.Histogram(intArray35, 97);
        util.Histogram histogram42 = null; // flaky: new util.Histogram(0);
        // flaky: histogram42.setSize((int) (short) 10);
        // flaky: histogram42.setSize((int) (byte) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50,
                                                         intArray49);
        // flaky: histogram42.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList50,
                                                        (int) 'a');
        // flaky: histogram40.set((java.util.List<java.lang.Integer>) intList50);
        int[] intArray56 = null; // flaky: histogram40.getData();
        util.Histogram histogram58 = new util.Histogram((int) ' ');
        int[] intArray59 = histogram58.getData();
        // flaky: histogram40.set(intArray59);
        histogram18.set(intArray59);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        // flaky: org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'",
                                    boolean51 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray59);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        histogram14.setOffset((int) (byte) 1);
        histogram14.setWidth(100);
        histogram14.setWidth((int) 'a');
        util.Histogram histogram27 = new util.Histogram((int) (byte) 100);
        int[] intArray28 = histogram27.getData();
        util.Histogram histogram30 = new util.Histogram(intArray28,
                                                        (int) (short) 10);
        histogram14.set(intArray28);
        int[] intArray32 = histogram14.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
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
        float[] floatArray18 = new float[] {};
        morphology.Erode erode19 = new morphology.Erode(floatArray18);
        morphology.ConvolutionKernel convolutionKernel20 = new morphology.ConvolutionKernel(floatArray18);
        morphology.ConvolutionKernel convolutionKernel21 = new morphology.ConvolutionKernel(floatArray18);
        morphology.Erode erode22 = new morphology.Erode(floatArray18);
        morphology.Identity identity23 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology24 = erode22.compose((morphology.BaseMorphology) identity23);
        float[] floatArray26 = new float[] { 0L };
        morphology.Erode erode27 = new morphology.Erode(floatArray26);
        morphology.ConvolutionKernel convolutionKernel28 = new morphology.ConvolutionKernel(floatArray26);
        java.lang.Class<?> wildcardClass29 = floatArray26.getClass();
        morphology.ConvolutionKernel convolutionKernel30 = new morphology.ConvolutionKernel(floatArray26);
        morphology.Erode erode31 = new morphology.Erode(floatArray26);
        float[] floatArray33 = new float[] { 0L };
        morphology.Erode erode34 = new morphology.Erode(floatArray33);
        morphology.ConvolutionKernel convolutionKernel35 = new morphology.ConvolutionKernel(floatArray33);
        java.lang.Class<?> wildcardClass36 = floatArray33.getClass();
        morphology.ConvolutionKernel convolutionKernel37 = new morphology.ConvolutionKernel(floatArray33);
        morphology.ConvolutionKernel convolutionKernel38 = new morphology.ConvolutionKernel(floatArray33);
        morphology.BaseMorphology baseMorphology39 = erode31.compose((morphology.BaseMorphology) convolutionKernel38);
        float[] floatArray40 = new float[] {};
        morphology.Erode erode41 = new morphology.Erode(floatArray40);
        morphology.ConvolutionKernel convolutionKernel42 = new morphology.ConvolutionKernel(floatArray40);
        morphology.ConvolutionKernel convolutionKernel43 = new morphology.ConvolutionKernel(floatArray40);
        morphology.BaseMorphology baseMorphology44 = baseMorphology39.compose((morphology.BaseMorphology) convolutionKernel43);
        morphology.Threshold threshold46 = new morphology.Threshold(0.0f);
        float[] floatArray51 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode52 = new morphology.Erode(floatArray51);
        morphology.BaseMorphology baseMorphology53 = threshold46.compose((morphology.BaseMorphology) erode52);
        float[] floatArray54 = new float[] {};
        morphology.Erode erode55 = new morphology.Erode(floatArray54);
        morphology.ConvolutionKernel convolutionKernel56 = new morphology.ConvolutionKernel(floatArray54);
        morphology.ConvolutionKernel convolutionKernel57 = new morphology.ConvolutionKernel(floatArray54);
        morphology.ConvolutionKernel convolutionKernel58 = new morphology.ConvolutionKernel(floatArray54);
        morphology.ConvolutionKernel convolutionKernel59 = new morphology.ConvolutionKernel(floatArray54);
        morphology.Erode erode60 = new morphology.Erode(floatArray54);
        morphology.ConvolutionKernel convolutionKernel61 = new morphology.ConvolutionKernel(floatArray54);
        morphology.Erode erode62 = new morphology.Erode(floatArray54);
        morphology.Erode erode63 = new morphology.Erode(floatArray54);
        morphology.BaseMorphology baseMorphology64 = baseMorphology53.compose((morphology.BaseMorphology) erode63);
        morphology.BaseMorphology baseMorphology65 = convolutionKernel43.compose(baseMorphology64);
        morphology.BaseMorphology baseMorphology66 = erode22.compose((morphology.BaseMorphology) convolutionKernel43);
        morphology.BaseMorphology baseMorphology67 = erode16.compose(baseMorphology66);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(baseMorphology24);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(baseMorphology39);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertNotNull(baseMorphology44);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertNotNull(baseMorphology53);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertNotNull(baseMorphology64);
        org.junit.Assert.assertNotNull(baseMorphology65);
        org.junit.Assert.assertNotNull(baseMorphology66);
        org.junit.Assert.assertNotNull(baseMorphology67);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        util.Histogram histogram2 = new util.Histogram(2, 10);
        util.Histogram histogram4 = new util.Histogram(2);
        int[] intArray5 = histogram4.getData();
        histogram2.set(intArray5);
        histogram2.put(0);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        int[] intArray5 = histogram2.getData();
        int[] intArray6 = histogram2.getData();
        histogram2.setSize(0);
        histogram2.setSize(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        97, 255);
        util.Histogram histogram18 = new util.Histogram((int) ' ');
        histogram18.put((int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((int) ' ');
        int[] intArray23 = histogram22.getData();
        histogram18.set(intArray23);
        java.lang.Class<?> wildcardClass25 = intArray23.getClass();
        histogram16.set(intArray23);
        histogram16.setWidth((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        // flaky: histogram1.put((int) (short) 10);
        int[] intArray26 = null; // flaky: histogram1.getData();
        util.Histogram histogram28 = new util.Histogram((int) ' ');
        histogram28.setWidth((int) (byte) 100);
        histogram28.setOffset((int) (short) 100);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
        // flaky: histogram34.setSize((int) (short) 10);
        // flaky: histogram34.setSize((int) (byte) 100);
        // flaky: histogram34.setOffset((int) (byte) 1);
        // flaky: histogram34.setOffset((int) '4');
        int[] intArray43 = null; // flaky: histogram34.getData();
        // flaky: histogram28.set(intArray43);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(intArray43, (int) (short) 100);
        util.Histogram histogram48 = null; // flaky: new util.Histogram(intArray43, 97);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
        // flaky: histogram50.setSize((int) (short) 10);
        // flaky: histogram50.setSize((int) (byte) 100);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58,
                                                         intArray57);
        // flaky: histogram50.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList58,
                                                        (int) 'a');
        // flaky: histogram48.set((java.util.List<java.lang.Integer>) intList58);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList58,
                                                        (int) (short) 1, 32);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList58);
        int[] intArray68 = null; // flaky: histogram1.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray26);
        // flaky: org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'",
                                    boolean59 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray68);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setOffset((int) '#');
        java.util.List<java.lang.Integer> intList10 = null;
        try {
            histogram1.set(intList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        util.Histogram histogram2 = new util.Histogram((int) '4', 9);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
        // flaky: histogram12.setSize((int) (short) 10);
        // flaky: histogram12.setSize((int) (byte) 100);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
        // flaky: histogram18.setSize((int) (short) 10);
        // flaky: histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26,
                                                         intArray25);
        // flaky: histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) 'a');
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        97, 255);
        // flaky: histogram12.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
        // flaky: histogram36.setSize((int) (short) 10);
        // flaky: histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44,
                                                         intArray43);
        // flaky: histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) 'a');
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) '4', (int) 'a');
        int[] intArray52 = histogram51.getData();
        util.Histogram histogram54 = new util.Histogram(intArray52,
                                                        (int) (short) 10);
        // flaky: histogram12.set(intArray52);
        histogram4.set(intArray52);
        util.Histogram histogram58 = new util.Histogram(intArray52,
                                                        (int) (byte) 10);
        util.Histogram histogram60 = new util.Histogram(intArray52,
                                                        (int) (short) 10);
        histogram2.set(intArray52);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'",
                                    boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        util.Histogram histogram14 = new util.Histogram(intArray9,
                                                        (int) (short) 100,
                                                        (int) (byte) 10);
        util.Histogram histogram17 = new util.Histogram(intArray9, 32,
                                                        (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = histogram17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        histogram13.setWidth((-1));
        histogram13.setOffset(0);
        try {
            histogram13.put(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        // flaky: histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((int) ' ');
        histogram38.setWidth((int) (byte) 100);
        histogram38.setOffset((int) (short) 100);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
        // flaky: histogram44.setSize((int) (short) 10);
        // flaky: histogram44.setSize((int) (byte) 100);
        // flaky: histogram44.setOffset((int) (byte) 1);
        // flaky: histogram44.setOffset((int) '4');
        int[] intArray53 = null; // flaky: histogram44.getData();
        // flaky: histogram38.set(intArray53);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(intArray53, (int) (short) 100);
        // flaky: histogram7.set(intArray53);
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram(intArray53, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray53);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        // flaky: histogram1.setSize(35);
        // flaky: org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        // flaky: histogram20.setSize((int) 'a');
        int int28 = 0; // flaky: histogram20.get((int) (short) 0);
        int[] intArray29 = null; // flaky: histogram20.getData();
        util.Histogram histogram32 = null; // flaky: new util.Histogram(intArray29, (int) ' ', (int) (short) -1);
        // flaky: histogram16.set(intArray29);
        int[] intArray34 = histogram16.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'",
                                    int28 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(35, (int) (short) -1);
        // flaky: histogram2.setWidth(9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        histogram14.setWidth(97);
        histogram14.setWidth((int) (byte) 1);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29,
                                                         intArray28);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) 'a');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) '4', (int) 'a');
        int[] intArray37 = histogram36.getData();
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
        // flaky: histogram39.setSize((int) (short) 10);
        // flaky: histogram39.setSize((int) (byte) 100);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47,
                                                         intArray46);
        // flaky: histogram39.set((java.util.List<java.lang.Integer>) intList47);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList47,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList47,
                                                        (int) (byte) 100);
        histogram36.set((java.util.List<java.lang.Integer>) intList47);
        int[] intArray56 = histogram36.getData();
        histogram14.set(intArray56);
        java.lang.Class<?> wildcardClass58 = histogram14.getClass();
        util.Histogram histogram60 = null; // flaky: new util.Histogram(0);
        // flaky: histogram60.setSize((int) (short) 10);
        // flaky: histogram60.setSize((int) (byte) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68,
                                                         intArray67);
        // flaky: histogram60.set((java.util.List<java.lang.Integer>) intList68);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        (int) (byte) 100);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        255);
        util.Histogram histogram79 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        (int) ' ');
        util.Histogram histogram81 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        (int) '4');
        histogram14.set((java.util.List<java.lang.Integer>) intList68);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList68,
                                                        (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'",
                                    boolean30 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'",
                                    boolean48 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'",
                                    boolean69 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.Erode erode8 = new morphology.Erode(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology11 = convolutionKernel5.compose((morphology.BaseMorphology) erode10);
        float[] floatArray16 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode17 = new morphology.Erode(floatArray16);
        morphology.Erode erode18 = new morphology.Erode(floatArray16);
        morphology.Erode erode19 = new morphology.Erode(floatArray16);
        float[] floatArray22 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel23 = null; // flaky: new morphology.ConvolutionKernel(floatArray22);
        float[] floatArray26 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel27 = null; // flaky: new morphology.ConvolutionKernel(floatArray26);
        float[] floatArray30 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel31 = null; // flaky: new morphology.ConvolutionKernel(floatArray30);
        morphology.BaseMorphology baseMorphology32 = null; // flaky: convolutionKernel27.compose((morphology.BaseMorphology) convolutionKernel31);
        morphology.BaseMorphology baseMorphology33 = null; // flaky: convolutionKernel23.compose((morphology.BaseMorphology) convolutionKernel31);
        java.lang.Class<?> wildcardClass34 = null; // flaky: convolutionKernel31.getClass();
        float[] floatArray35 = new float[] {};
        morphology.Erode erode36 = new morphology.Erode(floatArray35);
        morphology.ConvolutionKernel convolutionKernel37 = new morphology.ConvolutionKernel(floatArray35);
        morphology.Erode erode38 = new morphology.Erode(floatArray35);
        morphology.ConvolutionKernel convolutionKernel39 = new morphology.ConvolutionKernel(floatArray35);
        morphology.BaseMorphology baseMorphology40 = null; // flaky: convolutionKernel31.compose((morphology.BaseMorphology) convolutionKernel39);
        morphology.BaseMorphology baseMorphology41 = erode19.compose((morphology.BaseMorphology) convolutionKernel39);
        morphology.BaseMorphology baseMorphology42 = erode10.compose(baseMorphology41);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray30);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology32);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology33);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(floatArray35);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology40);
        org.junit.Assert.assertNotNull(baseMorphology41);
        org.junit.Assert.assertNotNull(baseMorphology42);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '#',
                                                        (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        52, (int) 'a');
        try {
            util.Histogram histogram25 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 1, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        int int1 = util.RGBPixel.getRed(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        // flaky: histogram1.setWidth((int) (byte) 0);
        int int7 = 0; // flaky: histogram1.get(1);
        int[] intArray8 = null; // flaky: histogram1.getData();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        // flaky: histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
        // flaky: histogram17.setSize((int) (short) 10);
        // flaky: histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25,
                                                         intArray24);
        // flaky: histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) (byte) 1, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass15 = intList9.getClass();
        java.lang.Class<?> wildcardClass16 = intList9.getClass();
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0, 2);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, (int) '4');
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList41);
        // flaky: histogram1.setSize((int) '4');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
        // flaky: histogram1.set(intArray10);
        util.Histogram histogram14 = new util.Histogram(intArray10,
                                                        (int) (short) 1,
                                                        (int) '4');
        try {
            util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray10, 0, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, (int) '4');
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, 255);
        histogram56.setSize((int) (short) 10);
        histogram56.setOffset(255);
        histogram56.put(10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        // flaky: histogram2.setWidth((int) '4');
        try {
            int int8 = 0; // flaky: histogram2.get((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17,
                                                        (int) (short) 1,
                                                        (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17,
                                                        (int) (short) 10);
        util.Histogram histogram25 = new util.Histogram(intArray17, 97,
                                                        (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = histogram25.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        histogram18.put(0);
        histogram18.put((int) (byte) 100);
        int int24 = histogram18.get(1);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
        // flaky: histogram26.setWidth(0);
        // flaky: histogram26.setSize((int) 'a');
        // flaky: histogram26.setWidth((int) (byte) 100);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
        // flaky: histogram34.setSize((int) (short) 10);
        // flaky: histogram34.setSize((int) (byte) 100);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42,
                                                         intArray41);
        // flaky: histogram34.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList42,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram26.set((java.util.List<java.lang.Integer>) intList42);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(0);
        // flaky: histogram50.setSize((int) (short) 10);
        // flaky: histogram50.setSize((int) (byte) 100);
        // flaky: histogram50.setSize((int) 'a');
        util.Histogram histogram58 = null; // flaky: new util.Histogram(0);
        // flaky: histogram58.setSize((int) (short) 10);
        // flaky: histogram58.setSize((int) (byte) 100);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66,
                                                         intArray65);
        // flaky: histogram58.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram71 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram50.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        10);
        int[] intArray75 = histogram74.getData();
        // flaky: histogram26.set(intArray75);
        histogram18.set(intArray75);
        util.Histogram histogram80 = new util.Histogram(intArray75, 52,
                                                        (int) (byte) 100);
        util.Histogram histogram82 = new util.Histogram(intArray75, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'",
                                    int24 == 1);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'",
                                    boolean43 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'",
                                    boolean67 == true);
        org.junit.Assert.assertNotNull(intArray75);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        util.Histogram histogram2 = new util.Histogram((int) '4',
                                                       (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        // flaky: histogram4.setSize((int) 'a');
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
        // flaky: histogram12.setSize((int) (short) 10);
        // flaky: histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20,
                                                         intArray19);
        // flaky: histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
        // flaky: histogram28.setSize((int) (short) 10);
        // flaky: histogram28.setSize((int) (byte) 100);
        // flaky: histogram28.setSize((int) 'a');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
        // flaky: histogram36.setSize((int) (short) 10);
        // flaky: histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44,
                                                         intArray43);
        // flaky: histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram28.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        1, (int) '4');
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        1, 255);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        97);
        java.lang.Class<?> wildcardClass62 = intList44.getClass();
        histogram2.set((java.util.List<java.lang.Integer>) intList44);
        histogram2.setWidth(255);
        util.Histogram histogram67 = null; // flaky: new util.Histogram(0);
        // flaky: histogram67.setSize((int) (short) 10);
        // flaky: histogram67.setSize((int) (byte) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75,
                                                         intArray74);
        // flaky: histogram67.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray81 = histogram80.getData();
        util.Histogram histogram83 = new util.Histogram(intArray81,
                                                        (int) (short) 100);
        int[] intArray84 = histogram83.getData();
        histogram2.set(intArray84);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'",
                                    boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'",
                                    boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'",
                                    boolean76 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertNotNull(intArray84);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) ' ');
        histogram25.setOffset((int) (byte) 100);
        histogram25.setSize(97);
        histogram25.setSize(52);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        java.lang.Class<?> wildcardClass5 = floatArray1.getClass();
        morphology.Erode erode6 = new morphology.Erode(floatArray1);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        // flaky: histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 10, 100);
        try {
            int int41 = histogram39.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17,
                                                        (int) (short) 1,
                                                        (int) (short) 10);
        util.Histogram histogram22 = new util.Histogram(intArray17,
                                                        (int) (short) 10);
        histogram22.setWidth(100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        35);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        histogram20.setOffset(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        util.Histogram histogram2 = new util.Histogram(52, 52);
        try {
            histogram2.setSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        util.Histogram histogram2 = new util.Histogram((int) '#', (int) 'a');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        histogram7.put((int) '#');
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        // flaky: histogram11.setSize((int) 'a');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        10);
        histogram7.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram39 = new util.Histogram(1, (int) (short) 100);
        int[] intArray40 = histogram39.getData();
        util.Histogram histogram42 = new util.Histogram(intArray40, (int) '#');
        int[] intArray43 = histogram42.getData();
        histogram7.set(intArray43);
        java.lang.Class<?> wildcardClass45 = histogram7.getClass();
        util.Histogram histogram47 = null; // flaky: new util.Histogram(0);
        // flaky: histogram47.setSize((int) (short) 10);
        // flaky: histogram47.setSize((int) (byte) 100);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55,
                                                         intArray54);
        // flaky: histogram47.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram60 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        (int) (byte) 100);
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        255);
        util.Histogram histogram66 = null; // flaky: new util.Histogram(0);
        // flaky: histogram66.setSize((int) (short) 10);
        // flaky: histogram66.setSize((int) (byte) 100);
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74,
                                                         intArray73);
        // flaky: histogram66.set((java.util.List<java.lang.Integer>) intList74);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList74,
                                                        (int) 'a');
        histogram64.set((java.util.List<java.lang.Integer>) intList74);
        util.Histogram histogram81 = null; // flaky: new util.Histogram(0);
        // flaky: histogram81.setSize((int) (short) 10);
        // flaky: histogram81.setSize((int) (byte) 100);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89,
                                                         intArray88);
        // flaky: histogram81.set((java.util.List<java.lang.Integer>) intList89);
        util.Histogram histogram94 = new util.Histogram((java.util.List<java.lang.Integer>) intList89,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram64.set((java.util.List<java.lang.Integer>) intList89);
        histogram7.set((java.util.List<java.lang.Integer>) intList89);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'",
                                    boolean56 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'",
                                    boolean75 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'",
                                    boolean90 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        100, (int) (byte) 10);
        histogram19.setWidth((int) (short) 1);
        int[] intArray22 = histogram19.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        histogram2.setSize(100);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) '4');
        int[] intArray25 = null; // flaky: histogram22.getData();
        // flaky: histogram20.set(intArray25);
        histogram20.setSize(10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = null; // flaky: intArray4.getClass();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray4, (int) '#', 52);
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray4, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray4);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, 255);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = new util.Histogram(intArray2, (int) ' ',
                                                       10);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) '4');
        int[] intArray10 = null; // flaky: histogram7.getData();
        // flaky: histogram5.set(intArray10);
        int[] intArray12 = histogram5.getData();
        histogram5.put(35);
        org.junit.Assert.assertNotNull(intArray2);
        // flaky: org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        // flaky: histogram20.setSize((int) 'a');
        int int28 = 0; // flaky: histogram20.get((int) (short) 0);
        int[] intArray29 = null; // flaky: histogram20.getData();
        util.Histogram histogram32 = null; // flaky: new util.Histogram(intArray29, (int) ' ', (int) (short) -1);
        // flaky: histogram16.set(intArray29);
        histogram16.setOffset(100);
        int int37 = histogram16.get((int) (byte) 10);
        histogram16.setSize(3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'",
                                    int28 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'",
                                    int37 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        util.Histogram histogram1 = new util.Histogram(31);
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
        // flaky: histogram3.setSize((int) (short) 10);
        // flaky: histogram3.setSize((int) (byte) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11,
                                                         intArray10);
        // flaky: histogram3.set((java.util.List<java.lang.Integer>) intList11);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList11,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        histogram16.setWidth(97);
        histogram16.setWidth((int) (byte) 1);
        histogram16.setOffset((int) (byte) 1);
        histogram16.setWidth(100);
        histogram16.setWidth((int) 'a');
        util.Histogram histogram29 = new util.Histogram((int) (byte) 100);
        int[] intArray30 = histogram29.getData();
        util.Histogram histogram32 = new util.Histogram(intArray30,
                                                        (int) (short) 10);
        histogram16.set(intArray30);
        util.Histogram histogram36 = new util.Histogram(intArray30, 52,
                                                        (int) ' ');
        histogram1.set(intArray30);
        util.Histogram histogram39 = new util.Histogram(intArray30, 52);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'",
                                    boolean12 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100);
        histogram16.put(1);
        histogram16.put((int) (short) 1);
        histogram16.setOffset(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        util.Histogram histogram14 = new util.Histogram(intArray9,
                                                        (int) (short) 100,
                                                        (int) (byte) 10);
        int int16 = histogram14.get((int) '#');
        int[] intArray17 = histogram14.getData();
        int[] intArray18 = histogram14.getData();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'",
                                    int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
        // flaky: histogram18.setSize((int) (short) 10);
        // flaky: histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26,
                                                         intArray25);
        // flaky: histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) 'a');
        histogram14.set((java.util.List<java.lang.Integer>) intList26);
        histogram14.setOffset((int) (byte) -1);
        util.Histogram histogram36 = new util.Histogram(100, 10);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(0);
        // flaky: histogram38.setSize((int) (short) 10);
        // flaky: histogram38.setSize((int) (byte) 100);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46,
                                                         intArray45);
        // flaky: histogram38.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        (int) (byte) 100);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        255);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        (int) ' ');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        (int) '4');
        histogram36.set((java.util.List<java.lang.Integer>) intList46);
        histogram14.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        97);
        histogram63.setSize(255);
        java.lang.Class<?> wildcardClass66 = histogram63.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'",
                                    boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        morphology.Grayscale grayscale0 = new morphology.Grayscale();
        float[] floatArray7 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10,
                                            1 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        morphology.Sobel sobel11 = new morphology.Sobel(direction9);
        java.lang.Class<?> wildcardClass12 = direction9.getClass();
        morphology.Sobel sobel13 = new morphology.Sobel(direction9);
        morphology.BaseMorphology baseMorphology14 = null; // flaky: convolutionKernel8.compose((morphology.BaseMorphology) sobel13);
        morphology.BaseMorphology baseMorphology15 = grayscale0.compose((morphology.BaseMorphology) convolutionKernel8);
        float[] floatArray16 = new float[] {};
        morphology.Erode erode17 = new morphology.Erode(floatArray16);
        morphology.Erode erode18 = new morphology.Erode(floatArray16);
        morphology.Erode erode19 = new morphology.Erode(floatArray16);
        morphology.Erode erode20 = new morphology.Erode(floatArray16);
        morphology.ConvolutionKernel convolutionKernel21 = new morphology.ConvolutionKernel(floatArray16);
        morphology.ConvolutionKernel convolutionKernel22 = new morphology.ConvolutionKernel(floatArray16);
        float[] floatArray26 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode27 = null; // flaky: new morphology.Erode(floatArray26);
        morphology.Erode erode28 = null; // flaky: new morphology.Erode(floatArray26);
        float[] floatArray29 = new float[] {};
        morphology.Erode erode30 = new morphology.Erode(floatArray29);
        morphology.ConvolutionKernel convolutionKernel31 = new morphology.ConvolutionKernel(floatArray29);
        morphology.Erode erode32 = new morphology.Erode(floatArray29);
        morphology.BaseMorphology baseMorphology33 = null; // flaky: erode28.compose((morphology.BaseMorphology) erode32);
        morphology.BaseMorphology baseMorphology34 = convolutionKernel22.compose((morphology.BaseMorphology) erode32);
        java.lang.Class<?> wildcardClass35 = erode32.getClass();
        morphology.BaseMorphology baseMorphology36 = grayscale0.compose((morphology.BaseMorphology) erode32);
        java.awt.image.BufferedImage bufferedImage37 = null;
        try {
            java.awt.image.BufferedImage bufferedImage38 = grayscale0.apply(bufferedImage37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.LEFT + "'",
                                    direction9.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass12);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNotNull(floatArray29);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(baseMorphology34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(baseMorphology36);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100,
                                                       (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        histogram2.setSize(32);
        histogram2.setWidth((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.Erode erode3 = new morphology.Erode(floatArray1);
        morphology.Erode erode4 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        util.Histogram histogram8 = new util.Histogram(intArray3,
                                                       (int) (byte) 10, 10);
        int[] intArray9 = histogram8.getData();
        util.Histogram histogram12 = new util.Histogram(intArray9, (int) ' ',
                                                        (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        // flaky: histogram1.setWidth(52);
        // flaky: histogram1.setSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        10);
        int[] intArray50 = histogram49.getData();
        // flaky: histogram1.set(intArray50);
        // flaky: histogram1.put((int) (short) 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57,
                                                         intArray56);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        (int) '#',
                                                        (int) (byte) 100);
        histogram61.put((int) '#');
        java.lang.Class<?> wildcardClass64 = histogram61.getClass();
        int[] intArray65 = histogram61.getData();
        util.Histogram histogram67 = null; // flaky: new util.Histogram(0);
        // flaky: histogram67.setSize((int) (short) 10);
        // flaky: histogram67.setSize((int) (byte) 100);
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75,
                                                         intArray74);
        // flaky: histogram67.set((java.util.List<java.lang.Integer>) intList75);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) (byte) 100);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        255);
        util.Histogram histogram86 = new util.Histogram((java.util.List<java.lang.Integer>) intList75,
                                                        (int) ' ');
        histogram61.set((java.util.List<java.lang.Integer>) intList75);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList75);
        java.lang.Class<?> wildcardClass89 = null; // flaky: histogram1.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'",
                                    boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'",
                                    boolean76 == true);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28,
                                                         intArray27);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
        // flaky: histogram35.setSize((int) (short) 10);
        // flaky: histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43,
                                                         intArray42);
        // flaky: histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 100,
                                                        (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 100);
        int int58 = histogram56.get((int) (byte) 1);
        histogram56.setSize(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'",
                                    int58 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 10);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        52);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        32);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10);
        histogram22.setOffset((-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = histogram1.getClass();
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray9, 52, (-1));
        util.Histogram histogram16 = new util.Histogram(intArray9,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
        // flaky: histogram18.setSize((int) (short) 10);
        // flaky: histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26,
                                                         intArray25);
        // flaky: histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (byte) 100);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        255);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) ' ');
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) '4');
        histogram16.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (byte) 1, 32);
        histogram1.set((java.util.List<java.lang.Integer>) intList26);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        97, 255);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        // flaky: histogram9.set(intArray49);
        histogram1.set(intArray49);
        util.Histogram histogram55 = new util.Histogram(intArray49,
                                                        (int) (byte) 10);
        util.Histogram histogram57 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram(intArray49, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        util.Histogram histogram2 = new util.Histogram((int) '#',
                                                       (int) (short) 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = histogram18.getClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) '#',
                                                        (int) (byte) 100);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        // flaky: histogram29.setSize((int) 'a');
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
        // flaky: histogram37.setSize((int) (short) 10);
        // flaky: histogram37.setSize((int) (byte) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45,
                                                         intArray44);
        // flaky: histogram37.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram29.set((java.util.List<java.lang.Integer>) intList45);
        histogram27.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        97);
        histogram18.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) ' ');
        histogram15.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) (byte) 10,
                                                        (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'",
                                    boolean46 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ', 100);
        histogram16.setOffset((int) (byte) 100);
        histogram16.put((int) (byte) 100);
        int[] intArray21 = histogram16.getData();
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray21, (int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        // flaky: histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
        // flaky: histogram17.setSize((int) (short) 10);
        // flaky: histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25,
                                                         intArray24);
        // flaky: histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        97);
        java.lang.Class<?> wildcardClass35 = histogram34.getClass();
        int[] intArray36 = histogram34.getData();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram4 = null; // flaky: new util.Histogram(intArray2, (int) (byte) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        // flaky: histogram2.setWidth(100);
        java.lang.Class<?> wildcardClass7 = null; // flaky: histogram2.getClass();
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (byte) 100);
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        255);
        histogram26.put(0);
        util.Histogram histogram31 = new util.Histogram(1, (int) (short) 100);
        int[] intArray32 = histogram31.getData();
        util.Histogram histogram34 = new util.Histogram(intArray32, (int) ' ');
        histogram26.set(intArray32);
        try {
            // flaky: histogram2.set(intArray32);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6,
                                                        (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        // flaky: histogram7.setOffset((int) (byte) 1);
        // flaky: histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
        // flaky: histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
        // flaky: histogram23.setSize((int) (short) 10);
        // flaky: histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31,
                                                         intArray30);
        // flaky: histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) 'a');
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
        // flaky: histogram21.set(intArray40);
        // flaky: histogram21.setOffset(1);
        util.Histogram histogram45 = new util.Histogram(100);
        util.Histogram histogram47 = new util.Histogram((int) ' ');
        histogram47.put((int) (byte) 10);
        util.Histogram histogram51 = new util.Histogram((int) ' ');
        int[] intArray52 = histogram51.getData();
        histogram47.set(intArray52);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(intArray52, 52, (-1));
        util.Histogram histogram59 = new util.Histogram(intArray52,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram61 = null; // flaky: new util.Histogram(0);
        // flaky: histogram61.setSize((int) (short) 10);
        // flaky: histogram61.setSize((int) (byte) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69,
                                                         intArray68);
        // flaky: histogram61.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram76 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        (int) (byte) 100);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        255);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        (int) ' ');
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        (int) '4');
        histogram59.set((java.util.List<java.lang.Integer>) intList69);
        histogram45.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram86 = new util.Histogram((java.util.List<java.lang.Integer>) intList69,
                                                        100);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList69);
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'",
                                    boolean70 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram14.put((int) (short) 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
        // flaky: histogram18.setSize((int) (short) 10);
        // flaky: histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26,
                                                         intArray25);
        // flaky: histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) 'a');
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) '4', (int) 'a');
        int[] intArray34 = histogram33.getData();
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
        // flaky: histogram36.setSize((int) (short) 10);
        // flaky: histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44,
                                                         intArray43);
        // flaky: histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) (byte) 100);
        histogram33.set((java.util.List<java.lang.Integer>) intList44);
        histogram14.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        1, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'",
                                    boolean45 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '#',
                                                        (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        32);
        int int23 = histogram21.get(31);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'",
                                    int23 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        int[] intArray5 = histogram2.getData();
        util.Histogram histogram8 = new util.Histogram(intArray5, 32, 10);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
        // flaky: histogram24.setSize((int) (short) 10);
        // flaky: histogram24.setSize((int) (byte) 100);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32,
                                                         intArray31);
        // flaky: histogram24.set((java.util.List<java.lang.Integer>) intList32);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList32,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram37.put((int) (short) 10);
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
        // flaky: histogram41.setSize((int) (short) 10);
        // flaky: histogram41.setSize((int) (byte) 100);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49,
                                                         intArray48);
        // flaky: histogram41.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList49,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray55 = histogram54.getData();
        histogram37.set(intArray55);
        histogram22.set(intArray55);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'",
                                    boolean33 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'",
                                    boolean50 == true);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
        int int7 = histogram1.get((int) (short) 10);
        histogram1.setOffset(32);
        histogram1.setWidth(255);
        try {
            int int13 = histogram1.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        morphology.Sobel sobel11 = new morphology.Sobel(direction9);
        morphology.BaseMorphology baseMorphology12 = erode8.compose((morphology.BaseMorphology) sobel11);
        java.awt.image.BufferedImage bufferedImage13 = null;
        try {
            java.awt.image.BufferedImage bufferedImage14 = sobel11.apply(bufferedImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction9.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(baseMorphology12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28,
                                                         intArray27);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
        // flaky: histogram35.setSize((int) (short) 10);
        // flaky: histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43,
                                                         intArray42);
        // flaky: histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 100,
                                                        (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 100);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) '#', 3);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        histogram1.setSize(52);
        histogram1.setOffset((int) (byte) 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 32, 32,
                                                                  3 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5,
                                                        intArray4);
        try {
            util.Histogram histogram9 = new util.Histogram((java.util.List<java.lang.Integer>) intList5,
                                                           (int) 'a',
                                                           (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'",
                                    boolean6 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = new util.Histogram(intArray2, (int) ' ',
                                                       10);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray2, (int) (byte) 100, (int) (short) -1);
        // flaky: histogram8.setOffset(100);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray7 = new float[] {};
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode10 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray7);
        morphology.BaseMorphology baseMorphology12 = convolutionKernel6.compose((morphology.BaseMorphology) convolutionKernel11);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(baseMorphology12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        // flaky: histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram15 = null; // flaky: new util.Histogram(intArray10, (int) (short) 10, 52);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(intArray10, 1, (int) (byte) 1);
        try {
            int int20 = 0; // flaky: histogram18.get((int) ' ');
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        histogram2.setOffset((int) '#');
        int int10 = histogram2.get((int) '#');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'",
                                    int10 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
        histogram1.setWidth((int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        int int16 = histogram14.get((int) '#');
        histogram14.setSize(31);
        histogram14.setWidth(97);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'",
                                    int16 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass5 = sobel4.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intList0, (-1), 31);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (short) 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
        // flaky: histogram10.setSize((int) (short) 10);
        // flaky: histogram10.setSize((int) (byte) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18,
                                                         intArray17);
        // flaky: histogram10.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) 'a');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        97, 255);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        97);
        histogram2.set((java.util.List<java.lang.Integer>) intList18);
        java.lang.Class<?> wildcardClass30 = intList18.getClass();
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) (short) 10,
                                                        (int) (byte) 100);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) '#');
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'",
                                    boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        float[] floatArray5 = new float[] { 'a', 1, (short) -1, 100, '4' };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setOffset((int) (short) 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        97, 255);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        // flaky: histogram9.set(intArray49);
        histogram1.set(intArray49);
        histogram1.setSize(10);
        histogram1.setWidth(2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
        // flaky: histogram5.setSize((int) (short) 10);
        // flaky: histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19,
                                                         intArray18);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        97, 255);
        // flaky: histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37,
                                                         intArray36);
        // flaky: histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45,
                                                        (int) (short) 10);
        // flaky: histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram51 = new util.Histogram(intArray45,
                                                        (int) (short) 100);
        util.Histogram histogram54 = new util.Histogram(intArray45,
                                                        (int) (short) 10, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass7 = erode6.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        97, 255);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        // flaky: histogram9.set(intArray49);
        histogram1.set(intArray49);
        util.Histogram histogram55 = new util.Histogram(intArray49,
                                                        (int) (byte) 10);
        util.Histogram histogram57 = new util.Histogram(intArray49, 255);
        histogram57.setWidth((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        3, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '#',
                                                        (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100, 100);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', 35);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 1,
                                                        (int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
        // flaky: histogram5.setSize((int) (short) 10);
        // flaky: histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19,
                                                         intArray18);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        97, 255);
        // flaky: histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37,
                                                         intArray36);
        // flaky: histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45,
                                                        (int) (short) 10);
        // flaky: histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram52 = new util.Histogram(intArray45, 9, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth((int) (short) 0);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
        // flaky: histogram13.setWidth(0);
        // flaky: histogram13.setSize((int) 'a');
        // flaky: histogram13.setWidth((int) (byte) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29,
                                                         intArray28);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram13.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
        // flaky: histogram37.setSize((int) (short) 10);
        // flaky: histogram37.setSize((int) (byte) 100);
        // flaky: histogram37.setSize((int) 'a');
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
        // flaky: histogram45.setSize((int) (short) 10);
        // flaky: histogram45.setSize((int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53,
                                                         intArray52);
        // flaky: histogram45.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList53,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram37.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList53,
                                                        10);
        int[] intArray62 = histogram61.getData();
        // flaky: histogram13.set(intArray62);
        util.Histogram histogram65 = new util.Histogram(intArray62, 100);
        try {
            // flaky: histogram1.set(intArray62);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'",
                                    boolean30 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'",
                                    boolean54 == true);
        org.junit.Assert.assertNotNull(intArray62);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15,
                                                         intArray14);
        // flaky: histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        97, 255);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33,
                                                         intArray32);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41,
                                                        (int) (short) 10);
        // flaky: histogram1.set(intArray41);
        util.Histogram histogram46 = null; // flaky: new util.Histogram(0);
        // flaky: histogram46.setSize((int) (short) 10);
        // flaky: histogram46.setSize((int) (byte) 100);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54,
                                                         intArray53);
        // flaky: histogram46.set((java.util.List<java.lang.Integer>) intList54);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList54,
                                                        (int) 'a');
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList54,
                                                        (int) '4', (int) 'a');
        int[] intArray62 = histogram61.getData();
        util.Histogram histogram64 = null; // flaky: new util.Histogram(0);
        // flaky: histogram64.setSize((int) (short) 10);
        // flaky: histogram64.setSize((int) (byte) 100);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72,
                                                         intArray71);
        // flaky: histogram64.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram79 = new util.Histogram((java.util.List<java.lang.Integer>) intList72,
                                                        (int) (byte) 100);
        histogram61.set((java.util.List<java.lang.Integer>) intList72);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList72);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'",
                                    boolean55 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'",
                                    boolean73 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        util.Histogram histogram2 = new util.Histogram(52, (int) '4');
        histogram2.setSize((int) (short) 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth((int) (byte) 100);
        // flaky: histogram1.put((int) (short) 0);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram12.setWidth((int) 'a');
        int[] intArray15 = null; // flaky: histogram12.getData();
        // flaky: histogram12.setOffset((int) (byte) 10);
        // flaky: histogram12.setSize((int) (short) 0);
        // flaky: histogram12.setWidth(255);
        int[] intArray22 = null; // flaky: histogram12.getData();
        java.lang.Class<?> wildcardClass23 = null; // flaky: intArray22.getClass();
        try {
            // flaky: histogram1.set(intArray22);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray15);
        // flaky: org.junit.Assert.assertNotNull(intArray22);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass3 = floatArray0.getClass();
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        morphology.Erode erode9 = new morphology.Erode(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setSize((int) (short) 10);
        // flaky: histogram20.setSize((int) (byte) 100);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28,
                                                         intArray27);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) 'a');
        histogram18.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
        // flaky: histogram35.setSize((int) (short) 10);
        // flaky: histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43,
                                                         intArray42);
        // flaky: histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram18.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (byte) 10);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 100,
                                                        (int) (short) 100);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) '4');
        histogram56.setOffset(10);
        try {
            histogram56.put((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setWidth((int) (byte) 0);
        int[] intArray11 = null; // flaky: histogram2.getData();
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
        // flaky: org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (byte) 100);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        255);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) ' ');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) '4');
        histogram13.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) (byte) 1, 32);
        histogram40.setSize(0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 31);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = convolutionKernel4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10,
                                            1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.Erode erode10 = new morphology.Erode(floatArray8);
        morphology.Erode erode11 = new morphology.Erode(floatArray8);
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray12);
        morphology.Erode erode15 = new morphology.Erode(floatArray12);
        morphology.Erode erode16 = new morphology.Erode(floatArray12);
        morphology.BaseMorphology baseMorphology17 = erode11.compose((morphology.BaseMorphology) erode16);
        float[] floatArray18 = new float[] {};
        morphology.Erode erode19 = new morphology.Erode(floatArray18);
        morphology.ConvolutionKernel convolutionKernel20 = new morphology.ConvolutionKernel(floatArray18);
        morphology.Erode erode21 = new morphology.Erode(floatArray18);
        morphology.ConvolutionKernel convolutionKernel22 = new morphology.ConvolutionKernel(floatArray18);
        morphology.ConvolutionKernel convolutionKernel23 = new morphology.ConvolutionKernel(floatArray18);
        morphology.Erode erode24 = new morphology.Erode(floatArray18);
        morphology.BaseMorphology baseMorphology25 = baseMorphology17.compose((morphology.BaseMorphology) erode24);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: convolutionKernel7.compose((morphology.BaseMorphology) erode24);
        java.awt.image.BufferedImage bufferedImage27 = null;
        try {
            java.awt.image.BufferedImage bufferedImage28 = erode24.apply(bufferedImage27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(baseMorphology25);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology26);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        int[] intArray3 = null; // flaky: histogram2.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 35, (int) (short) 100);
        // flaky: histogram6.put((int) (byte) 0);
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        util.Histogram histogram2 = new util.Histogram((int) (short) 100, 97);
        histogram2.put(0);
        histogram2.setSize(100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        // flaky: histogram9.setSize((int) 'a');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
        // flaky: histogram17.setSize((int) (short) 10);
        // flaky: histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25,
                                                         intArray24);
        // flaky: histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList25);
        histogram7.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        97);
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
        // flaky: histogram36.setSize((int) (short) 10);
        // flaky: histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44,
                                                         intArray43);
        // flaky: histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) 'a');
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44,
                                                        (int) '4', (int) 'a');
        int[] intArray52 = histogram51.getData();
        util.Histogram histogram54 = new util.Histogram(intArray52, 97);
        histogram34.set(intArray52);
        histogram34.put((int) ' ');
        try {
            histogram34.put(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'",
                                    boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(0);
        // flaky: histogram5.setSize((int) (short) 10);
        // flaky: histogram5.setSize((int) (byte) 100);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
        // flaky: histogram11.setSize((int) (short) 10);
        // flaky: histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19,
                                                         intArray18);
        // flaky: histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        (int) 'a');
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19,
                                                        97, 255);
        // flaky: histogram5.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37,
                                                         intArray36);
        // flaky: histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) 'a');
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) '4', (int) 'a');
        int[] intArray45 = histogram44.getData();
        util.Histogram histogram47 = new util.Histogram(intArray45,
                                                        (int) (short) 10);
        // flaky: histogram5.set(intArray45);
        histogram1.set(intArray45);
        util.Histogram histogram51 = new util.Histogram(intArray45,
                                                        (int) (short) 100);
        util.Histogram histogram54 = new util.Histogram(intArray45, 32,
                                                        (int) '4');
        histogram54.setOffset(35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        // flaky: histogram1.setOffset((int) '4');
        // flaky: histogram1.setWidth(255);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, 10);
        histogram2.put(97);
        histogram2.put(52);
        int[] intArray7 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 10);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = new util.Histogram((int) ' ');
        histogram19.setWidth((int) (byte) 100);
        histogram19.setOffset((int) (short) 100);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setOffset((int) (byte) 1);
        // flaky: histogram25.setOffset((int) '4');
        int[] intArray34 = null; // flaky: histogram25.getData();
        // flaky: histogram19.set(intArray34);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(intArray34, (int) (short) 100);
        util.Histogram histogram39 = null; // flaky: new util.Histogram(intArray34, 97);
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
        // flaky: histogram41.setSize((int) (short) 10);
        // flaky: histogram41.setSize((int) (byte) 100);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49,
                                                         intArray48);
        // flaky: histogram41.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList49,
                                                        (int) 'a');
        // flaky: histogram39.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList49,
                                                        (int) (short) 10, 1);
        histogram16.set((java.util.List<java.lang.Integer>) intList49);
        try {
            util.Histogram histogram61 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList49, (-1), 3);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        // flaky: org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'",
                                    boolean50 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        java.lang.Class<?> wildcardClass11 = sobel10.getClass();
        morphology.BaseMorphology baseMorphology12 = threshold1.compose((morphology.BaseMorphology) sobel10);
        morphology.Threshold threshold14 = new morphology.Threshold((float) (-1L));
        morphology.BaseMorphology baseMorphology15 = sobel10.compose((morphology.BaseMorphology) threshold14);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction9.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int[] intArray3 = null; // flaky: histogram2.getData();
        int int5 = 0; // flaky: histogram2.get((int) ' ');
        // flaky: org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray9 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel10 = null; // flaky: new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel12 = null; // flaky: new morphology.ConvolutionKernel(floatArray9);
        morphology.BaseMorphology baseMorphology13 = convolutionKernel6.compose((morphology.BaseMorphology) convolutionKernel12);
        morphology.Grayscale grayscale14 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology15 = baseMorphology13.compose((morphology.BaseMorphology) grayscale14);
        java.awt.image.BufferedImage bufferedImage16 = null;
        try {
            java.awt.image.BufferedImage bufferedImage17 = grayscale14.apply(bufferedImage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        util.Histogram histogram1 = new util.Histogram((int) (short) 100);
        histogram1.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = histogram1.getClass();
        histogram1.setOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        10);
        histogram25.setWidth((int) ' ');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        // flaky: histogram29.setOffset((int) (byte) 1);
        // flaky: histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
        // flaky: histogram25.set(intArray38);
        histogram25.put((int) '#');
        int[] intArray42 = histogram25.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        util.Histogram histogram2 = new util.Histogram(31, (int) (short) 100);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        float[] floatArray11 = new float[] { 0L, 97, (byte) -1, 10.0f,
                                             (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel12 = null; // flaky: new morphology.ConvolutionKernel(floatArray11);
        morphology.Erode erode13 = null; // flaky: new morphology.Erode(floatArray11);
        morphology.Erode erode14 = null; // flaky: new morphology.Erode(floatArray11);
        morphology.BaseMorphology baseMorphology15 = sobel4.compose((morphology.BaseMorphology) erode14);
        java.awt.image.BufferedImage bufferedImage16 = null;
        try {
            java.awt.image.BufferedImage bufferedImage17 = erode14.apply(bufferedImage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23,
                                                         intArray22);
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        (int) 'a');
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList23,
                                                        97, 255);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) 'a');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) '4', (int) 'a');
        int[] intArray49 = histogram48.getData();
        util.Histogram histogram51 = new util.Histogram(intArray49,
                                                        (int) (short) 10);
        // flaky: histogram9.set(intArray49);
        histogram1.set(intArray49);
        histogram1.setSize(10);
        histogram1.setSize(97);
        util.Histogram histogram60 = new util.Histogram(1, (int) (short) 100);
        int[] intArray61 = histogram60.getData();
        util.Histogram histogram63 = new util.Histogram(intArray61, (int) '#');
        util.Histogram histogram66 = new util.Histogram(intArray61,
                                                        (int) (byte) 10, 10);
        int[] intArray67 = histogram66.getData();
        histogram1.set(intArray67);
        util.Histogram histogram71 = new util.Histogram(intArray67,
                                                        (int) (short) 1, 10);
        util.Histogram histogram74 = new util.Histogram(intArray67, 52, 52);
        try {
            util.Histogram histogram76 = null; // flaky: new util.Histogram(intArray67, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'",
                                    boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray67);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setOffset((int) '4');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        histogram8.put((int) (byte) 10);
        util.Histogram histogram12 = new util.Histogram((int) ' ');
        int[] intArray13 = histogram12.getData();
        histogram8.set(intArray13);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray13, 52, (-1));
        util.Histogram histogram20 = new util.Histogram(intArray13,
                                                        (int) (byte) 100, 1);
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
        util.Histogram histogram49 = new util.Histogram(intArray42,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram51 = new util.Histogram(intArray42, (int) '4');
        util.Histogram histogram54 = new util.Histogram(1, (int) (short) 100);
        int[] intArray55 = histogram54.getData();
        histogram51.set(intArray55);
        histogram31.set(intArray55);
        int[] intArray58 = histogram31.getData();
        histogram2.set(intArray58);
        util.Histogram histogram61 = new util.Histogram(intArray58, (int) ' ');
        histogram61.setWidth(2);
        histogram61.setSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray58);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10,
                                                       (int) '4');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
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
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode12 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15,
                                                        (int) (short) 100);
        int[] intArray18 = histogram17.getData();
        util.Histogram histogram21 = new util.Histogram(1, (int) (short) 100);
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = new util.Histogram(intArray22, (int) '#');
        histogram17.set(intArray22);
        util.Histogram histogram28 = new util.Histogram(intArray22,
                                                        (int) (byte) 1, 52);
        try {
            int int30 = histogram28.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15,
                                                         intArray14);
        // flaky: histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        (int) 'a');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        97, 255);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33,
                                                         intArray32);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) 'a');
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) '4', (int) 'a');
        int[] intArray41 = histogram40.getData();
        util.Histogram histogram43 = new util.Histogram(intArray41,
                                                        (int) (short) 10);
        // flaky: histogram1.set(intArray41);
        // flaky: histogram1.put((int) (byte) -1);
        int int48 = 0; // flaky: histogram1.get((int) '#');
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'",
                                    int48 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        // flaky: histogram25.setSize((int) 'a');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        10);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, (int) '4');
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        1, 255);
        histogram56.setSize((int) (short) 10);
        histogram56.setOffset(255);
        histogram56.setSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
        int[] intArray9 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setSize(0);
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass8);
        // flaky: org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) (short) 10);
        // flaky: histogram22.setSize((int) (byte) 100);
        // flaky: histogram22.setOffset((int) (byte) 1);
        util.Histogram histogram30 = new util.Histogram((int) ' ');
        int[] intArray31 = histogram30.getData();
        // flaky: histogram22.set(intArray31);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray31, 100, (int) (short) -1);
        histogram20.set(intArray31);
        util.Histogram histogram38 = new util.Histogram(intArray31, 9);
        util.Histogram histogram40 = new util.Histogram(intArray31,
                                                        (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) ' ');
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) (short) 10);
        // flaky: histogram22.setSize((int) (byte) 100);
        // flaky: histogram22.setOffset((int) (byte) 1);
        util.Histogram histogram30 = new util.Histogram((int) ' ');
        int[] intArray31 = histogram30.getData();
        // flaky: histogram22.set(intArray31);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray31, 100, (int) (short) -1);
        histogram20.set(intArray31);
        util.Histogram histogram38 = new util.Histogram(intArray31, 35);
        util.Histogram histogram41 = new util.Histogram(intArray31, 32,
                                                        (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 1,
                                                       (int) (byte) 10);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        // flaky: histogram4.setOffset((int) (byte) 1);
        util.Histogram histogram12 = new util.Histogram((int) ' ');
        int[] intArray13 = histogram12.getData();
        // flaky: histogram4.set(intArray13);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray13, 100, (int) (short) -1);
        histogram2.set(intArray13);
        util.Histogram histogram20 = new util.Histogram(intArray13, 52);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth((int) (byte) 100);
        // flaky: histogram1.setSize((int) (byte) 1);
        // flaky: histogram1.put((int) (byte) 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        util.Histogram histogram2 = new util.Histogram((int) 'a', 3);
        int int4 = histogram2.get((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        histogram8.put((int) (byte) 10);
        util.Histogram histogram12 = new util.Histogram((int) ' ');
        int[] intArray13 = histogram12.getData();
        histogram8.set(intArray13);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray13, 52, (-1));
        util.Histogram histogram20 = new util.Histogram(intArray13,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram22 = new util.Histogram(intArray13, (int) '4');
        util.Histogram histogram25 = new util.Histogram(1, (int) (short) 100);
        int[] intArray26 = histogram25.getData();
        histogram22.set(intArray26);
        histogram2.set(intArray26);
        java.lang.Class<?> wildcardClass29 = histogram2.getClass();
        java.lang.Class<?> wildcardClass30 = histogram2.getClass();
        histogram2.put(0);
        histogram2.setOffset(100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 10);
        float[] floatArray8 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10,
                                            1 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        morphology.Sobel.Direction direction10 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel11 = new morphology.Sobel(direction10);
        morphology.Sobel sobel12 = new morphology.Sobel(direction10);
        java.lang.Class<?> wildcardClass13 = direction10.getClass();
        morphology.Sobel sobel14 = new morphology.Sobel(direction10);
        morphology.BaseMorphology baseMorphology15 = null; // flaky: convolutionKernel9.compose((morphology.BaseMorphology) sobel14);
        morphology.BaseMorphology baseMorphology16 = threshold1.compose((morphology.BaseMorphology) convolutionKernel9);
        morphology.Sobel.Direction direction17 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel18 = new morphology.Sobel(direction17);
        float[] floatArray19 = new float[] {};
        morphology.Erode erode20 = new morphology.Erode(floatArray19);
        java.lang.Class<?> wildcardClass21 = erode20.getClass();
        morphology.BaseMorphology baseMorphology22 = sobel18.compose((morphology.BaseMorphology) erode20);
        float[] floatArray27 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel28 = new morphology.ConvolutionKernel(floatArray27);
        morphology.Erode erode29 = new morphology.Erode(floatArray27);
        morphology.BaseMorphology baseMorphology30 = sobel18.compose((morphology.BaseMorphology) erode29);
        morphology.BaseMorphology baseMorphology31 = threshold1.compose((morphology.BaseMorphology) erode29);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '"
                                    + morphology.Sobel.Direction.LEFT + "'",
                                    direction10.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass13);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction17.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(baseMorphology31);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) 'a');
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram20 = new util.Histogram(intArray17, 10, 97);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) 'a');
        try {
            util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray17, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (byte) 100);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        255);
        histogram18.put(0);
        try {
            int int22 = histogram18.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth(1);
        // flaky: histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
        // flaky: histogram1.setWidth((int) '4');
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
        // flaky: histogram17.setSize((int) (short) 10);
        // flaky: histogram17.setSize((int) (byte) 100);
        // flaky: histogram17.setSize((int) 'a');
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
        // flaky: histogram25.setSize((int) (short) 10);
        // flaky: histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33,
                                                         intArray32);
        // flaky: histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram17.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
        // flaky: histogram41.setSize((int) (short) 10);
        // flaky: histogram41.setSize((int) (byte) 100);
        // flaky: histogram41.setSize((int) 'a');
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
        // flaky: histogram49.setSize((int) (short) 10);
        // flaky: histogram49.setSize((int) (byte) 100);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57,
                                                         intArray56);
        // flaky: histogram49.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram41.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        10);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList57,
                                                        1, (int) '4');
        // flaky: histogram17.set((java.util.List<java.lang.Integer>) intList57);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList57);
        java.lang.Class<?> wildcardClass71 = intList57.getClass();
        try {
            util.Histogram histogram74 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) 'a', (int) (byte)
                                               // 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'",
                                    int13 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'",
                                    boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 10);
        int[] intArray3 = null; // flaky: histogram2.getData();
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth((int) (byte) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        35);
        try {
            util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
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
        java.lang.Class<?> wildcardClass10 = convolutionKernel9.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 10);
        try {
            // flaky: histogram2.put(31);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology11 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode10);
        morphology.Sobel.Direction direction12 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel13 = new morphology.Sobel(direction12);
        morphology.Sobel sobel14 = new morphology.Sobel(direction12);
        java.lang.Class<?> wildcardClass15 = direction12.getClass();
        morphology.Sobel sobel16 = new morphology.Sobel(direction12);
        morphology.Sobel sobel17 = new morphology.Sobel(direction12);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: erode5.compose((morphology.BaseMorphology) sobel17);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '"
                                    + morphology.Sobel.Direction.LEFT + "'",
                                    direction12.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass15);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
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
        util.Histogram histogram25 = new util.Histogram(intArray18,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram27 = new util.Histogram(intArray18, (int) '4');
        util.Histogram histogram30 = new util.Histogram(1, (int) (short) 100);
        int[] intArray31 = histogram30.getData();
        histogram27.set(intArray31);
        histogram7.set(intArray31);
        int[] intArray34 = histogram7.getData();
        histogram2.set(intArray34);
        try {
            util.Histogram histogram37 = null; // flaky: new util.Histogram(intArray34, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass5 = direction0.getClass();
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        morphology.Threshold threshold8 = new morphology.Threshold((float) 10L);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        morphology.Sobel sobel11 = new morphology.Sobel(direction9);
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray12);
        morphology.Erode erode15 = new morphology.Erode(floatArray12);
        morphology.Erode erode16 = new morphology.Erode(floatArray12);
        morphology.BaseMorphology baseMorphology17 = sobel11.compose((morphology.BaseMorphology) erode16);
        morphology.BaseMorphology baseMorphology18 = threshold8.compose((morphology.BaseMorphology) erode16);
        float[] floatArray20 = new float[] { 0L };
        morphology.Erode erode21 = new morphology.Erode(floatArray20);
        morphology.ConvolutionKernel convolutionKernel22 = new morphology.ConvolutionKernel(floatArray20);
        java.lang.Class<?> wildcardClass23 = floatArray20.getClass();
        morphology.ConvolutionKernel convolutionKernel24 = new morphology.ConvolutionKernel(floatArray20);
        morphology.Erode erode25 = new morphology.Erode(floatArray20);
        float[] floatArray27 = new float[] { 0L };
        morphology.Erode erode28 = new morphology.Erode(floatArray27);
        morphology.ConvolutionKernel convolutionKernel29 = new morphology.ConvolutionKernel(floatArray27);
        java.lang.Class<?> wildcardClass30 = floatArray27.getClass();
        morphology.ConvolutionKernel convolutionKernel31 = new morphology.ConvolutionKernel(floatArray27);
        morphology.ConvolutionKernel convolutionKernel32 = new morphology.ConvolutionKernel(floatArray27);
        morphology.BaseMorphology baseMorphology33 = erode25.compose((morphology.BaseMorphology) convolutionKernel32);
        morphology.BaseMorphology baseMorphology34 = threshold8.compose((morphology.BaseMorphology) erode25);
        morphology.BaseMorphology baseMorphology35 = sobel6.compose(baseMorphology34);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction9.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(baseMorphology34);
        org.junit.Assert.assertNotNull(baseMorphology35);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram14.setOffset(10);
        int int18 = histogram14.get((int) (short) 0);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
        // flaky: histogram20.setWidth(0);
        // flaky: histogram20.setSize((int) 'a');
        // flaky: histogram20.setWidth((int) (byte) 100);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0);
        // flaky: histogram28.setSize((int) (short) 10);
        // flaky: histogram28.setSize((int) (byte) 100);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36,
                                                         intArray35);
        // flaky: histogram28.set((java.util.List<java.lang.Integer>) intList36);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList36,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList36);
        // flaky: histogram20.put((int) (short) 10);
        int[] intArray45 = null; // flaky: histogram20.getData();
        util.Histogram histogram47 = new util.Histogram((int) ' ');
        histogram47.setWidth((int) (byte) 100);
        histogram47.setOffset((int) (short) 100);
        util.Histogram histogram53 = null; // flaky: new util.Histogram(0);
        // flaky: histogram53.setSize((int) (short) 10);
        // flaky: histogram53.setSize((int) (byte) 100);
        // flaky: histogram53.setOffset((int) (byte) 1);
        // flaky: histogram53.setOffset((int) '4');
        int[] intArray62 = null; // flaky: histogram53.getData();
        // flaky: histogram47.set(intArray62);
        util.Histogram histogram65 = null; // flaky: new util.Histogram(intArray62, (int) (short) 100);
        util.Histogram histogram67 = null; // flaky: new util.Histogram(intArray62, 97);
        util.Histogram histogram69 = null; // flaky: new util.Histogram(0);
        // flaky: histogram69.setSize((int) (short) 10);
        // flaky: histogram69.setSize((int) (byte) 100);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList77 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77,
                                                         intArray76);
        // flaky: histogram69.set((java.util.List<java.lang.Integer>) intList77);
        util.Histogram histogram81 = new util.Histogram((java.util.List<java.lang.Integer>) intList77,
                                                        (int) 'a');
        // flaky: histogram67.set((java.util.List<java.lang.Integer>) intList77);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList77,
                                                        (int) (short) 1, 32);
        // flaky: histogram20.set((java.util.List<java.lang.Integer>) intList77);
        histogram14.set((java.util.List<java.lang.Integer>) intList77);
        histogram14.put(32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'",
                                    int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'",
                                    boolean37 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray45);
        // flaky: org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'",
                                    boolean78 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100);
        try {
            util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        histogram1.setOffset((int) (short) 100);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        // flaky: histogram7.setOffset((int) (byte) 1);
        // flaky: histogram7.setOffset((int) '4');
        int[] intArray16 = null; // flaky: histogram7.getData();
        // flaky: histogram1.set(intArray16);
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, 97);
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
        // flaky: histogram23.setSize((int) (short) 10);
        // flaky: histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31,
                                                         intArray30);
        // flaky: histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31,
                                                        (int) 'a');
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList31);
        int[] intArray37 = null; // flaky: histogram21.getData();
        util.Histogram histogram39 = new util.Histogram((int) ' ');
        int[] intArray40 = histogram39.getData();
        // flaky: histogram21.set(intArray40);
        util.Histogram histogram43 = new util.Histogram(intArray40,
                                                        (int) (short) 100);
        java.lang.Class<?> wildcardClass44 = histogram43.getClass();
        int int46 = histogram43.get(97);
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'",
                                    int46 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass5 = floatArray0.getClass();
        java.lang.Class<?> wildcardClass6 = floatArray0.getClass();
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel13 = new morphology.ConvolutionKernel(floatArray8);
        morphology.Erode erode14 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray8);
        morphology.Erode erode16 = new morphology.Erode(floatArray8);
        morphology.Erode erode17 = new morphology.Erode(floatArray8);
        morphology.BaseMorphology baseMorphology18 = convolutionKernel7.compose((morphology.BaseMorphology) erode17);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(baseMorphology18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100,
                                                       (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram17.setOffset(10);
        int[] intArray20 = histogram17.getData();
        histogram2.set(intArray20);
        histogram2.setWidth(97);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17,
                                                         intArray16);
        // flaky: histogram9.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList17);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        10);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                        1, (int) '4');
        java.lang.Class<?> wildcardClass29 = histogram28.getClass();
        histogram28.setWidth((int) (byte) 100);
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
        // flaky: histogram33.setSize((int) (short) 10);
        // flaky: histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41,
                                                         intArray40);
        // flaky: histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        (int) (byte) 100);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                        255);
        util.Histogram histogram52 = null; // flaky: new util.Histogram(0);
        // flaky: histogram52.setSize((int) (short) 10);
        // flaky: histogram52.setSize((int) (byte) 100);
        util.Histogram histogram58 = null; // flaky: new util.Histogram(0);
        // flaky: histogram58.setSize((int) (short) 10);
        // flaky: histogram58.setSize((int) (byte) 100);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66,
                                                         intArray65);
        // flaky: histogram58.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        (int) 'a');
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        97, 255);
        // flaky: histogram52.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram76 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        97);
        java.lang.Class<?> wildcardClass77 = intList66.getClass();
        histogram50.set((java.util.List<java.lang.Integer>) intList66);
        histogram28.set((java.util.List<java.lang.Integer>) intList66);
        util.Histogram histogram81 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        97);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList66,
                                                        52);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'",
                                    boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '#',
                                                        (int) (byte) 10);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100, 100);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4', 35);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel10 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
    }
}
