package leetcode.easy;

/**
 * 441. 排列硬币
 *
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 *
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 *
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 *
 * 示例 1:
 *
 * n = 5
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 *
 * 因为第三行不完整，所以返回2.
 * 示例 2:
 *
 * n = 8
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 *
 * 因为第四行不完整，所以返回3.
 *
 * @author gcg
 * @create 2019-08-05 13:28
 **/
public class FourHundredFortyOne {

    // 最简单办法
//    public int arrangeCoins(int n) {
//        int count = 1;
//        while (n > count) n -= count++;
//        return count;
//    }

    // 求解数学方程式（x + 1）* x / 2 > n，求解x
//    public int arrangeCoins(int n) {
//        return (int) (Math.sqrt(2 * (double) n + 0.25) - 0.5);
//    }

    // 二分查找
    public int arrangeCoins(int n) {
        int start = 1, end = n;
        while (start < end - 1) {
            long mid = start + (end - start) / 2;
            long result = mid * (mid + 1) / 2;
            if (result > n) end = (int) mid;
            else start = (int) mid;
        }
        return start;
    }

}
