package leetcode.middle;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 *
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *  
 *
 * 提示：
 *
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 *
 * @author gcg
 * @create 2020-06-17 13:31
 **/
public class Sixteen {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int num = nums[0] + nums[1] + nums[2], n = Math.abs(num - target);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1, result;
            if (nums[i] >= target) {
                result = nums[i] + nums[i + 1] + nums[i + 2];
                if (Math.abs(result - target) < n) return result;
            }
            while (left < right) {
                result = left + right + nums[i];
                if (result < target) left++;
                else if (result == target) return target;
                else right--;
                if (Math.abs(result - target) < n) {
                    num = result;
                    n = Math.abs(result - target);
                }
            }
        }

        return num;
    }

}
