package leetcode.easy;

/**
 * 434. 字符串中的单词数
 *
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 *
 * @author gcg
 * @create 2019-08-02 13:45
 **/
public class FourHundredThirtyFour {

    public int countSegments(String s) {
        char[] chars = s.trim().toCharArray();
        int num = 0;
        int index = 0;
        while (index < chars.length) {
            if (chars[index] != ' ') {
                index++;
                while (index < chars.length) {
                    if (chars[index] != ' ') index++;
                    else break;
                }
                num++;
            } else index++;
        }
        return num;
    }

}
