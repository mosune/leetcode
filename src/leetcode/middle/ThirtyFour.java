package leetcode.middle;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 *
 * @author gcg
 * @create 2020-06-30 16:40
 **/
public class ThirtyFour {

    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, 0, nums.length - 1, target, true);
        if (left == -1) return new int[]{-1, -1};
        return new int[]{left, search(nums, left, nums.length - 1, target, false)};
    }

    private int search(int[] nums, int left, int right, int target, boolean isLeft) {
        if (left > right) return -1;
        int mid = (left + right) / 2, index;
        if (nums[mid] == target) {
            index = mid;
            if (isLeft && mid > 0 && nums[mid - 1] == target) {
                index = search(nums, left, mid - 1, target, true);
            }
            if (!isLeft && mid < nums.length - 1 && nums[mid + 1] == target) {
                index = search(nums, mid + 1, right, target, false);
            }
        } else if (nums[mid] < target) {
            index = search(nums, mid + 1, right, target, isLeft);
        } else {
            index = search(nums, left, mid - 1, target, isLeft);
        }
        return index;
    }

}
