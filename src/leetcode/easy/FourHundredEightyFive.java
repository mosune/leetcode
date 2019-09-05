package leetcode.easy;

/**
 * 485. 最大连续1的个数
 *
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 *
 * @author gcg
 * @create 2019-09-05 12:27
 **/
public class FourHundredEightyFive {

    public int findMaxConsecutiveOnes(int[] nums) {
        int pre = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1 && nums[i - 1] == 0) pre = i;
            else if (nums[i - 1] != 0) max = Math.max(i - pre, max);
        }
        if (nums[nums.length - 1] == 1) max = Math.max(nums.length - pre, max);
        return max;
    }

}
