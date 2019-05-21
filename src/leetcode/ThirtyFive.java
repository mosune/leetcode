package leetcode;

/**
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @author gcg
 * @create 2019-05-13 12:07
 **/
public class ThirtyFive {

    public int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length, target);
    }

    private int search(int[] nums, int start, int end, int target) {
        if (start >= end) return start;
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return search(nums, start, middle, target);
        } else {
            if (middle < nums.length - 1 && nums[middle + 1] < target) {
                return search(nums, middle, end, target);
            }
            return middle + 1;
        }
    }

}
