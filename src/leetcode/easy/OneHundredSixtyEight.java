package leetcode.easy;

/**
 * 168. Excel表列名称
 *
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 *
 * @author gcg
 * @create 2019-06-11 13:31
 **/
public class OneHundredSixtyEight {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
//        if (n <= 26) {
//            sb.append((char) (n + 64));
//            return sb.toString();
//        }
//        while (true) {
//            int num = n % 26;
//            if (num == 0) sb.append('Z');
//            else sb.insert(0, (char) (num + 64));
//
//            n = n / 26;
//            if (num == 0) n--;
//            if (n <= 26) {
//                sb.insert(0, (char) (n + 64));
//                break;
//            }
//        }

        while (n != 0) {
            n--;
            sb.append((char) (n % 26 + 65));
            n /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        OneHundredSixtyEight oneHundredSixtyEight = new OneHundredSixtyEight();

        System.out.println(28 % 26);
        System.out.println(oneHundredSixtyEight.convertToTitle(702));
    }

}
