package leetcode.easy;

/**
 * 198. 打家劫舍
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 * @author gcg
 * @create 2019-06-15 15:30
 **/
public class OneHundredNinetyEight {

    public int rob(int[] nums) {
        // dp求解
        int[] result = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            if (i - 2 >= 0) result[i] += result[i - 2];
            if (i - 3 >= 0) result[i] = result[i - 3] + nums[i] > result[i] ? result[i - 3] + nums[i] : result[i];
            if (result[i] > max) {
                max = result[i];
            }
        }

        return max;
    }

}
