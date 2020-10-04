public class SherlockAndCostMemoizationApproach {
    static int cost(int[] B) {
        int[][] memo = new int[B.length][2];

        for (int r = 0; r < memo.length; r++) {
            Arrays.fill(memo[r], -1);
        }

        return Math.max(cost(1, 0, B, memo), cost(1, 1, B, memo));
    }

    private static int cost(int i, int prev, int[] B, int[][] memo) {
        if (i >= B.length) return 0;
        if (memo[i][prev] != -1) return memo[i][prev];

        return memo[i][prev] = Math.max(
                cost(i + 1, 0, B, memo) + Math.abs(1 - (prev == 0 ? 1 : B[i - 1])),
                cost(i + 1, 1, B, memo) + Math.abs(B[i] - (prev == 0 ? 1 : B[i - 1]))
        );
    }
}