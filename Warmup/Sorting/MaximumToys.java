package Hackerank.Warmup;

import java.util.Arrays;

public class MaximumToys {
    static int maximumToys(int[] prices, int k) {
        int sum = 0;
        Arrays.sort(prices);

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            if (sum > k) {
                return i;
            } else if (sum == k) {
                return i + 1;
            }
        }

        return 0;
    }
}
