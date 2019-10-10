package leetcode.easy;

/**
 * 581. 最短无序连续子数组
 *
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 *
 * 你找到的子数组应是最短的，请输出它的长度。
 *
 * 示例 1:
 *
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 *
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 *
 * @author gcg
 * @create 2019-10-10 14:20
 **/
public class FiveHundredEightyOne {

    /**
     * 常规做法，每次找到之后跑回之前找到头位置
     * @param nums
     * @return
     */
//    public int findUnsortedSubarray(int[] nums) {
//        int start = -1, end = 0, max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < max) {
//                int k;
//                if (start > -1) k = Math.min(start, i);
//                else k = i;
//                for (int j = 0; j < k; j++) {
//                    if (nums[j] > nums[i]) {
//                        start = j;
//                        break;
//                    }
//                }
//                end = i;
//            } else {
//                max = nums[i];
//            }
//        }
//
//        return end - start + 1;
//    }

    /**
     * 先找左边界，再找右边界，然后找边界在数组中的位置
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        boolean isflag = false;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isflag = true;
                min = Math.min(min, nums[i]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                isflag = true;
                max = Math.max(max, nums[i - 1]);
            }
        }
        if (!isflag) return 0;

        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                start = i;
                break;
            }
        }

        int end = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < max) {
                end = i;
                break;
            }
        }

        return end - start + 1;
    }

}
