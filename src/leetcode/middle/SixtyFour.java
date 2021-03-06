package leetcode.middle;

/**
 * 64. 最小路径和
 *
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * @author gcg
 * @create 2020-07-17 11:25
 **/
public class SixtyFour {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int[] dps = new int[grid[0].length];
        dps[0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) dps[i] = grid[0][i] + dps[i - 1];

        for (int i = 1; i < grid.length; i++) {
            dps[0] += grid[i][0];
            for (int j = 1; j < grid[0].length; j++) {
                dps[j] = grid[i][j] + Math.min(dps[j - 1], dps[j]);
            }
        }

        return dps[dps.length - 1];
    }

}
