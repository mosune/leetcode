package leetcode.easy;

/**
 * 840. 矩阵中的幻方
 *
 * 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
 *
 * 给定一个由整数组成的 grid，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
 *
 *  
 *
 * 示例：
 *
 * 输入: [[4,3,8,4],
 *       [9,5,1,9],
 *       [2,7,6,2]]
 * 输出: 1
 * 解释:
 * 下面的子矩阵是一个 3 x 3 的幻方：
 * 438
 * 951
 * 276
 *
 * 而这一个不是：
 * 384
 * 519
 * 762
 *
 * 总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
 * 提示:
 *
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * 0 <= grid[i][j] <= 15
 *
 * @author gcg
 * @create 2019-12-23 16:12
 **/
public class EightHundredForty {

    public int numMagicSquaresInside(int[][] grid) {
        int sum = 0, num;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (grid[i + 1][j + 1] != 5) continue;
                if (grid[i][j] == grid[i][j + 1]) continue;
                if (grid[i][j] > 9 || grid[i][j + 1] > 9 || grid[i][j + 2] > 9 || grid[i + 1][j] > 9 || grid[i + 1][j + 1] > 9 || grid[i + 1][j + 2] > 9 || grid[i + 2][j] > 9 || grid[i + 2][j + 1] > 9 || grid[i + 2][j + 2] > 9) continue;
                if (grid[i][j] < 1 || grid[i][j + 1] < 1 || grid[i][j + 2] < 1 || grid[i + 1][j] < 1 || grid[i + 1][j + 1] < 1 || grid[i + 1][j + 2] < 1 || grid[i + 2][j] < 1 || grid[i + 2][j + 1] < 1 || grid[i + 2][j + 2] < 1) continue;
                num = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                if (num != grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2]) continue;
                if (num != grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]) continue;
                if (num != grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2]) continue;
                if (num != grid[i + 2][j] + grid[i + 1][j + 1] + grid[i][j + 2]) continue;
                if (num != grid[i][j] + grid[i + 1][j] + grid[i + 2][j]) continue;
                if (num != grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1]) continue;
                if (num != grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2]) continue;
                sum++;
            }
        }
        return sum;
    }

}
