package leetcode.easy;

/**
 * 414. 第三大的数
 *
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * @author gcg
 * @create 2019-07-31 15:45
 **/
public class FourHundredFourteen {

    public int thirdMax(int[] nums) {
        long one = Long.MIN_VALUE;
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;
        for (int i : nums) {
            if (i == one || i == two || i == three) continue;
            if (i > three) {
                if (i > two) {
                    if (i > one) {
                        three = two;
                        two = one;
                        one = i;
                        continue;
                    }
                    three = two;
                    two = i;
                    continue;
                }
                three = i;
            }
        }
        return (int) (three == Long.MIN_VALUE ? one : three);
    }

}
