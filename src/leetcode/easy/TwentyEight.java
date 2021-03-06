package leetcode.easy;

/**
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * @author gcg
 * @create 2019-05-10 17:53
 **/
public class TwentyEight {

    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        char[] hayChars = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int hayLength = hayChars.length;
        int needLength = needles.length;
        if (hayLength == needLength) {
            for (int i = 0; i < hayLength; i++) {
                if (hayChars[i] != needles[i]) {
                    return -1;
                }
            }
            return 0;
        }
        for (int i = 0; i <= hayLength - needLength; i++) {
            int j = 0;
            for (; j < needLength; j++) {
                if (hayChars[i + j] == needles[j]) {
                    continue;
                } else {
                    break;
                }
            }
            if (j == needLength) {
                return i;
            }
        }
        return -1;
    }

}
