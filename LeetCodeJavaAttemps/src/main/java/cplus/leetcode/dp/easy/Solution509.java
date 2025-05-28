package cplus.leetcode.dp.easy;

class Solution509 {
    public static void main(String[] args) {
        Solution509 so = new Solution509();
        System.out.println(so.fib(2));
        System.out.println(so.fib(3));
        System.out.println(so.fib(4));
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int pre = 1;
        int ppre = 0;
        for (int i=2;i<=n;i++) {
            int res = pre + ppre;
            ppre = pre;
            pre = res;
        }

        return pre;
    }
}

