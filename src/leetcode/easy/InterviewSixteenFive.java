package leetcode.easy;

/**
 * 面试题 16.05. 阶乘尾数
 *
 * 设计一个算法，算出 n 阶乘有多少个尾随零。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 *
 * @author gcg
 * @create 2020-05-06 13:32
 **/
public class InterviewSixteenFive {

    public int trailingZeroes(int n) {
        long num = 0, base = 5, count;
        do {
            count = n / base;
            num += count;
            base *= 5;
        } while (count != 0);

        return (int) num;
    }

}
