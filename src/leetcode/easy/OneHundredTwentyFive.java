package leetcode.easy;

/**
 * 125. 验证回文串
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * @author gcg
 * @create 2019-06-06 17:19
 **/
public class OneHundredTwentyFive {

    public boolean isPalindrome(String s) {
        if (s == null) return true;
        char[] chars = s.toCharArray();

        int start = 0;
        int last = chars.length - 1;
        while (start < last) {
            // 这里可以使用Character.isLetterOrDigit方法
            if (chars[start] < 48 || (chars[start] > 57 && chars[start] < 65) || (chars[start] > 90 && chars[start] < 97) || chars[start] > 122) {
                start++;
                continue;
            }
            if (chars[last] < 48 || (chars[last] > 57 && chars[last] < 65) || (chars[last] > 90 && chars[last] < 97) || chars[last] > 122) {
                last--;
                continue;
            }
            if (!swap(chars[start++], chars[last--])) return false;
        }

        return true;
    }

    private boolean swap(char a, char b) {
        // 这里可以使用Character.toLowerCase方法
        if (a == b) return true;
        if (b > a && b - 32 == a && a > 57) return true;
        if (a > b && a - 32 == b && b > 57) return true;
        return false;
    }

}
