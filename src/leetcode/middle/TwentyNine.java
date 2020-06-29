package leetcode.middle;

/**
 * 29. 两数相除
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 *  
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 *  
 *
 * 提示：
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 *
 * @author gcg
 * @create 2020-06-29 10:28
 **/
public class TwentyNine {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        boolean isZ = true;
        if (((dividend >>> 31) ^ (divisor >>> 31)) == 1) isZ = false;

        if (dividend > 0) dividend *= -1;
        if (divisor > 0) divisor *= -1;

        int result = 0;

        int i = 0;
        for (; i <= 31; i++) {
            if (divisor > -Math.pow(2, i)) break;
        }

        while (dividend <= divisor) {
            int left = 0, right = 31 - i, mid = 0;
            while (left <= right) {
                mid = (right + left) / 2;
                int num = divisor * 2 << (mid - 1);
                if (num == dividend) {
                    break;
                } else if (num > dividend) {
                    if (divisor * (2 << mid) < dividend) break;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            dividend -= mid == 0 ? divisor : divisor * 2 << (mid - 1);
            result += Math.pow(2, mid);
        }

        return isZ ? result : result * -1;
    }

}
