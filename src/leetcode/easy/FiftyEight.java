package leetcode.easy;

/**
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * @author gcg
 * @create 2019-05-21 10:45
 **/
public class FiftyEight {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int index = -1;
        int last = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
           if (chars[i] != ' ') {
               last = i;
               break;
           }
        }
        if (last == -1) {
            return 0;
        }

        for (int i = last; i >= 0; i--) {
            if (chars[i] == ' ') {
                index = i;
                break;
            }
        }
        return last - index;
    }

}
