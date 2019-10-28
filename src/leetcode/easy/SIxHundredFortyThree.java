package leetcode.easy;

/**
 * 643. 子数组最大平均数 I
 *
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 示例 1:
 *
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 *  
 *
 * 注意:
 *
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 *
 * @author gcg
 * @create 2019-10-28 10:37
 **/
public class SIxHundredFortyThree {

    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) max += nums[i];
        int pre = max;

        for (int i = k; i < nums.length; i++) {
            pre += nums[i] - nums[i - k];
            max = Math.max(max, pre);
        }

        return (double) max / k;
    }

}
