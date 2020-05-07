package leetcode.easy;

/**
 * 面试题 16.07. 最大数值
 *
 * 编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 *
 * 示例：
 *
 * 输入： a = 1, b = 2
 * 输出： 2
 *
 * @author gcg
 * @create 2020-05-07 12:11
 **/
public class InterviewSixteenSeven {

    public int maximum(int a, int b) {
        // 避免逸出
        long c = (long) a - (long) b;
        // >>>为无符号移位，如果为1说明是负数
        if (((c >>> 63) & 1) == 1) return b;
        return a;
    }

}
