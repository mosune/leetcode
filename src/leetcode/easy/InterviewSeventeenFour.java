package leetcode.easy;

/**
 * 面试题 17.04. 消失的数字
 *
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 *
 * 注意：本题相对书上原题稍作改动
 *
 * 示例 1：
 *
 * 输入：[3,0,1]
 * 输出：2
 *  
 *
 * 示例 2：
 *
 * 输入：[9,6,4,2,3,5,7,0,1]
 * 输出：8
 *
 * @author gcg
 * @create 2020-05-09 17:27
 **/
public class InterviewSeventeenFour {

    /**
     * 求和解法
     * @param nums
     * @return
     */
//    public int missingNumber(int[] nums) {
//        int num = nums.length * (nums.length + 1) / 2;
//
//        for (int i : nums) num -= i;
//        return num;
//    }

    /**
     * 异或解法
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            res ^= i;
            res ^= nums[i];
        }
        res ^= nums.length;

        return res;
    }

}
