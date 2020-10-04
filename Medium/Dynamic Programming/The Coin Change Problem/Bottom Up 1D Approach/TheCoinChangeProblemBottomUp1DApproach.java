public class TheCoinChangeProblemBottomUp1DApproach {
    public static long getWays(int n, List<Long> c) {
        long[] ways = new long[n + 1];

        for (int i = c.size() - 1; i >= 0; i--) {
            for (long curN = 0; curN <= n; curN++) {
                if (curN == 0) {
                    ways[(int) curN] = 1;
                    continue;
                }

                if (c.get(i) > curN) continue;

                ways[(int) curN] += ways[(int) (curN - c.get(i))];
            }
        }

        return ways[n];
    }
}