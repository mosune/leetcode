package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. 找到字符串中所有字母异位词
 *
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 *
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 *
 * 说明：
 *
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 *
 * 输入:
 * s: "cbaebabacd" p: "abc"
 *
 * 输出:
 * [0, 6]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 *  示例 2:
 *
 * 输入:
 * s: "abab" p: "ab"
 *
 * 输出:
 * [0, 1, 2]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 *
 * @author gcg
 * @create 2019-08-05 10:24
 **/
public class FourHundredThirtyEight {

    // 蠢办法
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> result = new ArrayList<>();
//        if (s == null || p.length() > s.length()) return result;
//        char[] sChars = s.toCharArray();
//        char[] pChars = p.toCharArray();
//
//        int[] data;
//        int index = 0;
//        boolean isTrue;
//        while (index <= s.length() - p.length()) {
//            isTrue = true;
//            data = new int[26];
//            for (char c : pChars) data[c - 97] += 1;
//            for (int i = index; i < index + pChars.length; i++) {
//                if (data[sChars[i] - 97] == 0) {
//                    isTrue = false;
//                    if (p.indexOf(sChars[i]) != -1) index++;
//                    else index = i + 1;
//                    break;
//                }
//                data[sChars[i] - 97] -= 1;
//            }
//            if (isTrue) result.add(index++);
//        }
//
//        return result;
//    }

    // 滑动窗口
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p.length() > s.length()) return result;
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int[] pResult = new int[26];
        int[] betweenResult = new int[26];
        for (char c : pChars) pResult[c - 97] += 1;

        int start = 0, end = 0;

        while (end < sChars.length) {
            int index = sChars[end++] - 97;
            // 添加字母到间隔含有字母的数组中
            betweenResult[index] += 1;
            // 如果这个字母在p中不存在，start向前滑动，知道这个字母小于p中的字母个数
            while (pResult[index] < betweenResult[index]) {
                betweenResult[sChars[start++] - 97] -= 1;
            }
            // 如果end-start等于p的长度说明是符合的
            if (end - start == p.length()) result.add(start);
        }

        return result;
    }

}
