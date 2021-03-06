package leetcode.easy;

/**
 * 面试题 01.06. 字符串压缩
 *
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 示例1:
 *
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 * 示例2:
 *
 *  输入："abbccd"
 *  输出："abbccd"
 *  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 * 提示：
 *
 * 字符串长度在[0, 50000]范围内。
 *
 * @author gcg
 * @create 2020-04-10 10:53
 **/
public class InterviewOneSix {

    public String compressString(String S) {
        if (S.length() == 0) return S;
        int pre = 0, index = 0;
        StringBuilder sb = new StringBuilder();

        while (index < S.length()) {
            if (S.charAt(index) != S.charAt(pre)) {
                sb.append(S.charAt(pre)).append(index - pre);
                pre = index;
            }
            index++;
        }
        sb.append(S.charAt(pre)).append(S.length() - pre);

        return S.length() > sb.length() ? sb.toString() : S;
    }

}
