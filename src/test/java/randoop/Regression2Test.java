package randoop;

import org.junit.jupiter.api.Test;
public class Regression2Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
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
        int[] intArray83 = histogram56.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertNotNull(intArray83);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
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
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
        int[] intArray6 = null; // flaky: histogram1.getData();
        util.Histogram histogram8 = new util.Histogram((int) (byte) 100);
        int[] intArray9 = histogram8.getData();
        util.Histogram histogram11 = new util.Histogram(intArray9, (int) (short) 10);
        try {
// flaky:             histogram1.set(intArray9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        int int16 = histogram14.get((int) '#');
        histogram14.setSize((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
// flaky:         histogram1.setOffset((int) (byte) 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
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
        java.lang.Class<?> wildcardClass25 = null; // flaky: histogram12.getClass();
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.Erode erode5 = new morphology.Erode(floatArray3);
        morphology.Erode erode6 = new morphology.Erode(floatArray3);
        float[] floatArray7 = new float[] {};
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode10 = new morphology.Erode(floatArray7);
        morphology.Erode erode11 = new morphology.Erode(floatArray7);
        morphology.BaseMorphology baseMorphology12 = erode6.compose((morphology.BaseMorphology) erode11);
        morphology.BaseMorphology baseMorphology13 = convolutionKernel2.compose((morphology.BaseMorphology) erode11);
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = erode11.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        util.Histogram histogram2 = new util.Histogram(52, 32);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        int int21 = histogram14.get((int) (byte) 1);
        histogram14.put((int) '4');
        histogram14.setWidth(35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
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
        try {
            int int59 = histogram14.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
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
// flaky:         histogram1.setOffset((int) 'a');
// flaky:         histogram1.setSize(2);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
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
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (byte) 10);
        histogram54.setWidth((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        histogram1.setWidth((int) (byte) 0);
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
        try {
            histogram1.set((java.util.List<java.lang.Integer>) intList29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode12 = new morphology.Erode(floatArray6);
        morphology.Erode erode13 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode15 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology16 = convolutionKernel5.compose((morphology.BaseMorphology) erode15);
        java.awt.image.BufferedImage bufferedImage17 = null;
        try {
            java.awt.image.BufferedImage bufferedImage18 = convolutionKernel5.apply(bufferedImage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
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
// flaky:         histogram1.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = null; // flaky: histogram1.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
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
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray12);
        morphology.Erode erode15 = new morphology.Erode(floatArray12);
        morphology.Erode erode16 = new morphology.Erode(floatArray12);
        morphology.Erode erode17 = new morphology.Erode(floatArray12);
        float[] floatArray18 = new float[] {};
        morphology.Erode erode19 = new morphology.Erode(floatArray18);
        morphology.ConvolutionKernel convolutionKernel20 = new morphology.ConvolutionKernel(floatArray18);
        morphology.Erode erode21 = new morphology.Erode(floatArray18);
        morphology.BaseMorphology baseMorphology22 = erode17.compose((morphology.BaseMorphology) erode21);
        morphology.BaseMorphology baseMorphology23 = convolutionKernel5.compose(baseMorphology22);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(baseMorphology23);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, 97);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        histogram2.put((int) (byte) 1);
        int[] intArray6 = histogram2.getData();
        try {
            util.Histogram histogram8 = null; // flaky: new util.Histogram(intArray6, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass5 = floatArray0.getClass();
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = erode7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        histogram1.setOffset((int) (byte) 10);
        histogram1.setSize(9);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
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
            util.Histogram histogram34 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) (short) 100, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
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
        util.Histogram histogram38 = new util.Histogram(intArray31, 9);
        int[] intArray39 = histogram38.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
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
// flaky:         histogram21.setWidth((int) (short) 1);
// flaky:         histogram21.setWidth((-1));
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        util.Histogram histogram1 = new util.Histogram(9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
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
            int int58 = histogram56.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        int int1 = util.RGBPixel.getGreen(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
// flaky:         histogram1.setSize((int) (byte) 0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
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
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        float[] floatArray5 = new float[] { (byte) 0, 100.0f, 35, 1, 10.0f };
        morphology.ConvolutionKernel convolutionKernel6 = null; // flaky: new morphology.ConvolutionKernel(floatArray5);
        morphology.Sobel.Direction direction7 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel8 = new morphology.Sobel(direction7);
        morphology.Grayscale grayscale9 = new morphology.Grayscale();
        morphology.BaseMorphology baseMorphology10 = sobel8.compose((morphology.BaseMorphology) grayscale9);
        morphology.Threshold threshold12 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology13 = grayscale9.compose((morphology.BaseMorphology) threshold12);
        java.lang.Class<?> wildcardClass14 = baseMorphology13.getClass();
        morphology.BaseMorphology baseMorphology15 = null; // flaky: convolutionKernel6.compose(baseMorphology13);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction7.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(baseMorphology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram4 = new util.Histogram(intArray2, (int) (short) 10);
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
        histogram4.set(intArray22);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
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
        util.Histogram histogram19 = new util.Histogram(intArray17, (int) (short) 10);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray17, (int) ' ', 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
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
            util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray17, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
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
// flaky:         histogram24.setWidth(100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) (short) 1);
        histogram2.setOffset((-1));
        java.lang.Class<?> wildcardClass5 = histogram2.getClass();
        histogram2.setWidth((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
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
            util.Histogram histogram89 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList80, 35, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setOffset(10);
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        try {
            util.Histogram histogram42 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (byte) 0, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
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
        try {
            int int38 = histogram7.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
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
        try {
            int int63 = 0; // flaky: histogram1.get((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
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
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 10, 1);
        try {
            util.Histogram histogram42 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList31, 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
        int[] intArray9 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray9, 2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
// flaky:         org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        int[] intArray15 = histogram14.getData();
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        try {
            util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        util.Histogram histogram1 = new util.Histogram((int) (short) 10);
        histogram1.setSize(255);
        java.util.List<java.lang.Integer> intList4 = null;
        try {
            histogram1.set(intList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 97);
        float[] floatArray5 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray5);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray8);
        morphology.Erode erode11 = new morphology.Erode(floatArray8);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: erode7.compose((morphology.BaseMorphology) erode11);
        morphology.Threshold threshold14 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology15 = null; // flaky: baseMorphology12.compose((morphology.BaseMorphology) threshold14);
        morphology.BaseMorphology baseMorphology16 = threshold1.compose((morphology.BaseMorphology) threshold14);
        java.awt.image.BufferedImage bufferedImage17 = null;
        try {
            java.awt.image.BufferedImage bufferedImage18 = threshold1.apply(bufferedImage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray8);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology12);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        util.Histogram histogram2 = new util.Histogram(97, (int) (short) 1);
        histogram2.setOffset(0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        morphology.Erode erode9 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode12 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intArray0, 0, 32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) ' ');
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
// flaky:         histogram43.setSize((int) (short) 10);
// flaky:         histogram43.setSize((int) (byte) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
// flaky:         histogram43.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) '4');
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) '#', (int) (byte) 10);
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (short) 100, 100);
        histogram64.setOffset(97);
        util.Histogram histogram68 = new util.Histogram((int) (byte) 100);
        int[] intArray69 = histogram68.getData();
        util.Histogram histogram71 = new util.Histogram((int) (byte) 100);
        int[] intArray72 = histogram71.getData();
        histogram68.set(intArray72);
        histogram64.set(intArray72);
        histogram41.set(intArray72);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertNotNull(intArray72);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
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
        histogram14.put((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) (short) 10);
        try {
            int int4 = 0; // flaky: histogram2.get(35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
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
        int[] intArray26 = null; // flaky: histogram20.getData();
// flaky:         histogram20.setWidth(100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
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
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97, 10);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        int[] intArray17 = histogram16.getData();
        int[] intArray18 = histogram16.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        try {
            util.Histogram histogram43 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, 2, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        java.lang.Class<?> wildcardClass8 = floatArray4.getClass();
        morphology.Erode erode9 = new morphology.Erode(floatArray4);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = erode9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        histogram13.setWidth(1);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setWidth(10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
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
        int[] intArray53 = histogram52.getData();
        try {
            util.Histogram histogram55 = new util.Histogram(intArray53, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray53);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 9, 255, 52, 1, 35, 35, 35 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        try {
            util.Histogram histogram11 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList8, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
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
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) -1);
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
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
            util.Histogram histogram65 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList44, 0);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        util.Histogram histogram2 = new util.Histogram(52, (int) (short) 10);
        util.Histogram histogram4 = new util.Histogram((int) (byte) 100);
        int[] intArray5 = histogram4.getData();
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (byte) 10);
        int[] intArray23 = histogram22.getData();
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (byte) 10);
        histogram22.set((java.util.List<java.lang.Integer>) intList33);
        histogram4.set((java.util.List<java.lang.Integer>) intList33);
        histogram2.set((java.util.List<java.lang.Integer>) intList33);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Sobel.Direction direction10 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel11 = new morphology.Sobel(direction10);
        morphology.Sobel sobel12 = new morphology.Sobel(direction10);
        morphology.Sobel sobel13 = new morphology.Sobel(direction10);
        morphology.Sobel sobel14 = new morphology.Sobel(direction10);
        morphology.Sobel sobel15 = new morphology.Sobel(direction10);
        morphology.Sobel sobel16 = new morphology.Sobel(direction10);
        morphology.BaseMorphology baseMorphology17 = null; // flaky: erode9.compose((morphology.BaseMorphology) sobel16);
        java.awt.image.BufferedImage bufferedImage18 = null;
        try {
            java.awt.image.BufferedImage bufferedImage19 = sobel16.apply(bufferedImage18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + morphology.Sobel.Direction.UP + "'", direction10.equals(morphology.Sobel.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(baseMorphology17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
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
        morphology.Identity identity18 = new morphology.Identity();
        float[] floatArray22 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode23 = null; // flaky: new morphology.Erode(floatArray22);
        morphology.Erode erode24 = null; // flaky: new morphology.Erode(floatArray22);
        float[] floatArray25 = new float[] {};
        morphology.Erode erode26 = new morphology.Erode(floatArray25);
        morphology.ConvolutionKernel convolutionKernel27 = new morphology.ConvolutionKernel(floatArray25);
        morphology.ConvolutionKernel convolutionKernel28 = new morphology.ConvolutionKernel(floatArray25);
        morphology.Erode erode29 = new morphology.Erode(floatArray25);
        morphology.BaseMorphology baseMorphology30 = null; // flaky: erode24.compose((morphology.BaseMorphology) erode29);
        float[] floatArray33 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel34 = null; // flaky: new morphology.ConvolutionKernel(floatArray33);
        float[] floatArray37 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel38 = null; // flaky: new morphology.ConvolutionKernel(floatArray37);
        float[] floatArray41 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel42 = null; // flaky: new morphology.ConvolutionKernel(floatArray41);
        morphology.BaseMorphology baseMorphology43 = null; // flaky: convolutionKernel38.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology44 = null; // flaky: convolutionKernel34.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology45 = null; // flaky: erode24.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology46 = identity18.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology47 = baseMorphology17.compose(baseMorphology46);
        float[] floatArray52 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel53 = new morphology.ConvolutionKernel(floatArray52);
        morphology.Erode erode54 = new morphology.Erode(floatArray52);
        morphology.Erode erode55 = new morphology.Erode(floatArray52);
        morphology.Erode erode56 = new morphology.Erode(floatArray52);
        float[] floatArray57 = new float[] {};
        morphology.Erode erode58 = new morphology.Erode(floatArray57);
        morphology.ConvolutionKernel convolutionKernel59 = new morphology.ConvolutionKernel(floatArray57);
        float[] floatArray60 = new float[] {};
        morphology.Erode erode61 = new morphology.Erode(floatArray60);
        morphology.Erode erode62 = new morphology.Erode(floatArray60);
        morphology.Erode erode63 = new morphology.Erode(floatArray60);
        float[] floatArray64 = new float[] {};
        morphology.Erode erode65 = new morphology.Erode(floatArray64);
        morphology.ConvolutionKernel convolutionKernel66 = new morphology.ConvolutionKernel(floatArray64);
        morphology.Erode erode67 = new morphology.Erode(floatArray64);
        morphology.Erode erode68 = new morphology.Erode(floatArray64);
        morphology.BaseMorphology baseMorphology69 = erode63.compose((morphology.BaseMorphology) erode68);
        morphology.BaseMorphology baseMorphology70 = convolutionKernel59.compose((morphology.BaseMorphology) erode68);
        morphology.BaseMorphology baseMorphology71 = erode56.compose((morphology.BaseMorphology) convolutionKernel59);
        morphology.BaseMorphology baseMorphology72 = baseMorphology17.compose(baseMorphology71);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray25);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray41);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology43);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology44);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology45);
        org.junit.Assert.assertNotNull(baseMorphology46);
        org.junit.Assert.assertNotNull(baseMorphology47);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertNotNull(baseMorphology69);
        org.junit.Assert.assertNotNull(baseMorphology70);
        org.junit.Assert.assertNotNull(baseMorphology71);
        org.junit.Assert.assertNotNull(baseMorphology72);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
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
// flaky:         histogram19.put(10);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        feature.FirstOrder.Feature feature0 = feature.FirstOrder.Feature.HARMONICMEAN;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        java.lang.Class<?> wildcardClass2 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + feature.FirstOrder.Feature.HARMONICMEAN + "'", feature0.equals(feature.FirstOrder.Feature.HARMONICMEAN));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
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
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (byte) 100, 35);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
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
        util.Histogram histogram29 = new util.Histogram((int) (byte) 100, 97);
        int[] intArray30 = histogram29.getData();
        histogram25.set(intArray30);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
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
        histogram18.put((int) (byte) 1);
        histogram18.setOffset((int) (short) -1);
        histogram18.setSize((int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
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
        histogram1.setSize(10);
        histogram1.setSize(97);
        util.Histogram histogram60 = new util.Histogram(1, (int) (short) 100);
        int[] intArray61 = histogram60.getData();
        util.Histogram histogram63 = new util.Histogram(intArray61, (int) '#');
        util.Histogram histogram66 = new util.Histogram(intArray61, (int) (byte) 10, 10);
        int[] intArray67 = histogram66.getData();
        histogram1.set(intArray67);
        int int70 = histogram1.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
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
        java.lang.Class<?> wildcardClass57 = intArray55.getClass();
        try {
            util.Histogram histogram59 = new util.Histogram(intArray55, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Threshold threshold7 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology8 = null; // flaky: erode5.compose((morphology.BaseMorphology) threshold7);
        org.junit.Assert.assertNotNull(floatArray3);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = new util.Histogram(intArray15, 255);
        util.Histogram histogram19 = new util.Histogram(intArray15, (int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
        util.Histogram histogram9 = new util.Histogram((int) ' ');
        int[] intArray10 = histogram9.getData();
// flaky:         histogram1.set(intArray10);
        util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray10, 100, (int) (short) -1);
        int int16 = 0; // flaky: histogram14.get((int) (short) 10);
        try {
// flaky:             histogram14.put((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
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
        util.Histogram histogram46 = new util.Histogram(intArray41, (int) (byte) 10);
        java.lang.Class<?> wildcardClass47 = histogram46.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (byte) 100);
        histogram2.setSize(97);
        try {
            int int6 = histogram2.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray4);
        java.awt.image.BufferedImage bufferedImage10 = null;
        try {
            java.awt.image.BufferedImage bufferedImage11 = convolutionKernel9.apply(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
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
        try {
            histogram43.put((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 100);
// flaky:         histogram19.setWidth((int) (byte) 1);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        java.lang.Class<?> wildcardClass12 = null; // flaky: histogram1.getClass();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
// flaky:         histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, (int) (short) 10, (int) (byte) 10);
        int[] intArray28 = histogram27.getData();
// flaky:         histogram1.set(intArray28);
// flaky:         histogram1.setSize((int) (short) 0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
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
        util.Histogram histogram24 = new util.Histogram(intArray22, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
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
        morphology.Sobel.Direction direction33 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel34 = new morphology.Sobel(direction33);
        float[] floatArray35 = new float[] {};
        morphology.Erode erode36 = new morphology.Erode(floatArray35);
        java.lang.Class<?> wildcardClass37 = erode36.getClass();
        morphology.BaseMorphology baseMorphology38 = sobel34.compose((morphology.BaseMorphology) erode36);
        float[] floatArray43 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel44 = new morphology.ConvolutionKernel(floatArray43);
        morphology.Erode erode45 = new morphology.Erode(floatArray43);
        morphology.BaseMorphology baseMorphology46 = sobel34.compose((morphology.BaseMorphology) erode45);
        morphology.BaseMorphology baseMorphology47 = baseMorphology10.compose(baseMorphology46);
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
        org.junit.Assert.assertTrue("'" + direction33 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction33.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(baseMorphology38);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(baseMorphology46);
        org.junit.Assert.assertNotNull(baseMorphology47);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        histogram2.put(32);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, (int) ' ', (int) (short) -1);
        try {
// flaky:             histogram13.setSize((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        histogram14.setWidth((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
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
        util.Histogram histogram26 = null; // flaky: new util.Histogram(intArray23, 35);
        try {
// flaky:             histogram26.setSize((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
        try {
            histogram25.put((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
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
        histogram16.setWidth(0);
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
        util.Histogram histogram87 = new util.Histogram(intArray81, (int) (byte) 100, (int) '4');
        int[] intArray88 = histogram87.getData();
        try {
            histogram16.set(intArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertNotNull(intArray88);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
        int[] intArray6 = null; // flaky: histogram1.getData();
        util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray6, 255, (int) ' ');
// flaky:         org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
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
        java.lang.Class<?> wildcardClass30 = intList18.getClass();
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) (short) 10, (int) (byte) 100);
        try {
            util.Histogram histogram36 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList18, 0, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray3, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
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
        int int22 = histogram14.get(0);
        histogram14.put(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
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
        histogram16.setOffset(97);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
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
// flaky:         histogram1.setOffset(1);
        util.Histogram histogram57 = null; // flaky: new util.Histogram(0);
// flaky:         histogram57.setSize((int) (short) 10);
// flaky:         histogram57.setSize((int) (byte) 100);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
// flaky:         histogram57.set((java.util.List<java.lang.Integer>) intList65);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) 'a');
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) '4', (int) 'a');
        int[] intArray73 = histogram72.getData();
        util.Histogram histogram75 = null; // flaky: new util.Histogram(0);
// flaky:         histogram75.setSize((int) (short) 10);
// flaky:         histogram75.setSize((int) (byte) 100);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
// flaky:         histogram75.set((java.util.List<java.lang.Integer>) intList83);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList83, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram90 = new util.Histogram((java.util.List<java.lang.Integer>) intList83, (int) (byte) 100);
        histogram72.set((java.util.List<java.lang.Integer>) intList83);
        int[] intArray92 = histogram72.getData();
        util.Histogram histogram95 = new util.Histogram(intArray92, (int) ' ', (int) (short) 100);
// flaky:         histogram1.set(intArray92);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(intArray92);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
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
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setSize((int) (short) 10);
// flaky:         histogram2.setSize(0);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
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
        histogram25.setWidth((int) ' ');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
// flaky:         histogram29.setOffset((int) (byte) 1);
// flaky:         histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
// flaky:         histogram25.set(intArray38);
        util.Histogram histogram41 = new util.Histogram((int) ' ');
        histogram41.put((int) (byte) 10);
        util.Histogram histogram45 = new util.Histogram((int) ' ');
        int[] intArray46 = histogram45.getData();
        histogram41.set(intArray46);
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
        util.Histogram histogram55 = null; // flaky: new util.Histogram(0);
// flaky:         histogram55.setSize((int) (short) 10);
// flaky:         histogram55.setSize((int) (byte) 100);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
// flaky:         histogram55.set((java.util.List<java.lang.Integer>) intList63);
        util.Histogram histogram67 = new util.Histogram((java.util.List<java.lang.Integer>) intList63, (int) 'a');
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList63, 97, 255);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList63);
        util.Histogram histogram73 = null; // flaky: new util.Histogram(0);
// flaky:         histogram73.setSize((int) (short) 10);
// flaky:         histogram73.setSize((int) (byte) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
// flaky:         histogram73.set((java.util.List<java.lang.Integer>) intList81);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList81, (int) 'a');
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList81, (int) '4', (int) 'a');
        int[] intArray89 = histogram88.getData();
        util.Histogram histogram91 = new util.Histogram(intArray89, (int) (short) 10);
// flaky:         histogram49.set(intArray89);
        histogram41.set(intArray89);
        histogram25.set(intArray89);
        try {
            util.Histogram histogram96 = null; // flaky: new util.Histogram(intArray89, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(intArray89);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        float[] floatArray5 = new float[] { 'a', 1, (short) -1, 100, '4' };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray5);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
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
        histogram25.setWidth((int) ' ');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
// flaky:         histogram29.setOffset((int) (byte) 1);
// flaky:         histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
// flaky:         histogram25.set(intArray38);
        histogram25.put((int) '#');
        histogram25.put((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        util.Histogram histogram2 = new util.Histogram(10, (int) (short) 10);
        int[] intArray3 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
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
        java.lang.Class<?> wildcardClass24 = histogram14.getClass();
        int[] intArray25 = histogram14.getData();
        try {
            histogram14.put(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
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
        try {
            util.Histogram histogram80 = null; // flaky: new util.Histogram(intArray75, (int) '#', (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray75);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
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
        morphology.Threshold threshold38 = new morphology.Threshold(0.0f);
        float[] floatArray43 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode44 = new morphology.Erode(floatArray43);
        morphology.BaseMorphology baseMorphology45 = threshold38.compose((morphology.BaseMorphology) erode44);
        morphology.Sobel.Direction direction46 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel47 = new morphology.Sobel(direction46);
        float[] floatArray50 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel51 = null; // flaky: new morphology.ConvolutionKernel(floatArray50);
        float[] floatArray54 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel55 = null; // flaky: new morphology.ConvolutionKernel(floatArray54);
        morphology.BaseMorphology baseMorphology56 = null; // flaky: convolutionKernel51.compose((morphology.BaseMorphology) convolutionKernel55);
        morphology.BaseMorphology baseMorphology57 = sobel47.compose((morphology.BaseMorphology) convolutionKernel51);
        morphology.BaseMorphology baseMorphology58 = baseMorphology45.compose((morphology.BaseMorphology) convolutionKernel51);
        float[] floatArray59 = new float[] {};
        morphology.Erode erode60 = new morphology.Erode(floatArray59);
        java.lang.Class<?> wildcardClass61 = erode60.getClass();
        morphology.Sobel.Direction direction62 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel63 = new morphology.Sobel(direction62);
        float[] floatArray66 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel67 = null; // flaky: new morphology.ConvolutionKernel(floatArray66);
        float[] floatArray70 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel71 = null; // flaky: new morphology.ConvolutionKernel(floatArray70);
        morphology.BaseMorphology baseMorphology72 = null; // flaky: convolutionKernel67.compose((morphology.BaseMorphology) convolutionKernel71);
        morphology.BaseMorphology baseMorphology73 = sobel63.compose((morphology.BaseMorphology) convolutionKernel67);
        morphology.BaseMorphology baseMorphology74 = erode60.compose((morphology.BaseMorphology) sobel63);
        morphology.BaseMorphology baseMorphology75 = baseMorphology58.compose((morphology.BaseMorphology) erode60);
        float[] floatArray76 = new float[] {};
        morphology.Erode erode77 = new morphology.Erode(floatArray76);
        morphology.ConvolutionKernel convolutionKernel78 = new morphology.ConvolutionKernel(floatArray76);
        morphology.ConvolutionKernel convolutionKernel79 = new morphology.ConvolutionKernel(floatArray76);
        morphology.ConvolutionKernel convolutionKernel80 = new morphology.ConvolutionKernel(floatArray76);
        morphology.ConvolutionKernel convolutionKernel81 = new morphology.ConvolutionKernel(floatArray76);
        morphology.Erode erode82 = new morphology.Erode(floatArray76);
        morphology.ConvolutionKernel convolutionKernel83 = new morphology.ConvolutionKernel(floatArray76);
        morphology.BaseMorphology baseMorphology84 = baseMorphology58.compose((morphology.BaseMorphology) convolutionKernel83);
        morphology.BaseMorphology baseMorphology85 = erode34.compose((morphology.BaseMorphology) convolutionKernel83);
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
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(baseMorphology45);
        org.junit.Assert.assertTrue("'" + direction46 + "' != '" + morphology.Sobel.Direction.UP + "'", direction46.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertNotNull(floatArray54);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology56);
        org.junit.Assert.assertNotNull(baseMorphology57);
        org.junit.Assert.assertNotNull(baseMorphology58);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + direction62 + "' != '" + morphology.Sobel.Direction.UP + "'", direction62.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertNotNull(floatArray70);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology72);
        org.junit.Assert.assertNotNull(baseMorphology73);
        org.junit.Assert.assertNotNull(baseMorphology74);
        org.junit.Assert.assertNotNull(baseMorphology75);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertNotNull(baseMorphology84);
        org.junit.Assert.assertNotNull(baseMorphology85);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
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
        int int20 = histogram16.get(1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        int int1 = util.RGBPixel.getBlue(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
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
        float[] floatArray22 = new float[] {};
        morphology.Erode erode23 = new morphology.Erode(floatArray22);
        java.lang.Class<?> wildcardClass24 = erode23.getClass();
        morphology.Sobel.Direction direction25 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel26 = new morphology.Sobel(direction25);
        float[] floatArray29 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel30 = null; // flaky: new morphology.ConvolutionKernel(floatArray29);
        float[] floatArray33 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel34 = null; // flaky: new morphology.ConvolutionKernel(floatArray33);
        morphology.BaseMorphology baseMorphology35 = null; // flaky: convolutionKernel30.compose((morphology.BaseMorphology) convolutionKernel34);
        morphology.BaseMorphology baseMorphology36 = sobel26.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology37 = erode23.compose((morphology.BaseMorphology) sobel26);
        morphology.BaseMorphology baseMorphology38 = baseMorphology21.compose((morphology.BaseMorphology) erode23);
        float[] floatArray39 = new float[] {};
        morphology.Erode erode40 = new morphology.Erode(floatArray39);
        morphology.ConvolutionKernel convolutionKernel41 = new morphology.ConvolutionKernel(floatArray39);
        morphology.ConvolutionKernel convolutionKernel42 = new morphology.ConvolutionKernel(floatArray39);
        morphology.ConvolutionKernel convolutionKernel43 = new morphology.ConvolutionKernel(floatArray39);
        morphology.ConvolutionKernel convolutionKernel44 = new morphology.ConvolutionKernel(floatArray39);
        morphology.Erode erode45 = new morphology.Erode(floatArray39);
        morphology.ConvolutionKernel convolutionKernel46 = new morphology.ConvolutionKernel(floatArray39);
        morphology.BaseMorphology baseMorphology47 = baseMorphology21.compose((morphology.BaseMorphology) convolutionKernel46);
        java.awt.image.BufferedImage bufferedImage48 = null;
        try {
            java.awt.image.BufferedImage bufferedImage49 = convolutionKernel46.apply(bufferedImage48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + morphology.Sobel.Direction.UP + "'", direction9.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray17);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(baseMorphology20);
        org.junit.Assert.assertNotNull(baseMorphology21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + morphology.Sobel.Direction.UP + "'", direction25.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray33);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology35);
        org.junit.Assert.assertNotNull(baseMorphology36);
        org.junit.Assert.assertNotNull(baseMorphology37);
        org.junit.Assert.assertNotNull(baseMorphology38);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertNotNull(baseMorphology47);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        morphology.Erode erode9 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        util.Histogram histogram2 = new util.Histogram(32, (int) (byte) 1);
        histogram2.setSize((int) 'a');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
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
// flaky:         histogram20.setWidth((int) (short) -1);
// flaky:         histogram20.setSize((int) ' ');
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
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
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = convolutionKernel12.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray9);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = sobel6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
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
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 10);
        java.lang.Class<?> wildcardClass28 = histogram27.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setOffset(10);
        int[] intArray12 = null; // flaky: histogram1.getData();
// flaky:         org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        histogram7.setSize(52);
        java.lang.Class<?> wildcardClass10 = histogram7.getClass();
        int[] intArray11 = histogram7.getData();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        histogram16.setSize(255);
        histogram16.setSize(1);
        util.Histogram histogram22 = new util.Histogram((int) (byte) 100);
        int[] intArray23 = histogram22.getData();
        util.Histogram histogram25 = new util.Histogram((int) (byte) 100);
        int[] intArray26 = histogram25.getData();
        histogram22.set(intArray26);
        util.Histogram histogram29 = new util.Histogram(intArray26, (int) '#');
        histogram16.set(intArray26);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
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
        histogram28.put(35);
        java.lang.Class<?> wildcardClass34 = histogram28.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        int int1 = util.RGBPixel.getBlue(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
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
        int[] intArray30 = histogram25.getData();
        try {
            histogram25.put((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 152");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        util.Histogram histogram1 = null; // flaky: new util.Histogram((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = null; // flaky: histogram1.getClass();
        try {
// flaky:             histogram1.put(2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
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
        histogram7.setOffset(0);
        int int36 = histogram7.get(10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        util.Histogram histogram1 = new util.Histogram((int) (short) 10);
        histogram1.setSize(255);
        int[] intArray4 = histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
// flaky:         histogram6.setSize((int) 'a');
        int int14 = 0; // flaky: histogram6.get((int) (short) 0);
        int[] intArray15 = null; // flaky: histogram6.getData();
        util.Histogram histogram18 = null; // flaky: new util.Histogram(intArray15, (int) ' ', (int) (short) -1);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray15, 10, 1);
// flaky:         histogram1.set(intArray15);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
// flaky:         histogram2.setOffset(100);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(0);
// flaky:         histogram8.setSize((int) (short) 10);
// flaky:         histogram8.setSize((int) (byte) 100);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
// flaky:         histogram8.set((java.util.List<java.lang.Integer>) intList16);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList16, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList16, (int) (byte) 100);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList16, 255);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) 'a');
        histogram25.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram42 = null; // flaky: new util.Histogram(0);
// flaky:         histogram42.setSize((int) (short) 10);
// flaky:         histogram42.setSize((int) (byte) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
// flaky:         histogram42.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, (int) (short) 10, (int) (byte) 10);
        histogram25.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, 97, (int) 'a');
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, 10);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList50);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass8 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
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
        histogram54.setWidth((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        try {
            int int18 = histogram14.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        util.Histogram histogram18 = new util.Histogram(intArray16, (int) (byte) 10);
        try {
            util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 0, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
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
        java.lang.Class<?> wildcardClass58 = histogram14.getClass();
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
        histogram73.setWidth(100);
        histogram73.put(0);
        int[] intArray85 = histogram73.getData();
        histogram14.set(intArray85);
        try {
            util.Histogram histogram88 = null; // flaky: new util.Histogram(intArray85, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(intArray85);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setSize((int) (short) 10);
// flaky:         histogram3.setSize((int) (byte) 100);
// flaky:         histogram3.setSize((int) 'a');
        int int11 = 0; // flaky: histogram3.get((int) (short) 0);
        int[] intArray12 = null; // flaky: histogram3.getData();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
// flaky:         histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, (int) (byte) 100);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, 255);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, (int) ' ');
// flaky:         histogram3.set((java.util.List<java.lang.Integer>) intList22);
        try {
// flaky:             histogram1.set((java.util.List<java.lang.Integer>) intList22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 100);
        int[] intArray2 = histogram1.getData();
        util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, 52, (int) (byte) -1);
        util.Histogram histogram8 = new util.Histogram(intArray2, 97, 32);
        histogram8.setOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.put(100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
        int[] intArray2 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram5 = null; // flaky: new util.Histogram(intArray2, (int) ' ', 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (byte) 10);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(10, 0);
        try {
// flaky:             histogram2.put((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
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
            java.awt.image.BufferedImage bufferedImage29 = threshold1.apply(bufferedImage28);
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
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
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList30, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intList0, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setOffset(10);
// flaky:         histogram1.setOffset(9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
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
        try {
            util.Histogram histogram43 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
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
        try {
            util.Histogram histogram40 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, 52, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
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
        histogram25.setWidth((int) ' ');
        int[] intArray28 = histogram25.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = new util.Histogram(intArray17, 255);
        util.Histogram histogram22 = new util.Histogram(intArray17, (int) ' ', 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        morphology.Identity identity0 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology1 = null;
        morphology.BaseMorphology baseMorphology2 = identity0.compose(baseMorphology1);
        org.junit.Assert.assertNotNull(baseMorphology2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (byte) 100);
        histogram2.setSize(97);
        histogram2.put(0);
        java.util.List<java.lang.Integer> intList7 = null;
        try {
            histogram2.set(intList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
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
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
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
        int[] intArray22 = histogram14.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
// flaky:         histogram2.setOffset(100);
        int[] intArray7 = null; // flaky: histogram2.getData();
// flaky:         org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
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
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 52);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode9 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
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
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) '#');
        try {
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.DOWN;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        float[] floatArray3 = new float[] {};
        morphology.Erode erode4 = new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode6 = new morphology.Erode(floatArray3);
        morphology.Erode erode7 = new morphology.Erode(floatArray3);
        morphology.BaseMorphology baseMorphology8 = sobel2.compose((morphology.BaseMorphology) erode7);
        morphology.Grayscale grayscale9 = new morphology.Grayscale();
        float[] floatArray16 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel17 = null; // flaky: new morphology.ConvolutionKernel(floatArray16);
        morphology.Sobel.Direction direction18 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel19 = new morphology.Sobel(direction18);
        morphology.Sobel sobel20 = new morphology.Sobel(direction18);
        java.lang.Class<?> wildcardClass21 = direction18.getClass();
        morphology.Sobel sobel22 = new morphology.Sobel(direction18);
        morphology.BaseMorphology baseMorphology23 = null; // flaky: convolutionKernel17.compose((morphology.BaseMorphology) sobel22);
        morphology.BaseMorphology baseMorphology24 = grayscale9.compose((morphology.BaseMorphology) convolutionKernel17);
        morphology.BaseMorphology baseMorphology25 = erode7.compose((morphology.BaseMorphology) convolutionKernel17);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction18.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass21);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology23);
        org.junit.Assert.assertNotNull(baseMorphology24);
        org.junit.Assert.assertNotNull(baseMorphology25);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
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
        histogram39.setSize((int) 'a');
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
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
        int int39 = histogram16.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, 32);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 0, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        util.Histogram histogram2 = new util.Histogram((int) 'a', (int) (byte) 100);
        util.Histogram histogram5 = new util.Histogram(1, (int) (short) 100);
        int[] intArray6 = histogram5.getData();
        util.Histogram histogram8 = new util.Histogram(intArray6, (int) '#');
        histogram2.set(intArray6);
        java.lang.Class<?> wildcardClass10 = histogram2.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        int[] intArray1 = new int[] { '#' };
        util.Histogram histogram3 = new util.Histogram(intArray1, (int) 'a');
        try {
            util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray1, 1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 9);
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        int[] intArray15 = histogram14.getData();
        int[] intArray16 = histogram14.getData();
        util.Histogram histogram19 = new util.Histogram(intArray16, 2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 35, 2, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        try {
            util.Histogram histogram7 = new util.Histogram((java.util.List<java.lang.Integer>) intList4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(97, (int) (short) -1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        histogram1.setSize(52);
        histogram1.setSize(0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        int[] intArray17 = histogram16.getData();
        util.Histogram histogram19 = new util.Histogram(intArray17, 255);
        int int21 = histogram19.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
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
        histogram19.put((int) (short) 1);
        histogram19.setWidth((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
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
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
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
        histogram1.setOffset((int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        util.Histogram histogram2 = new util.Histogram(255, 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass5 = floatArray0.getClass();
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        java.awt.image.BufferedImage bufferedImage8 = null;
        try {
            java.awt.image.BufferedImage bufferedImage9 = convolutionKernel7.apply(bufferedImage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        util.Histogram histogram2 = new util.Histogram((int) '4', 255);
        histogram2.put((int) (byte) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
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
        histogram7.put((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        morphology.Erode erode6 = new morphology.Erode(floatArray1);
        float[] floatArray8 = new float[] { 0L };
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray8);
        java.lang.Class<?> wildcardClass11 = floatArray8.getClass();
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray8);
        morphology.ConvolutionKernel convolutionKernel13 = new morphology.ConvolutionKernel(floatArray8);
        morphology.BaseMorphology baseMorphology14 = erode6.compose((morphology.BaseMorphology) convolutionKernel13);
        float[] floatArray15 = new float[] {};
        morphology.Erode erode16 = new morphology.Erode(floatArray15);
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray15);
        morphology.ConvolutionKernel convolutionKernel18 = new morphology.ConvolutionKernel(floatArray15);
        morphology.BaseMorphology baseMorphology19 = baseMorphology14.compose((morphology.BaseMorphology) convolutionKernel18);
        java.awt.image.BufferedImage bufferedImage20 = null;
        try {
            java.awt.image.BufferedImage bufferedImage21 = convolutionKernel18.apply(bufferedImage20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(baseMorphology14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(baseMorphology19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 1, 0);
// flaky:         histogram2.setSize((int) (byte) 100);
// flaky:         histogram2.setOffset((int) (short) 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
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
        histogram19.setSize((int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
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
        float[] floatArray43 = new float[] { 0L };
        morphology.Erode erode44 = new morphology.Erode(floatArray43);
        morphology.ConvolutionKernel convolutionKernel45 = new morphology.ConvolutionKernel(floatArray43);
        morphology.ConvolutionKernel convolutionKernel46 = new morphology.ConvolutionKernel(floatArray43);
        morphology.BaseMorphology baseMorphology47 = convolutionKernel32.compose((morphology.BaseMorphology) convolutionKernel46);
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
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(baseMorphology47);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        morphology.Erode erode9 = new morphology.Erode(floatArray0);
        morphology.Erode erode10 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 1, 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
// flaky:         histogram4.setSize((int) 'a');
        int int12 = 0; // flaky: histogram4.get((int) (short) 0);
        int[] intArray13 = null; // flaky: histogram4.getData();
        util.Histogram histogram16 = null; // flaky: new util.Histogram(intArray13, 35, (int) ' ');
        java.lang.Class<?> wildcardClass17 = null; // flaky: intArray13.getClass();
        try {
// flaky:             histogram2.set(intArray13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        util.Histogram histogram1 = new util.Histogram((int) (short) 100);
        histogram1.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = histogram1.getClass();
        histogram1.setWidth((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        int int1 = util.RGBPixel.getGreen((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
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
// flaky:         histogram19.setWidth((int) (byte) 1);
        util.Histogram histogram24 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = histogram24.getClass();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) '#', (int) (byte) 100);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
// flaky:         histogram35.setSize((int) 'a');
        util.Histogram histogram43 = null; // flaky: new util.Histogram(0);
// flaky:         histogram43.setSize((int) (short) 10);
// flaky:         histogram43.setSize((int) (byte) 100);
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
// flaky:         histogram43.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList51);
        histogram33.set((java.util.List<java.lang.Integer>) intList51);
        util.Histogram histogram60 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, 97);
        histogram24.set((java.util.List<java.lang.Integer>) intList51);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList51);
        try {
            util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList51, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
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
// flaky:         histogram1.setWidth((-1));
        java.lang.Class<?> wildcardClass26 = null; // flaky: histogram1.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        int int1 = util.RGBPixel.getRed(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        morphology.Threshold threshold1 = new morphology.Threshold((float) 97);
        float[] floatArray5 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray5);
        float[] floatArray8 = new float[] {};
        morphology.Erode erode9 = new morphology.Erode(floatArray8);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray8);
        morphology.Erode erode11 = new morphology.Erode(floatArray8);
        morphology.BaseMorphology baseMorphology12 = null; // flaky: erode7.compose((morphology.BaseMorphology) erode11);
        morphology.Threshold threshold14 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology15 = null; // flaky: baseMorphology12.compose((morphology.BaseMorphology) threshold14);
        morphology.BaseMorphology baseMorphology16 = threshold1.compose((morphology.BaseMorphology) threshold14);
        java.awt.image.BufferedImage bufferedImage17 = null;
        try {
            java.awt.image.BufferedImage bufferedImage18 = threshold14.apply(bufferedImage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray8);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology12);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology15);
        org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 100, (int) (byte) 10);
        util.Histogram histogram22 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int[] intArray23 = null; // flaky: histogram22.getData();
// flaky:         histogram19.set(intArray23);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(intArray23, 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        util.Histogram histogram8 = new util.Histogram(intArray3, (int) (byte) 10, 10);
        int[] intArray9 = histogram8.getData();
        int[] intArray10 = histogram8.getData();
        util.Histogram histogram13 = new util.Histogram(intArray10, 10, 97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
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
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 10);
        try {
            util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
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
        histogram14.setOffset((-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
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
        util.Histogram histogram62 = new util.Histogram(intArray58, 100, (int) (byte) 100);
        try {
            util.Histogram histogram64 = new util.Histogram(intArray58, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray58);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
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
        histogram22.setOffset(52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = histogram14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
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
        util.Histogram histogram23 = new util.Histogram(1, (int) (short) 100);
        int[] intArray24 = histogram23.getData();
        util.Histogram histogram26 = new util.Histogram(intArray24, (int) ' ');
        histogram18.set(intArray24);
        util.Histogram histogram30 = new util.Histogram(intArray24, (int) (short) 1, (int) ' ');
        try {
            util.Histogram histogram33 = null; // flaky: new util.Histogram(intArray24, 35, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setSize(2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        int[] intArray7 = histogram1.getData();
        try {
            histogram1.put(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int int4 = 0; // flaky: histogram2.get((int) (byte) 1);
// flaky:         histogram2.setSize(10);
        java.lang.Class<?> wildcardClass7 = null; // flaky: histogram2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        histogram2.setOffset((int) (short) 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
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
        try {
            util.Histogram histogram28 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
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
        histogram66.put(255);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram2 = new util.Histogram(intList0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass4 = floatArray0.getClass();
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        float[] floatArray7 = new float[] { 0L };
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        java.lang.Class<?> wildcardClass10 = floatArray7.getClass();
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray7);
        float[] floatArray13 = new float[] {};
        morphology.Erode erode14 = new morphology.Erode(floatArray13);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray13);
        morphology.Erode erode16 = new morphology.Erode(floatArray13);
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray13);
        morphology.ConvolutionKernel convolutionKernel18 = new morphology.ConvolutionKernel(floatArray13);
        morphology.Erode erode19 = new morphology.Erode(floatArray13);
        float[] floatArray22 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel23 = null; // flaky: new morphology.ConvolutionKernel(floatArray22);
        float[] floatArray26 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel27 = null; // flaky: new morphology.ConvolutionKernel(floatArray26);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: convolutionKernel23.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology29 = erode19.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology30 = convolutionKernel12.compose(baseMorphology29);
        morphology.Threshold threshold32 = new morphology.Threshold(0.0f);
        float[] floatArray37 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode38 = new morphology.Erode(floatArray37);
        morphology.BaseMorphology baseMorphology39 = threshold32.compose((morphology.BaseMorphology) erode38);
        morphology.Sobel.Direction direction40 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel41 = new morphology.Sobel(direction40);
        java.lang.Class<?> wildcardClass42 = sobel41.getClass();
        morphology.BaseMorphology baseMorphology43 = threshold32.compose((morphology.BaseMorphology) sobel41);
        morphology.BaseMorphology baseMorphology44 = baseMorphology30.compose((morphology.BaseMorphology) sobel41);
        morphology.BaseMorphology baseMorphology45 = erode5.compose(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(baseMorphology39);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction40.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(baseMorphology43);
        org.junit.Assert.assertNotNull(baseMorphology44);
        org.junit.Assert.assertNotNull(baseMorphology45);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        util.Histogram histogram2 = new util.Histogram(32, 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 100);
        histogram16.setWidth((int) (byte) 100);
        util.Histogram histogram20 = null; // flaky: new util.Histogram(0);
// flaky:         histogram20.setSize((int) (short) 10);
// flaky:         histogram20.setSize((int) (byte) 100);
// flaky:         histogram20.setOffset((int) (byte) 1);
        util.Histogram histogram28 = new util.Histogram((int) ' ');
        int[] intArray29 = histogram28.getData();
// flaky:         histogram20.set(intArray29);
        util.Histogram histogram33 = new util.Histogram(intArray29, (int) (short) 1, (int) '4');
        histogram16.set(intArray29);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        histogram16.setWidth(1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setOffset(35);
        try {
            int int12 = 0; // flaky: histogram2.get((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (short) 0, 0);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setWidth(0);
// flaky:         histogram4.setSize((int) 'a');
// flaky:         histogram4.setWidth((int) (byte) 100);
        util.Histogram histogram12 = null; // flaky: new util.Histogram(0);
// flaky:         histogram12.setSize((int) (short) 10);
// flaky:         histogram12.setSize((int) (byte) 100);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
// flaky:         histogram12.set((java.util.List<java.lang.Integer>) intList20);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList20, (int) (short) 100, (int) (byte) 1);
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
        int[] intArray53 = histogram52.getData();
// flaky:         histogram4.set(intArray53);
        util.Histogram histogram57 = new util.Histogram(1, (int) (short) 100);
        int[] intArray58 = histogram57.getData();
        util.Histogram histogram60 = new util.Histogram(intArray58, (int) '#');
        int[] intArray61 = histogram60.getData();
// flaky:         histogram4.set(intArray61);
        try {
// flaky:             histogram2.set(intArray61);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray61);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setOffset(35);
        int[] intArray11 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray11, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
// flaky:         org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
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
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray17, (int) 'a', (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        int int41 = histogram2.get(1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
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
        int[] intArray89 = null; // flaky: histogram1.getData();
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
// flaky:         org.junit.Assert.assertNotNull(intArray89);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
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
        histogram18.put(31);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray75);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
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
// flaky:         histogram24.put((int) ' ');
        try {
// flaky:             histogram24.put((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.RIGHT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
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
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction0.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        int[] intArray33 = histogram32.getData();
        histogram32.setWidth(97);
        util.Histogram histogram37 = new util.Histogram((int) ' ');
        int[] intArray38 = histogram37.getData();
        histogram32.set(intArray38);
        histogram1.set(intArray38);
        histogram1.setOffset((int) (byte) 0);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) (short) 1);
        histogram2.setWidth((int) (byte) -1);
        histogram2.setSize(1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
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
        util.Histogram histogram60 = null; // flaky: new util.Histogram(0);
// flaky:         histogram60.setSize((int) (short) 10);
// flaky:         histogram60.setSize((int) (byte) 100);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
// flaky:         histogram60.set((java.util.List<java.lang.Integer>) intList68);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList68, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram75 = new util.Histogram((java.util.List<java.lang.Integer>) intList68, (int) (byte) 100);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList68, 255);
        util.Histogram histogram79 = null; // flaky: new util.Histogram(0);
// flaky:         histogram79.setSize((int) (short) 10);
// flaky:         histogram79.setSize((int) (byte) 100);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
// flaky:         histogram79.set((java.util.List<java.lang.Integer>) intList87);
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList87, (int) 'a');
        histogram77.set((java.util.List<java.lang.Integer>) intList87);
        java.lang.Class<?> wildcardClass93 = intList87.getClass();
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList87, (int) (short) 100);
        histogram58.set((java.util.List<java.lang.Integer>) intList87);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 100, (int) (byte) 10);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
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
        util.Histogram histogram23 = new util.Histogram(1, (int) (short) 100);
        int[] intArray24 = histogram23.getData();
        util.Histogram histogram26 = new util.Histogram(intArray24, (int) ' ');
        histogram18.set(intArray24);
        util.Histogram histogram30 = new util.Histogram(intArray24, 10, (int) (short) 1);
        try {
            histogram30.put((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        util.Histogram histogram2 = new util.Histogram(100, 255);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
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
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) ' ');
        histogram27.setWidth((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
        int[] intArray12 = null; // flaky: histogram1.getData();
        java.lang.Class<?> wildcardClass13 = null; // flaky: histogram1.getClass();
        util.Histogram histogram15 = null; // flaky: new util.Histogram(0);
// flaky:         histogram15.setSize((int) (short) 10);
// flaky:         histogram15.setSize((int) (byte) 100);
// flaky:         histogram15.setSize((int) 'a');
        util.Histogram histogram23 = null; // flaky: new util.Histogram(0);
// flaky:         histogram23.setSize((int) (short) 10);
// flaky:         histogram23.setSize((int) (byte) 100);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
// flaky:         histogram23.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram15.set((java.util.List<java.lang.Integer>) intList31);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, 10);
        int[] intArray40 = histogram39.getData();
        util.Histogram histogram42 = null; // flaky: new util.Histogram(0);
// flaky:         histogram42.setSize((int) (short) 10);
// flaky:         histogram42.setSize((int) (byte) 100);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
// flaky:         histogram42.set((java.util.List<java.lang.Integer>) intList50);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, (int) (byte) 100);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList50, 255);
        util.Histogram histogram61 = null; // flaky: new util.Histogram(0);
// flaky:         histogram61.setSize((int) (short) 10);
// flaky:         histogram61.setSize((int) (byte) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
// flaky:         histogram61.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) 'a');
        histogram59.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram76 = null; // flaky: new util.Histogram(0);
// flaky:         histogram76.setSize((int) (short) 10);
// flaky:         histogram76.setSize((int) (byte) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
// flaky:         histogram76.set((java.util.List<java.lang.Integer>) intList84);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList84, (int) (short) 10, (int) (byte) 10);
        histogram59.set((java.util.List<java.lang.Integer>) intList84);
        util.Histogram histogram92 = new util.Histogram((java.util.List<java.lang.Integer>) intList84, (int) (byte) 10);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList84, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram97 = new util.Histogram((java.util.List<java.lang.Integer>) intList84, (int) '4');
        histogram39.set((java.util.List<java.lang.Integer>) intList84);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList84);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
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
        util.Histogram histogram23 = new util.Histogram(1, (int) (short) 100);
        int[] intArray24 = histogram23.getData();
        util.Histogram histogram26 = new util.Histogram(intArray24, (int) ' ');
        histogram18.set(intArray24);
        util.Histogram histogram30 = new util.Histogram(intArray24, 2, (int) (byte) 1);
        try {
            histogram30.put(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
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
        histogram28.put(35);
        try {
            int int35 = histogram28.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray1);
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ');
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
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, (int) (short) 10, (int) (byte) 10);
        histogram32.set((java.util.List<java.lang.Integer>) intList57);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList57, 97, (int) 'a');
        histogram13.set((java.util.List<java.lang.Integer>) intList57);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, 9);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray16, 255, 2);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
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
        int[] intArray29 = histogram2.getData();
        try {
            util.Histogram histogram31 = null; // flaky: new util.Histogram(intArray29, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 100, (int) (byte) 10);
        histogram19.setWidth((int) (short) 1);
        histogram19.setSize(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
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
        java.lang.Class<?> wildcardClass34 = intList28.getClass();
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (byte) 10);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(0);
// flaky:         histogram38.setSize((int) (short) 10);
// flaky:         histogram38.setSize((int) (byte) 100);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
// flaky:         histogram38.set((java.util.List<java.lang.Integer>) intList46);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, (int) (byte) 100);
        int[] intArray54 = histogram53.getData();
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
// flaky:         histogram56.set((java.util.List<java.lang.Integer>) intList64);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList64, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram71 = new util.Histogram((java.util.List<java.lang.Integer>) intList64, (int) (byte) 100);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList64, 255);
        histogram53.set((java.util.List<java.lang.Integer>) intList64);
        histogram36.set((java.util.List<java.lang.Integer>) intList64);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
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
            util.Histogram histogram55 = new util.Histogram(intArray45, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
// flaky:         histogram2.setSize((int) (short) 0);
// flaky:         histogram2.setWidth(255);
// flaky:         histogram2.setSize(1);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        float[] floatArray5 = new float[] { (byte) 0, 100.0f, 35, 1, 10.0f };
        morphology.ConvolutionKernel convolutionKernel6 = null; // flaky: new morphology.ConvolutionKernel(floatArray5);
        java.awt.image.BufferedImage bufferedImage7 = null;
        try {
            java.awt.image.BufferedImage bufferedImage8 = convolutionKernel6.apply(bufferedImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
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
        histogram47.setWidth(0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, 97);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        java.lang.Class<?> wildcardClass4 = histogram2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
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
        try {
            util.Histogram histogram54 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList42, (int) (byte) 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        java.awt.image.BufferedImage bufferedImage6 = null;
        try {
            java.awt.image.BufferedImage bufferedImage7 = erode5.apply(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
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
// flaky:         histogram22.setSize((int) '4');
        int[] intArray25 = null; // flaky: histogram22.getData();
// flaky:         histogram20.set(intArray25);
        util.Histogram histogram28 = null; // flaky: new util.Histogram(intArray25, 100);
        try {
            util.Histogram histogram30 = null; // flaky: new util.Histogram(intArray25, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 100, 10);
        histogram2.put(97);
        histogram2.setOffset(2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
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
        try {
            histogram18.put((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
        try {
            util.Histogram histogram11 = null; // flaky: new util.Histogram(intArray8, (int) 'a', (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray6 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.BaseMorphology baseMorphology8 = null; // flaky: convolutionKernel3.compose((morphology.BaseMorphology) convolutionKernel7);
        float[] floatArray13 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode14 = new morphology.Erode(floatArray13);
        morphology.Sobel.Direction direction15 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel16 = new morphology.Sobel(direction15);
        morphology.Sobel sobel17 = new morphology.Sobel(direction15);
        morphology.Sobel sobel18 = new morphology.Sobel(direction15);
        morphology.BaseMorphology baseMorphology19 = erode14.compose((morphology.BaseMorphology) sobel18);
        morphology.BaseMorphology baseMorphology20 = null; // flaky: baseMorphology8.compose(baseMorphology19);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray6);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction15.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology19);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology20);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
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
        histogram43.setWidth((int) (short) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        util.Histogram histogram2 = new util.Histogram(100, 10);
        int int4 = histogram2.get((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        util.Histogram histogram1 = new util.Histogram(52);
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setSize((int) (short) 10);
// flaky:         histogram3.setSize((int) (byte) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
// flaky:         histogram3.set((java.util.List<java.lang.Integer>) intList11);
        util.Histogram histogram15 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) 'a');
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) ' ', 100);
        util.Histogram histogram21 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, 100, (int) (byte) 10);
        histogram1.set((java.util.List<java.lang.Integer>) intList11);
        try {
            util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        util.Histogram histogram2 = new util.Histogram((int) ' ', 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 100, (int) (byte) 10);
        try {
            util.Histogram histogram22 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) -1, 9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = histogram1.getClass();
        histogram1.setOffset(0);
        histogram1.setWidth((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        try {
            util.Histogram histogram2 = null; // flaky: new util.Histogram((-1), 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
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
        util.Histogram histogram25 = new util.Histogram((int) ' ');
        int[] intArray26 = histogram25.getData();
        java.lang.Class<?> wildcardClass27 = histogram25.getClass();
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) 'a');
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 97, 255);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram53 = null; // flaky: new util.Histogram(0);
// flaky:         histogram53.setSize((int) (short) 10);
// flaky:         histogram53.setSize((int) (byte) 100);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
// flaky:         histogram53.set((java.util.List<java.lang.Integer>) intList61);
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList61, (int) 'a');
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList61, (int) '4', (int) 'a');
        int[] intArray69 = histogram68.getData();
        util.Histogram histogram71 = new util.Histogram(intArray69, (int) (short) 10);
// flaky:         histogram29.set(intArray69);
        histogram25.set(intArray69);
        util.Histogram histogram75 = new util.Histogram(intArray69, (int) (short) 100);
        util.Histogram histogram77 = new util.Histogram(intArray69, (int) '#');
        java.lang.Class<?> wildcardClass78 = intArray69.getClass();
// flaky:         histogram21.set(intArray69);
        try {
            util.Histogram histogram81 = null; // flaky: new util.Histogram(intArray69, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
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
// flaky:         histogram19.setWidth((int) (byte) 1);
        int[] intArray22 = null; // flaky: histogram19.getData();
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
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
        histogram14.setOffset((int) (byte) 1);
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        util.Histogram histogram1 = new util.Histogram(52);
        util.Histogram histogram3 = null; // flaky: new util.Histogram(0);
// flaky:         histogram3.setSize((int) (short) 10);
// flaky:         histogram3.setSize((int) (byte) 100);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
// flaky:         histogram3.set((java.util.List<java.lang.Integer>) intList11);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram18 = new util.Histogram((java.util.List<java.lang.Integer>) intList11, (int) '4');
        int[] intArray19 = histogram18.getData();
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setWidth(0);
// flaky:         histogram21.setSize((int) 'a');
// flaky:         histogram21.setWidth((int) (byte) 100);
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
// flaky:         histogram29.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, 35);
        histogram18.set((java.util.List<java.lang.Integer>) intList37);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList37, (int) '4');
        histogram1.set((java.util.List<java.lang.Integer>) intList37);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
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
            util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        java.lang.Class<?> wildcardClass30 = histogram25.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
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
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) '#');
        util.Histogram histogram43 = new util.Histogram((int) (short) 10, (int) (short) 10);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
        util.Histogram histogram51 = null; // flaky: new util.Histogram(0);
// flaky:         histogram51.setSize((int) (short) 10);
// flaky:         histogram51.setSize((int) (byte) 100);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
// flaky:         histogram51.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, (int) 'a');
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, 97, 255);
// flaky:         histogram45.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, 97);
        histogram43.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, (int) ' ');
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, 35);
        histogram40.set((java.util.List<java.lang.Integer>) intList59);
        util.Histogram histogram78 = new util.Histogram((java.util.List<java.lang.Integer>) intList59, 2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) '#');
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
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
        java.lang.Class<?> wildcardClass24 = histogram14.getClass();
        int[] intArray25 = histogram14.getData();
        java.lang.Class<?> wildcardClass26 = histogram14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
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
        try {
            util.Histogram histogram28 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 0, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setSize((int) (short) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) '4');
// flaky:         histogram13.setWidth((int) (byte) 0);
// flaky:         histogram13.setOffset((int) ' ');
// flaky:         histogram13.setOffset((int) (byte) 1);
        int[] intArray22 = null; // flaky: histogram13.getData();
// flaky:         histogram1.set(intArray22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
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
        int[] intArray50 = null;
        try {
            histogram1.set(intArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        float[] floatArray9 = new float[] {};
        morphology.Erode erode10 = new morphology.Erode(floatArray9);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray9);
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.Erode erode14 = new morphology.Erode(floatArray12);
        morphology.Erode erode15 = new morphology.Erode(floatArray12);
        float[] floatArray16 = new float[] {};
        morphology.Erode erode17 = new morphology.Erode(floatArray16);
        morphology.ConvolutionKernel convolutionKernel18 = new morphology.ConvolutionKernel(floatArray16);
        morphology.Erode erode19 = new morphology.Erode(floatArray16);
        morphology.Erode erode20 = new morphology.Erode(floatArray16);
        morphology.BaseMorphology baseMorphology21 = erode15.compose((morphology.BaseMorphology) erode20);
        morphology.BaseMorphology baseMorphology22 = convolutionKernel11.compose((morphology.BaseMorphology) erode20);
        morphology.BaseMorphology baseMorphology23 = erode8.compose((morphology.BaseMorphology) convolutionKernel11);
        java.awt.image.BufferedImage bufferedImage24 = null;
        try {
            java.awt.image.BufferedImage bufferedImage25 = convolutionKernel11.apply(bufferedImage24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(baseMorphology21);
        org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(baseMorphology23);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram14 = null; // flaky: new util.Histogram(intArray10, 10);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass7 = direction0.getClass();
        morphology.Sobel sobel8 = new morphology.Sobel(direction0);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97);
        try {
            util.Histogram histogram18 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage3 = null;
        try {
            java.awt.image.BufferedImage bufferedImage4 = sobel2.apply(bufferedImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction0.equals(morphology.Sobel.Direction.LEFT));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
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
        histogram14.put((-1));
        histogram14.setWidth(31);
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        float[] floatArray6 = new float[] { (-1.0f), (-1L), 'a', (-1), (-1.0f), (byte) 100 };
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
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
        histogram22.setWidth(1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        int int1 = util.RGBPixel.getGreen(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass5 = floatArray0.getClass();
        java.lang.Class<?> wildcardClass6 = floatArray0.getClass();
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
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
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) (byte) 10);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList39, (int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 100, (int) (byte) 10);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) 'a');
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 97, 255);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
// flaky:         histogram45.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) 'a');
        util.Histogram histogram60 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) '4', (int) 'a');
        int[] intArray61 = histogram60.getData();
        util.Histogram histogram63 = new util.Histogram(intArray61, (int) (short) 10);
// flaky:         histogram21.set(intArray61);
        histogram19.set(intArray61);
        util.Histogram histogram68 = new util.Histogram(intArray61, (int) (byte) 100, 100);
        util.Histogram histogram71 = new util.Histogram(intArray61, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray61);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        util.Histogram histogram2 = new util.Histogram((int) '#', (int) ' ');
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
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
        morphology.BaseMorphology baseMorphology28 = null;
        morphology.BaseMorphology baseMorphology29 = sobel1.compose(baseMorphology28);
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
        org.junit.Assert.assertNotNull(baseMorphology29);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        int[] intArray0 = null;
        try {
            util.Histogram histogram3 = null; // flaky: new util.Histogram(intArray0, (int) (byte) -1, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        java.lang.Class<?> wildcardClass5 = floatArray1.getClass();
        morphology.Erode erode6 = new morphology.Erode(floatArray1);
        morphology.Threshold threshold8 = new morphology.Threshold((float) (-1L));
        morphology.BaseMorphology baseMorphology9 = erode6.compose((morphology.BaseMorphology) threshold8);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(baseMorphology9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
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
        try {
            util.Histogram histogram90 = new util.Histogram(intArray86, 2);
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
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        util.Histogram histogram2 = new util.Histogram(255, 35);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
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
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) ' ');
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray6);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 1);
        histogram1.setWidth((int) ' ');
        histogram1.setSize((int) (short) 10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
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
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
// flaky:         histogram20.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) '4');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) '#', (int) (byte) 10);
        histogram16.set((java.util.List<java.lang.Integer>) intList28);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList28, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.setOffset(10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (byte) 10);
        int[] intArray34 = histogram33.getData();
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) (short) 10);
// flaky:         histogram36.setSize((int) (byte) 100);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
// flaky:         histogram36.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) (byte) 10);
        histogram33.set((java.util.List<java.lang.Integer>) intList44);
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, (int) 'a', (int) (short) 10);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 100);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList44, 35);
        util.Histogram histogram61 = null; // flaky: new util.Histogram(0);
// flaky:         histogram61.setSize((int) (short) 10);
// flaky:         histogram61.setSize((int) (byte) 100);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
// flaky:         histogram61.set((java.util.List<java.lang.Integer>) intList69);
        util.Histogram histogram73 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) 'a');
        util.Histogram histogram76 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) ' ', 100);
        util.Histogram histogram79 = new util.Histogram((java.util.List<java.lang.Integer>) intList69, (int) (byte) 10, 255);
        histogram59.set((java.util.List<java.lang.Integer>) intList69);
        histogram14.set((java.util.List<java.lang.Integer>) intList69);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        float[] floatArray2 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel3 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        morphology.ConvolutionKernel convolutionKernel4 = null; // flaky: new morphology.ConvolutionKernel(floatArray2);
        float[] floatArray5 = new float[] {};
        morphology.Erode erode6 = new morphology.Erode(floatArray5);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray5);
        morphology.Erode erode8 = new morphology.Erode(floatArray5);
        morphology.Erode erode9 = new morphology.Erode(floatArray5);
        morphology.Erode erode10 = new morphology.Erode(floatArray5);
        float[] floatArray11 = new float[] {};
        morphology.Erode erode12 = new morphology.Erode(floatArray11);
        morphology.ConvolutionKernel convolutionKernel13 = new morphology.ConvolutionKernel(floatArray11);
        morphology.Erode erode14 = new morphology.Erode(floatArray11);
        morphology.BaseMorphology baseMorphology15 = erode10.compose((morphology.BaseMorphology) erode14);
        morphology.BaseMorphology baseMorphology16 = null; // flaky: convolutionKernel4.compose((morphology.BaseMorphology) erode10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(baseMorphology15);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology16);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        java.lang.Class<?> wildcardClass4 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setWidth((int) '4');
// flaky:         histogram2.setSize((int) (byte) 10);
// flaky:         org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, (int) (short) 1);
        try {
            int int4 = 0; // flaky: histogram2.get((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray4);
        morphology.ConvolutionKernel convolutionKernel7 = new morphology.ConvolutionKernel(floatArray4);
        float[] floatArray11 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode12 = null; // flaky: new morphology.Erode(floatArray11);
        morphology.Erode erode13 = null; // flaky: new morphology.Erode(floatArray11);
        float[] floatArray14 = new float[] {};
        morphology.Erode erode15 = new morphology.Erode(floatArray14);
        morphology.ConvolutionKernel convolutionKernel16 = new morphology.ConvolutionKernel(floatArray14);
        morphology.ConvolutionKernel convolutionKernel17 = new morphology.ConvolutionKernel(floatArray14);
        morphology.Erode erode18 = new morphology.Erode(floatArray14);
        morphology.BaseMorphology baseMorphology19 = null; // flaky: erode13.compose((morphology.BaseMorphology) erode18);
        morphology.BaseMorphology baseMorphology20 = convolutionKernel7.compose(baseMorphology19);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray14);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(baseMorphology20);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
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
        int[] intArray27 = histogram25.getData();
        histogram25.setSize((int) '#');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = null; // flaky: histogram1.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
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
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, 10);
        try {
            histogram54.put((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
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
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray11);
        morphology.ConvolutionKernel convolutionKernel16 = new morphology.ConvolutionKernel(floatArray11);
        morphology.BaseMorphology baseMorphology17 = erode5.compose((morphology.BaseMorphology) convolutionKernel16);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction6.equals(morphology.Sobel.Direction.RIGHT));
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(baseMorphology17);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        morphology.Sobel sobel3 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass4 = direction0.getClass();
        java.lang.Class<?> wildcardClass5 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.Erode erode3 = new morphology.Erode(floatArray1);
        morphology.Erode erode4 = new morphology.Erode(floatArray1);
        float[] floatArray7 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel10 = null; // flaky: new morphology.ConvolutionKernel(floatArray7);
        morphology.BaseMorphology baseMorphology11 = erode4.compose((morphology.BaseMorphology) convolutionKernel10);
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            java.awt.image.BufferedImage bufferedImage13 = erode4.apply(bufferedImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(baseMorphology11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
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
        util.Histogram histogram19 = new util.Histogram(intArray17, (int) (short) 10);
        try {
            util.Histogram histogram21 = null; // flaky: new util.Histogram(intArray17, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.Erode erode3 = new morphology.Erode(floatArray1);
        morphology.Erode erode4 = new morphology.Erode(floatArray1);
        java.awt.image.BufferedImage bufferedImage5 = null;
        try {
            java.awt.image.BufferedImage bufferedImage6 = erode4.apply(bufferedImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
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
        morphology.Sobel sobel10 = new morphology.Sobel(direction0);
        morphology.Sobel sobel11 = new morphology.Sobel(direction0);
        morphology.Sobel sobel12 = new morphology.Sobel(direction0);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
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
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = erode12.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction0.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(baseMorphology5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        histogram2.setSize((int) '4');
        histogram2.setWidth(35);
        histogram2.setWidth((int) (byte) 100);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 0, 0);
// flaky:         histogram2.setWidth(52);
        int[] intArray5 = null; // flaky: histogram2.getData();
        try {
// flaky:             histogram2.put(32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
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
        histogram19.put((int) (short) 1);
        int int23 = histogram19.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) ' ');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) '4');
        histogram13.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (byte) 100, (int) ' ');
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
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
        histogram28.setSize((int) '4');
        util.Histogram histogram33 = null; // flaky: new util.Histogram(0);
// flaky:         histogram33.setSize((int) (short) 10);
// flaky:         histogram33.setSize((int) (byte) 100);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
// flaky:         histogram33.set((java.util.List<java.lang.Integer>) intList41);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, (int) (short) 10, (int) (byte) 10);
        int[] intArray47 = histogram46.getData();
        histogram46.setWidth(97);
        histogram46.setOffset(1);
        util.Histogram histogram53 = null; // flaky: new util.Histogram(0);
// flaky:         histogram53.setSize((int) (short) 10);
// flaky:         histogram53.setSize((int) (byte) 100);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
// flaky:         histogram53.set((java.util.List<java.lang.Integer>) intList61);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList61, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram68 = new util.Histogram((java.util.List<java.lang.Integer>) intList61, (int) (byte) 100);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList61, 255);
        histogram46.set((java.util.List<java.lang.Integer>) intList61);
        histogram28.set((java.util.List<java.lang.Integer>) intList61);
        int[] intArray73 = histogram28.getData();
        histogram28.setOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray73);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, 35, (int) ' ');
        java.lang.Class<?> wildcardClass14 = null; // flaky: histogram13.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
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
        histogram14.setOffset((int) (byte) 10);
        histogram14.setSize(0);
        java.lang.Class<?> wildcardClass24 = histogram14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        util.Histogram histogram2 = new util.Histogram((int) ' ', 52);
        try {
            int int4 = histogram2.get(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        int[] intArray6 = histogram5.getData();
        histogram5.setWidth((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
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
        histogram16.put(1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        int[] intArray12 = histogram2.getData();
        histogram2.put((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram15 = new util.Histogram(intArray6, (int) '4');
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
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
// flaky:         histogram21.put(2);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
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
// flaky:         histogram1.put((int) (byte) 0);
// flaky:         histogram1.setSize(100);
        util.Histogram histogram57 = new util.Histogram((int) (byte) 100);
        int[] intArray58 = histogram57.getData();
        util.Histogram histogram60 = new util.Histogram(intArray58, (int) (short) 10);
        util.Histogram histogram63 = new util.Histogram(intArray58, (int) 'a', (int) '4');
// flaky:         histogram1.set(intArray58);
        int int66 = 0; // flaky: histogram1.get(35);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, 100);
        histogram2.put((int) (short) 1);
        int[] intArray5 = histogram2.getData();
        int[] intArray6 = histogram2.getData();
        histogram2.setSize(0);
        histogram2.setWidth(3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.setSize((int) (byte) 100);
        histogram1.setOffset((int) (short) 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = new util.Histogram((int) (byte) 100);
        int[] intArray13 = histogram12.getData();
        util.Histogram histogram16 = new util.Histogram(intArray13, (int) ' ', 10);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) '4');
        int[] intArray21 = null; // flaky: histogram18.getData();
// flaky:         histogram16.set(intArray21);
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
        java.lang.Class<?> wildcardClass47 = intList40.getClass();
        histogram16.set((java.util.List<java.lang.Integer>) intList40);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList40);
        util.Histogram histogram52 = new util.Histogram((java.util.List<java.lang.Integer>) intList40, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        util.Histogram histogram2 = new util.Histogram(52, (int) (short) 10);
        histogram2.put((int) (short) 1);
        histogram2.setWidth(35);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
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
        morphology.Erode erode10 = new morphology.Erode(floatArray0);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode10.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        util.Histogram histogram1 = new util.Histogram((int) (byte) 1);
        histogram1.setWidth(1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
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
        histogram16.setSize(255);
        histogram16.setSize((int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
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
            util.Histogram histogram39 = null; // flaky: new util.Histogram(intArray31, (-1), (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
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
// flaky:         histogram20.setSize(2);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
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
        try {
            util.Histogram histogram27 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
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
        java.lang.Class<?> wildcardClass11 = erode7.getClass();
        java.awt.image.BufferedImage bufferedImage12 = null;
        try {
            java.awt.image.BufferedImage bufferedImage13 = erode7.apply(bufferedImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 10);
        histogram16.setOffset(255);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
        int[] intArray12 = null; // flaky: histogram1.getData();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
// flaky:         histogram14.setSize((int) 'a');
        int int22 = 0; // flaky: histogram14.get((int) (short) 0);
        int[] intArray23 = null; // flaky: histogram14.getData();
        util.Histogram histogram25 = null; // flaky: new util.Histogram(0);
// flaky:         histogram25.setSize((int) (short) 10);
// flaky:         histogram25.setSize((int) (byte) 100);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
// flaky:         histogram25.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (byte) 100);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, 255);
        util.Histogram histogram44 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) ' ');
// flaky:         histogram14.set((java.util.List<java.lang.Integer>) intList33);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, (int) (byte) 10, (int) 'a');
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList33);
        try {
            util.Histogram histogram51 = new util.Histogram((java.util.List<java.lang.Integer>) intList33, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
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
        java.lang.Class<?> wildcardClass42 = baseMorphology41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        util.Histogram histogram7 = new util.Histogram(intArray5, (int) 'a');
        histogram7.setSize(52);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (byte) 100);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 255);
        util.Histogram histogram30 = null; // flaky: new util.Histogram(0);
// flaky:         histogram30.setSize((int) (short) 10);
// flaky:         histogram30.setSize((int) (byte) 100);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
// flaky:         histogram30.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList38, (int) 'a');
        histogram28.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
// flaky:         histogram45.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) (short) 10, (int) (byte) 10);
        histogram28.set((java.util.List<java.lang.Integer>) intList53);
        java.lang.Class<?> wildcardClass60 = intList53.getClass();
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, 32);
        histogram7.set((java.util.List<java.lang.Integer>) intList53);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 97);
        int int18 = histogram16.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) ' ');
        util.Histogram histogram7 = new util.Histogram(intArray3, (int) '#');
        histogram7.setWidth(10);
        histogram7.setWidth((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
        util.Histogram histogram16 = new util.Histogram(intArray6, 32, 100);
        int int18 = histogram16.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass8 = floatArray0.getClass();
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode10 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.Erode erode8 = new morphology.Erode(floatArray4);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = erode8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) '#', (int) (short) 0);
        int int4 = 0; // flaky: histogram2.get((int) (byte) 1);
// flaky:         histogram2.setSize(10);
// flaky:         histogram2.setOffset((-1));
        util.Histogram histogram10 = null; // flaky: new util.Histogram(0);
// flaky:         histogram10.setSize((int) (short) 10);
// flaky:         histogram10.setSize((int) (byte) 100);
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
// flaky:         histogram10.set((java.util.List<java.lang.Integer>) intList18);
        util.Histogram histogram23 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram25 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) '4');
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) '#', (int) (byte) 10);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, 32);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, 52);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
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
        histogram7.put(9);
        histogram7.put((int) '4');
        int[] intArray37 = histogram7.getData();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4');
        util.Histogram histogram18 = null; // flaky: new util.Histogram(0);
// flaky:         histogram18.setSize((int) (short) 10);
// flaky:         histogram18.setSize((int) (byte) 100);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
// flaky:         histogram18.set((java.util.List<java.lang.Integer>) intList26);
        util.Histogram histogram31 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, (int) (byte) 100);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList26, 255);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList45);
        util.Histogram histogram49 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) 'a');
        histogram35.set((java.util.List<java.lang.Integer>) intList45);
        java.lang.Class<?> wildcardClass51 = intList45.getClass();
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (short) 100);
        histogram16.set((java.util.List<java.lang.Integer>) intList45);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
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
        util.Histogram histogram24 = new util.Histogram(intArray20, (int) (byte) 10, (int) (byte) 100);
        try {
            util.Histogram histogram26 = null; // flaky: new util.Histogram(intArray20, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setSize(97);
// flaky:         histogram2.setOffset((int) (short) 10);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) ' ');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 35);
        histogram16.setWidth(32);
        histogram16.setOffset(31);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        util.Histogram histogram2 = new util.Histogram(100, (int) (byte) 100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, 32);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = null; // flaky: histogram2.getClass();
// flaky:         histogram2.setSize(97);
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setSize((int) (short) 10);
// flaky:         histogram7.setSize((int) (byte) 100);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
// flaky:         histogram7.set((java.util.List<java.lang.Integer>) intList15);
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) '4', (int) ' ');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) 10);
        histogram22.setSize(35);
        util.Histogram histogram26 = null; // flaky: new util.Histogram(0);
// flaky:         histogram26.setSize((int) (short) 10);
// flaky:         histogram26.setSize((int) (byte) 100);
// flaky:         histogram26.setSize((int) 'a');
        int int34 = 0; // flaky: histogram26.get((int) (short) 0);
        int[] intArray35 = null; // flaky: histogram26.getData();
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
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) ' ');
// flaky:         histogram26.set((java.util.List<java.lang.Integer>) intList45);
        histogram22.set((java.util.List<java.lang.Integer>) intList45);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList45);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
        int[] intArray6 = null; // flaky: histogram1.getData();
        try {
            util.Histogram histogram9 = null; // flaky: new util.Histogram(intArray6, 0, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
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
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList46, 97);
        histogram63.put(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
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
        histogram25.setWidth((int) ' ');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
// flaky:         histogram29.setOffset((int) (byte) 1);
// flaky:         histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
// flaky:         histogram25.set(intArray38);
        util.Histogram histogram41 = null; // flaky: new util.Histogram(0);
// flaky:         histogram41.setSize((int) (short) 10);
// flaky:         histogram41.setSize((int) (byte) 100);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
// flaky:         histogram41.set((java.util.List<java.lang.Integer>) intList49);
        util.Histogram histogram54 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram56 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, (int) '4');
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, (int) '#', (int) (byte) 10);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList49, 32);
        histogram25.set((java.util.List<java.lang.Integer>) intList49);
        histogram25.setWidth((-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
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
            util.Histogram histogram37 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList25, 9, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        float[] floatArray12 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode13 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.Erode erode14 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.Erode erode15 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.Erode erode16 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.Erode erode17 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.Erode erode18 = null; // flaky: new morphology.Erode(floatArray12);
        morphology.BaseMorphology baseMorphology19 = baseMorphology8.compose((morphology.BaseMorphology) erode18);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology19);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        util.Histogram histogram2 = new util.Histogram((int) ' ', (int) (byte) 100);
        histogram2.setSize(3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
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
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList45, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        util.Histogram histogram2 = new util.Histogram(10, 52);
        int[] intArray3 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
// flaky:         histogram1.setOffset((int) ' ');
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setSize(255);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
// flaky:         histogram1.put(0);
// flaky:         histogram1.setWidth((int) (short) 10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        int int1 = util.RGBPixel.getGreen(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        util.Histogram histogram2 = new util.Histogram(9, 2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray6 = new float[] {};
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray6);
        morphology.Erode erode9 = new morphology.Erode(floatArray6);
        morphology.Erode erode10 = new morphology.Erode(floatArray6);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray6);
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray12);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray12);
        morphology.Erode erode16 = new morphology.Erode(floatArray12);
        morphology.Identity identity17 = new morphology.Identity();
        morphology.BaseMorphology baseMorphology18 = erode16.compose((morphology.BaseMorphology) identity17);
        morphology.BaseMorphology baseMorphology19 = convolutionKernel11.compose((morphology.BaseMorphology) identity17);
        float[] floatArray20 = new float[] {};
        morphology.Erode erode21 = new morphology.Erode(floatArray20);
        morphology.BaseMorphology baseMorphology22 = identity17.compose((morphology.BaseMorphology) erode21);
        morphology.BaseMorphology baseMorphology23 = convolutionKernel5.compose((morphology.BaseMorphology) erode21);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(baseMorphology22);
        org.junit.Assert.assertNotNull(baseMorphology23);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) '4', (int) 'a');
        histogram16.setSize(10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
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
        histogram16.put((int) (byte) 100);
        histogram16.setSize(52);
        histogram16.setSize((int) 'a');
        histogram16.setOffset(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
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
        java.lang.Class<?> wildcardClass29 = identity0.getClass();
        java.awt.image.BufferedImage bufferedImage30 = null;
        try {
            java.awt.image.BufferedImage bufferedImage31 = identity0.apply(bufferedImage30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray7);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray23);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology25);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        int int5 = histogram2.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram13 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) 'a');
        util.Histogram histogram16 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) ' ', 100);
        try {
            util.Histogram histogram19 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (byte) 0, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int[] intArray2 = histogram1.getData();
        java.lang.Class<?> wildcardClass3 = histogram1.getClass();
        histogram1.setSize(52);
        util.Histogram histogram8 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram8.setWidth((int) 'a');
        int[] intArray11 = null; // flaky: histogram8.getData();
// flaky:         histogram8.setOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = null; // flaky: histogram8.getClass();
// flaky:         histogram8.setOffset(35);
        int[] intArray17 = null; // flaky: histogram8.getData();
        try {
// flaky:             histogram1.set(intArray17);
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
// flaky:         org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
// flaky:         org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        util.Histogram histogram2 = new util.Histogram(100, (int) (byte) 10);
        histogram2.setSize((int) (short) 10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
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
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) 'a');
        try {
            util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList67, (int) (byte) 1);
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
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
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
// flaky:         histogram1.setSize((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setOffset((int) (byte) 1);
// flaky:         histogram1.setOffset((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray10, (int) 'a');
        util.Histogram histogram15 = null; // flaky: new util.Histogram(intArray10, (int) (short) 10, 52);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(intArray10, 1, (int) (byte) 1);
// flaky:         histogram18.setOffset((int) '4');
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
        int[] intArray8 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setWidth((int) (byte) 0);
// flaky:         histogram2.setWidth((int) (short) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        util.Histogram histogram2 = new util.Histogram((int) '4', (int) '4');
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        histogram2.setWidth(52);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        util.Histogram histogram2 = new util.Histogram(100, 100);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
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
        int int27 = 0; // flaky: histogram24.get((int) '4');
// flaky:         org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
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
        int[] intArray25 = histogram22.getData();
        histogram22.setSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
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
        java.lang.Class<?> wildcardClass30 = intList18.getClass();
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList18, (int) (short) 10, (int) (byte) 100);
        try {
            util.Histogram histogram35 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList18, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
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
        histogram28.setWidth(255);
        util.Histogram histogram32 = new util.Histogram((int) ' ');
        histogram32.setWidth((int) (byte) 100);
        histogram32.setOffset((int) (short) 100);
        util.Histogram histogram38 = null; // flaky: new util.Histogram(0);
// flaky:         histogram38.setSize((int) (short) 10);
// flaky:         histogram38.setSize((int) (byte) 100);
// flaky:         histogram38.setOffset((int) (byte) 1);
// flaky:         histogram38.setOffset((int) '4');
        int[] intArray47 = null; // flaky: histogram38.getData();
// flaky:         histogram32.set(intArray47);
        util.Histogram histogram50 = null; // flaky: new util.Histogram(intArray47, (int) (short) 100);
        util.Histogram histogram52 = null; // flaky: new util.Histogram(intArray47, 97);
        util.Histogram histogram54 = null; // flaky: new util.Histogram(0);
// flaky:         histogram54.setSize((int) (short) 10);
// flaky:         histogram54.setSize((int) (byte) 100);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
// flaky:         histogram54.set((java.util.List<java.lang.Integer>) intList62);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) 'a');
// flaky:         histogram52.set((java.util.List<java.lang.Integer>) intList62);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) (short) 1, 32);
        histogram28.set((java.util.List<java.lang.Integer>) intList62);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList62, (int) '4', 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        util.Histogram histogram2 = new util.Histogram(52, (int) (short) 10);
        histogram2.put((int) (short) 1);
        util.Histogram histogram6 = null; // flaky: new util.Histogram(0);
// flaky:         histogram6.setSize((int) (short) 10);
// flaky:         histogram6.setSize((int) (byte) 100);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
// flaky:         histogram6.set((java.util.List<java.lang.Integer>) intList14);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList14, (int) (short) 10, (int) (byte) 10);
        int[] intArray20 = histogram19.getData();
        histogram19.setWidth(97);
        histogram19.setWidth((int) (byte) 1);
        histogram19.setOffset((int) (byte) 1);
        histogram19.setWidth(100);
        histogram19.setWidth((int) 'a');
        util.Histogram histogram32 = null; // flaky: new util.Histogram(0);
// flaky:         histogram32.setSize((int) (short) 10);
// flaky:         histogram32.setSize((int) (byte) 100);
// flaky:         histogram32.setSize((int) 'a');
        util.Histogram histogram40 = null; // flaky: new util.Histogram(0);
// flaky:         histogram40.setSize((int) (short) 10);
// flaky:         histogram40.setSize((int) (byte) 100);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
// flaky:         histogram40.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram53 = new util.Histogram((java.util.List<java.lang.Integer>) intList48, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram32.set((java.util.List<java.lang.Integer>) intList48);
        util.Histogram histogram56 = null; // flaky: new util.Histogram(0);
// flaky:         histogram56.setSize((int) (short) 10);
// flaky:         histogram56.setSize((int) (byte) 100);
// flaky:         histogram56.setSize((int) 'a');
        util.Histogram histogram64 = null; // flaky: new util.Histogram(0);
// flaky:         histogram64.setSize((int) (short) 10);
// flaky:         histogram64.setSize((int) (byte) 100);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
// flaky:         histogram64.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList72, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram56.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram80 = new util.Histogram((java.util.List<java.lang.Integer>) intList72, 10);
        util.Histogram histogram83 = new util.Histogram((java.util.List<java.lang.Integer>) intList72, 1, (int) '4');
// flaky:         histogram32.set((java.util.List<java.lang.Integer>) intList72);
        util.Histogram histogram87 = new util.Histogram((java.util.List<java.lang.Integer>) intList72, 1, 255);
        util.Histogram histogram89 = new util.Histogram((java.util.List<java.lang.Integer>) intList72, 97);
        histogram19.set((java.util.List<java.lang.Integer>) intList72);
        int[] intArray91 = histogram19.getData();
        histogram19.put((-1));
        int[] intArray94 = histogram19.getData();
        histogram2.set(intArray94);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertNotNull(intArray94);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
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
            util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) ' ');
        util.Histogram histogram7 = new util.Histogram(intArray3, (int) '#');
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray3, 35, (-1));
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray3, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
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
        float[] floatArray22 = new float[] {};
        morphology.Erode erode23 = new morphology.Erode(floatArray22);
        java.lang.Class<?> wildcardClass24 = erode23.getClass();
        morphology.Sobel.Direction direction25 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel26 = new morphology.Sobel(direction25);
        float[] floatArray29 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel30 = null; // flaky: new morphology.ConvolutionKernel(floatArray29);
        float[] floatArray33 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel34 = null; // flaky: new morphology.ConvolutionKernel(floatArray33);
        morphology.BaseMorphology baseMorphology35 = null; // flaky: convolutionKernel30.compose((morphology.BaseMorphology) convolutionKernel34);
        morphology.BaseMorphology baseMorphology36 = sobel26.compose((morphology.BaseMorphology) convolutionKernel30);
        morphology.BaseMorphology baseMorphology37 = erode23.compose((morphology.BaseMorphology) sobel26);
        morphology.BaseMorphology baseMorphology38 = baseMorphology21.compose((morphology.BaseMorphology) erode23);
        java.awt.image.BufferedImage bufferedImage39 = null;
        try {
            java.awt.image.BufferedImage bufferedImage40 = erode23.apply(bufferedImage39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + morphology.Sobel.Direction.UP + "'", direction9.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray17);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(baseMorphology20);
        org.junit.Assert.assertNotNull(baseMorphology21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + morphology.Sobel.Direction.UP + "'", direction25.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray33);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology35);
        org.junit.Assert.assertNotNull(baseMorphology36);
        org.junit.Assert.assertNotNull(baseMorphology37);
        org.junit.Assert.assertNotNull(baseMorphology38);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
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
// flaky:         histogram1.put((int) (byte) -1);
// flaky:         histogram1.setOffset((int) 'a');
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, (int) ' ', (int) (short) -1);
        util.Histogram histogram16 = null; // flaky: new util.Histogram(intArray10, 10, 1);
        util.Histogram histogram18 = null; // flaky: new util.Histogram(intArray10, 255);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (byte) 1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setSize((int) (short) 100);
        int[] intArray13 = new int[] { '#' };
        util.Histogram histogram15 = new util.Histogram(intArray13, (int) 'a');
// flaky:         histogram1.set(intArray13);
// flaky:         histogram1.setWidth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
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
        util.Histogram histogram38 = new util.Histogram(intArray31, 9);
        try {
            util.Histogram histogram41 = null; // flaky: new util.Histogram(intArray31, 100, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int int11 = 0; // flaky: histogram1.get(9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
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
// flaky:         histogram1.put((int) (byte) 0);
// flaky:         histogram1.setSize(100);
        util.Histogram histogram57 = new util.Histogram((int) (byte) 100);
        int[] intArray58 = histogram57.getData();
        util.Histogram histogram60 = new util.Histogram(intArray58, (int) (short) 10);
        util.Histogram histogram63 = new util.Histogram(intArray58, (int) 'a', (int) '4');
// flaky:         histogram1.set(intArray58);
        try {
            util.Histogram histogram67 = null; // flaky: new util.Histogram(intArray58, (int) (byte) 0, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray58);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        morphology.Threshold threshold1 = new morphology.Threshold((float) (short) 1);
        morphology.Sobel.Direction direction2 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel3 = new morphology.Sobel(direction2);
        morphology.Sobel sobel4 = new morphology.Sobel(direction2);
        java.lang.Class<?> wildcardClass5 = direction2.getClass();
        morphology.Sobel sobel6 = new morphology.Sobel(direction2);
        morphology.Sobel sobel7 = new morphology.Sobel(direction2);
        morphology.Sobel sobel8 = new morphology.Sobel(direction2);
        morphology.Sobel sobel9 = new morphology.Sobel(direction2);
        morphology.BaseMorphology baseMorphology10 = threshold1.compose((morphology.BaseMorphology) sobel9);
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction2.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(baseMorphology10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 100, (int) (byte) 1);
        int int16 = histogram14.get((int) '#');
        histogram14.setSize(31);
        int[] intArray19 = histogram14.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
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
        histogram42.setWidth((int) (byte) -1);
        try {
            histogram42.put(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, 100);
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
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
            java.awt.image.BufferedImage bufferedImage30 = identity0.apply(bufferedImage29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray7);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology12);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray23);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology25);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology27);
        org.junit.Assert.assertNotNull(baseMorphology28);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
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
        util.Histogram histogram23 = new util.Histogram(1, (int) (short) 100);
        int[] intArray24 = histogram23.getData();
        util.Histogram histogram26 = new util.Histogram(intArray24, (int) ' ');
        histogram18.set(intArray24);
        util.Histogram histogram30 = new util.Histogram(intArray24, 10, (int) (short) 1);
        util.Histogram histogram33 = new util.Histogram((int) 'a', (int) (byte) 100);
        util.Histogram histogram36 = new util.Histogram(1, (int) (short) 100);
        int[] intArray37 = histogram36.getData();
        util.Histogram histogram39 = new util.Histogram(intArray37, (int) '#');
        histogram33.set(intArray37);
        histogram30.set(intArray37);
        java.lang.Class<?> wildcardClass42 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
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
        util.Histogram histogram46 = new util.Histogram(intArray41, (int) (byte) 10);
        util.Histogram histogram49 = new util.Histogram(intArray41, (int) (byte) 10, 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth(1);
// flaky:         histogram1.setWidth((int) '4');
        int int13 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth((int) '4');
// flaky:         histogram1.setSize((int) '4');
// flaky:         histogram1.setWidth((int) (byte) 0);
        int int21 = 0; // flaky: histogram1.get((int) ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
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
        java.awt.image.BufferedImage bufferedImage19 = null;
        try {
            java.awt.image.BufferedImage bufferedImage20 = erode17.apply(bufferedImage19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(baseMorphology9);
        org.junit.Assert.assertNotNull(baseMorphology10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(baseMorphology18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        util.Histogram histogram2 = new util.Histogram(52, (int) (short) 10);
        histogram2.put((int) (short) 1);
        util.Histogram histogram7 = new util.Histogram((int) (byte) 10, (int) (short) 1);
        int[] intArray8 = histogram7.getData();
        histogram2.set(intArray8);
        util.Histogram histogram11 = new util.Histogram(intArray8, (int) '4');
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        util.Histogram histogram13 = new util.Histogram((int) ' ');
        histogram13.put((int) (byte) 10);
        util.Histogram histogram17 = new util.Histogram((int) ' ');
        int[] intArray18 = histogram17.getData();
        histogram13.set(intArray18);
        util.Histogram histogram22 = null; // flaky: new util.Histogram(intArray18, 52, (-1));
        util.Histogram histogram24 = new util.Histogram(intArray18, (int) '4');
        histogram2.set(intArray18);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        java.util.List<java.lang.Integer> intList0 = null;
        try {
            util.Histogram histogram3 = new util.Histogram(intList0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
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
        morphology.Sobel.Direction direction27 = morphology.Sobel.Direction.RIGHT;
        morphology.Sobel sobel28 = new morphology.Sobel(direction27);
        morphology.Sobel sobel29 = new morphology.Sobel(direction27);
        morphology.Sobel sobel30 = new morphology.Sobel(direction27);
        morphology.Sobel sobel31 = new morphology.Sobel(direction27);
        morphology.BaseMorphology baseMorphology32 = null; // flaky: baseMorphology26.compose((morphology.BaseMorphology) sobel31);
        java.awt.image.BufferedImage bufferedImage33 = null;
        try {
            java.awt.image.BufferedImage bufferedImage34 = sobel31.apply(bufferedImage33);
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
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + morphology.Sobel.Direction.RIGHT + "'", direction27.equals(morphology.Sobel.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(baseMorphology32);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        float[] floatArray4 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode5 = new morphology.Erode(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray4);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = convolutionKernel8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        java.lang.Class<?> wildcardClass6 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
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
        util.Histogram histogram55 = new util.Histogram(intArray49, (int) (byte) 10);
        util.Histogram histogram57 = null; // flaky: new util.Histogram(0);
// flaky:         histogram57.setSize((int) (short) 10);
// flaky:         histogram57.setSize((int) (byte) 100);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
// flaky:         histogram57.set((java.util.List<java.lang.Integer>) intList65);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) (byte) 100);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, 255);
        util.Histogram histogram76 = null; // flaky: new util.Histogram(0);
// flaky:         histogram76.setSize((int) (short) 10);
// flaky:         histogram76.setSize((int) (byte) 100);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
// flaky:         histogram76.set((java.util.List<java.lang.Integer>) intList84);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList84, (int) 'a');
        histogram74.set((java.util.List<java.lang.Integer>) intList84);
        java.lang.Class<?> wildcardClass90 = intList84.getClass();
        histogram55.set((java.util.List<java.lang.Integer>) intList84);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        util.Histogram histogram2 = new util.Histogram(10, (int) (byte) 100);
        util.Histogram histogram4 = null; // flaky: new util.Histogram(0);
// flaky:         histogram4.setSize((int) (short) 10);
// flaky:         histogram4.setSize((int) (byte) 100);
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
// flaky:         histogram4.set((java.util.List<java.lang.Integer>) intList12);
        util.Histogram histogram17 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram19 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '4');
        util.Histogram histogram22 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) '#', (int) (byte) 10);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, 32);
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList12, (int) (short) 100);
        histogram2.set((java.util.List<java.lang.Integer>) intList12);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
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
        util.Histogram histogram19 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 100);
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) '4');
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) '#', (int) (byte) 10);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 100, 100);
        histogram42.setOffset(97);
        int[] intArray45 = histogram42.getData();
// flaky:         histogram19.set(intArray45);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        morphology.Threshold threshold1 = new morphology.Threshold((float) '4');
        java.awt.image.BufferedImage bufferedImage2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = threshold1.apply(bufferedImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        util.Histogram histogram2 = new util.Histogram((int) (short) 10, (int) (byte) 1);
        util.Histogram histogram4 = new util.Histogram((int) ' ');
        histogram4.put((int) (byte) 10);
        util.Histogram histogram8 = new util.Histogram((int) ' ');
        int[] intArray9 = histogram8.getData();
        histogram4.set(intArray9);
        histogram2.set(intArray9);
        try {
            util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray9, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
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
        try {
            util.Histogram histogram32 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList21, 100, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
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
        java.lang.Class<?> wildcardClass57 = histogram56.getClass();
        histogram56.setSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) '4');
        int[] intArray10 = null; // flaky: histogram1.getData();
// flaky:         histogram1.put(52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
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
        java.awt.image.BufferedImage bufferedImage14 = null;
        try {
            java.awt.image.BufferedImage bufferedImage15 = convolutionKernel12.apply(bufferedImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(baseMorphology13);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
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
        float[] floatArray20 = new float[] {};
        morphology.Erode erode21 = new morphology.Erode(floatArray20);
        morphology.Erode erode22 = new morphology.Erode(floatArray20);
        morphology.Erode erode23 = new morphology.Erode(floatArray20);
        morphology.Erode erode24 = new morphology.Erode(floatArray20);
        float[] floatArray27 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel28 = null; // flaky: new morphology.ConvolutionKernel(floatArray27);
        float[] floatArray31 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel32 = null; // flaky: new morphology.ConvolutionKernel(floatArray31);
        morphology.BaseMorphology baseMorphology33 = null; // flaky: convolutionKernel28.compose((morphology.BaseMorphology) convolutionKernel32);
        float[] floatArray34 = new float[] {};
        morphology.Erode erode35 = new morphology.Erode(floatArray34);
        morphology.ConvolutionKernel convolutionKernel36 = new morphology.ConvolutionKernel(floatArray34);
        morphology.ConvolutionKernel convolutionKernel37 = new morphology.ConvolutionKernel(floatArray34);
        morphology.BaseMorphology baseMorphology38 = null; // flaky: convolutionKernel28.compose((morphology.BaseMorphology) convolutionKernel37);
        morphology.BaseMorphology baseMorphology39 = erode24.compose((morphology.BaseMorphology) convolutionKernel28);
        morphology.BaseMorphology baseMorphology40 = threshold8.compose(baseMorphology39);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + morphology.Sobel.Direction.DOWN + "'", direction9.equals(morphology.Sobel.Direction.DOWN));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(baseMorphology18);
        org.junit.Assert.assertNotNull(baseMorphology19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray31);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology33);
        org.junit.Assert.assertNotNull(floatArray34);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology38);
        org.junit.Assert.assertNotNull(baseMorphology39);
        org.junit.Assert.assertNotNull(baseMorphology40);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
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
        java.awt.image.BufferedImage bufferedImage30 = null;
        try {
            java.awt.image.BufferedImage bufferedImage31 = erode2.apply(bufferedImage30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
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
        int[] intArray25 = histogram22.getData();
        util.Histogram histogram27 = new util.Histogram(intArray25, (int) '#');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
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
            util.Histogram histogram20 = null; // flaky: new util.Histogram(intArray16, (int) (short) 0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setOffset((int) '#');
// flaky:         histogram1.setSize((int) (byte) 0);
// flaky:         histogram1.setSize((int) (short) 10);
        util.Histogram histogram11 = null; // flaky: new util.Histogram(0);
// flaky:         histogram11.setSize((int) (short) 10);
// flaky:         histogram11.setSize((int) (byte) 100);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
// flaky:         histogram11.set((java.util.List<java.lang.Integer>) intList19);
        util.Histogram histogram24 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram26 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, (int) (byte) 100);
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList19, 255);
        util.Histogram histogram30 = null; // flaky: new util.Histogram(0);
// flaky:         histogram30.setSize((int) (short) 10);
// flaky:         histogram30.setSize((int) (byte) 100);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
// flaky:         histogram30.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList38, (int) 'a');
        histogram28.set((java.util.List<java.lang.Integer>) intList38);
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
// flaky:         histogram45.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) (short) 10, (int) (byte) 10);
        histogram28.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) (byte) 10);
        util.Histogram histogram64 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) (short) 100, (int) (short) 100);
        util.Histogram histogram66 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) '4');
        try {
// flaky:             histogram1.set((java.util.List<java.lang.Integer>) intList53);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
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
        histogram1.setOffset((int) (short) 1);
        int int23 = histogram1.get(10);
        histogram1.setWidth(10);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
        int[] intArray12 = null; // flaky: histogram1.getData();
        util.Histogram histogram14 = new util.Histogram((int) (byte) 100);
        int[] intArray15 = histogram14.getData();
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram30 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) (byte) 10);
        int[] intArray33 = histogram32.getData();
        util.Histogram histogram35 = null; // flaky: new util.Histogram(0);
// flaky:         histogram35.setSize((int) (short) 10);
// flaky:         histogram35.setSize((int) (byte) 100);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
// flaky:         histogram35.set((java.util.List<java.lang.Integer>) intList43);
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (short) 100, (int) (byte) 1);
        util.Histogram histogram50 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) (byte) 10);
        histogram32.set((java.util.List<java.lang.Integer>) intList43);
        histogram14.set((java.util.List<java.lang.Integer>) intList43);
        java.lang.Class<?> wildcardClass53 = intList43.getClass();
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList43);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
        int[] intArray3 = null; // flaky: histogram2.getData();
        try {
            int int5 = 0; // flaky: histogram2.get((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
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
        histogram25.setWidth((int) ' ');
        util.Histogram histogram29 = null; // flaky: new util.Histogram(0);
// flaky:         histogram29.setSize((int) (short) 10);
// flaky:         histogram29.setSize((int) (byte) 100);
// flaky:         histogram29.setOffset((int) (byte) 1);
// flaky:         histogram29.setOffset((int) '4');
        int[] intArray38 = null; // flaky: histogram29.getData();
// flaky:         histogram25.set(intArray38);
        util.Histogram histogram41 = new util.Histogram((int) ' ');
        histogram41.put((int) (byte) 10);
        util.Histogram histogram45 = new util.Histogram((int) ' ');
        int[] intArray46 = histogram45.getData();
        histogram41.set(intArray46);
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
        util.Histogram histogram55 = null; // flaky: new util.Histogram(0);
// flaky:         histogram55.setSize((int) (short) 10);
// flaky:         histogram55.setSize((int) (byte) 100);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
// flaky:         histogram55.set((java.util.List<java.lang.Integer>) intList63);
        util.Histogram histogram67 = new util.Histogram((java.util.List<java.lang.Integer>) intList63, (int) 'a');
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList63, 97, 255);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList63);
        util.Histogram histogram73 = null; // flaky: new util.Histogram(0);
// flaky:         histogram73.setSize((int) (short) 10);
// flaky:         histogram73.setSize((int) (byte) 100);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
// flaky:         histogram73.set((java.util.List<java.lang.Integer>) intList81);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList81, (int) 'a');
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList81, (int) '4', (int) 'a');
        int[] intArray89 = histogram88.getData();
        util.Histogram histogram91 = new util.Histogram(intArray89, (int) (short) 10);
// flaky:         histogram49.set(intArray89);
        histogram41.set(intArray89);
        histogram25.set(intArray89);
        histogram25.put(31);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(intArray89);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
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
        util.Histogram histogram27 = new util.Histogram((int) (byte) 100);
        int[] intArray28 = histogram27.getData();
        util.Histogram histogram30 = new util.Histogram(intArray28, (int) (short) 10);
        histogram14.set(intArray28);
        util.Histogram histogram34 = new util.Histogram(intArray28, 52, (int) ' ');
        util.Histogram histogram36 = null; // flaky: new util.Histogram(0);
// flaky:         histogram36.setSize((int) '4');
// flaky:         histogram36.setWidth((int) (byte) 0);
// flaky:         histogram36.setOffset((int) ' ');
// flaky:         histogram36.setOffset((int) (byte) 1);
        int[] intArray45 = null; // flaky: histogram36.getData();
// flaky:         histogram34.set(intArray45);
        util.Histogram histogram48 = null; // flaky: new util.Histogram(intArray45, 35);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray28);
// flaky:         org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        morphology.Threshold threshold1 = new morphology.Threshold(0.0f);
        float[] floatArray6 = new float[] { 1, 0, 1L, (byte) -1 };
        morphology.Erode erode7 = new morphology.Erode(floatArray6);
        morphology.BaseMorphology baseMorphology8 = threshold1.compose((morphology.BaseMorphology) erode7);
        java.lang.Class<?> wildcardClass9 = erode7.getClass();
        morphology.Threshold threshold11 = new morphology.Threshold((float) 97);
        morphology.BaseMorphology baseMorphology12 = erode7.compose((morphology.BaseMorphology) threshold11);
        java.awt.image.BufferedImage bufferedImage13 = null;
        try {
            java.awt.image.BufferedImage bufferedImage14 = threshold11.apply(bufferedImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(baseMorphology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(baseMorphology12);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(0, (int) (short) -1);
// flaky:         histogram2.setWidth((int) 'a');
        int[] intArray5 = null; // flaky: histogram2.getData();
// flaky:         histogram2.setOffset((int) (byte) 10);
// flaky:         histogram2.setSize((int) (short) 0);
// flaky:         histogram2.setWidth(255);
        int[] intArray12 = null; // flaky: histogram2.getData();
        util.Histogram histogram14 = null; // flaky: new util.Histogram(0);
// flaky:         histogram14.setSize((int) (short) 10);
// flaky:         histogram14.setSize((int) (byte) 100);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
// flaky:         histogram14.set((java.util.List<java.lang.Integer>) intList22);
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList22, (int) (short) 10, (int) (byte) 10);
        int[] intArray28 = histogram27.getData();
        histogram27.setWidth(97);
        histogram27.setWidth((int) (byte) 1);
        histogram27.setOffset((int) (byte) 1);
        histogram27.setWidth(100);
        histogram27.setWidth((int) 'a');
        util.Histogram histogram40 = null; // flaky: new util.Histogram(0);
// flaky:         histogram40.setSize((int) (short) 10);
// flaky:         histogram40.setSize((int) (byte) 100);
// flaky:         histogram40.setSize((int) 'a');
        util.Histogram histogram48 = null; // flaky: new util.Histogram(0);
// flaky:         histogram48.setSize((int) (short) 10);
// flaky:         histogram48.setSize((int) (byte) 100);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
// flaky:         histogram48.set((java.util.List<java.lang.Integer>) intList56);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList56, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram40.set((java.util.List<java.lang.Integer>) intList56);
        util.Histogram histogram64 = null; // flaky: new util.Histogram(0);
// flaky:         histogram64.setSize((int) (short) 10);
// flaky:         histogram64.setSize((int) (byte) 100);
// flaky:         histogram64.setSize((int) 'a');
        util.Histogram histogram72 = null; // flaky: new util.Histogram(0);
// flaky:         histogram72.setSize((int) (short) 10);
// flaky:         histogram72.setSize((int) (byte) 100);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
// flaky:         histogram72.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram85 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram64.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram88 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 10);
        util.Histogram histogram91 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 1, (int) '4');
// flaky:         histogram40.set((java.util.List<java.lang.Integer>) intList80);
        util.Histogram histogram95 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 1, 255);
        util.Histogram histogram97 = new util.Histogram((java.util.List<java.lang.Integer>) intList80, 97);
        histogram27.set((java.util.List<java.lang.Integer>) intList80);
        try {
// flaky:             histogram2.set((java.util.List<java.lang.Integer>) intList80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
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
        try {
            util.Histogram histogram28 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList15, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        util.Histogram histogram2 = null; // flaky: new util.Histogram((int) (byte) 10, 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        util.Histogram histogram2 = new util.Histogram(3, (int) (short) 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
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
        int[] intArray29 = histogram28.getData();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        util.Histogram histogram1 = new util.Histogram((int) 'a');
        histogram1.setSize((int) (byte) 10);
        histogram1.setOffset((int) (byte) 10);
        try {
            int int7 = histogram1.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
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
        util.Histogram histogram54 = new util.Histogram(intArray45, 32, (int) '4');
        util.Histogram histogram56 = new util.Histogram(intArray45, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
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
            util.Histogram histogram55 = null; // flaky: new util.Histogram(intArray49, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
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
        int[] intArray29 = histogram2.getData();
        histogram2.setOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
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
        histogram14.setSize(2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        histogram2.put((int) (byte) 1);
        histogram2.setOffset((int) (short) -1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
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
        try {
            util.Histogram histogram40 = null; // flaky: new util.Histogram(intArray37, 97, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        int[] intArray8 = null; // flaky: histogram1.getData();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray8, (int) (short) 1);
        int[] intArray11 = null; // flaky: histogram10.getData();
// flaky:         org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
            util.Histogram histogram38 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 10, (int) (short) 1);
        int[] intArray3 = histogram2.getData();
        histogram2.setOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        util.Histogram histogram2 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray3 = histogram2.getData();
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        util.Histogram histogram11 = new util.Histogram((java.util.List<java.lang.Integer>) intList7, (int) '#', (int) (byte) 100);
        util.Histogram histogram13 = null; // flaky: new util.Histogram(0);
// flaky:         histogram13.setSize((int) (short) 10);
// flaky:         histogram13.setSize((int) (byte) 100);
// flaky:         histogram13.setSize((int) 'a');
        util.Histogram histogram21 = null; // flaky: new util.Histogram(0);
// flaky:         histogram21.setSize((int) (short) 10);
// flaky:         histogram21.setSize((int) (byte) 100);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
// flaky:         histogram21.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram13.set((java.util.List<java.lang.Integer>) intList29);
        histogram11.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, 97);
        histogram2.set((java.util.List<java.lang.Integer>) intList29);
        util.Histogram histogram42 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 10, (int) (short) 1);
        util.Histogram histogram45 = new util.Histogram((java.util.List<java.lang.Integer>) intList29, (int) (short) 1, (int) (short) 100);
        int[] intArray46 = histogram45.getData();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray46);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        int int3 = histogram1.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
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
        histogram14.put((-1));
        int[] intArray89 = histogram14.getData();
        histogram14.setOffset(100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNotNull(intArray89);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass3 = floatArray0.getClass();
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        morphology.Erode erode5 = new morphology.Erode(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = histogram2.getClass();
        histogram2.setWidth((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode10 = null; // flaky: new morphology.Erode(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        util.Histogram histogram2 = new util.Histogram((int) (byte) 1, (int) ' ');
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
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
        util.Histogram histogram19 = new util.Histogram(intArray17, (int) (short) 10);
        util.Histogram histogram21 = new util.Histogram((int) (byte) 100);
        int[] intArray22 = histogram21.getData();
        util.Histogram histogram24 = new util.Histogram((int) (byte) 100);
        int[] intArray25 = histogram24.getData();
        histogram21.set(intArray25);
        util.Histogram histogram28 = new util.Histogram(100);
        util.Histogram histogram30 = new util.Histogram((int) ' ');
        histogram30.put((int) (byte) 10);
        util.Histogram histogram34 = new util.Histogram((int) ' ');
        int[] intArray35 = histogram34.getData();
        histogram30.set(intArray35);
        util.Histogram histogram39 = null; // flaky: new util.Histogram(intArray35, 52, (-1));
        util.Histogram histogram42 = new util.Histogram(intArray35, (int) (byte) 100, 1);
        util.Histogram histogram44 = null; // flaky: new util.Histogram(0);
// flaky:         histogram44.setSize((int) (short) 10);
// flaky:         histogram44.setSize((int) (byte) 100);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
// flaky:         histogram44.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram57 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram59 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) (byte) 100);
        util.Histogram histogram61 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, 255);
        util.Histogram histogram63 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) ' ');
        util.Histogram histogram65 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) '4');
        histogram42.set((java.util.List<java.lang.Integer>) intList52);
        histogram28.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram69 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, 32);
        histogram21.set((java.util.List<java.lang.Integer>) intList52);
        util.Histogram histogram72 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) '#');
        histogram19.set((java.util.List<java.lang.Integer>) intList52);
        java.lang.Class<?> wildcardClass74 = intList52.getClass();
        util.Histogram histogram77 = new util.Histogram((java.util.List<java.lang.Integer>) intList52, (int) 'a', 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
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
        util.Histogram histogram20 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
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
        util.Histogram histogram89 = new util.Histogram(intArray86, 52, 35);
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        util.Histogram histogram2 = new util.Histogram(1, (int) (short) 100);
        int[] intArray3 = histogram2.getData();
        util.Histogram histogram5 = new util.Histogram(intArray3, (int) '#');
        int[] intArray6 = histogram5.getData();
        util.Histogram histogram8 = new util.Histogram(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        util.Histogram histogram2 = new util.Histogram(52, (int) (byte) 10);
        histogram2.setWidth(10);
        util.Histogram histogram7 = new util.Histogram((int) (short) 10, (int) (short) 10);
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
        util.Histogram histogram33 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 97);
        histogram7.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) ' ');
        util.Histogram histogram38 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, 35);
        histogram2.set((java.util.List<java.lang.Integer>) intList23);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        util.Histogram histogram2 = new util.Histogram(52, 100);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
// flaky:         histogram1.set((java.util.List<java.lang.Integer>) intList9);
        util.Histogram histogram14 = new util.Histogram((java.util.List<java.lang.Integer>) intList9, (int) (short) 10, (int) (byte) 10);
        histogram14.setOffset(10);
        int[] intArray17 = histogram14.getData();
        util.Histogram histogram19 = null; // flaky: new util.Histogram(0);
// flaky:         histogram19.setSize((int) (short) 10);
// flaky:         histogram19.setSize((int) (byte) 100);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList27);
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) (short) 10, (int) (byte) 10);
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) '4');
        util.Histogram histogram37 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, (int) '#', (int) (byte) 10);
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 32);
        util.Histogram histogram41 = new util.Histogram((java.util.List<java.lang.Integer>) intList27, 9);
        histogram14.set((java.util.List<java.lang.Integer>) intList27);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setWidth(0);
