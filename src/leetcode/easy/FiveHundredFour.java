package leetcode.easy;

/**
 * 504. 七进制数
 *
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 *
 * 示例 1:
 *
 * 输入: 100
 * 输出: "202"
 * 示例 2:
 *
 * 输入: -7
 * 输出: "-10"
 * 注意: 输入范围是 [-1e7, 1e7] 。
 *
 * @author gcg
 * @create 2019-09-11 18:20
 **/
public class FiveHundredFour {

    public String convertToBase7(int num) {
        boolean isFu = false;
        if (num < 0) {
            num *= -1;
            isFu = true;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (num < 7) {
                sb.append(num);
                break;
            }
            sb.append(num % 7);
            num /= 7;
        }
        return (isFu ? "-" : "") + sb.reverse().toString();
    }

}
