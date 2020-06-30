package leetcode.middle;

/**
 * 33. 搜索旋转排序数组
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * 你可以假设数组中不存在重复的元素。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 示例 1:
 *
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * 示例 2:
 *
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 *
 * @author gcg
 * @create 2020-06-30 15:39
 **/
public class ThirtyThree {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2, index;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) {
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left]) {
                    index = search(nums, target, left, mid - 1);
                } else {
                    index = search(nums, target, mid + 1, right);
                }
            } else {
                index = search(nums, target, left, mid - 1);
            }
        } else {
            if (nums[mid] <= nums[right]) {
                if (target <= nums[right]) {
                    index = search(nums, target, mid + 1, right);
                } else {
                    index = search(nums, target, left, mid - 1);
                }
            } else {
                index = search(nums, target, mid + 1, right);
            }
        }
        return index;
    }

}
