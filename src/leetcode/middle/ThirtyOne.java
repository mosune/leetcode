package leetcode.middle;

import java.util.Arrays;

/**
 * 31. 下一个排列
 *
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * @author gcg
 * @create 2020-06-29 16:35
 **/
public class ThirtyOne {

    public void nextPermutation(int[] nums) {
        int a = -1, b = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                a = i - 1;
                break;
            }
        }
        if (a != -1) {
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i] > nums[a]) {
                    b = i;
                    break;
                }
            }
            int num = nums[a];
            nums[a] = nums[b];
            nums[b] = num;
        }
        Arrays.sort(nums, a + 1, nums.length);
    }

}
