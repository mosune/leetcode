package leetcode.easy;

/**
 * 415. 字符串相加
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 *
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 *
 * @author gcg
 * @create 2019-08-01 09:50
 **/
public class FourHundredFifteen {

    public String addStrings(String num1, String num2) {
        char[] chars1, chars2;
        if (num1.length() < num2.length()) {
            chars1 = num2.toCharArray();
            chars2 = num1.toCharArray();
        } else {
            chars1 = num1.toCharArray();
            chars2 = num2.toCharArray();
        }

        StringBuilder sb = new StringBuilder();
        int sub = chars1.length - chars2.length;
        int result = 0;
        for (int i = chars2.length - 1; i >= 0; i--) {
            if (result > 105) result = chars1[i + sub] + chars2[i] + 1;
            else result = chars1[i + sub] + chars2[i];
            sb.append((result - 96) % 10);
        }

        boolean isTrue = false;
        if (result > 105) isTrue = true;
        for (int i = chars1.length - chars2.length - 1; i >= 0; i--) {
            if (result > 57 && isTrue) result = chars1[i] + 1;
            else {
                result = chars1[i];
                isTrue = true;
            }
            sb.append((result - 48) % 10);
        }

        if (chars1.length == chars2.length && result > 105) sb.append('1');
        else if (chars1.length > chars2.length && result > 57) sb.append('1');

        return sb.reverse().toString();
    }

}
