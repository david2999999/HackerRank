public class TheCoinChangeProblemRecursiveApproach {
    public static long getWays(int n, List<Long> c) {
        return getWays((long) n, 0, c);
    }

    private static long getWays(long n, int i, List<Long> c) {
        if (n == 0) return 1;
        if (i >= c.size()) return 0;
        if (c.get(i) > n) return getWays(n, i + 1, c);

        return getWays(n - c.get(i), i, c) + getWays(n, i + 1, c);
    }
}