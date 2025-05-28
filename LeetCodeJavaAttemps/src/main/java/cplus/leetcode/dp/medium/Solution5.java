package cplus.leetcode.dp.medium;

class Solution5 {
    public static void main(String[] args) {
        Solution5 so = new Solution5();
        System.out.println(so.longestPalindrome("babad"));
        System.out.println(so.longestPalindrome("cbbd"));
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        char[] cs = s.toCharArray();
        int start = 0, end = start;
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (len == 2 || len == 3) {
                    if (cs[i] == cs[j]) {
                        dp[i][j] = 1;
                        start = i;
                        end = j;
                    }
                } else {
                    if ((cs[i] == cs[j]) && (dp[i+1][j-1] == 1)) {
                        dp[i][j] = 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
