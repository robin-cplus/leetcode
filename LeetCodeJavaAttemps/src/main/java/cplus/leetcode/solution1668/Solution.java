package cplus.leetcode.solution1668;

class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.maxRepeating("ababc", "ab"));
        System.out.println(so.maxRepeating("ababc", "ba"));
        System.out.println(so.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

    public int maxRepeating(String sequence, String word) {
        char[] cs= sequence.toCharArray();
        char[] cw=word.toCharArray();
        int is=0, iw=0;
        int maxRepeat = 0;

        while (is < cs.length) {
            int pre = is;
            int repeat = 0;
            while (cs[is] == cw[iw]) {
                is++;
                iw++;
                if (iw == cw.length) {
                    repeat++;
                    iw = 0;
                }
                if (is == cs.length) {
                    break;
                }
            }
            is = pre + 1;
            iw=0;
            maxRepeat = Math.max(maxRepeat, repeat);
        }
        return maxRepeat;
    }
}


