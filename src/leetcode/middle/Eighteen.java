package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 *
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * @author gcg
 * @create 2020-06-18 16:07
 **/
public class Eighteen {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] > target && nums[i] > 0) break;
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1, right = nums.length - 1, sum;
                while (left < right) {
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        List<Integer> ns = Arrays.asList(nums[i], nums[j], nums[left++], nums[right--]);
                        while (left < nums.length && nums[left] == nums[left - 1]) left++;
                        while (right > j && nums[right] == nums[right + 1]) right--;
                        results.add(ns);
                    }
                }
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }

        return results;
    }

}
