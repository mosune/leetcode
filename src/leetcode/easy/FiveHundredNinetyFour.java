package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 594. 最长和谐子序列
 *
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 *
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 *
 * 示例 1:
 *
 * 输入: [1,3,2,2,5,2,3,7]
 * 输出: 5
 * 原因: 最长的和谐数组是：[3,2,2,2,3].
 * 说明: 输入的数组长度最大不超过20,000.
 *
 * @author gcg
 * @create 2019-10-12 11:09
 **/
public class FiveHundredNinetyFour {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);

        int max = 0;
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set) {
            Integer num = map.get(entry.getKey() + 1);
            if (num == null) continue;
            max = Math.max(max, entry.getValue() + num);
        }

        return max;
    }

}
