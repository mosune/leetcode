package leetcode.middle;

/**
 * 59. 螺旋矩阵 II
 *
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 *
 * @author gcg
 * @create 2020-07-15 10:14
 **/
public class FiftyNine {

    public int[][] generateMatrix(int n) {
        int[][] results = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                results[i][j] = num++;
            }
            for (int j = i + 1; j < n - i - 1; j++) {
                results[j][n - 1 - i] = num++;
            }
            if (num > n * n) return results;
            for (int j = n - 1 - i; j >= i; j--) {
                results[n - 1 - i][j] = num++;
            }
            for (int j = n - 2 - i; j > i; j--) {
                results[j][i] = num++;
            }
        }

        return results;
    }

}
