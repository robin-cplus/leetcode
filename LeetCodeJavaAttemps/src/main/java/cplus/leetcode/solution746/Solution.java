package cplus.leetcode.solution746;

class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(so.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] map = new int[cost.length + 1];
        map[0] = map[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            map[i] = Math.min(map[i - 1] + cost[i - 1], map[i - 2] + cost[i - 2]);
        }

        return map[cost.length];
    }
}