// flaky:         histogram1.setSize((int) 'a');
// flaky:         histogram1.setWidth((int) (byte) 100);
        int[] intArray8 = null; // flaky: histogram1.getData();
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray8, (int) (short) 1);
        try {
            util.Histogram histogram12 = null; // flaky: new util.Histogram(intArray8, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
// flaky:         org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
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
        int int35 = histogram16.get(1);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
// flaky:         histogram37.setSize((int) 'a');
        int int45 = 0; // flaky: histogram37.get((int) (short) 0);
        int[] intArray46 = null; // flaky: histogram37.getData();
        util.Histogram histogram49 = null; // flaky: new util.Histogram(intArray46, 35, (int) ' ');
        java.lang.Class<?> wildcardClass50 = null; // flaky: intArray46.getClass();
// flaky:         histogram16.set(intArray46);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
// flaky:         histogram1.setWidth(52);
        int[] intArray12 = null; // flaky: histogram1.getData();
// flaky:         histogram1.setSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) (short) 10);
// flaky:         histogram1.setSize((int) (byte) 100);
// flaky:         histogram1.setSize((int) 'a');
        int int9 = 0; // flaky: histogram1.get((int) (short) 0);
        int[] intArray10 = null; // flaky: histogram1.getData();
        util.Histogram histogram13 = null; // flaky: new util.Histogram(intArray10, 35, (int) ' ');
// flaky:         histogram13.setOffset(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        util.Histogram histogram1 = null; // flaky: new util.Histogram(0);
// flaky:         histogram1.setSize((int) '4');
        int[] intArray4 = null; // flaky: histogram1.getData();
        util.Histogram histogram6 = null; // flaky: new util.Histogram(intArray4, (int) (short) 1);
// flaky:         histogram6.setOffset((int) (short) 0);
// flaky:         histogram6.setSize((int) (byte) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        util.Histogram histogram2 = new util.Histogram((int) (short) 1, (int) '4');
        int[] intArray3 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
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
        util.Histogram histogram28 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
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
        util.Histogram histogram23 = new util.Histogram(1, (int) (short) 100);
        int[] intArray24 = histogram23.getData();
        util.Histogram histogram26 = new util.Histogram(intArray24, (int) ' ');
        histogram18.set(intArray24);
        util.Histogram histogram30 = new util.Histogram(intArray24, 2, (int) (byte) 1);
        histogram30.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        util.Histogram histogram2 = new util.Histogram((int) '4', 32);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
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
        histogram56.setSize((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
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
// flaky:         histogram1.put((int) (byte) -1);
// flaky:         histogram1.setOffset((int) (byte) 10);
        try {
// flaky:             histogram1.put((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
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
        int[] intArray30 = histogram2.getData();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
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
        util.Histogram histogram35 = null; // flaky: new util.Histogram(intArray29, (int) (short) 100);
// flaky:         histogram35.setSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode6 = new morphology.Erode(floatArray0);
        morphology.Erode erode7 = new morphology.Erode(floatArray0);
        morphology.Erode erode8 = new morphology.Erode(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
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
        morphology.Sobel sobel10 = new morphology.Sobel(direction0);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = sobel10.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.UP + "'", direction0.equals(morphology.Sobel.Direction.UP));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
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
        int int22 = histogram15.get((int) '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        util.Histogram histogram2 = new util.Histogram(31, 97);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
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
        util.Histogram histogram39 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) (short) 10, 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        util.Histogram histogram47 = new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) '#', (int) (byte) 100);
        util.Histogram histogram49 = null; // flaky: new util.Histogram(0);
// flaky:         histogram49.setSize((int) (short) 10);
// flaky:         histogram49.setSize((int) (byte) 100);
// flaky:         histogram49.setSize((int) 'a');
        util.Histogram histogram57 = null; // flaky: new util.Histogram(0);
// flaky:         histogram57.setSize((int) (short) 10);
// flaky:         histogram57.setSize((int) (byte) 100);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
// flaky:         histogram57.set((java.util.List<java.lang.Integer>) intList65);
        util.Histogram histogram70 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram49.set((java.util.List<java.lang.Integer>) intList65);
        histogram47.set((java.util.List<java.lang.Integer>) intList65);
        util.Histogram histogram74 = new util.Histogram((java.util.List<java.lang.Integer>) intList65, (int) ' ');
        histogram39.set((java.util.List<java.lang.Integer>) intList65);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
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
            util.Histogram histogram57 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList43, (int) ' ', (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        float[] floatArray5 = new float[] { 'a', 1, (short) -1, 100, '4' };
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray5);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray5);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray5);
        java.lang.Class<?> wildcardClass9 = null; // flaky: erode8.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        util.Histogram histogram1 = new util.Histogram((int) ' ');
        histogram1.put((int) (byte) 10);
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        int[] intArray6 = histogram5.getData();
        histogram1.set(intArray6);
        util.Histogram histogram10 = null; // flaky: new util.Histogram(intArray6, 52, (-1));
        util.Histogram histogram13 = new util.Histogram(intArray6, (int) (byte) 100, 1);
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
        util.Histogram histogram34 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) ' ');
        util.Histogram histogram36 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) '4');
        histogram13.set((java.util.List<java.lang.Integer>) intList23);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList23, (int) (byte) 100, (int) ' ');
        try {
            util.Histogram histogram43 = null; // flaky: new util.Histogram((java.util.List<java.lang.Integer>) intList23, 0, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        util.Histogram histogram2 = null; // flaky: new util.Histogram(255, (int) (byte) 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
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
        int int25 = histogram23.get((int) (byte) 0);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) '4', (int) ' ');
        histogram23.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) '4');
        int int45 = histogram43.get(3);
        int[] intArray46 = histogram43.getData();
        int[] intArray47 = histogram43.getData();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
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
        util.Histogram histogram55 = new util.Histogram((java.util.List<java.lang.Integer>) intList41, 35);
        histogram55.setSize(0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.Erode erode2 = new morphology.Erode(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray10 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode11 = null; // flaky: new morphology.Erode(floatArray10);
        morphology.Erode erode12 = null; // flaky: new morphology.Erode(floatArray10);
        float[] floatArray13 = new float[] {};
        morphology.Erode erode14 = new morphology.Erode(floatArray13);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray13);
        morphology.Erode erode16 = new morphology.Erode(floatArray13);
        morphology.BaseMorphology baseMorphology17 = null; // flaky: erode12.compose((morphology.BaseMorphology) erode16);
        morphology.Threshold threshold19 = new morphology.Threshold((float) 10L);
        morphology.BaseMorphology baseMorphology20 = null; // flaky: baseMorphology17.compose((morphology.BaseMorphology) threshold19);
        morphology.Threshold threshold22 = new morphology.Threshold((float) 0L);
        morphology.BaseMorphology baseMorphology23 = null; // flaky: baseMorphology20.compose((morphology.BaseMorphology) threshold22);
        morphology.BaseMorphology baseMorphology24 = convolutionKernel6.compose(baseMorphology20);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray13);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology17);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology20);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology23);
        org.junit.Assert.assertNotNull(baseMorphology24);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        float[] floatArray6 = new float[] { (-1.0f), (-1L), 'a', (-1), (-1.0f), (byte) 100 };
        morphology.Erode erode7 = null; // flaky: new morphology.Erode(floatArray6);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        float[] floatArray3 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode4 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode5 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode6 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray3);
        morphology.Erode erode8 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode9 = null; // flaky: new morphology.Erode(floatArray3);
        morphology.Erode erode10 = null; // flaky: new morphology.Erode(floatArray3);
        java.awt.image.BufferedImage bufferedImage11 = null;
        try {
            java.awt.image.BufferedImage bufferedImage12 = erode10.apply(bufferedImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
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
        util.Histogram histogram27 = new util.Histogram((java.util.List<java.lang.Integer>) intList15, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
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
        histogram14.setWidth((int) (byte) 1);
        util.Histogram histogram26 = new util.Histogram(255, (int) (byte) 100);
        int[] intArray27 = histogram26.getData();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList31, (int) '#', (int) (byte) 100);
        util.Histogram histogram37 = null; // flaky: new util.Histogram(0);
// flaky:         histogram37.setSize((int) (short) 10);
// flaky:         histogram37.setSize((int) (byte) 100);
// flaky:         histogram37.setSize((int) 'a');
        util.Histogram histogram45 = null; // flaky: new util.Histogram(0);
// flaky:         histogram45.setSize((int) (short) 10);
// flaky:         histogram45.setSize((int) (byte) 100);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
// flaky:         histogram45.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram58 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, (int) (short) 10, (int) (byte) 10);
// flaky:         histogram37.set((java.util.List<java.lang.Integer>) intList53);
        histogram35.set((java.util.List<java.lang.Integer>) intList53);
        util.Histogram histogram62 = new util.Histogram((java.util.List<java.lang.Integer>) intList53, 97);
        histogram26.set((java.util.List<java.lang.Integer>) intList53);
        histogram14.set((java.util.List<java.lang.Integer>) intList53);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        morphology.Sobel.Direction direction0 = morphology.Sobel.Direction.LEFT;
        morphology.Sobel sobel1 = new morphology.Sobel(direction0);
        morphology.Sobel sobel2 = new morphology.Sobel(direction0);
        java.lang.Class<?> wildcardClass3 = direction0.getClass();
        morphology.Sobel sobel4 = new morphology.Sobel(direction0);
        morphology.Sobel sobel5 = new morphology.Sobel(direction0);
        morphology.Sobel sobel6 = new morphology.Sobel(direction0);
        morphology.Sobel sobel7 = new morphology.Sobel(direction0);
        morphology.Sobel sobel8 = new morphology.Sobel(direction0);
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + morphology.Sobel.Direction.LEFT + "'", direction0.equals(morphology.Sobel.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        float[] floatArray1 = new float[] { 0L };
        morphology.Erode erode2 = new morphology.Erode(floatArray1);
        morphology.ConvolutionKernel convolutionKernel3 = new morphology.ConvolutionKernel(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray1);
        morphology.Erode erode6 = new morphology.Erode(floatArray1);
        float[] floatArray11 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray11);
        morphology.Erode erode13 = new morphology.Erode(floatArray11);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray11);
        float[] floatArray15 = new float[] {};
        morphology.Erode erode16 = new morphology.Erode(floatArray15);
        java.lang.Class<?> wildcardClass17 = erode16.getClass();
        morphology.Sobel.Direction direction18 = morphology.Sobel.Direction.UP;
        morphology.Sobel sobel19 = new morphology.Sobel(direction18);
        float[] floatArray22 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel23 = null; // flaky: new morphology.ConvolutionKernel(floatArray22);
        float[] floatArray26 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel27 = null; // flaky: new morphology.ConvolutionKernel(floatArray26);
        morphology.BaseMorphology baseMorphology28 = null; // flaky: convolutionKernel23.compose((morphology.BaseMorphology) convolutionKernel27);
        morphology.BaseMorphology baseMorphology29 = sobel19.compose((morphology.BaseMorphology) convolutionKernel23);
        morphology.BaseMorphology baseMorphology30 = erode16.compose((morphology.BaseMorphology) sobel19);
        float[] floatArray33 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel34 = null; // flaky: new morphology.ConvolutionKernel(floatArray33);
        float[] floatArray37 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel38 = null; // flaky: new morphology.ConvolutionKernel(floatArray37);
        float[] floatArray41 = new float[] { 'a', (byte) 0 };
        morphology.ConvolutionKernel convolutionKernel42 = null; // flaky: new morphology.ConvolutionKernel(floatArray41);
        morphology.BaseMorphology baseMorphology43 = null; // flaky: convolutionKernel38.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology44 = null; // flaky: convolutionKernel34.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology45 = sobel19.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology46 = convolutionKernel14.compose((morphology.BaseMorphology) convolutionKernel42);
        morphology.BaseMorphology baseMorphology47 = erode6.compose(baseMorphology46);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + morphology.Sobel.Direction.UP + "'", direction18.equals(morphology.Sobel.Direction.UP));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray26);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology28);
        org.junit.Assert.assertNotNull(baseMorphology29);
        org.junit.Assert.assertNotNull(baseMorphology30);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray41);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology43);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology44);
        org.junit.Assert.assertNotNull(baseMorphology45);
        org.junit.Assert.assertNotNull(baseMorphology46);
        org.junit.Assert.assertNotNull(baseMorphology47);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        float[] floatArray6 = new float[] { 0L, 97, (byte) -1, 10.0f, (byte) 10, 1 };
        morphology.ConvolutionKernel convolutionKernel7 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        morphology.ConvolutionKernel convolutionKernel8 = null; // flaky: new morphology.ConvolutionKernel(floatArray6);
        java.awt.image.BufferedImage bufferedImage9 = null;
        try {
            java.awt.image.BufferedImage bufferedImage10 = convolutionKernel8.apply(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
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
// flaky:         histogram19.setWidth(0);
// flaky:         histogram19.setSize((int) 'a');
// flaky:         histogram19.setWidth((int) (byte) 100);
        util.Histogram histogram27 = null; // flaky: new util.Histogram(0);
// flaky:         histogram27.setSize((int) (short) 10);
// flaky:         histogram27.setSize((int) (byte) 100);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
// flaky:         histogram27.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram40 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) (short) 100, (int) (byte) 1);
// flaky:         histogram19.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram43 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 35);
        histogram16.set((java.util.List<java.lang.Integer>) intList35);
        util.Histogram histogram46 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, (int) '4');
        util.Histogram histogram48 = new util.Histogram((java.util.List<java.lang.Integer>) intList35, 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        float[] floatArray4 = new float[] { 'a', 255, (byte) 0, (byte) -1 };
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray4);
        morphology.Erode erode6 = new morphology.Erode(floatArray4);
        morphology.Erode erode7 = new morphology.Erode(floatArray4);
        morphology.ConvolutionKernel convolutionKernel8 = new morphology.ConvolutionKernel(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
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
        util.Histogram histogram25 = null; // flaky: new util.Histogram(intArray16, (int) (byte) 1, (int) (byte) 100);
// flaky:         org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        util.Histogram histogram1 = new util.Histogram(255);
        int int3 = histogram1.get((int) '#');
        util.Histogram histogram5 = new util.Histogram((int) ' ');
        util.Histogram histogram7 = null; // flaky: new util.Histogram(0);
// flaky:         histogram7.setWidth(0);
// flaky:         histogram7.setSize((int) 'a');
// flaky:         histogram7.setWidth((int) (byte) 100);
        int[] intArray14 = null; // flaky: histogram7.getData();
// flaky:         histogram5.set(intArray14);
        util.Histogram histogram17 = null; // flaky: new util.Histogram(0);
// flaky:         histogram17.setSize((int) (short) 10);
// flaky:         histogram17.setSize((int) (byte) 100);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
// flaky:         histogram17.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram29 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, (int) 'a');
        util.Histogram histogram32 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 97, 255);
        histogram5.set((java.util.List<java.lang.Integer>) intList25);
        util.Histogram histogram35 = new util.Histogram((java.util.List<java.lang.Integer>) intList25, 100);
        histogram1.set((java.util.List<java.lang.Integer>) intList25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
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
        int int21 = histogram14.get((int) (byte) 1);
        histogram14.put((int) '4');
        histogram14.setWidth((int) '4');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
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
        int[] intArray23 = histogram22.getData();
        util.Histogram histogram26 = new util.Histogram(1, (int) (short) 100);
        int[] intArray27 = histogram26.getData();
        util.Histogram histogram29 = new util.Histogram(intArray27, (int) ' ');
        util.Histogram histogram31 = new util.Histogram(intArray27, (int) '#');
        util.Histogram histogram34 = null; // flaky: new util.Histogram(intArray27, 35, (-1));
        histogram22.set(intArray27);
        histogram22.setSize(2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        java.lang.Class<?> wildcardClass3 = floatArray0.getClass();
        morphology.Erode erode4 = new morphology.Erode(floatArray0);
        java.lang.Class<?> wildcardClass5 = erode4.getClass();
        float[] floatArray9 = new float[] { (short) 0, '#', 0.0f };
        morphology.Erode erode10 = null; // flaky: new morphology.Erode(floatArray9);
        morphology.Erode erode11 = null; // flaky: new morphology.Erode(floatArray9);
        float[] floatArray12 = new float[] {};
        morphology.Erode erode13 = new morphology.Erode(floatArray12);
        morphology.ConvolutionKernel convolutionKernel14 = new morphology.ConvolutionKernel(floatArray12);
        morphology.ConvolutionKernel convolutionKernel15 = new morphology.ConvolutionKernel(floatArray12);
        morphology.Erode erode16 = new morphology.Erode(floatArray12);
        morphology.BaseMorphology baseMorphology17 = null; // flaky: erode11.compose((morphology.BaseMorphology) erode16);
        morphology.BaseMorphology baseMorphology18 = erode4.compose((morphology.BaseMorphology) erode11);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray12);
// flaky:         org.junit.Assert.assertNotNull(baseMorphology17);
        org.junit.Assert.assertNotNull(baseMorphology18);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        float[] floatArray0 = new float[] {};
        morphology.Erode erode1 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel2 = new morphology.ConvolutionKernel(floatArray0);
        morphology.Erode erode3 = new morphology.Erode(floatArray0);
        morphology.ConvolutionKernel convolutionKernel4 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel5 = new morphology.ConvolutionKernel(floatArray0);
        morphology.ConvolutionKernel convolutionKernel6 = new morphology.ConvolutionKernel(floatArray0);
        float[] floatArray7 = new float[] {};
        morphology.Erode erode8 = new morphology.Erode(floatArray7);
        morphology.ConvolutionKernel convolutionKernel9 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel10 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel11 = new morphology.ConvolutionKernel(floatArray7);
        morphology.ConvolutionKernel convolutionKernel12 = new morphology.ConvolutionKernel(floatArray7);
        morphology.Erode erode13 = new morphology.Erode(floatArray7);
        morphology.BaseMorphology baseMorphology14 = convolutionKernel6.compose((morphology.BaseMorphology) erode13);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(baseMorphology14);
    }
}
