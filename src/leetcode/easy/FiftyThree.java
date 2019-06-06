package leetcode.easy;

/**
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * @author gcg
 * @create 2019-05-16 12:53
 **/
public class FiftyThree {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int sum = index + nums[i];
            index = sum < nums[i] ? nums[i] : sum;
            if (index > max) max = index;
        }
        return max;
    }

}
