package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 *
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 *
 * @author gcg
 * @create 2020-04-09 12:23
 **/
public class InterviewOneOne {

    /**
     * 如果规定只有对应的字母进行操作，可以直接使用位运算记录是否出现过
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>(astr.length(), 1);

        for (char c : astr.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }

        return true;
    }

}
