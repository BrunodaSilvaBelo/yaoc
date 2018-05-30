package randoop;

import org.junit.jupiter.api.Test;

public class Regression0Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.GEOMETRICMEAN;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.GEOMETRICMEAN
                                    + "'",
                                    feature0.equals(feature.FirstOrder.Feature.GEOMETRICMEAN));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.LOGSUM;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.LOGSUM + "'",
                                    feature0.equals(feature.FirstOrder.Feature.LOGSUM));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 10,
                                                                  (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8,
                                                        intArray7);
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList8);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'",
                                    boolean9 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = convolutionKernel3.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        java.util.List<java.lang.Integer> intList5 = null;
        try {
            histogram2.set(intList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.SIZE;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.SIZE + "'",
                                    feature0.equals(feature.FirstOrder.Feature.SIZE));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 0, 0, 1,
                                                                  0 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6,
                                                        intArray5);
        try {
            util.Histogram histogram9 = new util.Histogram((java.util.List<java.lang.Integer>) intList6,
                                                           1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'",
                                    boolean7 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int[] intArray6 = new int[] { 10, (-1), (byte) 0, (short) -1, ' ',
                                      'a' };
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray6, 10, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.STDDEV;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.STDDEV + "'",
                                    feature0.equals(feature.FirstOrder.Feature.STDDEV));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MOMENT1;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MOMENT1 + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MOMENT1));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4,
                                                        intArray3);
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList4, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'",
                                    boolean5 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        try {
            int int4 = 0; // flaky: histogram2.get((int) (short) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.awt.image.BufferedImage bufferedImage0 = null;
        try {
            feature.FirstOrder firstOrder1 = new feature.FirstOrder(bufferedImage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int1 = util.RGBPixel.getRed((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MOMENT3;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MOMENT3 + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MOMENT3));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        try {
            int int3 = 0; // flaky: histogram1.get((int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.SKEWNESS;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.SKEWNESS + "'",
                                    feature0.equals(feature.FirstOrder.Feature.SKEWNESS));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.KURTOSIS;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.KURTOSIS + "'",
                                    feature0.equals(feature.FirstOrder.Feature.KURTOSIS));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MEAN;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MEAN + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MEAN));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int[] intArray2 = new int[] { (short) 0, (byte) 1 };
        try {
            util.Histogram histogram4 = null; // flaky: new util.Histogram(intArray2, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray5, (int) (short) 1, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = erode1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MOMENT2;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MOMENT2 + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MOMENT2));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        try {
            // flaky: histogram2.put((int) '#');
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        try {
            // flaky: histogram2.setSize((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int1 = util.RGBPixel.getGreen((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        try {
            // flaky: histogram2.put((int) (short) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MOMENT4;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MOMENT4 + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MOMENT4));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray5, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) -1, 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray3, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) -1);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.VARIANCE;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.VARIANCE + "'",
                                    feature0.equals(feature.FirstOrder.Feature.VARIANCE));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        try {
            // flaky: histogram2.put((int) '#');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) -1, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray5, (int) ' ', (int) (byte) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
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
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList12);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (byte) -1);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.SUM;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.SUM + "'",
                                    feature0.equals(feature.FirstOrder.Feature.SUM));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MAX;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MAX + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MAX));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray3, (int) 'a');
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int1 = util.RGBPixel.getBlue(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'",
                                    int1 == 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int1 = util.RGBPixel.getRed((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList12);
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList12);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.INVERSESUM;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.INVERSESUM
                                    + "'",
                                    feature0.equals(feature.FirstOrder.Feature.INVERSESUM));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) 'a');
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList12);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        try {
            util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int1 = util.RGBPixel.getBlue((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        int[] intArray14 = new int[] { (short) -1, (short) 10, 1, (-1), ' ' };
        try {
            // flaky: histogram2.set(intArray14);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MEDIAN;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MEDIAN + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MEDIAN));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        try {
            // flaky: histogram1.put((int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9,
                                                         intArray8);
        // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList9);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1, (int)
                                               // (short) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int1 = util.RGBPixel.getGreen((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        try {
            int int4 = 0; // flaky: histogram2.get(0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = convolutionKernel3.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setWidth((int) (short) 0);
        try {
            histogram2.put((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        try {
            util.Histogram histogram16 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (-1), (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 0, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray5, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, (-1), (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        try {
            util.Histogram histogram26 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) 'a', (int) (byte)
                                               // 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Grayscale grayscale2 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology3 = sobel1.compose((morphology.BaseMorphology) grayscale2);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = grayscale2.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = erode4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 0, (-1),
                                                                   0, 255 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16,
                                                         intArray15);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList16);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'",
                                    boolean17 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = util.RGBPixel.getBlue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        try {
            int int5 = 0; // flaky: histogram1.get((int) (byte) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        try {
            util.Histogram histogram16 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) (short)
                                               // 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setOffset((int) '#');
        try {
            // flaky: histogram1.put((int) (byte) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int1 = util.RGBPixel.getBlue((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = erode2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        try {
            util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) -1, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        try {
            util.Histogram histogram15 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        morphology.Threshold threshold1 = new morphology.Threshold(1.0f);
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
            System.out.format("%n%s%n", "RegressionTest0.test077");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            // flaky: histogram2.put((-1));
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        try {
            int int9 = 0; // flaky: histogram1.get((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int1 = util.RGBPixel.getRed((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        try {
            int int9 = 0; // flaky: histogram2.get((int) 'a');
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        morphology.Grayscale grayscale0 = new morphology.Grayscale();
        java.awt.image.BufferedImage bufferedImage1 = null;
        try {
            java.awt.image.BufferedImage bufferedImage2 = grayscale0.apply(bufferedImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        java.lang.Class<?> wildcardClass4 = null; // flaky: convolutionKernel3.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Grayscale grayscale2 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology3 = sobel1.compose((morphology.BaseMorphology) grayscale2);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = sobel1.apply(bufferedImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        // flaky: histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram13.setWidth((int) 'a');
        int[] intArray16 = null; // flaky: histogram13.getData();
        try {
            // flaky: histogram1.set(intArray16);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray10);
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intList0, (-1), (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int1 = util.RGBPixel.getGreen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int1 = util.RGBPixel.getBlue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'",
                                    int1 == 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.MIN;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.MIN + "'",
                                    feature0.equals(feature.FirstOrder.Feature.MIN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = util.RGBPixel.getGreen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        try {
            // flaky: histogram2.put((int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
        // flaky: histogram1.set(intArray10);
        try {
            util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int int1 = util.RGBPixel.getBlue((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'",
                                    int1 == 97);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int1 = util.RGBPixel.getRed((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int1 = util.RGBPixel.getBlue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        histogram28.setSize((int) 'a');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        try {
            util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        float[] floatArray10 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray10);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: convolutionKernel7.compose((morphology.BaseMorphology) convolutionKernel11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel11);
        java.lang.Class<?> wildcardClass14 = null; // flaky: convolutionKernel11.getClass();
        java.awt.image.BufferedImage bufferedImage15 = null;
        try {
            java.awt.image.BufferedImage bufferedImage16 = convolutionKernel11.apply(bufferedImage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray10);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology12);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        try {
            util.Histogram histogram16 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass2 = erode1.getClass();
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = erode1.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        try {
            // flaky: histogram1.put((int) (short) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int1 = util.RGBPixel.getRed(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        histogram7.put((int) '#');
        int int11 = histogram7.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'",
                                    int11 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        morphology.Threshold threshold1 = new morphology.Threshold((-1.0f));
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = util.RGBPixel.getRed(255);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = sobel1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        try {
            // flaky: histogram2.put(0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, (int) (byte) 100, 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = threshold1.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        // flaky: histogram2.setWidth(100);
        int[] intArray12 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                       (byte) 10 };
        util.Histogram histogram14 = new util.Histogram(intArray12, (int) 'a');
        try {
            // flaky: histogram2.set(intArray12);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray5, (int) 'a');
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int1 = util.RGBPixel.getGreen(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int1 = util.RGBPixel.getGreen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int1 = util.RGBPixel.getBlue(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        try {
            util.Histogram histogram28 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) 0, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        try {
            int int4 = histogram1.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
        try {
            int int18 = histogram16.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int1 = util.RGBPixel.getRed(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((-1), (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        float[] floatArray5 = new float[] { 'a', 1, (short) -1, 100, '4' };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int int1 = util.RGBPixel.getGreen((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray5, 100, 255);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        int int5 = histogram1.get((int) (byte) 0);
        try {
            int int7 = histogram1.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        // flaky: histogram2.setOffset(10);
        // flaky: histogram2.setSize(100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = util.RGBPixel.getRed((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        try {
            // flaky: histogram2.put((int) (short) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Identity identity5 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology6 = erode4.compose((morphology.BaseMorphology) identity5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = identity5.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(baseMorphology6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        histogram25.setWidth((int) (short) 100);
        try {
            int int31 = histogram25.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        try {
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        try {
            util.Histogram histogram36 = null; // flaky: new util.Histogram(intArray32, (int) (byte) -1, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        try {
            // flaky: histogram1.put((int) (short) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put(0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int1 = util.RGBPixel.getRed(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = erode4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        try {
            util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray32, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        try {
            util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        try {
            int int18 = histogram16.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int int1 = util.RGBPixel.getRed((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        try {
            util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList41,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        try {
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) -1, 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int1 = util.RGBPixel.getGreen((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        java.lang.Class<?> wildcardClass9 = erode7.getClass();
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = erode7.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int1 = util.RGBPixel.getGreen(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        // flaky: histogram2.setOffset((int) 'a');
        // flaky: org.junit.Assert.assertNotNull(intArray3);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) 'a');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) '4', (int) 'a');
        int[] intArray20 = histogram19.getData();
        util.Histogram histogram22 = new util.Histogram(intArray20, 97);
        try {
            // flaky: histogram2.set(intArray20);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int1 = util.RGBPixel.getBlue((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'",
                                    int1 == 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Identity identity5 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology6 = erode4.compose((morphology.BaseMorphology) identity5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode4.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(baseMorphology6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth(10);
        // flaky: histogram1.setWidth((int) (short) -1);
        try {
            // flaky: histogram1.put(255);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.BaseMorphology baseMorphology8 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel7);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = convolutionKernel3.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', (int) (byte)
                                               // 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int1 = util.RGBPixel.getBlue((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'",
                                    int1 == 52);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int int1 = util.RGBPixel.getGreen(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        // flaky: histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
        // flaky: histogram14.setSize((int) (short) 10);
        // flaky: histogram14.setSize((int) (byte) 100);
        // flaky: histogram14.setOffset((int) (byte) 1);
        // flaky: histogram14.setOffset((int) '4');
        int[] intArray23 = null; // flaky: histogram14.getData();
        // flaky: histogram12.set(intArray23);
        try {
            util.Histogram histogram26 = null; // flaky: new util.Histogram(intArray23, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray10);
        // flaky: org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        util.Histogram histogram19 = new util.Histogram(intArray17,
                                                        (int) (short) 10);
        java.util.List<java.lang.Integer> intList20 = null;
        try {
            histogram19.set(intList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode7.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
        try {
            // flaky: histogram2.setSize((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        java.lang.Class<?> wildcardClass34 = intList28.getClass();
        try {
            util.Histogram histogram36 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList28, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology10 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode9);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode5.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        histogram22.put((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
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
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList19);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (short) 10);
        histogram2.setSize((int) (byte) 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        // flaky: histogram1.setWidth((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        try {
            util.Histogram histogram9 = new util.Histogram(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = erode4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int int1 = util.RGBPixel.getBlue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (short) 0);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.setWidth((int) (byte) 100);
        histogram3.setOffset((int) (short) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        // flaky: histogram9.setOffset((int) (byte) 1);
        // flaky: histogram9.setOffset((int) '4');
        int[] intArray18 = null; // flaky: histogram9.getData();
        // flaky: histogram3.set(intArray18);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray18, (int) (short) 100);
        try {
            // flaky: histogram1.set(intArray18);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        try {
            int int18 = histogram14.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int1 = util.RGBPixel.getGreen(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        try {
            histogram14.setSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        try {
            int int4 = 0; // flaky: histogram2.get((int) (byte) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray4 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel5 = null; // flaky: new morphology.ConvolutionKernel(floatArray4);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        morphology.BaseMorphology baseMorphology10 = null; // flaky: convolutionKernel5.compose((morphology.BaseMorphology) convolutionKernel9);
        morphology.BaseMorphology baseMorphology11 = sobel1.compose((morphology.BaseMorphology) convolutionKernel5);
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            java.awt.image.BufferedImage bufferedImage13 = convolutionKernel5.apply(bufferedImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = sobel2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        try {
            util.Histogram histogram58 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
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
                                                        (int) '4', (int) 'a');
        int[] intArray23 = histogram22.getData();
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
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33,
                                                        (int) (byte) 100);
        histogram22.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
        // flaky: histogram43.setSize((int) (short) 10);
        // flaky: histogram43.setSize((int) (byte) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51,
                                                         intArray50);
        // flaky: histogram43.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList51,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList51,
                                                        (int) (byte) 100);
        util.Histogram histogram60 = new util.Histogram((java.util.List<java.lang.Integer>) intList51,
                                                        255);
        util.Histogram histogram62 = null; // flaky: new util.Histogram(0);
        // flaky: histogram62.setSize((int) (short) 10);
        // flaky: histogram62.setSize((int) (byte) 100);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70,
                                                         intArray69);
        // flaky: histogram62.set((java.util.List<java.lang.Integer>) intList70);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList70,
                                                        (int) 'a');
        histogram60.set((java.util.List<java.lang.Integer>) intList70);
        histogram22.set((java.util.List<java.lang.Integer>) intList70);
        try {
            histogram1.set((java.util.List<java.lang.Integer>) intList70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'",
                                    boolean52 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'",
                                    boolean71 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int1 = util.RGBPixel.getBlue(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'",
                                    int1 == 52);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = sobel2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int1 = util.RGBPixel.getGreen((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 1);
        try {
            histogram2.put((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
        // flaky: histogram10.setSize((int) (short) 10);
        // flaky: histogram10.setSize((int) (byte) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18,
                                                         intArray17);
        // flaky: histogram10.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        (int) (byte) 100);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList18,
                                                        255);
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
        histogram27.set((java.util.List<java.lang.Integer>) intList37);
        java.lang.Class<?> wildcardClass43 = intList37.getClass();
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList37);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'",
                                    boolean19 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
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
                                                        (int) '4', (int) 'a');
        int[] intArray23 = histogram22.getData();
        util.Histogram histogram25 = new util.Histogram(intArray23, 97);
        try {
            // flaky: histogram2.set(intArray23);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (byte) 0, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        float[] floatArray0 = null;
        try {
            morphology.Erode erode1 = new morphology.Erode(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        // flaky: histogram2.setSize((int) (short) 0);
        // flaky: histogram2.setWidth(255);
        int[] intArray12 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray12, (int) ' ');
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setWidth((int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = histogram1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 10);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int1 = util.RGBPixel.getGreen((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = convolutionKernel2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        try {
            util.Histogram histogram16 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int1 = util.RGBPixel.getGreen(255);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
        // flaky: histogram10.setSize((int) (short) 10);
        // flaky: histogram10.setSize((int) (byte) 100);
        // flaky: histogram10.setSize((int) 'a');
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
        // flaky: histogram10.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram34 = null; // flaky: new util.Histogram(0);
        // flaky: histogram34.setSize((int) (short) 10);
        // flaky: histogram34.setSize((int) (byte) 100);
        // flaky: histogram34.setSize((int) 'a');
        util.Histogram histogram42 = null; // flaky: new util.Histogram(0);
        // flaky: histogram42.setSize((int) (short) 10);
        // flaky: histogram42.setSize((int) (byte) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50,
                                                         intArray49);
        // flaky: histogram42.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList50,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram34.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList50,
                                                        10);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList50,
                                                        1, (int) '4');
        // flaky: histogram10.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList50,
                                                        1, 255);
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList50);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'",
                                    boolean51 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        histogram16.setOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        try {
            int int9 = histogram1.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int int3 = histogram1.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int1 = util.RGBPixel.getBlue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'",
                                    int1 == 100);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int1 = util.RGBPixel.getRed((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        int int1 = util.RGBPixel.getBlue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        util.Histogram histogram1 = new util.Histogram(255);
        int[] intArray7 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram9 = new util.Histogram(intArray7, (int) 'a');
        util.Histogram histogram11 = new util.Histogram(intArray7, 100);
        histogram1.set(intArray7);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
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
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) (byte) 100);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        255);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
        // flaky: histogram56.setSize((int) (short) 10);
        // flaky: histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64,
                                                         intArray63);
        // flaky: histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList64,
                                                        (int) 'a');
        histogram54.set((java.util.List<java.lang.Integer>) intList64);
        histogram16.set((java.util.List<java.lang.Integer>) intList64);
        try {
            int int72 = histogram16.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'",
                                    boolean46 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'",
                                    boolean65 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        util.Histogram histogram51 = new util.Histogram((int) ' ');
        histogram51.setWidth((int) (byte) 100);
        histogram51.setOffset((int) (short) 100);
        util.Histogram histogram57 = null; // flaky: new util.Histogram(0);
        // flaky: histogram57.setSize((int) (short) 10);
        // flaky: histogram57.setSize((int) (byte) 100);
        // flaky: histogram57.setOffset((int) (byte) 1);
        // flaky: histogram57.setOffset((int) '4');
        int[] intArray66 = null; // flaky: histogram57.getData();
        // flaky: histogram51.set(intArray66);
        util.Histogram histogram70 = null; // flaky: new util.Histogram(intArray66, (int) '#', (int) '#');
        // flaky: histogram18.set(intArray66);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray66);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = erode5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        try {
            int int55 = 0; // flaky: histogram1.get(97);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        // flaky: histogram2.setWidth(100);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(0);
        // flaky: histogram8.setSize((int) (short) 10);
        // flaky: histogram8.setSize((int) (byte) 100);
        // flaky: histogram8.setOffset((int) (byte) 1);
        // flaky: histogram8.setOffset((int) '4');
        int[] intArray17 = null; // flaky: histogram8.getData();
        try {
            // flaky: histogram2.set(intArray17);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int int1 = util.RGBPixel.getBlue(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'",
                                    int1 == 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
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
                                                        (int) '4', (int) 'a');
        int[] intArray27 = histogram26.getData();
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
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList37,
                                                        (int) (byte) 100);
        histogram26.set((java.util.List<java.lang.Integer>) intList37);
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
        histogram26.set((java.util.List<java.lang.Integer>) intList74);
        util.Histogram histogram82 = null; // flaky: new util.Histogram(0);
        // flaky: histogram82.setSize((int) (short) 10);
        // flaky: histogram82.setSize((int) (byte) 100);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90,
                                                         intArray89);
        // flaky: histogram82.set((java.util.List<java.lang.Integer>) intList90);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList90,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram26.set((java.util.List<java.lang.Integer>) intList90);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList90);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'",
                                    boolean38 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'",
                                    boolean56 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'",
                                    boolean75 == true);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'",
                                    boolean91 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int1 = util.RGBPixel.getBlue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'",
                                    int1 == 35);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 100, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int1 = util.RGBPixel.getRed((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        java.awt.image.BufferedImage bufferedImage26 = null;
        try {
            java.awt.image.BufferedImage bufferedImage27 = convolutionKernel5.apply(bufferedImage26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int1 = util.RGBPixel.getGreen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        try {
            // flaky: histogram1.put((int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 52, 255, (-1),
                                                                  0, (-1),
                                                                  100 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7,
                                                        intArray6);
        try {
            util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList7,
                                                            (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'",
                                    boolean8 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100, 52,
                                                                   0, 100, 100,
                                                                   (-1), 0 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        try {
            histogram1.set((java.util.List<java.lang.Integer>) intList12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        histogram14.setSize(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        try {
            util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) -1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((-1), (int) '4');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int int1 = util.RGBPixel.getBlue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'",
                                    int1 == 35);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        histogram14.setOffset((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth(1);
        // flaky: histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
        // flaky: histogram14.setSize((int) (short) 10);
        // flaky: histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22,
                                                         intArray21);
        // flaky: histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray28 = histogram27.getData();
        // flaky: histogram1.set(intArray28);
        try {
            // flaky: histogram1.setSize((-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'",
                                    boolean23 == true);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth(10);
        // flaky: histogram1.setWidth((int) (short) -1);
        try {
            // flaky: histogram1.put((int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) -1, (int) (short) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setOffset((int) '#');
        // flaky: histogram1.setSize((int) (byte) 0);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11,
                                                         intArray10);
        util.Histogram histogram15 = new util.Histogram((java.util.List<java.lang.Integer>) intList11,
                                                        (int) '#',
                                                        (int) (byte) 100);
        histogram15.put((int) '#');
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        // flaky: histogram19.setSize((int) 'a');
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
        // flaky: histogram27.setSize((int) (short) 10);
        // flaky: histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35,
                                                         intArray34);
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35,
                                                        10);
        histogram15.set((java.util.List<java.lang.Integer>) intList35);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList35);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'",
                                    boolean12 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'",
                                    boolean36 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) 100);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int int1 = util.RGBPixel.getGreen((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        // flaky: histogram1.setSize((int) (short) 100);
        // flaky: histogram1.setOffset((int) (byte) 10);
        // flaky: histogram1.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = sobel1.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 35, 100, (-1),
                                                                  97, 100, 0,
                                                                  35, 100, 35 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10,
                                                         intArray9);
        try {
            util.Histogram histogram14 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList10, (int) (byte) 0, 255);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'",
                                    boolean11 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        histogram34.put(10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
        // flaky: histogram6.setSize((int) (short) 10);
        // flaky: histogram6.setSize((int) (byte) 100);
        // flaky: histogram6.setSize((int) 'a');
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
        // flaky: histogram14.setSize((int) (short) 10);
        // flaky: histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22,
                                                         intArray21);
        // flaky: histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram6.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram30 = null; // flaky: new util.Histogram(0);
        // flaky: histogram30.setSize((int) (short) 10);
        // flaky: histogram30.setSize((int) (byte) 100);
        // flaky: histogram30.setSize((int) 'a');
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
        // flaky: histogram30.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        10);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList46,
                                                        1, (int) '4');
        // flaky: histogram6.set((java.util.List<java.lang.Integer>) intList46);
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList46);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'",
                                    boolean23 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'",
                                    boolean47 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        java.awt.image.BufferedImage bufferedImage26 = null;
        try {
            java.awt.image.BufferedImage bufferedImage27 = erode19.apply(bufferedImage26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        float[] floatArray0 = null;
        try {
            morphology.ConvolutionKernel convolutionKernel1 = new morphology.ConvolutionKernel(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        try {
            histogram5.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        java.lang.Class<?> wildcardClass9 = erode7.getClass();
        morphology.Threshold threshold11 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology12 = erode7.compose((morphology.BaseMorphology) threshold11);
        java.lang.Class<?> wildcardClass13 = erode7.getClass();
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = erode7.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        try {
            util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                            (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray3, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        util.Histogram histogram39 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray40 = histogram39.getData();
        histogram7.set(intArray40);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        try {
            util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                            1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology11 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode10);
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            java.awt.image.BufferedImage bufferedImage13 = erode10.apply(bufferedImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int int1 = util.RGBPixel.getBlue(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'",
                                    int1 == 97);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray3, 100, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray5, 255);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel6 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        int int1 = util.RGBPixel.getRed(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int1 = util.RGBPixel.getBlue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) 0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 1,
                                                       (int) '#');
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 1);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        try {
            int int25 = histogram14.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        morphology.Threshold threshold1 = new morphology.Threshold(100.0f);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        try {
            util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        util.Histogram histogram1 = new util.Histogram((int) (short) 1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        try {
            util.Histogram histogram26 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) ' ', 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        try {
            int int23 = 0; // flaky: histogram21.get((int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (byte) 0);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null;
        try {
            histogram1.set(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30,
                                                         intArray29);
        // flaky: histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram35.put((int) (short) 10);
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
        int[] intArray53 = histogram52.getData();
        histogram35.set(intArray53);
        int[] intArray55 = histogram35.getData();
        histogram20.set(intArray55);
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram(intArray55, 100, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'",
                                    boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'",
                                    boolean48 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        histogram15.setSize((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
            java.awt.image.BufferedImage bufferedImage17 = sobel4.apply(bufferedImage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction3.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
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
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) (byte) 100);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        255);
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
        histogram21.set((java.util.List<java.lang.Integer>) intList31);
        java.lang.Class<?> wildcardClass37 = intList31.getClass();
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList31);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
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
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) (byte) 100);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        255);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
        // flaky: histogram56.setSize((int) (short) 10);
        // flaky: histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64,
                                                         intArray63);
        // flaky: histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList64,
                                                        (int) 'a');
        histogram54.set((java.util.List<java.lang.Integer>) intList64);
        histogram16.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
        // flaky: histogram72.setSize((int) (short) 10);
        // flaky: histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80,
                                                         intArray79);
        // flaky: histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList80,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList80);
        try {
            util.Histogram histogram88 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList80, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'",
                                    boolean46 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'",
                                    boolean65 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'",
                                    boolean81 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = threshold12.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology10);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 1);
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
        try {
            histogram2.set((java.util.List<java.lang.Integer>) intList12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10,
                                                       (int) (short) 10);
        try {
            int int4 = histogram2.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth(10);
        // flaky: histogram1.setWidth((int) (short) -1);
        // flaky: histogram1.setWidth(52);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        // flaky: histogram2.setOffset(10);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
        // flaky: histogram6.setSize((int) (short) 10);
        // flaky: histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14,
                                                         intArray13);
        // flaky: histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList14);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'",
                                    boolean15 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setWidth(1);
        // flaky: histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
        // flaky: histogram14.setSize((int) (short) 10);
        // flaky: histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22,
                                                         intArray21);
        // flaky: histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray28 = histogram27.getData();
        // flaky: histogram1.set(intArray28);
        try {
            util.Histogram histogram32 = null; // flaky: new util.Histogram(intArray28, (int) (short) 1, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'",
                                    boolean23 == true);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        try {
            histogram14.put((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        morphology.Sobel sobel9 = new morphology.Sobel(direction6);
        morphology.BaseMorphology baseMorphology10 = erode5.compose((morphology.BaseMorphology) sobel9);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = sobel9.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction6.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
        java.lang.Class<?> wildcardClass37 = histogram7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.SQUARESUM;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        java.lang.Class<?> wildcardClass2 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '"
                                    + feature.FirstOrder.Feature.SQUARESUM
                                    + "'",
                                    feature0.equals(feature.FirstOrder.Feature.SQUARESUM));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        97, (int) 'a');
        try {
            util.Histogram histogram54 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        try {
            histogram15.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        util.Histogram histogram18 = new util.Histogram((int) ' ');
        histogram18.setWidth((int) (byte) 100);
        histogram18.setOffset((int) (short) 100);
        util.Histogram histogram24 = null; // flaky: new util.Histogram(0);
        // flaky: histogram24.setSize((int) (short) 10);
        // flaky: histogram24.setSize((int) (byte) 100);
        // flaky: histogram24.setOffset((int) (byte) 1);
        // flaky: histogram24.setOffset((int) '4');
        int[] intArray33 = null; // flaky: histogram24.getData();
        // flaky: histogram18.set(intArray33);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(intArray33, (int) '#', (int) '#');
        int[] intArray38 = null; // flaky: histogram37.getData();
        try {
            // flaky: histogram14.set(intArray38);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'",
                                    int16 == 0);
        // flaky: org.junit.Assert.assertNotNull(intArray33);
        // flaky: org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, 52, (int) (byte) -1);
        // flaky: histogram5.setOffset(0);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        morphology.Sobel sobel9 = new morphology.Sobel(direction6);
        morphology.BaseMorphology baseMorphology10 = erode5.compose((morphology.BaseMorphology) sobel9);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode5.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction6.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) -1, (int)
                                               // '#');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
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
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray4 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel5 = null; // flaky: new morphology.ConvolutionKernel(floatArray4);
        float[] floatArray8 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray8);
        morphology.BaseMorphology baseMorphology10 = null; // flaky: convolutionKernel5.compose((morphology.BaseMorphology) convolutionKernel9);
        morphology.BaseMorphology baseMorphology11 = sobel1.compose((morphology.BaseMorphology) convolutionKernel5);
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            java.awt.image.BufferedImage bufferedImage13 = sobel1.apply(bufferedImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray8);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
        // flaky: histogram6.setSize((int) (short) 10);
        // flaky: histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14,
                                                         intArray13);
        // flaky: histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList14,
                                                        (int) (byte) 100);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList14,
                                                        255);
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
        histogram23.set((java.util.List<java.lang.Integer>) intList33);
        java.lang.Class<?> wildcardClass39 = intList33.getClass();
        try {
            // flaky: histogram2.set((java.util.List<java.lang.Integer>) intList33);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'",
                                    boolean15 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1,
                                                       (int) (short) 1);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
        // flaky: histogram4.setSize((int) (short) 10);
        // flaky: histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12,
                                                         intArray11);
        // flaky: histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) 'a');
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) '4', (int) 'a');
        int[] intArray20 = histogram19.getData();
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) (short) 10);
        // flaky: histogram22.setSize((int) (byte) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30,
                                                         intArray29);
        // flaky: histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (byte) 100);
        histogram19.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram40 = null; // flaky: new util.Histogram(0);
        // flaky: histogram40.setSize((int) (short) 10);
        // flaky: histogram40.setSize((int) (byte) 100);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48,
                                                         intArray47);
        // flaky: histogram40.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        (int) (byte) 100);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        255);
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
        // flaky: histogram59.setSize((int) (short) 10);
        // flaky: histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67,
                                                         intArray66);
        // flaky: histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram71 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        (int) 'a');
        histogram57.set((java.util.List<java.lang.Integer>) intList67);
        histogram19.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = null; // flaky: new util.Histogram(0);
        // flaky: histogram75.setSize((int) (short) 10);
        // flaky: histogram75.setSize((int) (byte) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83,
                                                         intArray82);
        // flaky: histogram75.set((java.util.List<java.lang.Integer>) intList83);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList83,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram19.set((java.util.List<java.lang.Integer>) intList83);
        try {
            histogram2.set((java.util.List<java.lang.Integer>) intList83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'",
                                    boolean31 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'",
                                    boolean49 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'",
                                    boolean68 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'",
                                    boolean84 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        try {
            util.Histogram histogram25 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList15, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        java.lang.Class<?> wildcardClass34 = intList28.getClass();
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) (short) 100);
        try {
            util.Histogram histogram39 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) -1, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int1 = util.RGBPixel.getRed((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setOffset(35);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setOffset((int) (short) 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        int int1 = util.RGBPixel.getGreen((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        try {
            util.Histogram histogram59 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int)
                                               // (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram4 = new util.Histogram(intArray2,
                                                       (int) (short) 10);
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray2, (-1), (int) (byte) 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        int int1 = util.RGBPixel.getGreen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int int1 = util.RGBPixel.getBlue((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'",
                                    int1 == 10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int1 = util.RGBPixel.getRed(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1,
                                                       (int) (short) 100);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        // flaky: histogram1.setWidth((int) (byte) 0);
        try {
            // flaky: histogram1.put((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 97);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        try {
            util.Histogram histogram7 = null; // flaky: new util.Histogram(intArray3, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        // flaky: histogram1.setWidth((int) (byte) 0);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
        // flaky: histogram7.setSize((int) (short) 10);
        // flaky: histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15,
                                                         intArray14);
        // flaky: histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList15,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList15);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        try {
            util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray16, (int) '4', 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray7 = null; // flaky: histogram6.getData();
        java.lang.Class<?> wildcardClass8 = null; // flaky: intArray7.getClass();
        try {
            // flaky: histogram1.set(intArray7);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray7);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        int int22 = histogram18.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'",
                                    int22 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram(intList0, (int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 0L);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intArray0, 35,
                                                           (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (byte) 1);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = erode3.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(baseMorphology9);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        try {
            util.Histogram histogram21 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0, (int) (byte) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 52, 52, 0, 1,
                                                                  255, 35 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7,
                                                        intArray6);
        try {
            util.Histogram histogram10 = new util.Histogram((java.util.List<java.lang.Integer>) intList7,
                                                            (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'",
                                    boolean8 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        java.lang.Class<?> wildcardClass19 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode6 = new morphology.Erode(floatArray3);
        morphology.Erode erode7 = new morphology.Erode(floatArray3);
        morphology.BaseMorphology baseMorphology8 = sobel2.compose((morphology.BaseMorphology) erode7);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = sobel2.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        histogram56.setOffset((int) (short) -1);
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 255);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int int1 = util.RGBPixel.getGreen((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        util.Histogram histogram2 = new util.Histogram(255, (int) '4');
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        try {
            int int5 = histogram1.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        int[] intArray34 = histogram14.getData();
        histogram14.setSize(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
        // flaky: org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10,
                                                       (int) (short) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.setWidth((int) (byte) 100);
        histogram4.setOffset((int) (short) 100);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
        // flaky: histogram10.setSize((int) (short) 10);
        // flaky: histogram10.setSize((int) (byte) 100);
        // flaky: histogram10.setOffset((int) (byte) 1);
        // flaky: histogram10.setOffset((int) '4');
        int[] intArray19 = null; // flaky: histogram10.getData();
        // flaky: histogram4.set(intArray19);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray19, (int) (short) 100);
        int[] intArray23 = null; // flaky: histogram22.getData();
        try {
            // flaky: histogram2.set(intArray23);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray19);
        // flaky: org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) 10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        try {
            util.Histogram histogram17 = null; // flaky: new util.Histogram(intArray15, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        histogram58.setOffset((-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 35);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        histogram14.setOffset((int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1, (int)
                                               // '4');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        try {
            histogram1.put((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram4 = null; // flaky: new util.Histogram(intArray2, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
        // flaky: histogram1.set(intArray10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.put((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        util.Histogram histogram1 = new util.Histogram((int) '4');
        int[] intArray2 = null;
        try {
            histogram1.set(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
        // flaky: histogram27.setSize((int) (short) 10);
        // flaky: histogram27.setSize((int) (byte) 100);
        // flaky: histogram27.setSize((int) 'a');
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
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
        // flaky: histogram51.setSize((int) (short) 10);
        // flaky: histogram51.setSize((int) (byte) 100);
        // flaky: histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
        // flaky: histogram59.setSize((int) (short) 10);
        // flaky: histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67,
                                                         intArray66);
        // flaky: histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        1, (int) '4');
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        try {
            util.Histogram histogram88 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (short) 10, (int)
                                               // (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'",
                                    boolean68 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int1 = util.RGBPixel.getRed((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
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
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        (int) (byte) 100);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList45,
                                                        255);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
        // flaky: histogram56.setSize((int) (short) 10);
        // flaky: histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64,
                                                         intArray63);
        // flaky: histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList64,
                                                        (int) 'a');
        histogram54.set((java.util.List<java.lang.Integer>) intList64);
        histogram16.set((java.util.List<java.lang.Integer>) intList64);
        try {
            util.Histogram histogram73 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList64, 10, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'",
                                    boolean46 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'",
                                    boolean65 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        try {
            util.Histogram histogram23 = null; // flaky: new util.Histogram(intArray19, (int) ' ', (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 100);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray17, 0);
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        util.Histogram histogram1 = new util.Histogram(35);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Sobel.Direction direction6 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel7 = new morphology.Sobel(direction6);
        morphology.Sobel sobel8 = new morphology.Sobel(direction6);
        morphology.Sobel sobel9 = new morphology.Sobel(direction6);
        morphology.BaseMorphology baseMorphology10 = erode5.compose((morphology.BaseMorphology) sobel9);
        java.lang.Class<?> wildcardClass11 = erode5.getClass();
        java.lang.Class<?> wildcardClass12 = erode5.getClass();
        java.awt.image.BufferedImage bufferedImage13 = null;
        try {
            java.awt.image.BufferedImage bufferedImage14 = erode5.apply(bufferedImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction6.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        util.Histogram histogram1 = new util.Histogram(97);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
        // flaky: histogram1.set(intArray10);
        // flaky: histogram1.setOffset(97);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        try {
            int int4 = 0; // flaky: histogram2.get((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        histogram56.setWidth(1);
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100,
                                                       (int) (byte) 100);
        histogram2.setSize((int) (byte) 1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray8, 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                      (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        util.Histogram histogram9 = new util.Histogram(intArray5, 100);
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray5, (-1), (int) (byte) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        java.lang.Class<?> wildcardClass34 = intList28.getClass();
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList28,
                                                        (int) (short) 100);
        try {
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) '4');
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((-1), 52);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        // flaky: histogram2.setWidth(100);
        // flaky: histogram2.setOffset(1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3,
                                                        intArray2);
        util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList3,
                                                       (int) '#',
                                                       (int) (byte) 100);
        histogram7.put((int) '#');
        java.lang.Class<?> wildcardClass10 = histogram7.getClass();
        histogram7.setWidth((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        histogram16.setWidth((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        try {
            util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        float[] floatArray10 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray10);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: convolutionKernel7.compose((morphology.BaseMorphology) convolutionKernel11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel11);
        java.lang.Class<?> wildcardClass14 = null; // flaky: convolutionKernel11.getClass();
        float[] floatArray15 = new float[] {};
        morphology.Erode erode16 = new morphology.Erode(floatArray15);
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray15);
        morphology.Erode erode18 = new morphology.Erode(floatArray15);
        morphology.ConvolutionKernel convolutionKernel19 = new morphology.ConvolutionKernel(floatArray15);
        morphology.BaseMorphology baseMorphology20 = null; // flaky: convolutionKernel11.compose((morphology.BaseMorphology) convolutionKernel19);
        java.awt.image.BufferedImage bufferedImage21 = null;
        try {
            java.awt.image.BufferedImage bufferedImage22 = convolutionKernel19.apply(bufferedImage21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray10);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology12);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(floatArray15);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology20);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 'a');
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        int[] intArray32 = histogram31.getData();
        histogram14.set(intArray32);
        try {
            util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray32, (int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'",
                                    boolean27 == true);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 10, (-1));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) 'a',
                                                        (int) (short) 10);
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) '4', 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        try {
            util.Histogram histogram46 = null; // flaky: new util.Histogram(intArray40, (int) (byte) 1, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        util.Histogram histogram1 = new util.Histogram((int) '#');
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        histogram25.setOffset(10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        int[] intArray20 = histogram14.getData();
        int int22 = histogram14.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'",
                                    int22 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        java.awt.image.BufferedImage bufferedImage31 = null;
        try {
            java.awt.image.BufferedImage bufferedImage32 = convolutionKernel27.apply(bufferedImage31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + direction3 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction3.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology28);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(baseMorphology30);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        // flaky: histogram2.setSize((int) (short) 0);
        // flaky: histogram2.setWidth(255);
        int[] intArray12 = null; // flaky: histogram2.getData();
        try {
            // flaky: histogram2.put((int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        try {
            int int58 = histogram56.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        histogram40.setOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'",
                                    boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'",
                                    boolean29 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) 'a',
                                                        (int) (short) 10);
        try {
            util.Histogram histogram40 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100,
                                                       (int) (byte) 100);
        int[] intArray3 = null;
        try {
            histogram2.set(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        util.Histogram histogram19 = new util.Histogram(intArray17,
                                                        (int) (short) 10);
        histogram19.setOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        int int1 = util.RGBPixel.getRed((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'",
                                    int1 == 255);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        try {
            util.Histogram histogram56 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (byte) -1, (int) '
                                               // ');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, 52, (int) (byte) -1);
        // flaky: histogram5.put((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        java.lang.Class<?> wildcardClass26 = null; // flaky: histogram1.getClass();
        try {
            // flaky: histogram1.setSize((int) (short) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int int1 = util.RGBPixel.getGreen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = erode6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        try {
            util.Histogram histogram34 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        java.lang.Class<?> wildcardClass11 = sobel10.getClass();
        morphology.BaseMorphology baseMorphology12 = threshold1.compose((morphology.BaseMorphology) sobel10);
        java.awt.image.BufferedImage bufferedImage13 = null;
        try {
            java.awt.image.BufferedImage bufferedImage14 = threshold1.apply(bufferedImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction9.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(baseMorphology12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        util.Histogram histogram2 = new util.Histogram(100, 10);
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
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) (byte) 100);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        255);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) ' ');
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList12,
                                                        (int) '4');
        histogram2.set((java.util.List<java.lang.Integer>) intList12);
        try {
            util.Histogram histogram29 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList12, (-1), (int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'",
                                    boolean13 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int int1 = util.RGBPixel.getGreen((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 10, (int) (byte) -1);
        // flaky: histogram2.setWidth((int) (short) 10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        java.lang.Class<?> wildcardClass54 = intList41.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) (short) 10);
        // flaky: histogram22.setSize((int) (byte) 100);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30,
                                                         intArray29);
        // flaky: histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (byte) 10);
        int[] intArray38 = histogram37.getData();
        util.Histogram histogram40 = null; // flaky: new util.Histogram(0);
        // flaky: histogram40.setSize((int) (short) 10);
        // flaky: histogram40.setSize((int) (byte) 100);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48,
                                                         intArray47);
        // flaky: histogram40.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        (int) (byte) 10);
        histogram37.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        (int) 'a',
                                                        (int) (short) 10);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        100);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList48,
                                                        35);
        util.Histogram histogram65 = null; // flaky: new util.Histogram(0);
        // flaky: histogram65.setSize((int) (short) 10);
        // flaky: histogram65.setSize((int) (byte) 100);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList73 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73,
                                                         intArray72);
        // flaky: histogram65.set((java.util.List<java.lang.Integer>) intList73);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList73,
                                                        (int) 'a');
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList73,
                                                        (int) ' ', 100);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList73,
                                                        (int) (byte) 10, 255);
        histogram63.set((java.util.List<java.lang.Integer>) intList73);
        histogram20.set((java.util.List<java.lang.Integer>) intList73);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'",
                                    boolean31 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'",
                                    boolean49 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'",
                                    boolean74 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
                                                        (int) (byte) 10, 255);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 0, (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        histogram14.setSize((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int int1 = util.RGBPixel.getRed(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        util.Histogram histogram19 = new util.Histogram(intArray17, 97);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray17, 0, (-1));
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
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int int1 = util.RGBPixel.getBlue((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'",
                                    int1 == 32);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setSize((int) 'a');
        // flaky: histogram1.setSize(0);
        // flaky: histogram1.setWidth((int) (short) 0);
        // flaky: histogram1.setWidth((int) (short) -1);
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
        // flaky: histogram15.setSize((int) (short) 10);
        // flaky: histogram15.setSize((int) (byte) 100);
        // flaky: histogram15.setSize((int) 'a');
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
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram39 = null; // flaky: new util.Histogram(0);
        // flaky: histogram39.setSize((int) (short) 10);
        // flaky: histogram39.setSize((int) (byte) 100);
        // flaky: histogram39.setSize((int) 'a');
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
        // flaky: histogram39.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        10);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        1, (int) '4');
        // flaky: histogram15.set((java.util.List<java.lang.Integer>) intList55);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList55,
                                                        1, 255);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList55);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'",
                                    boolean56 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, 255);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) -1, (int) ' ');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Grayscale grayscale2 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology3 = sobel1.compose((morphology.BaseMorphology) grayscale2);
        morphology.Threshold threshold5 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology6 = grayscale2.compose((morphology.BaseMorphology) threshold5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = grayscale2.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology3);
        org.junit.Assert.assertNotNull(baseMorphology6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
        // flaky: histogram27.setSize((int) (short) 10);
        // flaky: histogram27.setSize((int) (byte) 100);
        // flaky: histogram27.setSize((int) 'a');
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
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
        // flaky: histogram51.setSize((int) (short) 10);
        // flaky: histogram51.setSize((int) (byte) 100);
        // flaky: histogram51.setSize((int) 'a');
        util.Histogram histogram59 = null; // flaky: new util.Histogram(0);
        // flaky: histogram59.setSize((int) (short) 10);
        // flaky: histogram59.setSize((int) (byte) 100);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67,
                                                         intArray66);
        // flaky: histogram59.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram51.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        10);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        1, (int) '4');
        // flaky: histogram27.set((java.util.List<java.lang.Integer>) intList67);
        util.Histogram histogram82 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        1, 255);
        util.Histogram histogram84 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                        97);
        histogram14.set((java.util.List<java.lang.Integer>) intList67);
        try {
            util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList67,
                                                            (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'",
                                    boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'",
                                    boolean68 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        util.Histogram histogram2 = new util.Histogram(97, (int) (byte) 1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        util.Histogram histogram2 = new util.Histogram(255, 100);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray6, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        try {
            util.Histogram histogram39 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, 255, (int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        try {
            util.Histogram histogram17 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        histogram5.put(10);
        java.util.List<java.lang.Integer> intList8 = null;
        try {
            histogram5.set(intList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        histogram16.setOffset((int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'",
                                    int20 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((-1), 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.BaseMorphology baseMorphology8 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel7);
        float[] floatArray9 = new float[] {};
        morphology.Erode erode10 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray9);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray9);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel12);
        java.lang.Class<?> wildcardClass14 = convolutionKernel12.getClass();
        java.awt.image.BufferedImage bufferedImage15 = null;
        try {
            java.awt.image.BufferedImage bufferedImage16 = convolutionKernel12.apply(bufferedImage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray9);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        java.lang.Class<?> wildcardClass11 = sobel10.getClass();
        morphology.BaseMorphology baseMorphology12 = threshold1.compose((morphology.BaseMorphology) sobel10);
        java.awt.image.BufferedImage bufferedImage13 = null;
        try {
            java.awt.image.BufferedImage bufferedImage14 = sobel10.apply(bufferedImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction9.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(baseMorphology12);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology11 = null; // flaky: erode5.compose((morphology.BaseMorphology) erode10);
        java.lang.Class<?> wildcardClass12 = null; // flaky: baseMorphology11.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray6);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology11);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1,
                                                       (int) (short) 1);
        histogram2.setWidth((int) (short) 0);
        java.util.List<java.lang.Integer> intList5 = null;
        try {
            histogram2.set(intList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        histogram56.setSize((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        try {
            util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList17,
                                                            (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        float[] floatArray10 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel11 = null; // flaky: new morphology.ConvolutionKernel(floatArray10);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: convolutionKernel7.compose((morphology.BaseMorphology) convolutionKernel11);
        morphology.BaseMorphology baseMorphology13 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel11);
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = convolutionKernel11.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray10);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology12);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) ' ');
        histogram2.put((int) (short) 0);
        int int6 = histogram2.get(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        util.Histogram histogram19 = new util.Histogram(intArray17, 255);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'",
                                    int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (byte) 0);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.setWidth((int) (byte) 100);
        histogram3.setOffset((int) (short) 100);
        util.Histogram histogram9 = null; // flaky: new util.Histogram(0);
        // flaky: histogram9.setSize((int) (short) 10);
        // flaky: histogram9.setSize((int) (byte) 100);
        // flaky: histogram9.setOffset((int) (byte) 1);
        // flaky: histogram9.setOffset((int) '4');
        int[] intArray18 = null; // flaky: histogram9.getData();
        // flaky: histogram3.set(intArray18);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray18, (int) '#', (int) '#');
        int[] intArray23 = null; // flaky: histogram22.getData();
        try {
            // flaky: histogram1.set(intArray23);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray18);
        // flaky: org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        // flaky: histogram2.setWidth((int) (short) 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        util.Histogram histogram23 = new util.Histogram((int) ' ');
        histogram23.setWidth((int) (byte) 100);
        histogram23.setOffset((int) (short) 100);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
        // flaky: histogram29.setSize((int) (short) 10);
        // flaky: histogram29.setSize((int) (byte) 100);
        // flaky: histogram29.setOffset((int) (byte) 1);
        // flaky: histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
        // flaky: histogram23.set(intArray38);
        util.Histogram histogram42 = null; // flaky: new util.Histogram(intArray38, (int) '#', (int) '#');
        int[] intArray43 = null; // flaky: histogram42.getData();
        try {
            // flaky: histogram21.set(intArray43);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        // flaky: org.junit.Assert.assertNotNull(intArray38);
        // flaky: org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        util.Histogram histogram19 = new util.Histogram(intArray17,
                                                        (int) (short) 10);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29,
                                                         intArray28);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) (byte) 100);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        255);
        histogram19.set((java.util.List<java.lang.Integer>) intList29);
        try {
            int int41 = histogram19.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'",
                                    boolean30 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        try {
            util.Histogram histogram30 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) ' ');
        histogram2.put((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = histogram2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        // flaky: histogram1.put((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intArray0,
                                                           (int) (short) 10,
                                                           (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6,
                                                        (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        util.Histogram histogram18 = new util.Histogram(1, (int) (short) 100);
        int[] intArray19 = histogram18.getData();
        histogram15.set(intArray19);
        histogram15.setSize((int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) ' ', (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (byte) 0);
        util.Histogram histogram3 = new util.Histogram((int) ' ');
        histogram3.put((int) (byte) 10);
        util.Histogram histogram7 = new util.Histogram((int) ' ');
        int[] intArray8 = histogram7.getData();
        histogram3.set(intArray8);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, 52, (-1));
        util.Histogram histogram15 = new util.Histogram(intArray8,
                                                        (int) (byte) 100, 1);
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
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) (byte) 100);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        255);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                        (int) '4');
        histogram15.set((java.util.List<java.lang.Integer>) intList25);
        try {
            // flaky: histogram1.set((java.util.List<java.lang.Integer>) intList25);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10,
                                            1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = convolutionKernel7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        histogram16.setWidth(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = sobel2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = convolutionKernel5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7,
                                                        intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7,
                                                        (int) '#',
                                                        (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
        // flaky: histogram13.setSize((int) (short) 10);
        // flaky: histogram13.setSize((int) (byte) 100);
        // flaky: histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
        // flaky: histogram21.setSize((int) (short) 10);
        // flaky: histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29,
                                                         intArray28);
        // flaky: histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29,
                                                        97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        try {
            histogram2.setSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'",
                                    boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'",
                                    boolean30 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        try {
            util.Histogram histogram1 = null; // flaky: new util.Histogram((-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        histogram18.setOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        util.Histogram histogram24 = null; // flaky: new util.Histogram(intArray16, 97, 10);
        int int26 = 0; // flaky: histogram24.get((int) (short) 10);
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'",
                                    int26 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList9,
                                                        (int) (short) 100, 100);
        try {
            util.Histogram histogram21 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
        // flaky: histogram19.setSize((int) (short) 10);
        // flaky: histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27,
                                                         intArray26);
        // flaky: histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (short) 100,
                                                        (int) (byte) 1);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27,
                                                        (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList27);
        try {
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (-1), (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'",
                                    boolean28 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        int[] intArray29 = histogram2.getData();
        histogram2.setSize(100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
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
        try {
            util.Histogram histogram36 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        histogram16.setOffset((int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (byte) -1);
        // flaky: histogram2.setWidth((int) (short) -1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray10 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode11 = null; // flaky: new morphology.Erode(floatArray10);
        morphology.Erode erode12 = null; // flaky: new morphology.Erode(floatArray10);
        float[] floatArray13 = new float[] {};
        morphology.Erode erode14 = new morphology.Erode(floatArray13);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray13);
        morphology.ConvolutionKernel convolutionKernel16 = new morphology.ConvolutionKernel(floatArray13);
        morphology.Erode erode17 = new morphology.Erode(floatArray13);
        morphology.BaseMorphology baseMorphology18 = null; // flaky: erode12.compose((morphology.BaseMorphology) erode17);
        float[] floatArray21 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel22 = null; // flaky: new morphology.ConvolutionKernel(floatArray21);
        float[] floatArray25 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel26 = null; // flaky: new morphology.ConvolutionKernel(floatArray25);
        float[] floatArray29 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel30 = null; // flaky: new morphology.ConvolutionKernel(floatArray29);
        morphology.BaseMorphology baseMorphology31 = null; // flaky: convolutionKernel26.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology32 = null; // flaky: convolutionKernel22.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology33 = null; // flaky: erode12.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology34 = convolutionKernel6.compose((morphology.BaseMorphology) convolutionKernel30);
        java.awt.image.BufferedImage bufferedImage35 = null;
        try {
            java.awt.image.BufferedImage bufferedImage36 = convolutionKernel30.apply(bufferedImage35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray13);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray29);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology31);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology32);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(baseMorphology34);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        histogram16.setSize(0);
        try {
            histogram16.put((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) (short) 10);
        // flaky: histogram1.setSize((int) (byte) 100);
        // flaky: histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
        // flaky: histogram1.set(intArray10);
        // flaky: histogram1.put(97);
        // flaky: histogram1.setWidth((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        try {
            util.Histogram histogram39 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 1, (int)
                                               // (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int int1 = util.RGBPixel.getRed((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        morphology.Sobel.Direction direction0 = null;
        try {
            morphology.Sobel sobel1 = new morphology.Sobel(direction0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Grayscale grayscale2 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology3 = sobel1.compose((morphology.BaseMorphology) grayscale2);
        morphology.Threshold threshold5 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology6 = grayscale2.compose((morphology.BaseMorphology) threshold5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = threshold5.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology3);
        org.junit.Assert.assertNotNull(baseMorphology6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList43,
                                                        (int) (short) 10);
        try {
            util.Histogram histogram61 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) -1, (int)
                                               // 'a');
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        histogram14.setWidth((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(52, (int) (short) 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        // flaky: histogram21.setWidth(100);
        // flaky: histogram21.setWidth((int) 'a');
        util.Histogram histogram28 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray29 = null; // flaky: histogram28.getData();
        java.lang.Class<?> wildcardClass30 = null; // flaky: intArray29.getClass();
        try {
            // flaky: histogram21.set(intArray29);
            // flaky: org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException;
            // message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        // flaky: org.junit.Assert.assertNotNull(intArray29);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        java.lang.Class<?> wildcardClass7 = histogram2.getClass();
        histogram2.setWidth(0);
        util.Histogram histogram11 = new util.Histogram((int) ' ');
        int[] intArray12 = histogram11.getData();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16,
                                                         intArray15);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList16,
                                                        (int) '#',
                                                        (int) (byte) 100);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(0);
        // flaky: histogram22.setSize((int) (short) 10);
        // flaky: histogram22.setSize((int) (byte) 100);
        // flaky: histogram22.setSize((int) 'a');
        util.Histogram histogram30 = null; // flaky: new util.Histogram(0);
        // flaky: histogram30.setSize((int) (short) 10);
        // flaky: histogram30.setSize((int) (byte) 100);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38,
                                                         intArray37);
        // flaky: histogram30.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList38,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        // flaky: histogram22.set((java.util.List<java.lang.Integer>) intList38);
        histogram20.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList38,
                                                        97);
        histogram11.set((java.util.List<java.lang.Integer>) intList38);
        try {
            histogram2.set((java.util.List<java.lang.Integer>) intList38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'",
                                    boolean17 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'",
                                    boolean39 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        float[] floatArray2 = new float[] {};
        morphology.Erode erode3 = new morphology.Erode(floatArray2);
        java.lang.Class<?> wildcardClass4 = erode3.getClass();
        morphology.BaseMorphology baseMorphology5 = sobel1.compose((morphology.BaseMorphology) erode3);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = erode3.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList30 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList30,
                                                         intArray29);
        // flaky: histogram22.set((java.util.List<java.lang.Integer>) intList30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList30,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        histogram35.put((int) (short) 10);
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
        int[] intArray53 = histogram52.getData();
        histogram35.set(intArray53);
        int[] intArray55 = histogram35.getData();
        histogram20.set(intArray55);
        try {
            util.Histogram histogram58 = new util.Histogram(intArray55, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'",
                                    boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'",
                                    boolean48 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setWidth(0);
        // flaky: histogram1.setOffset((int) '#');
        // flaky: histogram1.setSize((int) (byte) 0);
        util.Histogram histogram10 = new util.Histogram(1, (int) (short) 100);
        int[] intArray11 = histogram10.getData();
        util.Histogram histogram13 = new util.Histogram(intArray11, (int) '#');
        util.Histogram histogram16 = new util.Histogram(intArray11,
                                                        (int) (byte) 10, 10);
        try {
            // flaky: histogram1.set(intArray11);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        util.Histogram histogram2 = new util.Histogram(32, 100);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
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
        int int18 = histogram16.get(0);
        histogram16.setWidth((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'",
                                    int18 == 1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        // flaky: histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = null; // flaky: intArray4.getClass();
        try {
            util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray4, (-1), 100);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray4);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        float[] floatArray6 = new float[] { (-1.0f), (-1L), 'a', (-1), (-1.0f),
                                            (byte) 100 };
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray6);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) '#');
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intArray0, 1,
                                                           (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        histogram51.setOffset(0);
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
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        // flaky: histogram2.setWidth(100);
        try {
            // flaky: histogram2.put((int) (short) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = erode2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass2 = sobel1.getClass();
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = sobel1.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.RIGHT + "'",
                                    direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode6 = new morphology.Erode(floatArray3);
        morphology.Erode erode7 = new morphology.Erode(floatArray3);
        morphology.BaseMorphology baseMorphology8 = sobel2.compose((morphology.BaseMorphology) erode7);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode7.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int int1 = util.RGBPixel.getBlue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'",
                                    int1 == 32);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
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
        try {
            util.Histogram histogram28 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList17, (int) (short) -1, (int)
                                               // (short) 1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        try {
            util.Histogram histogram44 = null; // flaky: new util.Histogram(intArray40, 0, 10);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        int int1 = util.RGBPixel.getRed(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        histogram14.setSize((int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = histogram14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 1, 0);
        // flaky: histogram2.setSize((int) (byte) 100);
        // flaky: histogram2.setWidth(10);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
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
        morphology.BaseMorphology baseMorphology19 = erode6.compose((morphology.BaseMorphology) threshold8);
        java.awt.image.BufferedImage bufferedImage20 = null;
        try {
            java.awt.image.BufferedImage bufferedImage21 = threshold8.apply(bufferedImage20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.DOWN + "'",
                                    direction9.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(baseMorphology19);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        morphology.Sobel.Direction direction9 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel10 = new morphology.Sobel(direction9);
        float[] floatArray13 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel14 = null; // flaky: new morphology.ConvolutionKernel(floatArray13);
        float[] floatArray17 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel18 = null; // flaky: new morphology.ConvolutionKernel(floatArray17);
        morphology.BaseMorphology baseMorphology19 = null; // flaky: convolutionKernel14.compose((morphology.BaseMorphology) convolutionKernel18);
        morphology.BaseMorphology baseMorphology20 = sobel10.compose((morphology.BaseMorphology) convolutionKernel14);
        morphology.BaseMorphology baseMorphology21 = baseMorphology8.compose((morphology.BaseMorphology) convolutionKernel14);
        java.awt.image.BufferedImage bufferedImage22 = null;
        try {
            java.awt.image.BufferedImage bufferedImage23 = convolutionKernel14.apply(bufferedImage22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '"
                                    + morphology.Sobel.Direction.UP + "'",
                                    direction9.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray17);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(baseMorphology20);
        org.junit.Assert.assertNotNull(baseMorphology21);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 1L);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
                                                        (int) (short) 100);
        try {
            util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25,
                                                            1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'",
                                    boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'",
                                    boolean26 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        morphology.Threshold threshold1 = new morphology.Threshold((float) '#');
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        morphology.Identity identity0 = new morphology.Identity();
        float[] floatArray4 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray4);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray4);
        float[] floatArray7 = new float[] {};
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode11 = new morphology.Erode(floatArray7);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: erode6.compose((morphology.BaseMorphology) erode11);
        float[] floatArray15 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel16 = null; // flaky: new morphology.ConvolutionKernel(floatArray15);
        float[] floatArray19 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel20 = null; // flaky: new morphology.ConvolutionKernel(floatArray19);
        float[] floatArray23 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel24 = null; // flaky: new morphology.ConvolutionKernel(floatArray23);
        morphology.BaseMorphology baseMorphology25 = null; // flaky: convolutionKernel20.compose((morphology.BaseMorphology) convolutionKernel24);
        morphology.BaseMorphology baseMorphology26 = null; // flaky: convolutionKernel16.compose((morphology.BaseMorphology) convolutionKernel24);
        morphology.BaseMorphology baseMorphology27 = null; // flaky: erode6.compose((morphology.BaseMorphology) convolutionKernel24);
        morphology.BaseMorphology baseMorphology28 = identity0.compose((morphology.BaseMorphology) convolutionKernel24);
        java.awt.image.BufferedImage bufferedImage29 = null;
        try {
            java.awt.image.BufferedImage bufferedImage30 = convolutionKernel24.apply(bufferedImage29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray7);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray23);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology25);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology26);
        // flaky: org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(baseMorphology28);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        histogram14.setOffset((int) (byte) 10);
        histogram14.setWidth(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        int int1 = util.RGBPixel.getGreen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        histogram28.setSize((int) '4');
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
        int[] intArray47 = histogram46.getData();
        histogram46.setWidth(97);
        histogram46.setOffset(1);
        util.Histogram histogram53 = null; // flaky: new util.Histogram(0);
        // flaky: histogram53.setSize((int) (short) 10);
        // flaky: histogram53.setSize((int) (byte) 100);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61,
                                                         intArray60);
        // flaky: histogram53.set((java.util.List<java.lang.Integer>) intList61);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList61,
                                                        (int) (short) 10,
                                                        (int) (byte) 10);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList61,
                                                        (int) (byte) 100);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList61,
                                                        255);
        histogram46.set((java.util.List<java.lang.Integer>) intList61);
        histogram28.set((java.util.List<java.lang.Integer>) intList61);
        histogram28.put((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'",
                                    boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'",
                                    boolean42 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'",
                                    boolean62 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 10, (int) (byte) -1);
        try {
            // flaky: histogram2.put(97);
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: -97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        try {
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) (short) 100, (int) (byte) 0);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message:
            // null");
        } catch (java.lang.ArithmeticException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        try {
            util.Histogram histogram40 = null; // flaky: new util.Histogram(intArray37, (int) (byte) -1, (int) (short) 10);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        // flaky: org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'",
                                    boolean32 == true);
        // flaky: org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        histogram14.setSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        int[] intArray38 = new int[] { (byte) 1, (short) 10, (byte) -1, '#',
                                       (byte) 10 };
        util.Histogram histogram40 = new util.Histogram(intArray38, (int) 'a');
        util.Histogram histogram42 = new util.Histogram(intArray38, 100);
        // flaky: histogram1.set(intArray38);
        try {
            util.Histogram histogram45 = null; // flaky: new util.Histogram(intArray38, (int) (byte) -1);
            // flaky: org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException;
            // message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'",
                                    boolean20 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
        histogram14.put((-1));
        try {
            histogram14.setSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        util.Histogram histogram47 = new util.Histogram(intArray41,
                                                        (int) (byte) 100,
                                                        (int) '4');
        try {
            util.Histogram histogram50 = null; // flaky: new util.Histogram(intArray41, (int) '4', (-1));
            // flaky: org.junit.Assert.fail("Expected exception of type
            // java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'",
                                    boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'",
                                    boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intList0, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        // flaky: histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        // flaky: histogram2.setWidth((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = null; // flaky: histogram2.getClass();
        // flaky: org.junit.Assert.assertNotNull(intArray5);
        // flaky: org.junit.Assert.assertNotNull(intArray8);
        // flaky: org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        histogram16.setSize(97);
        try {
            histogram16.setSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'",
                                    boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'",
                                    int20 == 0);
    }
}
