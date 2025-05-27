package cplus.leetcode.solution1025;

class Solution {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.divisorGame(2));
        System.out.println(so.divisorGame(3));
    }

    public boolean divisorGame(int n) {
        boolean[] map = new boolean[n + 1];
        map[0] = map[1] = false;
        for (int i = 2;i <= n; i++) {
            boolean flag = false;
            for (int j = 1; j * j <= i; j++) {
                if (i%j == 0 && !map[i - j]) {
                    flag = true;
                    break;
                }
            }
            map[i]=flag;
        }

        return map[n];
    }
}

