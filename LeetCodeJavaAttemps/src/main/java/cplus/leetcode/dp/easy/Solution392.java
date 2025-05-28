package cplus.leetcode.dp.easy;

class Solution392 {
    public static void main(String[] args) {
        Solution392 so = new Solution392();
        System.out.println(so.isSubsequence("abc", "ahbgdc"));
        System.out.println(so.isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        int is = 0, it = 0;
        while (is < cs.length) {
            if (it >= ct.length) {
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

