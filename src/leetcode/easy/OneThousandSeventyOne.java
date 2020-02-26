package leetcode.easy;

/**
 * 1071. 字符串的最大公因子
 *
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 *
 * 返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：str1 = "ABCABC", str2 = "ABC"
 * 输出："ABC"
 * 示例 2：
 *
 * 输入：str1 = "ABABAB", str2 = "ABAB"
 * 输出："AB"
 * 示例 3：
 *
 * 输入：str1 = "LEET", str2 = "CODE"
 * 输出：""
 *  
 *
 * 提示：
 *
 * 1 <= str1.length <= 1000
 * 1 <= str2.length <= 1000
 * str1[i] 和 str2[i] 为大写英文字母
 *
 * @author gcg
 * @create 2020-02-26 10:20
 **/
public class OneThousandSeventyOne {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        // 字符串版辗转相除法
        while (str1.length() != str2.length()) {
            if (str1.length() < str2.length()) str2 = str2.substring(0, str2.length() - str1.length());
            else str1 = str1.substring(0, str1.length() - str2.length());
        }

        return str1;
    }

}
