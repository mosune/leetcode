package leetcode.easy;

/**
 * 303. 区域和检索 - 数组不可变
 *
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 *
 * @author gcg
 * @create 2019-07-10 15:41
 **/
public class ThreeHundredThree {

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        numArray.sumRange(0, 2);
        numArray.sumRange(2, 5);
        numArray.sumRange(0, 5);
    }

}

class NumArray {

    /**
     * 用数组缓存结果
     */
    private int[] results;

    public NumArray(int[] nums) {
        results = new int[nums.length + 1];
        for (int i = 1; i < results.length; i++) {
            results[i] = nums[i - 1] + results[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return results[j + 1] - results[i];
    }
}
