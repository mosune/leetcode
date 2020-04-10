package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.04. 回文排列
 *
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 *  
 *
 * 示例1：
 *
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 *
 * @author gcg
 * @create 2020-04-10 10:38
 **/
public class InterviewOneFour {

//    public boolean canPermutePalindrome(String s) {
//        Map<Character, Integer> map = new HashMap<>(s.length(), 1);
//        for (int i = 0; i < s.length(); i++) map.merge(s.charAt(i), 1, Integer::sum);
//
//        boolean hasSingle = false;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() % 2 == 1) {
//                if (hasSingle) return false;
//                else hasSingle = true;
//            }
//        }
//
//        return true;
//    }

    /**
     * 位图解法
     * @param s
     * @return
     */
    public boolean canPermutePalindrome(String s) {
        Long highMap = 0L, lowMap = 0L;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 64) {
                highMap ^= 1L << s.charAt(i) - 64;
            } else {
                lowMap ^= 1L << s.charAt(i);
            }
        }
        return Long.bitCount(highMap) + Long.bitCount(lowMap) < 2;
    }

}
