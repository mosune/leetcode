package leetcode;

/**
 *
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * @author gcg
 * @create 2019-05-24 12:33
 **/
public class SixtyNine {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 0;
        int end = x / 2 + 1;
        int middle = end / 2;
        // todo：等会了牛顿迭代法再来做一遍
        while (middle != start) {
            Long c = Long.valueOf(middle) * Long.valueOf(middle);
            if (c > x)
                end = middle;
            else if (c == x)
                break;
            else
                start = middle;
            middle = (start + end) / 2;
        }
        return middle;
    }

}
