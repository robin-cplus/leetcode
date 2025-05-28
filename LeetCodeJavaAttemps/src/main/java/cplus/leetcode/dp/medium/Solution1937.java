package cplus.leetcode.dp.medium;

class Solution1937 {
    public static void main(String[] args) {
        Solution1937 so = new Solution1937();
        System.out.println(so.maxPoints(new int[][]{{5, 2, 1, 2}, {2, 1, 5, 2}, {5, 5, 5, 0}}));
        System.out.println(so.maxPoints(new int[][]{{1, 2, 3}, {1, 5, 1}, {3, 1, 1}}));
        System.out.println(so.maxPoints(new int[][]{{1, 5}, {2, 3}, {4, 2}}));
    }

    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        long res = Integer.MIN_VALUE;
        long[] pre = new long[n];

        for (int i = 0; i < n; i++) {
            pre[i] = points[0][i];
            res = Math.max(res, pre[i]);
        }

        for (int i = 1; i < m; i++) {
            long[] left = new long[n];
            left[0] = pre[0];
            long[] right = new long[n];
            right[n - 1] = pre[n - 1];

            for (int j = 1; j < n; j++) {
                left[j] = Math.max(pre[j], left[j - 1] - 1);
            }
            for (int j = n - 2; j >= 0; j--) {
                right[j] = Math.max(pre[j], right[j + 1] - 1);
            }

            for (int j = 0; j < n; j++) {
                pre[j] = Math.max(left[j] + points[i][j], right[j] + points[i][j]);
                res = Math.max(res, pre[j]);
            }
        }

        return res;
    }
}

