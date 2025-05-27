package cplus.leetcode.solution121;

class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(so.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {

        int preLowPrice = Integer.MAX_VALUE;
        int preMaxProfit = Integer.MIN_VALUE;

        for (int price : prices) {
            if (price < preLowPrice) {
                preLowPrice = price;
            }
            int profitToday = price - preLowPrice;
            if (preMaxProfit < profitToday) {
                preMaxProfit = profitToday;
            }
        }
        return preMaxProfit;
    }
}

