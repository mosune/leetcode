package leetcode.easy;

/**
 * 面试题53 - I. 在排序数组中查找数字 I
 *
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *  
 *
 * 限制：
 *
 * 0 <= 数组长度 <= 50000
 *
 *  
 *
 * 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * @author gcg
 * @create 2020-05-28 10:08
 **/
public class InterviewFiftyThreeI {

    public int search(int[] nums, int target) {
        int left = getIndex(nums, target, 0, nums.length - 1, true);
        int right = getIndex(nums, target, 0, nums.length - 1, false);
        return right - left;
    }

    private int getIndex(int[] nums, int target, int left, int right, boolean isLeft) {
        if (left > right) return left;
        int mid = left + (right - left) / 2;
        if (nums[mid] > target) {
            return getIndex(nums, target, left, mid - 1, isLeft);
        } else if (nums[mid] < target) {
            return getIndex(nums, target, mid + 1, right, isLeft);
        } else {
            if (isLeft) {
                if (mid != 0 && nums[mid] == nums[mid - 1]) {
                    return getIndex(nums, target, left, mid - 1, true);
                }
            } else {
                if (mid != nums.length - 1 && nums[mid] == nums[mid + 1]) {
                    return getIndex(nums, target, mid + 1, right, false);
                }
                mid++;
            }
        }
        return mid;
    }

}
