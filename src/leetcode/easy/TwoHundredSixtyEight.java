package leetcode.easy;

import java.util.Arrays;

/**
 * 268. 缺失数字
 *
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 *
 * @author gcg
 * @create 2019-07-03 10:14
 **/
public class TwoHundredSixtyEight {

    // 排序解决
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) return i;
//        }
//        return nums[nums.length - 1] + 1;
//    }

    // 额外空间解决
//    public int missingNumber(int[] nums) {
//        int[] datas = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//            datas[nums[i]] = 1;
//        }
//        for (int i = 0; i < datas.length; i++) {
//            if (datas[i] == 0) return i;
//        }
//        return datas.length - 1;
//    }

    public int missingNumber(int[] nums) {
        // 高斯公式，利用数学计算
        int num = nums.length * (nums.length + 1) / 2;;
        for (int i = 0; i < nums.length; i++) {
            num -= nums[i];
        }
        return num;
    }

}
