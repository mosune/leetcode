package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * @author gcg
 * @create 2020-07-14 14:50
 **/
public class FiftySix {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] nums = list.get(list.size() - 1);
            if (intervals[i][0] <= nums[1]) {
                nums[1] = Math.max(intervals[i][1], nums[1]);
            } else {
                list.add(intervals[i]);
            }
        }

        int[][] result = new int[list.size()][2];

        return list.toArray(result);
    }


}
