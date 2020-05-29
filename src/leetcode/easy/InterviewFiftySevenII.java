package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题57 - II. 和为s的连续正数序列
 *
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *  
 *
 * 限制：
 *
 * 1 <= target <= 10^5
 *
 * @author gcg
 * @create 2020-05-29 10:39
 **/
public class InterviewFiftySevenII {

    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();

        for (int i = 1; i <= target / 2; i++) {
            int sum = 0, index = i;
            while (true) {
                sum += index;
                if (sum > target) break;
                else if (sum == target) {
                    int[] results = new int[index - i + 1];
                    for (int j = 0; j < results.length; j++) results[j] = j + i;
                    list.add(results);
                }
                index++;
            }
        }
        int[][] results = new int[list.size()][];
        for (int i = 0; i < results.length; i++) results[i] = list.get(i);
        return results;
    }

}
