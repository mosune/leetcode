package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * @author gcg
 * @create 2019-06-29 13:15
 **/
public class TwoHundredFortyTwo {

    public boolean isAnagram(String s, String t) {
        // 使用HashMap解决
//        char[] sChars = s.toCharArray();
//        Map<Character, Integer> map = new HashMap<>(sChars.length);
//        for (int i = 0; i < sChars.length; i++) {
//            if (map.containsKey(sChars[i])) {
//                map.put(sChars[i], map.get(sChars[i]) + 1);
//            } else {
//                map.put(sChars[i], 1);
//            }
//        }
//
//        char[] tChars = t.toCharArray();
//        for (int i = 0; i < tChars.length; i++) {
//            if (map.containsKey(tChars[i])) {
//                Integer num = map.get(tChars[i]);
//                if (num == 1) {
//                    map.remove(tChars[i]);
//                } else {
//                    map.put(tChars[i], num - 1);
//                }
//            } else return false;
//        }
//
//        if (map.size() != 0) return false;
//
//        return true;

        // 自建hash表
        int[] datas = new int[26];
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            datas[sChars[i] - 'a'] += 1;
        }

        char[] tChars = t.toCharArray();
        for (int i = 0; i < tChars[i]; i++) {
            if (datas[sChars[i] - 'a'] == 0) return false;
            else datas[sChars[i] - 'a'] -= 1;
        }

        for (int i = 0; i < datas.length; i++) {
            if (datas[i] != 0) return false;
        }

        return true;
    }

    // 排序解决
//    public boolean isAnagram(String s, String t) {
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//
//        return String.valueOf(sChars).equals(String.valueOf(tChars));
//    }

}
