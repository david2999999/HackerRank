package Hackerank.Warmup;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonal1 += arr[i][i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            diagonal2 += arr[(arr.length - 1) - i][i];
        }

        return Math.abs(diagonal1 - diagonal2);

    }
}
