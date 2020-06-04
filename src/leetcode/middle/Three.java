package leetcode.middle;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 *
 * @author gcg
 * @create 2020-06-04 10:35
 **/
public class Three {

//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0) return 0;
//        Set<Character> set = new HashSet<>(s.length(), 1);
//        char[] chars = s.toCharArray();
//        int max = 0, i = 0, j = 1;
//        set.add(chars[i]);
//
//        while (j < chars.length) {
//            if (set.contains(chars[j])) {
//                max = Math.max(max, j - i);
//                while (chars[i] != chars[j]) {
//                    set.remove(chars[i++]);
//                }
//                i++;
//            }
//            set.add(chars[j++]);
//        }
//
//        return Math.max(max, j - i);
//    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(s.length(), 1);
        int max = 0, j = -1;

        for (int i = 0; i < s.length(); i++) {
            if (i != 0) set.remove(s.charAt(i - 1));

            while (j + 1 < s.length() && !set.contains(s.charAt(j + 1))) {
                set.add(s.charAt(j + 1));
                j++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }

}
