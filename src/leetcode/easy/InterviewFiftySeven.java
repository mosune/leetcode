package leetcode.easy;

/**
 * 面试题57. 和为s的两个数字
 *
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 *
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *  
 *
 * 限制：
 *
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^6
 *
 * @author gcg
 * @create 2020-05-29 10:20
 **/
public class InterviewFiftySeven {

//    public int[] twoSum(int[] nums, int target) {
//        int[] results = new int[2];
//        int index = 0, head = index + 1, last = nums.length - 1;
//        while (index < last) {
//            while (head <= last) {
//                int mid = head + (last - head) / 2;
//                if (nums[index] + nums[mid] == target) {
//                    results[0] = nums[index];
//                    results[1] = nums[mid];
//                    return results;
//                } else if (nums[index] + nums[mid] < target) head = mid + 1;
//                else last = mid - 1;
//            }
//            index++;
//            head = index + 1;
//            last = nums.length - 1;
//        }
//        return results;
//    }

    public int[] twoSum(int[] nums, int target) {
        int head = 0, last = nums.length - 1;
        while (head < last) {
            if (nums[head] + nums[last] == target) return new int[]{nums[head], nums[last]};
            else if (nums[head] + nums[last] < target) head++;
            else last--;
        }
        return new int[0];
    }

}
