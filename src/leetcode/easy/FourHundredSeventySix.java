package leetcode.easy;

/**
 * 476. 数字的补数
 *
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 *
 * 注意:
 *
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 *
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 *
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 *
 * @author gcg
 * @create 2019-09-04 10:22
 **/
public class FourHundredSeventySix {

    public int findComplement(int num) {
        int n = 0;
        // 获取同个数的1
        while (n < num) n = n << 1 | 1;
        return num ^ n;
    }

}
