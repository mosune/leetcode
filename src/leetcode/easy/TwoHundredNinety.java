package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 290. 单词规律
 *
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    
 *
 * @author gcg
 * @create 2019-07-08 10:08
 **/
public class TwoHundredNinety {

    // 双向存储哈希表
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if (pattern.length() != strs.length) return false;
        char[] chars = pattern.toCharArray();
        String[] nums = new String[26];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 97;
            if (nums[index] == null) {
                if (set.contains(strs[i])) {
                    return false;
                } else {
                    nums[index] = strs[i];
                    set.add(strs[i]);
                }
            } else {
                if (!nums[index].equals(strs[i])) return false;
            }
        }
        return true;
    }

}
