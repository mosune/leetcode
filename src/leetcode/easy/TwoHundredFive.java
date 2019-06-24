package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 *
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 *
 * @author gcg
 * @create 2019-06-20 16:57
 **/
public class TwoHundredFive {

    // 循环的做法
//    public boolean isIsomorphic(String s, String t) {
//        char[] charsA = s.toCharArray();
//        char[] charsB = t.toCharArray();
//
//        int[] nums = new int[charsA.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (charsA[j] == charsA[i]) {
//                    if (charsB[i] != charsB[j]) return false;
//                    else nums[j] = 1;
//                }
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) continue;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == 1) continue;
//                if (charsB[j] == charsB[i]) {
//                    if (charsA[i] != charsA[j]) return false;
//                }
//            }
//        }
//
//        return true;
//    }

    // 双hash表解决
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < sChars.length; i++) {
            char a = sChars[i];
            char b = tChars[i];
            if (sMap.containsKey(a)) {
                if (sMap.get(a) != b) return false;
                else continue;
            }
            if (tMap.containsKey(b)) {
                if (tMap.get(b) != a) return false;
            }
            sMap.put(a, b);
            tMap.put(b, a);
        }

        return true;
    }

}
