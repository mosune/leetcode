package leetcode.easy;

import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @author gcg
 * @create 2019-06-07 18:53
 **/
public class OneHundredThirtySix {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 == nums.length || nums[i] != nums[i + 1]) return nums[i];
        }
        return 0;
    }

//    private int[] sort(int[] nums) {
//        return sortArrays(0, nums.length, nums);
//    }
//
//    private int[] sortArrays(int start, int end, int[] nums) {
//        int middle = (end - start) / 2;
//        sortArrays(start, middle, nums);
//        sortArrays(middle + 1, end, nums);
//        return nums;
//    }

}
