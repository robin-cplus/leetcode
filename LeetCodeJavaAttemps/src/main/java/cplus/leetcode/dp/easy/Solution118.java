package cplus.leetcode.dp.easy;

import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public static void main(String[] args) {
        Solution118 so = new Solution118();
        System.out.println(so.generate(5));
    }

    public List<List<Integer>> generate(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(List.of(1));
        }

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        res.add(arr);

        List<Integer> pre = arr;
        for (int i = 0; i <= rowIndex; i++) {
            arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i; j++) {
                arr.add(pre.get(j) + pre.get(j - 1));
            }
            arr.add(1);
            res.add(arr);
            pre = arr;
        }
        return res;
    }
}
