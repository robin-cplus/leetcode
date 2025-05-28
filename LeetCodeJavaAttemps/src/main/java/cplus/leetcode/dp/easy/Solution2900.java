package cplus.leetcode.dp.easy;

import java.util.ArrayList;
import java.util.List;

class Solution2900 {
    public static void main(String[] args) {
        Solution2900 so = new Solution2900();
        System.out.println(so.getLongestSubsequence(new String[]{"c"}, new int[]{0}));
        System.out.println(so.getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}));
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int pre = groups[0];
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != pre) {
                res.add(words[i]);
                pre = groups[i];
            }
        }
        return res;
    }
}
