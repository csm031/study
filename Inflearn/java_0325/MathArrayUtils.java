package Inflearn.java_0325;

public class MathArrayUtils {
    private MathArrayUtils() {

    }


    static int sum(int[] array) {
        int j = 0;
        for (int i : array) {
            j += i;
        }
        return j;
    }

    static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
