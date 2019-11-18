package leetcode.easy;

/**
 * 709. 转换成小写字母
 *
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * @author gcg
 * @create 2019-11-18 16:05
 **/
public class SevenHundredNine {

    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] <= 90 && chars[i] >= 65) stringBuilder.append((char) (chars[i] + 32));
            else stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

}
