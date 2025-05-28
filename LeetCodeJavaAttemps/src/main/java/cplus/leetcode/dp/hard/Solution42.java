package cplus.leetcode.dp.hard;

class Solution42 {
    public static void main(String[] args) {
        Solution42 so = new Solution42();
        System.out.println(so.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(so.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        for (int i = 1;i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(maxLeft[i], maxRight[i]);
            if (minHeight > height[i]) {
                res += minHeight - height[i];
            }
        }
        return res;
    }
}