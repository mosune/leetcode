package leetcode.easy;

/**
 * 461. 汉明距离
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 * @author gcg
 * @create 2019-09-02 10:29
 **/
public class FourHundredSixtyOne {

    public int hammingDistance(int x, int y) {
        int num = 0;
        // 先进行异或
        int z = x ^ y;
        while (z != 0) {
            // 每次右移一位，如果跟1与结果是1说明这个位置是不同的位置，直到z是0
            if ((z & 1) == 1) {
                num++;
            }
            z >>= 1;
        }

        return num;
    }

}
