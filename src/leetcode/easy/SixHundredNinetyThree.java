package leetcode.easy;

/**
 * 693. 交替位二进制数
 *
 * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 *
 * 示例 1:
 *
 * 输入: 5
 * 输出: True
 * 解释:
 * 5的二进制数是: 101
 * 示例 2:
 *
 * 输入: 7
 * 输出: False
 * 解释:
 * 7的二进制数是: 111
 * 示例 3:
 *
 * 输入: 11
 * 输出: False
 * 解释:
 * 11的二进制数是: 1011
 *  示例 4:
 *
 * 输入: 10
 * 输出: True
 * 解释:
 * 10的二进制数是: 1010
 *
 * @author gcg
 * @create 2019-11-12 15:44
 **/
public class SixHundredNinetyThree {

    /**
     * 检查每一位的数值
     * @param n
     * @return
     */
//    public boolean hasAlternatingBits(int n) {
//        int pre;
//        while (n != 0) {
//            pre = n & 1;
//            n >>= 1;
//            if (n != 0 && (n & 1) == pre) return false;
//        }
//        return true;
//    }

    /**
     * 牛逼的解法
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        // 异或右移一位的n，得到全是1的数
        n ^= n >> 1;
        // 比较全是1的数+1和原数字的与运算结果是否为0，如果是0说明结果全是1
        return (n & n + 1) == 0;
    }

}
