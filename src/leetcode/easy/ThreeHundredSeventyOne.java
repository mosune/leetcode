package leetcode.easy;

/**
 * 371. 两整数之和
 *
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 *
 * @author gcg
 * @create 2019-07-17 10:29
 **/
public class ThreeHundredSeventyOne {

    public int getSum(int a, int b) {
        if (b == 0) return a;
        // 异或先计算每个位置上的数值
        int num1 = a ^ b;
        // 与运算计算进位，并且进位向前移动一位
        int num2 = (a & b) >> 1;
        // 递归进行计算
        return getSum(num1, num2);
    }

}
