public class TheCoinChangeProblemMemoizationApproach {
    public static long getWays(int n, List<Long> c) {
        long[][] memo = new long[c.size()][n + 1];

        for (int r = 0; r < memo.length; r++) {
            Arrays.fill(memo[r], -1);
        }

        return getWays((long) n, 0, c, memo);
    }

    private static long getWays(long n, int i, List<Long> c, long[][] memo) {
        if (n == 0) return 1;
        if (i >= c.size()) return 0;
        if (c.get(i) > n) return getWays(n, i + 1, c, memo);
        if (memo[i][(int) n] != -1) return memo[i][(int) n];

        return memo[i][(int) n] = getWays(n - c.get(i), i, c, memo) + getWays(n, i + 1, c, memo);
    }
}