package leetcode.middle;

/**
 * 400. 第N个数字
 *
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 *
 * 示例 1:
 *
 * 输入:
 * 3
 *
 * 输出:
 * 3
 * 示例 2:
 *
 * 输入:
 * 11
 *
 * 输出:
 * 0
 *
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 *
 * @author gcg
 * @create 2019-07-19 10:36
 **/
public class FourHundred {

    // 数学计算，很艰难
    public int findNthDigit(int n) {
        long num = 9;
        long pre = 0;
        int index = 1;
        int t;
        while (true) {
            if (n <= num) {
                n -= pre;
                t = n % index;
                n = (int) ((n - 1) / index + Math.pow(10, index - 1));
                return t == 0 ? n % 10 : (int) (n / Math.pow(10, (index - t)) % 10);
            } else {
                pre = num;
                num += 9 * Math.pow(10, index++) * index;
            }
        }
    }

}
