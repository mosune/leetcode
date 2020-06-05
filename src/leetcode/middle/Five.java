package leetcode.middle;

/**
 * 5. 最长回文子串
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author gcg
 * @create 2020-06-05 09:35
 **/
public class Five {

    public String longestPalindrome(String s) {
        int start = 0, end = 0, max = 0;

        // 每个点向外扩展
        for (int i = 0; i < s.length(); i++) {
            int a = getLength(s, i, i);
            int b = getLength(s, i, i + 1);
            int c = Math.max(a, b);
            if (c > max) {
                start = i - (c - 1) / 2;
                end = i + c / 2 + 1;
                max = c;
            }
        }

        return s.substring(start, end);
    }

    private int getLength(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

}
