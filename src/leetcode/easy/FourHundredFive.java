package leetcode.easy;

import java.math.BigInteger;

/**
 * 405. 数字转换为十六进制数
 *
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 *
 * 注意:
 *
 * 十六进制中所有字母(a-f)都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 * 示例 1：
 *
 * 输入:
 * 26
 *
 * 输出:
 * "1a"
 * 示例 2：
 *
 * 输入:
 * -1
 *
 * 输出:
 * "ffffffff"
 *
 * @author gcg
 * @create 2019-07-30 10:59
 **/
public class FourHundredFive {

    public String toHex(int num) {
        double d = num;
        if (num < 0) d = Double.valueOf(new BigInteger(Integer.toBinaryString(num), 2).toString());

        StringBuilder sb = new StringBuilder();
        while ((int) d > 0) {
            double n = d % 16;
            if ((int) n > 9) sb.append((char) (n + 'a' - 10));
            else sb.append((int) n);
            d /= 16;
        }

        return sb.reverse().toString();
    }

}
