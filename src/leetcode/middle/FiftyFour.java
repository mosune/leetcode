package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 *
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * @author gcg
 * @create 2020-07-13 11:44
 **/
public class FiftyFour {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length * 2);
        for (int i = 0; i <= matrix.length / 2; i++) {
            for (int j = i; j < matrix[0].length - i; j++) {
                list.add(matrix[i][j]);
            }
            if (matrix[0].length - 1 - i >= 0) {
                for (int j = i + 1; j < matrix.length - i - 1; j++) {
                    list.add(matrix[j][matrix[0].length - 1 - i]);
                }
            }
            if (matrix.length - i - 1 >= 0) {
                for (int j = matrix[0].length - 1 - i; j >= i; j--) {
                    list.add(matrix[matrix.length - i - 1][j]);
                }
            }
            if (i < matrix[0].length) {
                for (int j = matrix.length - 2 - i; j > i; j--) {
                    list.add(matrix[j][i]);
                }
            }
        }
        return list.subList(0, matrix.length * matrix[0].length);
    }

}
