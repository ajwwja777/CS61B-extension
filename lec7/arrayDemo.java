public class arrayDemo {

    public int[]nestedArray;

    public arrayDemo(int[] nA) {
        nestedArray = nA;
    }

    public static int[] create1DIntArray1() {
        return new int[]{1,2,3};
    }

    public static int[] create1DIntArray2() {
        return new int[]{1,2};
    }

    public static int[][] create2DIntArray1() {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        return array1;
    }
    public static int[][] create2DIntArray2() {
        int[][] array2 = {
                {4, 5, 6},
                {1, 2, 3},
        };
        return array2;
    }

}
