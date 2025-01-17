// https://leetcode.com/problems/k-inverse-pairs-array/description/

public class Solution {
    public int kInversePairs(int n, int k) {
        int MOD = 1_000_000_007;

        int[][] dp = new int[n + 1][k + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= 1) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
                }
                if (j >= i) {
                    dp[i][j] = (dp[i][j] - dp[i - 1][j - i] + MOD) % MOD;
                }
            }
        }

        return dp[n][k];
    }
}
