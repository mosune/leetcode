package leetcode.easy;

/**
 * 面试题 17.01. 不用加号的加法
 *
 * 设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。
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
 * @create 2020-05-09 17:13
 **/
public class InterviewSeventeenOne {

    public int add(int a, int b) {
        if (b == 0) return a;
        // 计算进数位
        int c = (a & b) << 1;
        // 计算没有进数位的数
        int d = a ^ b;
        // 递归直到没有进数位
        return add(d, c);
    }

}
