package Hackerank.Warmup;

public class VeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (long num: ar) {
            sum += num;
        }

        return sum;
    }
}
