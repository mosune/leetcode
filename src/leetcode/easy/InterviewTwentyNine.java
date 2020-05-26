package leetcode.easy;

/**
 * 面试题29. 顺时针打印矩阵
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *  
 *
 * 限制：
 *
 * 0 <= matrix.length <= 100
 * 0 <= matrix[i].length <= 100
 * 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
 *
 * @author gcg
 * @create 2020-05-26 10:14
 **/
public class InterviewTwentyNine {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[]{};
        int[] results = new int[matrix.length * matrix[0].length];
        int index = 0, r = 0;

        while (r < results.length) {
            for (int i = index; i < matrix[0].length - index; i++) {
                results[r++] = matrix[index][i];
            }
            if (r >= results.length) break;
            for (int i = index + 1; i < matrix.length - 1 - index; i++) {
                results[r++] = matrix[i][matrix[0].length - 1 - index];
            }
            if (r >= results.length) break;
            for (int i = matrix[0].length - 1 - index; i >= index; i--) {
                results[r++] = matrix[matrix.length - 1 - index][i];
            }
            if (r >= results.length) break;
            for (int i = matrix.length - 2 - index; i >= index + 1; i--) {
                results[r++] = matrix[i][index];
            }
            index++;
        }

        return results;
    }

}
