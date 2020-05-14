package leetcode.easy;

/**
 * 面试题03. 数组中重复的数字
 *
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *  
 *
 * 限制：
 *
 * 2 <= n <= 100000
 *
 * @author gcg
 * @create 2020-05-14 16:31
 **/
public class InterviewThree {

    public int findRepeatNumber(int[] nums) {
        int[] dataes = new int[nums.length];

        for (int i : nums) {
            if (dataes[i]++ != 0) return i;
        }

        return 0;
    }

}
