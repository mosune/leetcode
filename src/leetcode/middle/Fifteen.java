package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * @author gcg
 * @create 2020-06-10 12:18
 **/
public class Fifteen {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3) return lists;

        Arrays.sort(nums);

        int result, left, right, num;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > 0) break;
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                result = nums[i] + nums[left] + nums[right];
                if (result == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    num = nums[left];
                    while (left < nums.length && nums[left] == num) left++;
                    num = nums[right];
                    while (right >= 0 && nums[right] == num) right--;
                } else if (result < 0) left++;
                else right--;
            }
        }

        return lists;
    }

}
