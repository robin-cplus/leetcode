package cplus.leetcode.dp.medium;

import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public static void main(String[] args) {
        Solution22 so = new Solution22();
        System.out.println(so.generateParenthesis(5));
        System.out.println(so.generateParenthesis(2));
        System.out.println(so.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        char[] str = new char[2 * n];
        dfs(res, str, 0, 0, 0, n);
        return res;
    }

    private void dfs(List<String> res, char[] ca, int index, int leftNUmber, int rightNumber, int number) {
        if (leftNUmber == number && rightNumber == number) {
            while (index < 2 * number) {
                ca[index++] = ')';
            }
            res.add(new String(ca));
            return;
        }

        if (leftNUmber < number) {
            ca[index] = '(';
            dfs(res, ca, index + 1, leftNUmber + 1, rightNumber, number);
        }

        if (rightNumber < leftNUmber) {
            ca[index] = ')';
            dfs(res, ca, index + 1, leftNUmber, rightNumber + 1, number);
        }
    }
}