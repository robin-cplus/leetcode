package cplus.leetcode.dp.easy;

class Solution1137 {
    public static void main(String[] args) {
        Solution1137 so = new Solution1137();
        System.out.println(so.tribonacci(4));
        System.out.println(so.tribonacci(25));
    }

    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int t0 = 0, t1 = 1, t2 = 1;
        for (int i=3;i<=n;i++) {
            int value = t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=value;
        }
        return t2;
    }
}

