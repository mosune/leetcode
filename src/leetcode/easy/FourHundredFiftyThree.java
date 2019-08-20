package leetcode.easy;

import java.util.Arrays;

/**
 * 453. 最小移动次数使数组元素相等
 *
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 *
 * 示例:
 *
 * 输入:
 * [1,2,3]
 *
 * 输出:
 * 3
 *
 * 解释:
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 *
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 *
 * @author gcg
 * @create 2019-08-20 14:43
 **/
public class FourHundredFiftyThree {

    /**
     * 数学法求解，等价于最大的元素减少到最小的元素数值
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        int count = 0;
        for (int n : nums) {
            count += n - min;
        }
        return count;
    }

    /**
     * dp思想
     * @param nums
     * @return
     */
//    public int minMoves(int[] nums) {
//        Arrays.sort(nums);
//        int move = 0;
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += move;
//            move += nums[i] - nums[i - 1];
//        }
//        return move;
//    }

}
