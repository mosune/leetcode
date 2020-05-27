package leetcode.easy;

/**
 * 面试题50. 第一个只出现一次的字符
 *
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *  
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 *
 * @author gcg
 * @create 2020-05-27 13:36
 **/
public class InterviewFifty {

    public char firstUniqChar(String s) {
        char[] chars = new char[26];
        char[] cs = s.toCharArray();

        for (char c : cs) chars[c - 97]++;

        for (char c : cs) {
            if (chars[c - 97] == 1) return c;
        }

        return ' ';
    }

}
