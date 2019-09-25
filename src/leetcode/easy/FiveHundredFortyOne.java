package leetcode.easy;

/**
 * 541. 反转字符串 II
 *
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 *
 * 示例:
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 要求:
 *
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 *
 * @author gcg
 * @create 2019-09-25 10:18
 **/
public class FiveHundredFortyOne {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        int index = 0;
        while (index < s.length()) {
            int length = Math.min(index + k - 1, s.length() - 1);
            int num = length - index + 1;
            for (int i = index; i <= (length - index) / 2 + index; i++) {
                int j = 2 * index + num - i - 1;
                if (i == j) continue;
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
            }
            index += k * 2;
        }

        return new String(chars);
    }

}
