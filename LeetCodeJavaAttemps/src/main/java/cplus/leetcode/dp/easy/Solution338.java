package cplus.leetcode.dp.easy;

import java.util.Arrays;

class Solution338 {
    public static void main(String[] args) {
        Solution338 so = new Solution338();
        System.out.println(Arrays.toString(so.countBits(2)));
        System.out.println(Arrays.toString(so.countBits(5)));
    }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            int sum = i % 2;
            sum += res[i / 2];
            res[i] = sum;
        }
        return res;
    }
}

