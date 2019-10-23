package leetcode.easy;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 *
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: 24
 * 注意:
 *
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 *
 * @author gcg
 * @create 2019-10-23 10:35
 **/
public class SixHundredTwentyEight {

    /**
     * 排序
     * @param nums
     * @return
     */
//    public int maximumProduct(int[] nums) {
//        Arrays.sort(nums);
//        int max = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
//        if (nums[1] < 0) {
//            max = Math.max(max, nums[0] * nums[1] * nums[nums.length - 1]);
//        }
//        return max;
//    }

    /**
     * 直接找最大的三个数和最小的两个数
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        int a = -1000, b = -1000, c = -1000;
        int y = 1000, z = 1000;

        for (int i : nums) {
            if (i > c) {
                if (i > b) {
                    c = b;
                    if (i > a) {
                        b = a;
                        a = i;
                    } else b = i;
                } else c = i;
            }
            if (i < y) {
                if (i < z) {
                    y = z;
                    z = i;
                } else y = i;
            }
        }

        return Math.max(a * b * c, a * z * y);
    }

}
