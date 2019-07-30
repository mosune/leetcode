package leetcode.easy;

/**
 * 409. 最长回文串
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 * @author gcg
 * @create 2019-07-30 13:16
 **/
public class FourHundredNine {

    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] data = new int[58];

        for (char c : chars) data[c - 65] += 1;
        int length = 0;
        boolean isSolo = false;
        for (int i : data) {
            if (i > 0) {
                if (i % 2 == 0) length += i;
                else {
                    length += i - 1;
                    isSolo = true;
                }
            }
        }
        return length + (isSolo ? 1 : 0);
    }

}
