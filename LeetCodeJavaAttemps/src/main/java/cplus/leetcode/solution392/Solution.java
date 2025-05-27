package cplus.leetcode.solution392;

class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.isSubsequence("abc", "ahbgdc"));
        System.out.println(so.isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        int is = 0, it = 0;
        while (is < cs.length) {
            if (it >= ct.length) {
                return false;
            }
            if (cs[is] == ct[it]) {
                is++;
                it++;
            } else {
                it++;
            }
        }
        return true;
    }
}

