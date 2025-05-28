package cplus.leetcode.dp.medium;

class Solution1947 {
    public static void main(String[] args) {
        Solution1947 so = new Solution1947();
        System.out.println(so.maxCompatibilitySum(new int[][]{{0, 1, 0, 1, 1, 1}, {1, 0, 0, 1, 0, 1}, {1, 0, 1, 1, 0, 0}}, new int[][]{{1, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 1, 1}, {0, 1, 0, 0, 1, 1}}));
        System.out.println(so.maxCompatibilitySum(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 1, 0}}));
        System.out.println(so.maxCompatibilitySum(new int[][]{{0, 0}, {0, 0}, {0, 0}}, new int[][]{{1, 1}, {1, 1}, {1, 1}}));
    }

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int m = students.length;
        int[][] score = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int res = 0;
                for (int k = 0; k < students[i].length; k++) {
                    if (students[i][k] == mentors[j][k]) {
                        res++;
                    }
                }
                score[i][j] = res;
            }
        }

        int[] map = new int[m];
        return dfs(score, map, 0, 0, m);
    }

    private int dfs(int[][] scoreBoard, int[] map, int student, int score, int total) {
        if (student == total) {
            return score;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < total; i++) {
            if (map[i] != -1) {
                map[i] = -1;
                int nextScore = dfs(scoreBoard, map, student + 1, score + scoreBoard[student][i], total);
                maxValue = Math.max(nextScore, maxValue);
                map[i] = 0;
            }
        }

        return maxValue;
    }
}
