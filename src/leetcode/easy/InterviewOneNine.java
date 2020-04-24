package leetcode.easy;

/**
 * 面试题 01.09. 字符串轮转
 *
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 * 示例1:
 *
 *  输入：s1 = "waterbottle", s2 = "erbottlewat"
 *  输出：True
 * 示例2:
 *
 *  输入：s1 = "aa", "aba"
 *  输出：False
 * 提示：
 *
 * 字符串长度在[0, 100000]范围内。
 * 说明:
 *
 * 你能只调用一次检查子串的方法吗？
 *
 * @author gcg
 * @create 2020-04-24 11:18
 **/
public class InterviewOneNine {

//    public boolean isFlipedString(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//        if (s1.length() == 0) return true;
//
//        int i = 0;
//            for (; i < s1.length(); i++) {
//            if (!s1.contains(s2.substring(0, i))) break;
//        }
//
//        return s1.equals(s2.substring(i - 1) + s2.substring(0, i - 1));
//    }

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0) return true;

        return (s1 + s1).contains(s2);
    }

}
