package leetcode.easy;

/**
 * 1304. 和为零的N个唯一整数
 *
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：[0]
 *  
 *
 * 提示：
 *
 * 1 <= n <= 1000
 *
 * @author gcg
 * @create 2020-03-30 11:51
 **/
public class OneThousandThreeHundredFour {

    public int[] sumZero(int n) {
        if (n == 1) return new int[]{0};
        int[] nums = new int[n];

        int sum = 0;
        for (int i = 1; i < n; i++) {
            nums[i - 1] = i;
            sum += i;
        }
        nums[n - 1] = -sum;

        return nums;
    }

}