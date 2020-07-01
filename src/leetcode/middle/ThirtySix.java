package leetcode.middle;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. 有效的数独
 *
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 * 上图是一个部分填充的有效的数独。
 *
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: true
 * 示例 2:
 *
 * 输入:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: false
 * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
 *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * 说明:
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 *
 * @author gcg
 * @create 2020-07-01 10:04
 **/
public class ThirtySix {

//    public boolean isValidSudoku(char[][] board) {
//        int[] nums = new int[9];
//        int[] nums2 = new int[9];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    if (nums[board[i][j] - 49] != 0) return false;
//                    nums[board[i][j] - 49]++;
//                }
//                if (board[j][i] != '.') {
//                    if (nums2[board[j][i] - 49] != 0) return false;
//                    nums2[board[j][i] - 49]++;
//                }
//            }
//            Arrays.fill(nums, 0);
//            Arrays.fill(nums2, 0);
//        }
//
//        for (int i = 0; i < 9; i += 3) {
//            for (int j = 0; j < 9; j += 3) {
//                for (int k = 0; k < 3; k++) {
//                    for (int l = 0; l < 3; l++) {
//                        if (board[i + k][j + l] != '.') {
//                            if (nums[board[i + k][j + l] - 49] != 0) return false;
//                            nums[board[i + k][j + l] - 49]++;
//                        }
//                    }
//                }
//                Arrays.fill(nums, 0);
//            }
//        }
//
//        return true;
//    }

    public boolean isValidSudoku(char[][] board) {
        Set<String> xSet = new HashSet<>(81, 1);
        Set<String> ySet = new HashSet<>(81, 1);
        Set<String> aSet = new HashSet<>(81, 1);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (xSet.contains(i + "" + board[i][j])) return false;
                else xSet.add(i + "" + board[i][j]);
                if (ySet.contains(j + "" + board[i][j])) return false;
                else ySet.add(j + "" + board[i][j]);
                if (aSet.contains(i / 3 + "" + j / 3 + "" + board[i][j])) return false;
                else aSet.add(i / 3 + "" + j / 3 + "" + board[i][j]);
            }
        }

        return true;
    }

}
