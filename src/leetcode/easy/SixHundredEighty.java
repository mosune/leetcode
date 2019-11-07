package leetcode.easy;

/**
 * 680. 验证回文字符串 Ⅱ
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 *
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 *
 * @author gcg
 * @create 2019-11-07 10:55
 **/
public class SixHundredEighty {

    public boolean validPalindrome(String s) {
        int a = 0, b = s.length() - 1;
        char[] chars = s.toCharArray();

        while (a < b) {
            if (chars[a] == chars[b]) {
                a++;
                b--;
            } else return check(chars, a + 1, b) || check(chars, a, b - 1);
        }

        return true;
    }

    private boolean check(char[] chars, int a, int b) {
        while (a < b) {
            if (chars[a] == chars[b]) {
                a++;
                b--;
            } else return false;
        }
        return true;
    }

}
