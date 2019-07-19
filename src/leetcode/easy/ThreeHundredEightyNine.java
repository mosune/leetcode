package leetcode.easy;

import java.util.Arrays;

/**
 * 389. 找不同
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 *
 * @author gcg
 * @create 2019-07-19 10:05
 **/
public class ThreeHundredEightyNine {

    // 哈希表解法
//    public char findTheDifference(String s, String t) {
//        char[] ss = s.toCharArray();
//        char[] ts = t.toCharArray();
//        int[] results = new int[26];
//        for (char c : ss) {
//            results[c - 97] += 1;
//        }
//
//        int index;
//        for (char c : ts) {
//            index = c - 97;
//            if (results[index] == 0) return c;
//            results[index] -= 1;
//        }
//
//        return 0;
//    }

    // 排序解法
//    public char findTheDifference(String s, String t) {
//        if (s.length() == 0) return t.charAt(0);
//        char[] ss = s.toCharArray();
//        char[] ts = t.toCharArray();
//        Arrays.sort(ss);
//        Arrays.sort(ts);
//        for (int i = 0; i < ts.length; i++) {
//            if (ss[i] != ts[i]) return ts[i];
//        }
//        return 0;
//    }

    // 异或解法
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        char result = 0;

        for (int i = 0; i < ss.length; i++) {
            result ^= ss[i];
            result ^= ts[i];
        }

        return (char) (result ^ ts[ts.length - 1]);
    }

}
