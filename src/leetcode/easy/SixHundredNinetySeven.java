package leetcode.easy;

/**
 * 697. 数组的度
 *
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 *
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 *
 * 示例 1:
 *
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释:
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:
 *
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 * 注意:
 *
 * nums.length 在1到50,000区间范围内。
 * nums[i] 是一个在0到49,999范围内的整数。
 *
 * @author gcg
 * @create 2019-11-13 10:48
 **/
public class SixHundredNinetySeven {

    public int findShortestSubArray(int[] nums) {
        int max = -1;
        for (int i : nums) max = Math.max(max, i);

        int[] data = new int[max + 1];
        for (int i : nums) data[i]++;

        max = -1;
        for (int i : data) max = Math.max(i, max);

        int min = 50001;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                int start = -1, end, num = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == i) {
                        if (num == 0) start = j;
                        num++;
                        if (num == max) {
                            end = j;
                            min = Math.min(end - start + 1, min);
                            break;
                        }
                    }
                }
                if (min == max) return min;
            }
        }

        return min;
    }

}
