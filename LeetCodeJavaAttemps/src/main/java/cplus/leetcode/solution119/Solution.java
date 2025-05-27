package cplus.leetcode.solution119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            return List.of(1);
        }

        List<Integer> res = new ArrayList<>();

        res.add(1);
        List<Integer> pre = res;
        for(int i=0;i<=rowIndex;i++) {
            res=new ArrayList<>();
            res.add(1);
            for(int j=1;j<i;j++) {
                res.add(pre.get(j)+pre.get(j-1));
            }
            res.add(1);
            pre=res;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.getRow(5));
    }
}
