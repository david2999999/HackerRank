public class TheCoinChangeProblemBottomUp2DApproach {
    public static long getWays(int n, List<Long> c) {
        long[][] ways = new long[c.size() + 1][n + 1];

        for (int i = c.size() - 1; i >= 0; i--) {
            for (long curN = 0; curN <= n; curN++) {
                if (curN == 0) {
                    ways[i][(int) curN] = 1;
                    continue;
                }

                if (c.get(i) > curN) {
                    ways[i][(int) curN] = ways[i + 1][(int) curN];
                    continue;
                }

                ways[i][(int) curN] = ways[i][(int) (curN - c.get(i))] + ways[i + 1][(int) curN];
            }
        }

        return ways[0][n];
    }
}