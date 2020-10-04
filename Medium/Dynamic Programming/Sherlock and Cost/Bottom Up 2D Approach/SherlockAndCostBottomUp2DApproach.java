public class SherlockAndCostBottomUp2DApproach {
    static int cost(int[] B) {
        int[][] maxSum = new int[B.length + 1][2];

        for (int i = B.length - 1; i >= 1; i--) {
            for (int prev = 1; prev >= 0; prev--) {
                maxSum[i][prev] = Math.max(
                        maxSum[i + 1][0] + Math.abs(1 - (prev == 0 ? 1 : B[i - 1])),
                        maxSum[i + 1][1] + Math.abs(B[i] - (prev == 0 ? 1 : B[i - 1]))
                );
            }
        }

        return Math.max(maxSum[1][0], maxSum[1][1]);
    }
}