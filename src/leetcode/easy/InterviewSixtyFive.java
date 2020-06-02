package leetcode.easy;

/**
 * 面试题65. 不用加减乘除做加法
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 *
 *  
 *
 * 示例:
 *
 * 输入: a = 1, b = 1
 * 输出: 2
 *  
 *
 * 提示：
 *
 * a, b 均可能是负数或 0
 * 结果不会溢出 32 位整数
 *
 * @author gcg
 * @create 2020-06-02 15:17
 **/
public class InterviewSixtyFive {

    public int add(int a, int b) {
        if (b == 0) return a;

        int c = (a & b) << 1;

        int d = a ^ b;

        return add(d, c);
    }

}
