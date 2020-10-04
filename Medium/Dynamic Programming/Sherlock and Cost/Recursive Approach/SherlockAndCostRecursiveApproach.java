public class SherlockAndCostRecursiveApproach {
    public static int cost(int[] B) {
        return Math.max(cost(1, 0, B), cost(1, 1, B));
    }

    private static int cost(int i, int prev, int[] B) {
        if (i >= B.length) return 0;

        return Math.max(
                cost(i + 1, 0, B) + Math.abs(1 - (prev == 0 ? 1 : B[i - 1])),
                cost(i + 1, 1, B) + Math.abs(B[i] - (prev == 0 ? 1 : B[i - 1]))
        );
    }
}