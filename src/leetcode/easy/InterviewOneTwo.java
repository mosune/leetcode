package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.02. 判定是否互为字符重排
 *
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 *
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 *
 * @author gcg
 * @create 2020-04-10 10:16
 **/
public class InterviewOneTwo {

    /**
     * 排序解法
     */
//    public boolean CheckPermutation(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//        char[] chars1 = s1.toCharArray();
//        Arrays.sort(chars1);
//
//        char[] chars2 = s1.toCharArray();
//        Arrays.sort(chars2);
//
//        for (int i = 0; i < chars1.length; i++) {
//            if (chars1[i] != chars2[i]) return false;
//        }
//
//        return true;
//    }

    /**
     * 哈希表解法
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>(s1.length(), 1);
        for (int i = 0; i < s1.length(); i++) map.merge(s1.charAt(i), 1, Integer::sum);

        for (int i = 0; i < s2.length(); i++) {
            Integer num = map.get(s2.charAt(i));
            if (num == null || num == 0) return false;
            map.put(s2.charAt(i), num - 1);
        }

        return true;
    }

}
