package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1337. 方阵中战斗力最弱的 K 行
 *
 * 给你一个大小为 m * n 的方阵 mat，方阵由若干军人和平民组成，分别用 0 和 1 表示。
 *
 * 请你返回方阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 *
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 *
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * 输出：[2,0,3]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 2
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 2
 * 行 4 -> 5
 * 从最弱到最强对这些行排序后得到 [2,0,3,1,4]
 * 示例 2：
 *
 * 输入：mat =
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]],
 * k = 2
 * 输出：[0,2]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 1
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 1
 * 从最弱到最强对这些行排序后得到 [0,2,3,1]
 *  
 *
 * 提示：
 *
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] 不是 0 就是 1
 *
 * @author gcg
 * @create 2020-04-01 12:08
 **/
public class OneThousandThreeHundredThirtySeven {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] nums = new int[mat.length][2];
        int n = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j : mat[i]) {
                if (j == 0) break;
                else n++;
            }
            nums[i][0] = i;
            nums[i][1] = n;
            n = 0;
        }

        Arrays.sort(nums, Comparator.comparingInt(o -> o[1]));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = nums[i][0];

        return result;
    }

}
