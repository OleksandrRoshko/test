package org.start.utils.mazutils;

public class MathUtils {
    /*
   My first comment

     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;

        }

        return b;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        int max = max(a, b);

        return max(max, c);
    }
}
