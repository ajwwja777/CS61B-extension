/**
 * Write a testing method that will take in 2 arrays and see if they are equal.
 * These arrays can have nested arrays and those nested arrays
 * can have nested arrays and so forth.
 * */

import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDemo {

    @Test
    public void test1DIntArrayEqual() {
        int[] arr1 = arrayDemo.create1DIntArray1();
        int[] arr2 = arrayDemo.create1DIntArray1();
        int[] arr3 = arrayDemo.create1DIntArray2();
        assertArrayEquals(arr1, arr2);
        // assertArrayEquals(arr1, arr3);
    }
    @Test
    public void test2DIntArrayEqual() {
        int[][] arr1 = arrayDemo.create2DIntArray1();
        int[][] arr2 = arrayDemo.create2DIntArray1();
        int[][] arr3 = arrayDemo.create2DIntArray2();
        assertArrayEquals(arr1, arr2);
        // assertArrayEquals(arr1, arr3);
    }

    @Test
    public void testDemoArrayEqual() {
        int[] arr1 = arrayDemo.create1DIntArray1();
        int[] arr2 = arrayDemo.create1DIntArray1();
        int[] arr3 = arrayDemo.create1DIntArray2();

        arrayDemo[] a1 = new arrayDemo[2];
        a1[0] = new arrayDemo(arr1);
        a1[1] = new arrayDemo(arr3);

        arrayDemo[] a2 = a1;

        assertEquals(a1, a2);
    }

    @Test
    public void test1() {
        int[] arr1 = arrayDemo.create1DIntArray1();
        int[] arr2 = arrayDemo.create1DIntArray1();
        int[] arr3 = arrayDemo.create1DIntArray2();
        assertEquals(arr1, arr2);
        assertEquals(arr1, arr3);
    }

    @Test
    public void test2() {
        int[] arr1 = arrayDemo.create1DIntArray1();
        int[] arr2 = arrayDemo.create1DIntArray1();
        int[] arr3 = arrayDemo.create1DIntArray2();

        arrayDemo[] a1 = new arrayDemo[2];
        a1[0] = new arrayDemo(arr1);
        a1[1] = new arrayDemo(arr3);

        arrayDemo[] a2 = new arrayDemo[2];
        a2[0] = new arrayDemo(arr1);
        a2[1] = new arrayDemo(arr3);

        assertEquals(a1, a2);
    }

}
