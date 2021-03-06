package leetcode.easy;

/**
 * 459. 重复的子字符串
 *
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 *
 * 输入: "abab"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 示例 2:
 *
 * 输入: "aba"
 *
 * 输出: False
 * 示例 3:
 *
 * 输入: "abcabcabcabc"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 *
 * @author gcg
 * @create 2019-08-29 10:07
 **/
public class FourHundredFiftyNine {

    public boolean repeatedSubstringPattern(String s) {
        char[] chars = s.toCharArray();
        int length = 1, fast = 1;
        while (fast < s.length()) {
            if (chars[fast] == chars[0]) {
                int index = fast;
                boolean isTrue = true;
                while (index < s.length()) {
                    if (s.length() - index < length) return false;
                    for (int i = 0; i < length; i++) {
                        if (chars[i] != chars[index++]) {
                            length = fast + 1;
                            isTrue = false;
                            break;
                        }
                    }
                    if (!isTrue) break;
                }
                if (isTrue) return true;
            } else {
                length = fast + 1;
            }
            fast++;
        }

        return false;
    }

}
