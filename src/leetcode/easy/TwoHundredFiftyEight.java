package leetcode.easy;

/**
 * 258. 各位相加
 *
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * @author gcg
 * @create 2019-07-02 10:23
 **/
public class TwoHundredFiftyEight {

    // 循环计算法
//    public int addDigits(int num) {
//        while (num > 9) {
//            int sum = 0;
//            while (num != 0) {
//                sum += num % 10;
//                num /= 10;
//            }
//            num = sum;
//        }
//        return num;
//    }

    // 数学规律是除以9的余数
    public int addDigits(int num) {
        if (num > 9) {
            num %= 9;
            if (num == 0) num = 9;
        }
        return num;
    }

}
