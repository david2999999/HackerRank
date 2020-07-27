package Hackerank.Warmup;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
    static void plusMinus(int[] arr) {
        int total = arr.length;
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int num: arr) {
            if (num == 0) {
                zeroCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.format("%.6f\n", (double)positiveCount / total);
        System.out.format("%.6f\n", (double)negativeCount / total);
        System.out.format("%.6f\n", (double)zeroCount / total);

    }
}
