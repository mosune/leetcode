package leetcode.easy;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author gcg
 * @create 2019-08-05 13:54
 **/
public class Seven {

    public int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (num > 214748364 || (num > 214748364 && pop > 7)) return 0;
            if (num < -214748364 || (num < -214748364 && pop < -8)) return 0;
            num = num * 10 + pop;
        }
        return num;
    }

}
