package leetcode.easy;

/**
 * 367. 有效的完全平方数
 *
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 *
 * @author gcg
 * @create 2019-07-16 13:56
 **/
public class ThreeHundredSixtySeven {

    // 二分查找，todo 可以使用牛顿迭代法
    public boolean isPerfectSquare(int num) {
        if (num == 1 || num == 4) return true;
        long s = 0, e = num / 2;

        while (s + 1 != e) {
            // 这里有精度的坑
            long m = (s + e) / 2;
            long r = m * m;
            if (r == num) return true;
            else if (r > num) e = m;
            else s = m;
        }

        return false;
    }

}
