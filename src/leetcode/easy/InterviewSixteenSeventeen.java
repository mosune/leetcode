package leetcode.easy;

/**
 * 面试题 16.17. 连续数列
 *
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和。
 *
 * 示例：
 *
 * 输入： [-2,1,-3,4,-1,2,1,-5,4]
 * 输出： 6
 * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶：
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author gcg
 * @create 2020-05-09 16:55
 **/
public class InterviewSixteenSeventeen {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return Integer.MIN_VALUE;
        int max = nums[0];
        int[] dps = new int[nums.length];
        dps[0] = max;

        for (int i = 1; i < nums.length; i++) {
            dps[i] = Math.max(dps[i - 1] + nums[i], nums[i]);
            max = Math.max(dps[i], max);
        }

        return max;
    }

}
